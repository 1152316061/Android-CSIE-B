package org.example.Android.Service;

import org.example.Android.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String getUserByObject(User user);
    void updateUserByObject(User user);
}
