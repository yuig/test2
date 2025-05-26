package org.chromium.base;

import dp2.e;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class JNIUtils {
    @CalledByNative
    public static ClassLoader getSplitClassLoader(String str) {
        if (!str.isEmpty()) {
            boolean d2 = BundleUtils.d(str);
            e.f("JNIUtils", "Init JNI Classloader for %s. isInstalled=%b", str, Boolean.valueOf(d2));
            if (d2) {
                return BundleUtils.b(str);
            }
        }
        return JNIUtils.class.getClassLoader();
    }
}
