package im.zhaojun.zfile.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import im.zhaojun.zfile.module.login.entity.RolesMenus;

import java.util.List;

public interface IRolesMenusService extends IService<RolesMenus> {
    List<Long> getByRoleId(Long roleId);

}
