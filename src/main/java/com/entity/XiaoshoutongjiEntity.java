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
 * 销售统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-06 16:44:13
 */
@TableName("xiaoshoutongji")
public class XiaoshoutongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoshoutongjiEntity() {
		
	}
	
	public XiaoshoutongjiEntity(T t) {
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
	 * 统计编号
	 */
					
	private String tongjibianhao;
	
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 销售量
	 */
					
	private Integer xiaoshouliang;
	
	/**
	 * 销售额
	 */
					
	private Float xiaoshoue;
	
	/**
	 * 成本额
	 */
					
	private Float chengbene;
	
	/**
	 * 利润
	 */
					
	private Float lirun;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：统计编号
	 */
	public void setTongjibianhao(String tongjibianhao) {
		this.tongjibianhao = tongjibianhao;
	}
	/**
	 * 获取：统计编号
	 */
	public String getTongjibianhao() {
		return tongjibianhao;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：销售量
	 */
	public void setXiaoshouliang(Integer xiaoshouliang) {
		this.xiaoshouliang = xiaoshouliang;
	}
	/**
	 * 获取：销售量
	 */
	public Integer getXiaoshouliang() {
		return xiaoshouliang;
	}
	/**
	 * 设置：销售额
	 */
	public void setXiaoshoue(Float xiaoshoue) {
		this.xiaoshoue = xiaoshoue;
	}
	/**
	 * 获取：销售额
	 */
	public Float getXiaoshoue() {
		return xiaoshoue;
	}
	/**
	 * 设置：成本额
	 */
	public void setChengbene(Float chengbene) {
		this.chengbene = chengbene;
	}
	/**
	 * 获取：成本额
	 */
	public Float getChengbene() {
		return chengbene;
	}
	/**
	 * 设置：利润
	 */
	public void setLirun(Float lirun) {
		this.lirun = lirun;
	}
	/**
	 * 获取：利润
	 */
	public Float getLirun() {
		return lirun;
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
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
