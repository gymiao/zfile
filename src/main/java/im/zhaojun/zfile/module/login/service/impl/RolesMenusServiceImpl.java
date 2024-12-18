package im.zhaojun.zfile.module.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import im.zhaojun.zfile.module.login.entity.RolesMenus;
import im.zhaojun.zfile.module.login.mapper.RolesMenusMapper;
import im.zhaojun.zfile.module.login.service.IRolesMenusService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RolesMenusServiceImpl extends ServiceImpl<RolesMenusMapper, RolesMenus> implements IRolesMenusService {
    @Override
    public List<Long> getByRoleId(Long roleId) {
        List<RolesMenus> menusList = lambdaQuery().eq(roleId != null, RolesMenus::getRoleId, roleId).list();
        List<Long> res = new ArrayList<>();
        for(RolesMenus m:menusList) {
            res.add(m.getMenuId());
        }
        return res;
    }
}
