package im.zhaojun.zfile.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import im.zhaojun.zfile.module.login.entity.Role;

public interface IRoleService extends IService<Role> {
    Role getByRoleId(Long roleId);
}
