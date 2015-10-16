package hello.redis;

import hello.domain.User;
import org.springframework.data.redis.core.HashOperations;

import javax.annotation.Resource;

/**
 * 测试保存Java POJO对象的实例。
 * Created by gaofu on 15-10-16.
 */
public class UserExample {
//    @Autowired
//    private RedisTemplate<String, User> redisTemplate; // inject the actual template

    @Resource(name = "redisTemplate") // inject the template as HashOperations
    private HashOperations<String, Long, User> hashOps;

    public void put(User user) {
        hashOps.put(User.KEY, user.hashKey(), user);
    }

    public User get(User user) {
        return hashOps.get(User.KEY, user.hashKey());
    }

    public void delete(User user) {
        hashOps.delete(User.KEY, user.hashKey());
    }
}
