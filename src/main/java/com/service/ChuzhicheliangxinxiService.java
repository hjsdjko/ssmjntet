package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuzhicheliangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuzhicheliangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuzhicheliangxinxiView;


/**
 * 处置车辆信息
 *
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface ChuzhicheliangxinxiService extends IService<ChuzhicheliangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuzhicheliangxinxiVO> selectListVO(Wrapper<ChuzhicheliangxinxiEntity> wrapper);
   	
   	ChuzhicheliangxinxiVO selectVO(@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);
   	
   	List<ChuzhicheliangxinxiView> selectListView(Wrapper<ChuzhicheliangxinxiEntity> wrapper);
   	
   	ChuzhicheliangxinxiView selectView(@Param("ew") Wrapper<ChuzhicheliangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuzhicheliangxinxiEntity> wrapper);
   	
}

