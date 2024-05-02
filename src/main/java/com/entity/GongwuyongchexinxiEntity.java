package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 公务用车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
@TableName("gongwuyongchexinxi")
public class GongwuyongchexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongwuyongchexinxiEntity() {
		
	}
	
	public GongwuyongchexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公务车编号
	 */
					
	private String gongwuchebianhao;
	
	/**
	 * 公务车名称
	 */
					
	private String gongwuchemingcheng;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公务车编号
	 */
	public void setGongwuchebianhao(String gongwuchebianhao) {
		this.gongwuchebianhao = gongwuchebianhao;
	}
	/**
	 * 获取：公务车编号
	 */
	public String getGongwuchebianhao() {
		return gongwuchebianhao;
	}
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
