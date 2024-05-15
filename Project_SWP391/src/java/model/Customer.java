/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Customer extends DBContext{
    String id,username,pass,name,email,phone,gender,address;
    Connection cnn;//ket noi
    Statement stm;//thuc thi cau lenh sql
    ResultSet rs;//luu tru du lieu va xu li
    PreparedStatement pstm;//thuc thi cau lenh sql
   
    private void connect(){
        cnn=connection;
        if(cnn!=null){
            System.out.println("Connect success");
        }else{
            System.out.println("Connect Fail");
        }
    }
    public Customer() {
    }

    public Customer(String username, String pass, String email) {
        this.username = username;
        this.pass = pass;
        this.email = email;
        connect();
    }

    public Customer(String id, String username, String pass, String name, String email, String phone, String gender, String address) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void registerCustomer() {
         try{
            String strAdd=
                    "insert into Customer (username,password,email ) values(?,?,?)";
           
            pstm=cnn.prepareStatement(strAdd);
            pstm.setString(1, username);
            pstm.setString(2,pass);
            pstm.setString(3, email);
        
            pstm.execute();
       } catch(Exception e){
            System.out.println("register fail:"+e.getMessage());

       }
    }
}
