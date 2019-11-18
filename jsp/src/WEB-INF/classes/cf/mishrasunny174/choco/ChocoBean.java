package cf.mishrasunny174.choco;

import java.io.Serializable;

public class ChocoBean implements Serializable{
    public static final long serialVersionUID = 2;
    private String texture = null;

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTexture() {
        return this.texture;
    }

    public String getBrands() {
        if(this.texture.equalsIgnoreCase("chewy")) {
            return "FiveStar, BarOne.";
        } else if(this.texture.equalsIgnoreCase("crunchy")) {
            return "Munch. KitKat.";
        } else {
            return "I am a dumb bean i don't know any other texture.";
        }
    }
}