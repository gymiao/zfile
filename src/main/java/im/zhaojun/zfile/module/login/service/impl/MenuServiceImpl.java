package im.zhaojun.zfile.module.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import im.zhaojun.zfile.module.login.entity.Menu;
import im.zhaojun.zfile.module.login.mapper.MenuMapper;
import im.zhaojun.zfile.module.login.service.IMenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Override
    public Menu getById(Long menuId) {
        return lambdaQuery().eq(menuId!=null, Menu::getId, menuId).one();
    }
}
