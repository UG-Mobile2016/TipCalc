package me.juancrg90.tipcalc;

import android.app.Application;

/**
 * Created by JuanCrg90 on 9/26/16.
 */

public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "http://juancrg90.me";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
