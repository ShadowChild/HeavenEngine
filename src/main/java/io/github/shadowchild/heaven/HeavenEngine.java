package io.github.shadowchild.heaven;


import io.github.shadowchild.heaven.utils.LWJGLNativesLoader;
import org.lwjgl.Version;

/**
 * Created by Zach Piddock on 23/02/2016.
 */
public class HeavenEngine {

    public static IEngine graphics;
    public static IEngine audio;
    public static IEngine input;

    public static void load() {

        System.out.println("LWJGL Version " + Version.getVersion() + " Found");
        LWJGLNativesLoader.load();
    }
}
