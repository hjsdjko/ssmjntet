package com.entity.view;

import com.entity.GongwuyongchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公务用车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
@TableName("gongwuyongchexinxi")
public class GongwuyongchexinxiView  extends GongwuyongchexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongwuyongchexinxiView(){
	}
 
 	public GongwuyongchexinxiView(GongwuyongchexinxiEntity gongwuyongchexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gongwuyongchexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
