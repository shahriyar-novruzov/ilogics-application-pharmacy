package com.developia.application.pharmacy.object;

/**
 * Created by shnovruzov on 10/02/2019.
 */
public enum Language {
    AZE("AZE"), RUS("RUS"), ENG("ENG");

    private String code;

    Language(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Language convertFromCode (String code) {
        for (Language lang : values())
            if (lang.getCode().equals(code))
                return lang;

        return null;
    }
}
