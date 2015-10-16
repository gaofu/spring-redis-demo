package hello.redis;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Set;

/**
 * 演示Redis保存字符串。
 * Created by gaofu on 15-9-25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/beans.xml")
public class StringExampleTest {

    private static final String KEY = "testKey";

    @Resource(name = "stringExample")
    private StringExample stringExample;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testAdd() throws Exception {
        stringExample.add(KEY, "aaa", "bbb", "REDIS");
    }

    @org.junit.Test
    public void testMembers() throws Exception {
        Set<String> members = stringExample.members(KEY);
        Assert.assertEquals(3, members.size());
    }

    @org.junit.Test
    public void testDelete() throws Exception {
        stringExample.delete(KEY);
    }
}