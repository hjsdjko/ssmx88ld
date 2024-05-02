package com.entity.vo;

import com.entity.CaiwutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 财务统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-06 16:44:13
 */
public class CaiwutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 进货总额
	 */
	
	private Float jinhuozonge;
		
	/**
	 * 销售收入
	 */
	
	private Float xiaoshoushouru;
		
	/**
	 * 纯利润
	 */
	
	private String chunlirun;
		
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
	 * 设置：进货总额
	 */
	 
	public void setJinhuozonge(Float jinhuozonge) {
		this.jinhuozonge = jinhuozonge;
	}
	
	/**
	 * 获取：进货总额
	 */
	public Float getJinhuozonge() {
		return jinhuozonge;
	}
				
	
	/**
	 * 设置：销售收入
	 */
	 
	public void setXiaoshoushouru(Float xiaoshoushouru) {
		this.xiaoshoushouru = xiaoshoushouru;
	}
	
	/**
	 * 获取：销售收入
	 */
	public Float getXiaoshoushouru() {
		return xiaoshoushouru;
	}
				
	
	/**
	 * 设置：纯利润
	 */
	 
	public void setChunlirun(String chunlirun) {
		this.chunlirun = chunlirun;
	}
	
	/**
	 * 获取：纯利润
	 */
	public String getChunlirun() {
		return chunlirun;
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
