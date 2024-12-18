package im.zhaojun.zfile.module.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import im.zhaojun.zfile.module.login.entity.Role;
import im.zhaojun.zfile.module.login.entity.User;
import im.zhaojun.zfile.module.login.mapper.UserMapper;
import im.zhaojun.zfile.module.login.service.IUserRolesService;
import im.zhaojun.zfile.module.login.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private IUserRolesService userRolesService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public User getByUserName(String userName) {
        return lambdaQuery().eq(userName!=null, User::getUserName, userName).one();
    }

    @Override
    public User findUserAllProperties(String userName) {
        User user = lambdaQuery().eq(userName != null, User::getUserName, userName).one();
        if(user == null) {
            return user;
        }
        List<Role> roles = userRolesService.getRoles(user.getId());
        user.setRoles(roles);
        return user;
    }

    @Override
    public boolean check(String currentPassword, String password) {
        // System.out.println(bCryptPasswordEncoder.encode(currentPassword));
        return bCryptPasswordEncoder.matches(currentPassword, password);
    }

}
