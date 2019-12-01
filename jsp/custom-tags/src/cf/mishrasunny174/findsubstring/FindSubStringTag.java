package cf.mishrasunny174.findsubstring;

import java.io.IOException;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FindSubStringTag extends SimpleTagSupport {
    private String targetString = null;
    private String searchString = null;

    public void setTargetString(String targeString) {
        this.targetString = targeString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    @Override
    public void doTag() throws IOException{
        int index = targetString.indexOf(searchString);
        if(index!=-1) {
            getJspContext().getOut().println("Found "+searchString+" at index "+index);
        } else {
            getJspContext().getOut().println("Substring "+searchString+" not found");
        }
    }
}