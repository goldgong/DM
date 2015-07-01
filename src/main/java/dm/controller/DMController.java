package dm.controller;

import java.util.List; 
import java.util.UUID; 

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.servlet.ModelAndView; 

import dm.domain.DMVO; 
import dm.service.DMService; 

/** 
* <PRE> 
* 1. author	:	정수원 
* 2. date	:	2015.04.26 
* </PRE> 
* 
*/ 
@RestController 
public class DMController {

	@Autowired DMService DMService; 

	//************************************** REST API *****************************************// 

//	@RequestMapping(value="/rest/DMVO/register", method = RequestMethod.POST) 
//	public ModelAndView registerDMVO(DMVO DMVO) throws Exception { 
//
////	DMVO.setDMVOUid(String.valueOf(System.currentTimeMillis())+UUID.randomUUID().toString()); 
////	DMService.insertDMVO(DMVO); 
//
//	return new ModelAndView("redirect:/DMVO/DMVOs"); 
//	} 
//
//	@RequestMapping(value="/rest/DMVO/{DMVOUid}", method = RequestMethod.GET) 
//	public DMVO selectDMVO(@PathVariable String DMVOUid) throws Exception { 
//
////	DMVO DMVO = DMService.selectDMVO(DMVOUid); 
////	return DMVO;
//		return null;
//	} 

	@RequestMapping(value="/rest/dm/list", method = RequestMethod.GET) 
	public List<DMVO> selectDMList(DMVO DMVO) throws Exception { 

	List<DMVO> selectDMVOList = DMService.selectDMList(DMVO); 
	return selectDMVOList;
	} 
}
