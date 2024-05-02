package com.entity.vo;

import com.entity.GongwuyongchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公务用车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public class GongwuyongchexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公务车名称
	 */
	
	private String gongwuchemingcheng;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 车架号
	 */
	
	private String chejiahao;
		
	/**
	 * 结构分类
	 */
	
	private String jiegoufenlei;
		
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 公务车照片
	 */
	
	private String gongwuchezhaopian;
				
	
	/**
	 * 设置：公务车名称
	 */
	 
	public void setGongwuchemingcheng(String gongwuchemingcheng) {
		this.gongwuchemingcheng = gongwuchemingcheng;
	}
	
	/**
	 * 获取：公务车名称
	 */
	public String getGongwuchemingcheng() {
		return gongwuchemingcheng;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：车架号
	 */
	 
	public void setChejiahao(String chejiahao) {
		this.chejiahao = chejiahao;
	}
	
	/**
	 * 获取：车架号
	 */
	public String getChejiahao() {
		return chejiahao;
	}
				
	
	/**
	 * 设置：结构分类
	 */
	 
	public void setJiegoufenlei(String jiegoufenlei) {
		this.jiegoufenlei = jiegoufenlei;
	}
	
	/**
	 * 获取：结构分类
	 */
	public String getJiegoufenlei() {
		return jiegoufenlei;
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
	 * 设置：公务车照片
	 */
	 
	public void setGongwuchezhaopian(String gongwuchezhaopian) {
		this.gongwuchezhaopian = gongwuchezhaopian;
	}
	
	/**
	 * 获取：公务车照片
	 */
	public String getGongwuchezhaopian() {
		return gongwuchezhaopian;
	}
			
}
