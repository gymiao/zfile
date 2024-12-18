package im.zhaojun.zfile.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import im.zhaojun.zfile.module.login.entity.Role;
import im.zhaojun.zfile.module.login.entity.UserRoles;

import java.util.List;

public interface IUserRolesService extends IService<UserRoles> {

    List<Long> getByUserId(Long userId);

    List<Role> getRoles(Long userId);
}
