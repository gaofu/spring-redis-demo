package hello.domain;

import java.io.Serializable;

/**
 * Created by gaofu on 15-10-16.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 3809874319256616377L;
    public static final String KEY = "USER";
    private long id;
    private String name;
    private int age;

    public long hashKey(){
        return getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
