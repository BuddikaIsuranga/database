package com.ijse.database.service;


import java.util.List;



import com.ijse.database.dto.UserPwdDTO;
import com.ijse.database.entity.User;



public interface UserService {
    List<User> getAllUsers();
    User creatUser(User user);
    User getUserById(Long id);
    User changeUserPassword(Long id, UserPwdDTO userPwdDTO);
    
}
