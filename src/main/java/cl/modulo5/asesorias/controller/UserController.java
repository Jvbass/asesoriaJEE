package cl.modulo5.asesorias.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.google.gson.Gson;

import cl.modulo5.asesorias.conexion.DBConnection;
import cl.modulo5.asesorias.controller.interfaces.IUserController;
import cl.modulo5.asesorias.model.entity.User;

public class UserController implements IUserController {

  @Override
  public String login(String username, String password) {
    
    Gson gson = new Gson();
    DBConnection conexion = DBConnection.getInstance();
    
    String sql = "SELECT * FROM users WHERE username = ? and password = ?";
    
    try {
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      statement.setString(1, username);
      statement.setString(2, password);
      
      ResultSet rs = statement.executeQuery();
      
      while(rs.next()) {
        String name = rs.getString("username");
        String pass = rs.getString("password");
        
        User user = new User(name, pass);
        return gson.toJson(user);
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    return "false";
  }

@Override
public void register(String username, String password) {
	// TODO Auto-generated method stub
	
}

}
