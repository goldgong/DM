package dm.service;
import java.util.List; 

import dm.domain.DMVO; 


/** 
* <PRE> 
* 1. author	:	정수원 
* 2. date	:	2015.04.26 
* </PRE> 
* 
*/ 
public interface  DMService {
	List<DMVO> selectDMList(DMVO vo) throws Exception; 
}
