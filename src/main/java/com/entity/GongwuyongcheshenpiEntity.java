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
 * 公务用车审批
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
@TableName("gongwuyongcheshenpi")
public class GongwuyongcheshenpiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongwuyongcheshenpiEntity() {
		
	}
	
	public GongwuyongcheshenpiEntity(T t) {
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
	 * 审核日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenheriqi;
	
	/**
	 * 复审日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
