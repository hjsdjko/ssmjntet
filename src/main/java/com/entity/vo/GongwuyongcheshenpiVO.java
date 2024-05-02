package com.entity.vo;

import com.entity.GongwuyongcheshenpiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公务用车审批
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
public class GongwuyongcheshenpiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公务车名称
	 */
	
	private String gongwuchemingcheng;
		
	/**
	 * 审核日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenheriqi;
		
	/**
	 * 复审日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fushenriqi;
		
	/**
	 * 审批单号
	 */
	
	private String shenpidanhao;
		
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
	 * 审批状态
	 */
	
	private String shenpizhuangtai;
		
	/**
	 * 注册事由
	 */
	
	private String zhuceshiyou;
		
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
	 * 设置：审核日期
	 */
	 
	public void setShenheriqi(Date shenheriqi) {
		this.shenheriqi = shenheriqi;
	}
	
	/**
	 * 获取：审核日期
	 */
	public Date getShenheriqi() {
		return shenheriqi;
	}
				
	
	/**
	 * 设置：复审日期
	 */
	 
	public void setFushenriqi(Date fushenriqi) {
		this.fushenriqi = fushenriqi;
	}
	
	/**
	 * 获取：复审日期
	 */
	public Date getFushenriqi() {
		return fushenriqi;
	}
				
	
	/**
	 * 设置：审批单号
	 */
	 
	public void setShenpidanhao(String shenpidanhao) {
		this.shenpidanhao = shenpidanhao;
	}
	
	/**
	 * 获取：审批单号
	 */
	public String getShenpidanhao() {
		return shenpidanhao;
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
	 * 设置：审批状态
	 */
	 
	public void setShenpizhuangtai(String shenpizhuangtai) {
		this.shenpizhuangtai = shenpizhuangtai;
	}
	
	/**
	 * 获取：审批状态
	 */
	public String getShenpizhuangtai() {
		return shenpizhuangtai;
	}
				
	
	/**
	 * 设置：注册事由
	 */
	 
	public void setZhuceshiyou(String zhuceshiyou) {
		this.zhuceshiyou = zhuceshiyou;
	}
	
	/**
	 * 获取：注册事由
	 */
	public String getZhuceshiyou() {
		return zhuceshiyou;
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
