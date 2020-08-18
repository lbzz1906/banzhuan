package com.sys.controller;

import com.sys.pojo.Customer;
import com.sys.pojo.Shops;
import com.sys.pojo.Users;
import com.sys.pojo.Wallet;
import com.sys.service.CustomerService;
import com.sys.service.ShopsService;
import com.sys.service.UsersService;
import com.sys.service.WalletService;
import com.sys.service.impl.CustomerServiceImpl;
import com.sys.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

@Controller
public class UsersController {
    @Autowired
    UsersService usersService;
    @Autowired
    CustomerService customerService;
    @Autowired
    WalletService walletService;
    @Autowired
    ShopsService shopsService;
    @RequestMapping("/loginCheck")
    @ResponseBody
    public boolean loginCheck(String username,String password){
        boolean flag=false;
        try {
            flag=usersService.loginCheck(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @RequestMapping("/getUserByUserName")
    @ResponseBody
    public Users getUserByUserName(String username){
        Users user=new Users();
        try {
            user=usersService.getUserByUsersname(username).get(0);
            user.setAddress(customerService.getCustomerAddress(user.getUsersId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @RequestMapping("/registerInsert")
    @ResponseBody
    public boolean registerInsert(Users users){

        boolean flag=false,flag1=false,flag2=false;
        try {
            flag=usersService.insert(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            List<Users> list=usersService.getUserByUsersname(users.getUsersName());
            users=list.get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        Customer customer=new Customer();
        customer.setUsersId(users.getUsersId());
        Wallet wallet=new Wallet();
        wallet.setWalletAccount(users.getUsersName());
        wallet.setWalletPassword(users.getUsersPassword());
        wallet.setUsersId(users.getUsersId());
        try{
            flag1=customerService.insert(customer)&&walletService.insert(wallet);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag&&flag1;
    }

    @RequestMapping("/updateUsersMsg")
    @ResponseBody
    public boolean updateByPrimaryKeySelective(Users users){
        boolean flag=false;
        boolean flag1=false;
        try {
            int id=usersService.getUserByUsersname(users.getUsersName()).get(0).getUsersId();
           flag1=customerService.addCustomersAddress(users.getAddress(),id);
           users.setUsersId(id);
            flag=usersService.updateByPrimaryKeySelective(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag&&flag1;
    }

}
