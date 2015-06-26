package cn.v5cn.v5cms.biz;

import cn.v5cn.v5cms.entity.SystemUser;
import org.springframework.data.domain.Page;

/**
 * Created by ZXF-PC1 on 2015/6/18.
 */
public interface SystemUserBiz {
    SystemUser findByLoginname(String loginname);
    Page<SystemUser> findUserByUserNamePageable(SystemUser user,Integer currPage);
}
