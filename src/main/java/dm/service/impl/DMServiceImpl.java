package dm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service; 

import dm.common.service.AbstractBaseService;
import dm.domain.DMVO; 
import dm.mybatis.mapper.DMMapper;
import dm.service.DMService;


/** 
* <PRE> 
* 1. author	:	정수원 
* 2. date	:	2015.04.26 
* </PRE> 
* 
*/ 
@Service("DMVOService") 
public class DMServiceImpl extends AbstractBaseService<DMServiceImpl> implements DMService { 

	@Override 
	public List<DMVO> selectDMList(DMVO vo) throws Exception { 
	DMMapper mapper = getMapper(DMMapper.class); 
	List<DMVO> selectDMList = mapper.selectDMList(vo); 
	return selectDMList; 
	} 
}
