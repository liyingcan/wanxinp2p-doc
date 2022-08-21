package cn.itcast.mp;


import cn.itcast.mp.pojo.User;
import cn.itcast.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testInsert(){
        User user = new User();
        user.setEmail("123@itcast.cn");
        user.setAge(301);
        user.setUserName("caocao1");
        user.setName("曹操1");
        user.setPassword("123456");
        userService.save(user);
    }

}
