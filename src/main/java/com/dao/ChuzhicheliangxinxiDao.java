package com.dao;

import com.entity.ChuzhicheliangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuzhicheliangxinxiVO;
import com.entity.view.ChuzhicheliangxinxiView;


/**
 * 处置车辆信息
 * 
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface ChuzhicheliangxinxiDao extends BaseMapper<ChuzhicheliangxinxiEntity> {
	
	List<ChuzhicheliangxinxiVO> selectListVO(@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);
	
	ChuzhicheliangxinxiVO selectVO(@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);
	
	List<ChuzhicheliangxinxiView> selectListView(@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);

	List<ChuzhicheliangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);
	
	ChuzhicheliangxinxiView selectView(@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);
	
}
