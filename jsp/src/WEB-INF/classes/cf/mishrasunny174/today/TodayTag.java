package cf.mishrasunny174.today;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDateTime;

public class TodayTag extends SimpleTagSupport {
    
    @Override
    public void doTag() throws IOException{
        LocalDateTime datetime = LocalDateTime.now();
        getJspContext().getOut().println(datetime);
    }
}