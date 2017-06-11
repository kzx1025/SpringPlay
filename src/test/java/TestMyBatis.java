import com.springdemo.model.User;
import com.springdemo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by iceke on 17/6/8.
 */
@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring.xml","file:src/main/webapp/WEB-INF/spring-mybatis.xml"})
public class TestMyBatis {
    private static final Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        User user = userService.findById(3);
        logger.info("username:" + user.getUserName() + " , userAge=" + user.getAge());
    }

    @Test
    public void test2() {
        User user = new User();
        user.setId(4);
        user.setUserName("Toby");
        user.setAge("28");
        userService.insert(user);
    }

    @Test
    public void test3() {
        User user = userService.findById(4);
        user.setAge("27");
        userService.update(user);
    }

    @Test
    public void test4() {
        List<User> userList = userService.getAll();
        for (User user : userList) {
            logger.info("username:" + user.getUserName() + " , userAge=" + user.getAge());
        }
    }

    @Test
    public void test5() {
        userService.deleteById(3);
    }
}