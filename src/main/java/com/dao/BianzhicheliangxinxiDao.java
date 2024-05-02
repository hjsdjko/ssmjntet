package com.dao;

import com.entity.BianzhicheliangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BianzhicheliangxinxiVO;
import com.entity.view.BianzhicheliangxinxiView;


/**
 * 编制车辆信息
 * 
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface BianzhicheliangxinxiDao extends BaseMapper<BianzhicheliangxinxiEntity> {
	
	List<BianzhicheliangxinxiVO> selectListVO(@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);
	
	BianzhicheliangxinxiVO selectVO(@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);
	
	List<BianzhicheliangxinxiView> selectListView(@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);

	List<BianzhicheliangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);
	
	BianzhicheliangxinxiView selectView(@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);
	
}
