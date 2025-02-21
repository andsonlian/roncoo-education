package com.roncoo.education.course.dao.impl;

import com.roncoo.education.common.core.base.Page;
import com.roncoo.education.common.core.base.PageUtil;
import com.roncoo.education.common.core.tools.IdWorker;
import com.roncoo.education.course.dao.ZoneDao;
import com.roncoo.education.course.dao.impl.mapper.ZoneMapper;
import com.roncoo.education.course.dao.impl.mapper.entity.Zone;
import com.roncoo.education.course.dao.impl.mapper.entity.ZoneExample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 专区 服务实现类
 *
 * @author wujing
 * @date 2022-08-25
 */
@Repository
@RequiredArgsConstructor
public class ZoneDaoImpl implements ZoneDao {

    @NotNull
    private final ZoneMapper mapper;

    @Override
    public int save(Zone record) {
        if (record.getId() == null) {
            record.setId(IdWorker.getId());
        }
        return this.mapper.insertSelective(record);
    }

    @Override
    public int deleteById(Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(Zone record) {
        record.setGmtCreate(null);
        record.setGmtModified(null);
        return this.mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Zone getById(Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }

    @Override
    public Page<Zone> page(int pageCurrent, int pageSize, ZoneExample example) {
        int count = this.mapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<>(count, totalPage, pageCurrent, pageSize, this.mapper.selectByExample(example));
    }

    @Override
    public List<Zone> listByExample(ZoneExample example) {
        return this.mapper.selectByExample(example);
    }

    @Override
    public int countByExample(ZoneExample example){
        return this.mapper.countByExample(example);
    }
}
