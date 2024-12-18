package im.zhaojun.zfile.module.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import im.zhaojun.zfile.module.login.entity.Role;
import im.zhaojun.zfile.module.login.mapper.RoleMapper;
import im.zhaojun.zfile.module.login.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
    @Override
    public Role getByRoleId(Long roleId) {
        return lambdaQuery().eq(roleId!=null, Role::getId, roleId).one();
    }
}
