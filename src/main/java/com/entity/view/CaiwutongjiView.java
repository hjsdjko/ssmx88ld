package com.entity.view;

import com.entity.CaiwutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 财务统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:44:13
 */
@TableName("caiwutongji")
public class CaiwutongjiView  extends CaiwutongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaiwutongjiView(){
	}
 
 	public CaiwutongjiView(CaiwutongjiEntity caiwutongjiEntity){
 	try {
			BeanUtils.copyProperties(this, caiwutongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
