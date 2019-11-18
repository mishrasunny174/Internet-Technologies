package cf.mishrasunny174.choco;

import java.io.IOException;

import javax.servlet.jsp.tagext.*;

public class ChocoTag extends SimpleTagSupport {
    private ChocoBean bean = null;

    public ChocoTag() {
        super();
        this.bean = new ChocoBean();
    }

    public void setTexture(String texture) {
        this.bean.setTexture(texture);
    }

    @Override
    public void doTag() throws IOException {
        getJspContext().getOut().write(this.bean.getBrands());
    }
}