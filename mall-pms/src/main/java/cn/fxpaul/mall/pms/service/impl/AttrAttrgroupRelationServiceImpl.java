package cn.fxpaul.mall.pms.service.impl;

import cn.fxpaul.core.bean.PageVo;
import cn.fxpaul.core.bean.Query;
import cn.fxpaul.core.bean.QueryCondition;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.fxpaul.mall.pms.dao.AttrAttrgroupRelationDao;
import cn.fxpaul.mall.pms.entity.AttrAttrgroupRelationEntity;
import cn.fxpaul.mall.pms.service.AttrAttrgroupRelationService;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

        return new PageVo(page);
    }

}