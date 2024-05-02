package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongwuyongcheshenpiDao;
import com.entity.GongwuyongcheshenpiEntity;
import com.service.GongwuyongcheshenpiService;
import com.entity.vo.GongwuyongcheshenpiVO;
import com.entity.view.GongwuyongcheshenpiView;

@Service("gongwuyongcheshenpiService")
public class GongwuyongcheshenpiServiceImpl extends ServiceImpl<GongwuyongcheshenpiDao, GongwuyongcheshenpiEntity> implements GongwuyongcheshenpiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongwuyongcheshenpiEntity> page = this.selectPage(
                new Query<GongwuyongcheshenpiEntity>(params).getPage(),
                new EntityWrapper<GongwuyongcheshenpiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongwuyongcheshenpiEntity> wrapper) {
		  Page<GongwuyongcheshenpiView> page =new Query<GongwuyongcheshenpiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongwuyongcheshenpiVO> selectListVO(Wrapper<GongwuyongcheshenpiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongwuyongcheshenpiVO selectVO(Wrapper<GongwuyongcheshenpiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongwuyongcheshenpiView> selectListView(Wrapper<GongwuyongcheshenpiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongwuyongcheshenpiView selectView(Wrapper<GongwuyongcheshenpiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
