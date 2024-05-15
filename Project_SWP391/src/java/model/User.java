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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class User extends DBContext{
    String u_id,u_name,pass,email,fullname,gender,address,roles_id;
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
    public User() {
    }

    public User(String u_id, String u_name) {
        this.u_id = u_id;
        this.u_name = u_name;
        connect();
    }
    
    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(String roles_id) {
        this.roles_id = roles_id;
    }
    
}
