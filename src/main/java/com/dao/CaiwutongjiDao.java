package com.dao;

import com.entity.CaiwutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwutongjiVO;
import com.entity.view.CaiwutongjiView;


/**
 * 财务统计
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:44:13
 */
public interface CaiwutongjiDao extends BaseMapper<CaiwutongjiEntity> {
	
	List<CaiwutongjiVO> selectListVO(@Param("ew") Wrapper<CaiwutongjiEntity> wrapper);
	
	CaiwutongjiVO selectVO(@Param("ew") Wrapper<CaiwutongjiEntity> wrapper);
	
	List<CaiwutongjiView> selectListView(@Param("ew") Wrapper<CaiwutongjiEntity> wrapper);

	List<CaiwutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwutongjiEntity> wrapper);
	
	CaiwutongjiView selectView(@Param("ew") Wrapper<CaiwutongjiEntity> wrapper);
	
}
