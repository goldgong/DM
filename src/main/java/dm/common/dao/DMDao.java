package dm.common.dao;

import java.sql.SQLException; 
import java.util.List; 
import org.apache.ibatis.session.SqlSession; 

/** 
* <PRE> 
* 1. author	:	정수원 
* 2. date	:	2015.04.26 
* </PRE> 
* 
*/ 
public interface DMDao {
	/** 
	* 특정 쿼리문 실행 : Delete 
	* @param qName : 쿼리문 네임스페이스 
	* @param parameter 
	* @return 
	* @throws SQLException 
	*/ 
	int delete(String qName, Object parameter) throws SQLException; 
	int delete(String qName) throws SQLException; 

	/** 
	* 특정 쿼리문 실행 : Insert 
	* @param qName : 쿼리문 네임스페이스 
	* @param parameter 
	* @return 
	* @throws SQLException 
	*/ 
	int insert(String qName, Object parameter) throws SQLException; 
	int insert(String qName) throws SQLException; 

	/** 
	* 틀정 쿼리문 실행 : Update 
	* @param qName 
	* @param parameter 
	* @return 
	* @throws SQLException 
	*/ 
	int update(String qName, Object parameter) throws SQLException; 
	int update(String qName) throws SQLException; 

	/** 
	* 특정 쿼리문 실행 : SELECT - ONE 
	* @param qName 
	* @param parameter 
	* @return Object 
	* @throws SQLException 
	*/ 
	Object selectOne(String qName, Object parameter) throws SQLException; 
	Object selectOne(String qName) throws SQLException; 


	/** 
	* 특정쿼리문 실행 : SELECT - LIST 
	* @param qName 
	* @param parameter 
	* @return 
	* @throws SQLException 
	*/ 
	@SuppressWarnings("rawtypes") 
	List selectList(String qName, Object parameter) throws SQLException; 

	@SuppressWarnings("rawtypes") 
	List selectList(String qName) throws SQLException; 

	public SqlSession getSqlSession();
}
