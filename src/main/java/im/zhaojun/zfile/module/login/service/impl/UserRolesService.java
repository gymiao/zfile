package im.zhaojun.zfile.module.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import im.zhaojun.zfile.module.login.entity.Role;
import im.zhaojun.zfile.module.login.entity.UserRoles;
import im.zhaojun.zfile.module.login.mapper.UserRolesMapper;
import im.zhaojun.zfile.module.login.service.IRoleService;
import im.zhaojun.zfile.module.login.service.IUserRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserRolesService extends ServiceImpl<UserRolesMapper, UserRoles> implements IUserRolesService {

    @Resource
    private IRoleService roleService;

    @Override
    public List<Long> getByUserId(Long userId) {
        List<UserRoles> rolesList = lambdaQuery().eq(userId != null, UserRoles::getUserId, userId).list();
        List<Long> res = new ArrayList<>();
        for(UserRoles u:rolesList) {
            res.add(u.getRoleId());
        }
        return res;
    }

    @Override
    public List<Role> getRoles(Long userId) {
        // 获取roleIds
        List<Long> roleIds = getByUserId(userId);
        List<Role> roles = roleService.listByIds(roleIds);
        return roles;
    }
}
