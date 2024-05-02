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


import com.dao.ChuzhicheliangxinxiDao;
import com.entity.ChuzhicheliangxinxiEntity;
import com.service.ChuzhicheliangxinxiService;
import com.entity.vo.ChuzhicheliangxinxiVO;
import com.entity.view.ChuzhicheliangxinxiView;

@Service("chuzhicheliangxinxiService")
public class ChuzhicheliangxinxiServiceImpl extends ServiceImpl<ChuzhicheliangxinxiDao, ChuzhicheliangxinxiEntity> implements ChuzhicheliangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuzhicheliangxinxiEntity> page = this.selectPage(
                new Query<ChuzhicheliangxinxiEntity>(params).getPage(),
                new EntityWrapper<ChuzhicheliangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuzhicheliangxinxiEntity> wrapper) {
		  Page<ChuzhicheliangxinxiView> page =new Query<ChuzhicheliangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuzhicheliangxinxiVO> selectListVO(Wrapper<ChuzhicheliangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuzhicheliangxinxiVO selectVO(Wrapper<ChuzhicheliangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuzhicheliangxinxiView> selectListView(Wrapper<ChuzhicheliangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuzhicheliangxinxiView selectView(Wrapper<ChuzhicheliangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
