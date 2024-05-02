package com.dao;

import com.entity.GongwuyongchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongwuyongchexinxiVO;
import com.entity.view.GongwuyongchexinxiView;


/**
 * 公务用车信息
 * 
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface GongwuyongchexinxiDao extends BaseMapper<GongwuyongchexinxiEntity> {
	
	List<GongwuyongchexinxiVO> selectListVO(@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);
	
	GongwuyongchexinxiVO selectVO(@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);
	
	List<GongwuyongchexinxiView> selectListView(@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);

	List<GongwuyongchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);
	
	GongwuyongchexinxiView selectView(@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);
	
}
