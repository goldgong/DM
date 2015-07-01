package dm.mybatis.mapper;
import java.util.List; 

import dm.domain.DMVO; 

public interface DMMapper {
	List<DMVO> selectDMList(DMVO vo); 
}
