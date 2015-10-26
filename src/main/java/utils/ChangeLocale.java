package utils;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class ChangeLocale implements Serializable {

    private String locale = "fr";

    public ChangeLocale() {
    }

    public String getLocale() {
        return locale;
    }

    public String setFrenchLocale() {
        locale = "fr";
        return null;

    }

    public String setEnglishLocale() {
        locale = "en";
        return null;
    }
}
