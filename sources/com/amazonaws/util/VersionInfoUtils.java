package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public abstract class VersionInfoUtils {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f29053a;

    static {
        LogFactory.a(VersionInfoUtils.class);
    }

    public static void a() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append("aws-sdk-");
        sb3.append(StringUtils.a("android"));
        sb3.append("/2.22.6 ");
        sb3.append(b(System.getProperty("os.name")));
        sb3.append("/");
        sb3.append(b(System.getProperty("os.version")));
        sb3.append(" ");
        sb3.append(b(System.getProperty("java.vm.name")));
        sb3.append("/");
        sb3.append(b(System.getProperty("java.vm.version")));
        sb3.append("/");
        sb3.append(b(System.getProperty("java.version")));
        String property = System.getProperty("user.language");
        String property2 = System.getProperty("user.region");
        if (property != null && property2 != null) {
            sb3.append(" ");
            sb3.append(b(property));
            sb3.append("_");
            sb3.append(b(property2));
        }
        f29053a = sb3.toString();
    }

    public static String b(String str) {
        return str != null ? str.replace(' ', '_') : str;
    }
}
