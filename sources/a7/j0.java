package a7;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f1089a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f1090b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (j0.class) {
            if (f1089a.add(str)) {
                f1090b += ", " + str;
            }
        }
    }
}
