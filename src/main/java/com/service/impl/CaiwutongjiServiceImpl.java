package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaiwutongjiDao;
import com.entity.CaiwutongjiEntity;
import com.service.CaiwutongjiService;
import com.entity.vo.CaiwutongjiVO;
import com.entity.view.CaiwutongjiView;

@Service("caiwutongjiService")
public class CaiwutongjiServiceImpl extends ServiceImpl<CaiwutongjiDao, CaiwutongjiEntity> implements CaiwutongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwutongjiEntity> page = this.selectPage(
                new Query<CaiwutongjiEntity>(params).getPage(),
                new EntityWrapper<CaiwutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwutongjiEntity> wrapper) {
		  Page<CaiwutongjiView> page =new Query<CaiwutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwutongjiVO> selectListVO(Wrapper<CaiwutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwutongjiVO selectVO(Wrapper<CaiwutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwutongjiView> selectListView(Wrapper<CaiwutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwutongjiView selectView(Wrapper<CaiwutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
