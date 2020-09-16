import User.User;

import java.util.ArrayList;
import java.util.List;

import static User.test.sort;

public class JUnit
{
    public static void main(String[] args) throws Exception {
        User u1 = new User();
        u1.setName("吴邪");
        u1.setPosition("董事长");
        User u2 = new User();
        u2.setName("陈一鸣");
        u2.setPosition("总经理,主管");
        User u3 = new User();
        u3.setName("罗浮生");
        u3.setPosition("董事");
        User u4 = new User();
        u4.setName("沈巍");
        u4.setPosition("总经理");
        User u5 = new User();
        u5.setName("沈面");
        u5.setPosition("经理");
        User u6 = new User();
        u6.setName("齐衡");
        u6.setPosition("副经理");
        User u7 = new User();
        u7.setName("井然");
        u7.setPosition("主管");
        User u8 = new User();
        u8.setName("何开心");
        u8.setPosition("组长");
        User u9 = new User();
        u9.setName("江心白");
        u9.setPosition("组员");
        User u10 = new User();
        u10.setName("胡杨");
        User u11 = new User();
        u11.setName("林楠笙");
        List<User> list = new ArrayList<>();
        list.add(u11);
        list.add(u10);
        list.add(u9);
        list.add(u8);
        list.add(u7);
        list.add(u6);
        list.add(u5);
        list.add(u4);
        list.add(u3);
        list.add(u2);
        list.add(u1);
        List<User> sort = sort(list);
        System.out.println(sort);
    }
}


