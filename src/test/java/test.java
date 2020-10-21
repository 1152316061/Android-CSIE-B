import org.example.Android.Mapper.UserMapper;
import org.example.Android.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class test {

    @Autowired
    UserMapper userMapper;
    @Test
    public void test(){
        List<User> allUsers = userMapper.getAllUsers();


    }
}
