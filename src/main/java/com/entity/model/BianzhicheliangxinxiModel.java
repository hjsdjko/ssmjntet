package com.entity.model;

import com.entity.BianzhicheliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 编制车辆信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public class BianzhicheliangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆名称
	 */
	
	private String cheliangmingcheng;
		
	/**
	 * 车辆照片
	 */
	
	private String cheliangzhaopian;
		
	/**
	 * 机构性质
	 */
	
	private String jigouxingzhi;
		
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 编制日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bianzhiriqi;
				
	
	/**
	 * 设置：车辆名称
	 */
	 
	public void setCheliangmingcheng(String cheliangmingcheng) {
		this.cheliangmingcheng = cheliangmingcheng;
	}
	
	/**
	 * 获取：车辆名称
	 */
	public String getCheliangmingcheng() {
		return cheliangmingcheng;
	}
				
	
	/**
	 * 设置：车辆照片
	 */
	 
	public void setCheliangzhaopian(String cheliangzhaopian) {
		this.cheliangzhaopian = cheliangzhaopian;
	}
	
	/**
	 * 获取：车辆照片
	 */
	public String getCheliangzhaopian() {
		return cheliangzhaopian;
	}
				
	
	/**
	 * 设置：机构性质
	 */
	 
	public void setJigouxingzhi(String jigouxingzhi) {
		this.jigouxingzhi = jigouxingzhi;
	}
	
	/**
	 * 获取：机构性质
	 */
	public String getJigouxingzhi() {
		return jigouxingzhi;
	}
				
	
	/**
	 * 设置：单位名称
	 */
	 
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
				
	
	/**
	 * 设置：编制日期
	 */
	 
	public void setBianzhiriqi(Date bianzhiriqi) {
		this.bianzhiriqi = bianzhiriqi;
	}
	
	/**
	 * 获取：编制日期
	 */
	public Date getBianzhiriqi() {
		return bianzhiriqi;
	}
			
}
