package im.zhaojun.zfile.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import im.zhaojun.zfile.module.login.entity.Menu;

public interface IMenuService extends IService<Menu> {
    Menu getById(Long menuId);
}
