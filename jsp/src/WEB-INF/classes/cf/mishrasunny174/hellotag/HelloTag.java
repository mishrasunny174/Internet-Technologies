package cf.mishrasunny174.hellotag;

import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.jsp.tagext.*;

public class HelloTag extends SimpleTagSupport {
    private String name = "World";

    public void setName (String name) {
        this.name = name;
    }

    public void doTag() throws IOException {
        getJspContext().getOut().println("Hello "+name);
    }
}