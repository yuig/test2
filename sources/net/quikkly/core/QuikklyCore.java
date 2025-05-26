package net.quikkly.core;

import java.io.File;

/* loaded from: classes4.dex */
public class QuikklyCore {
    static {
        System.loadLibrary("quikklycore");
        System.loadLibrary("quikklycore-jni");
    }

    public static synchronized Pipeline buildPipeline(String str) {
        Pipeline nativeBuildPipeline;
        synchronized (QuikklyCore.class) {
            checkLinking();
            nativeBuildPipeline = nativeBuildPipeline(str);
        }
        return nativeBuildPipeline;
    }

    public static Pipeline buildPipelineFromFile(File file) {
        return buildPipeline(StrUtils.readUtf8FromFile(file));
    }

    public static synchronized void checkLinking() {
        synchronized (QuikklyCore.class) {
            if (!nativeCheckLinking()) {
                throw new LinkageError("libquikklycore has failed linking tests.");
            }
        }
    }

    public static synchronized boolean isDebug() {
        boolean nativeIsDebug;
        synchronized (QuikklyCore.class) {
            checkLinking();
            nativeIsDebug = nativeIsDebug();
        }
        return nativeIsDebug;
    }

    private static native Pipeline nativeBuildPipeline(String str);

    private static native boolean nativeCheckLinking();

    private static native boolean nativeIsDebug();

    private static native String nativeVersionString();

    public static synchronized String versionString() {
        String nativeVersionString;
        synchronized (QuikklyCore.class) {
            checkLinking();
            nativeVersionString = nativeVersionString();
        }
        return nativeVersionString;
    }
}
