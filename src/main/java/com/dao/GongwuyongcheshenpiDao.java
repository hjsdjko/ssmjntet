package com.dao;

import com.entity.GongwuyongcheshenpiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongwuyongcheshenpiVO;
import com.entity.view.GongwuyongcheshenpiView;


/**
 * 公务用车审批
 * 
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface GongwuyongcheshenpiDao extends BaseMapper<GongwuyongcheshenpiEntity> {
	
	List<GongwuyongcheshenpiVO> selectListVO(@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);
	
	GongwuyongcheshenpiVO selectVO(@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);
	
	List<GongwuyongcheshenpiView> selectListView(@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);

	List<GongwuyongcheshenpiView> selectListView(Pagination page,@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);
	
	GongwuyongcheshenpiView selectView(@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);
	
}
