package com.roncoo.education.system.service.api.biz;

import com.roncoo.education.common.core.base.PageUtil;
import com.roncoo.education.common.core.base.Result;
import com.roncoo.education.common.core.enums.StatusIdEnum;
import com.roncoo.education.system.dao.WebsiteLinkDao;
import com.roncoo.education.system.dao.impl.mapper.entity.WebsiteLink;
import com.roncoo.education.system.service.api.resp.ApiWebsiteLinkResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 站点友情链接
 *
 * @author wuyun
 */
@Component
public class ApiWebsiteLinkBiz {

    @Autowired
    private WebsiteLinkDao dao;

    public Result<List<ApiWebsiteLinkResp>> list() {
        List<WebsiteLink> websiteLinkList = dao.listByStatusId(StatusIdEnum.YES.getCode());
        return Result.success(PageUtil.copyList(websiteLinkList, ApiWebsiteLinkResp.class));
    }

}
