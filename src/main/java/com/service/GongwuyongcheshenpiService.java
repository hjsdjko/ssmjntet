package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongwuyongcheshenpiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongwuyongcheshenpiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongwuyongcheshenpiView;


/**
 * 公务用车审批
 *
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface GongwuyongcheshenpiService extends IService<GongwuyongcheshenpiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongwuyongcheshenpiVO> selectListVO(Wrapper<GongwuyongcheshenpiEntity> wrapper);
   	
   	GongwuyongcheshenpiVO selectVO(@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);
   	
   	List<GongwuyongcheshenpiView> selectListView(Wrapper<GongwuyongcheshenpiEntity> wrapper);
   	
   	GongwuyongcheshenpiView selectView(@Param("ew") Wrapper<GongwuyongcheshenpiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongwuyongcheshenpiEntity> wrapper);
   	
}

