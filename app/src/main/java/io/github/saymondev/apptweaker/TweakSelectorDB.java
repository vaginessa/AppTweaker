package io.github.saymondev.apptweaker;

/**
 * Created by saymon on 08/12/16.
 */



public class TweakSelectorDB {

    public static String WATweakName[] = {
            "Video & Image Size"
    };
    public static String WATweakDescription[] = {
            "This tweak able you to change max size of Video/Image can you send."
    };

    public static int ArrayLengthCalc() {
        int value = 0;
        if (SelectApp.globalPackageName.equals("com.whatsapp")) {
            value = WATweakName.length;
        }
        return value;
    }
}
