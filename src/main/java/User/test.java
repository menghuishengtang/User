package User;

import User.User;

import java.util.*;

/**
 * @author Yhg
 * @version 1.0
 * @Title test.java
 * @description
 * @time 2020/9/15 22:09
 */
public class test {

    public static List<User> sort(List<User> userList) throws Exception{
        Collections.sort(userList, new Comparator<User>(){
            @Override
            public int compare(User u1,User u2){
                if(u1.getPosition()!= null && u2.getPosition() != null){
                    int p1=0,p2 = 0;
                    if(u1.getPosition().contains("董事长")) {
                        p1 = 1;
                    }
                    else if(u1.getPosition().contains("董事")) {
                        p1 =2 ;
                    }
                    else if(u1.getPosition().contains("总经理")) {
                        p1 =3 ;
                    }
                    else if(u1.getPosition().contains("经理")&&!u1.getPosition().contains("副经理")) {
                        p1 =4 ;
                    }
                    else if(u1.getPosition().contains("副经理")) {
                        p1 =5 ;
                    }
                    else if(u1.getPosition().contains("主管")) {
                        p1 =6 ;
                    }
                    else if(u1.getPosition().contains("组长")) {
                        p1 =7 ;
                    }
                    else{p1=8;}
                    if(u2.getPosition().contains("董事长")) {
                        p2 =1 ;
                    }
                    else if(u2.getPosition().contains("董事")) {
                        p2 =2 ;
                    }
                    else if(u2.getPosition().contains("总经理")) {
                        p2 =3 ;
                    }
                    else if(u2.getPosition().contains("经理")&&!u2.getPosition().contains("副经理")) {
                        p2 =4 ;
                    }
                    else if(u2.getPosition().contains("副经理")) {
                        p2 =5 ;
                    }
                    else if(u2.getPosition().contains("主管")) {
                        p2 =6 ;
                    }
                    else if(u2.getPosition().contains("组长")) {
                        p2 =7 ;
                    }
                    else{p2=8;}
                    return p1-p2;
                }else if(u1.getPosition() == null && u2.getPosition() == null){
                    return u1.getName().compareTo(u2.getName());
                }else {
                    if(u1.getPosition() != null){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            }
        });
        return userList;
    }



}
