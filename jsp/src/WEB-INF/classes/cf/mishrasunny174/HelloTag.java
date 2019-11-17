package cf.mishrasunny174;

import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.jsp.tagext.*;


public class HelloTag extends SimpleTagSupport{
    private String name = "World";

    public void setName(String name="World") {
        this.name = name;
    }

    public void doTag() throws IOException {
        getJSPContext().getOut().println("Hello "+name);
    }
}