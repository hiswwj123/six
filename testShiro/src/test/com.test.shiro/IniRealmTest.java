package com.test.shiro;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/17 0017 8:45
 */
public class IniRealmTest {

    @Test
    public void testIniRealm(){
        //默认安全管理器
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        //通过配置文件创建realm
        IniRealm initRealm = new IniRealm("classpath:user.ini");

        defaultSecurityManager.setRealm(initRealm);

        SecurityUtils.setSecurityManager(defaultSecurityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("aaa","123");

        subject.login(token);

        System.out.println(subject.isAuthenticated());

        subject.checkRole("admin");

        System.out.println(subject.isAuthenticated());

        subject.checkPermission("user:add");

        System.out.println(subject.isAuthenticated());

    }
}
