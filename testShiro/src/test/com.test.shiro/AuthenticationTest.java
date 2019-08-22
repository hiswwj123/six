package com.test.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/16 0016 11:12
 */
//身份验证
public class AuthenticationTest {
    //没有连接数据库弄点假数据
    private  SimpleAccountRealm simpleAccountRealm=
            new SimpleAccountRealm();
    @Before
    public void addUser(){
        simpleAccountRealm.addAccount("admin","123");
    }

    @Test
    public void testAuthentication(){
        //构建一个SecurityManage环境
        DefaultSecurityManager defaultSecurityManager =
                new DefaultSecurityManager();

        defaultSecurityManager.setRealm(simpleAccountRealm);

        SecurityUtils.setSecurityManager(defaultSecurityManager);

        Subject subject = SecurityUtils.getSubject();

        //创建一个token对象
        UsernamePasswordToken token =
                new UsernamePasswordToken("admin","123");

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            System.out.println("用户名和密码不对");
        }

        System.out.println("isAuthenticated:"+subject.isAuthenticated());
        subject.logout(); //退出登录
        System.out.println("isAuthenticated:"+subject.isAuthenticated());

    }





}
