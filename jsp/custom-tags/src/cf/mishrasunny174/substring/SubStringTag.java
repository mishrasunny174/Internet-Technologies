package cf.mishrasunny174.substring;

import java.io.IOException;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SubStringTag extends SimpleTagSupport{
    private String input = null;
    private String start = null;
    private String end = null;

    public void setInput(String input) {
        this.input = input;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void doTag() throws IOException {
        int startIndex = this.input.indexOf(this.start);
        int endIndex = this.input.indexOf(this.end) + this.end.length();
        String substring = this.input.substring(startIndex, endIndex);
        getJspContext().getOut().println(substring);
    }

}