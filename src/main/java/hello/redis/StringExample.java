package hello.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;

import javax.annotation.Resource;
import java.util.Set;

/**
 * 测试保存字符串的实例。
 * Created by gaofu on 15-7-15.
 */
public class StringExample {
    @Autowired
    private RedisTemplate<String, String> redisTemplate; // inject the actual template

    @Resource(name = "stringRedisTemplate") // inject the template as SetOperations
    private SetOperations<String, String> setOps;

    public void add(String key, String... values) {
        setOps.add(key, values);
    }

    public Set<String> members(String key) {
        return setOps.members(key);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }
}
