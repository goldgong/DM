package goldgong.ds.keyword;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KeywordController {
	Logger log = Logger.getLogger(getClass());
	
    @RequestMapping("/ds/keyword/write")
    public String hello() {
    	log.info("keyword.hello");
    	
        return "keyword/write";
    }

}
