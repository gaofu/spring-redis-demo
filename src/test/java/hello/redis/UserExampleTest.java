package hello.redis;

import hello.domain.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by gaofu on 15-10-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/beans.xml")
public class UserExampleTest {

    @Resource(name = "userExample")
    private UserExample userExample;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPut() throws Exception {
        User user = new User();
        user.setId(1L);
        user.setName("Jack");
        user.setAge(22);

        userExample.put(user);
    }

    @Test
    public void testGet() throws Exception {
        User user = new User();
        user.setId(1L);

        User u = userExample.get(user);
        Assert.assertEquals("Jack", u.getName());
        Assert.assertEquals(22, u.getAge());
    }

    @Test
    public void testDelete() throws Exception {
        User user = new User();
        user.setId(1L);

        userExample.delete(user);
    }
}