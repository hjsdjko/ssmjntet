package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BianzhicheliangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BianzhicheliangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BianzhicheliangxinxiView;


/**
 * 编制车辆信息
 *
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface BianzhicheliangxinxiService extends IService<BianzhicheliangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianzhicheliangxinxiVO> selectListVO(Wrapper<BianzhicheliangxinxiEntity> wrapper);
   	
   	BianzhicheliangxinxiVO selectVO(@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);
   	
   	List<BianzhicheliangxinxiView> selectListView(Wrapper<BianzhicheliangxinxiEntity> wrapper);
   	
   	BianzhicheliangxinxiView selectView(@Param("ew") Wrapper<BianzhicheliangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianzhicheliangxinxiEntity> wrapper);
   	
}

