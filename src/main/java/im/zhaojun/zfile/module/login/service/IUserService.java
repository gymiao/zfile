package im.zhaojun.zfile.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import im.zhaojun.zfile.module.login.entity.Role;
import im.zhaojun.zfile.module.login.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    User getByUserName(String userName);

    User findUserAllProperties(String userName);

    boolean check(String password, String password1);

}
