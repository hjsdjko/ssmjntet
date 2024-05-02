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


import com.dao.BianzhicheliangxinxiDao;
import com.entity.BianzhicheliangxinxiEntity;
import com.service.BianzhicheliangxinxiService;
import com.entity.vo.BianzhicheliangxinxiVO;
import com.entity.view.BianzhicheliangxinxiView;

@Service("bianzhicheliangxinxiService")
public class BianzhicheliangxinxiServiceImpl extends ServiceImpl<BianzhicheliangxinxiDao, BianzhicheliangxinxiEntity> implements BianzhicheliangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianzhicheliangxinxiEntity> page = this.selectPage(
                new Query<BianzhicheliangxinxiEntity>(params).getPage(),
                new EntityWrapper<BianzhicheliangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianzhicheliangxinxiEntity> wrapper) {
		  Page<BianzhicheliangxinxiView> page =new Query<BianzhicheliangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BianzhicheliangxinxiVO> selectListVO(Wrapper<BianzhicheliangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BianzhicheliangxinxiVO selectVO(Wrapper<BianzhicheliangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BianzhicheliangxinxiView> selectListView(Wrapper<BianzhicheliangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianzhicheliangxinxiView selectView(Wrapper<BianzhicheliangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
