package cf.mishrasunny174.reverse;

import java.io.IOException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ReverseTag extends SimpleTagSupport{
    private String input = null;

    public void setInput(String input) {
        this.input = input;
    }

    public void doTag() throws IOException {
        String reverseString = (new StringBuilder(this.input)).reverse().toString();
        getJspContext().getOut().println(reverseString);
    }
}