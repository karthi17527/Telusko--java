package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class productdb {
    Connection conn = null;
    public productdb(){
        try {
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Telusko","postgres","2007");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void save(products p){
        String query =" insert into products (name,type,place,warranty) values(?,?,?,?)";
        try{
            PreparedStatement st= conn.prepareStatement(query);
            st.setString(1,p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getWarranty());
            st.execute();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public List<products> getalldb(){
        List<products> items = new ArrayList<>();
        String query =" select name,type,place,warranty from products";
        try{
            PreparedStatement st= conn.prepareStatement(query);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                products p= new products();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setPlace(rs.getString(3));
                p.setWarranty(rs.getInt(4));
                items.add(p);
            }
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
        return items;
    }

}
