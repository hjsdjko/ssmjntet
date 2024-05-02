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


import com.dao.GongwuyongchexinxiDao;
import com.entity.GongwuyongchexinxiEntity;
import com.service.GongwuyongchexinxiService;
import com.entity.vo.GongwuyongchexinxiVO;
import com.entity.view.GongwuyongchexinxiView;

@Service("gongwuyongchexinxiService")
public class GongwuyongchexinxiServiceImpl extends ServiceImpl<GongwuyongchexinxiDao, GongwuyongchexinxiEntity> implements GongwuyongchexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongwuyongchexinxiEntity> page = this.selectPage(
                new Query<GongwuyongchexinxiEntity>(params).getPage(),
                new EntityWrapper<GongwuyongchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongwuyongchexinxiEntity> wrapper) {
		  Page<GongwuyongchexinxiView> page =new Query<GongwuyongchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongwuyongchexinxiVO> selectListVO(Wrapper<GongwuyongchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongwuyongchexinxiVO selectVO(Wrapper<GongwuyongchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongwuyongchexinxiView> selectListView(Wrapper<GongwuyongchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongwuyongchexinxiView selectView(Wrapper<GongwuyongchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
