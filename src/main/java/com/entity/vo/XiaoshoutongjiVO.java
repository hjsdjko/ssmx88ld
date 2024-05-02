package com.entity.vo;

import com.entity.XiaoshoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 销售统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-06 16:44:13
 */
public class XiaoshoutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
