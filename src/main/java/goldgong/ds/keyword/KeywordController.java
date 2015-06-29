package goldgong.ds.keyword;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ds/keyword")
public class KeywordController {
	Logger log = Logger.getLogger(getClass());
	
    @RequestMapping("write.do")
    String home() {
    	log.info("write.do do it!!");
        return "keyword/write";
    }

}
