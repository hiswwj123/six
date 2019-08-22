package com.test.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/16 0016 23:37
 */
public class AuthorizerTest {
    private SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void addUser(){
        simpleAccountRealm.addAccount("aaa","123","admin","user");
        simpleAccountRealm.addAccount("lisi","123","admin","user");
    }

    @Test
    public void testAuthorizer(){
        DefaultSecurityManager defaultSecurityManager =
                               new DefaultSecurityManager(simpleAccountRealm);
        //将默认的安全管理器设置到安全管理器中
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        //从工具类中拿主体对象,其实securityManager
        Subject subject = SecurityUtils.getSubject();
        //创建口令
        UsernamePasswordToken token = new UsernamePasswordToken("aaa","123");

        subject.login(token); //验证是否可以登录成功

        System.out.println("isAuthenticated:"+subject.isAuthenticated());

        subject.checkRoles("admin");

        System.out.println("isAuthenticated:"+subject.isAuthenticated());


    }







}
