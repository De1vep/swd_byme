/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class CourseDAO extends DBContext{
    public ArrayList<CourseDAO> getListCourses(){
        ArrayList<CourseDAO>data=new ArrayList<>();
        String sql = "Select * from Courses ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                        

                return data;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
