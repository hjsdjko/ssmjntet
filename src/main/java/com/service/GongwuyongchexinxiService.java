package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongwuyongchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongwuyongchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongwuyongchexinxiView;


/**
 * 公务用车信息
 *
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public interface GongwuyongchexinxiService extends IService<GongwuyongchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongwuyongchexinxiVO> selectListVO(Wrapper<GongwuyongchexinxiEntity> wrapper);
   	
   	GongwuyongchexinxiVO selectVO(@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);
   	
   	List<GongwuyongchexinxiView> selectListView(Wrapper<GongwuyongchexinxiEntity> wrapper);
   	
   	GongwuyongchexinxiView selectView(@Param("ew") Wrapper<GongwuyongchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongwuyongchexinxiEntity> wrapper);
   	
}

