package jc;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f75373a = new a();

    public static void a() {
        f75373a.getClass();
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
    }

    public static void b() {
        f75373a.getClass();
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
    }

    public static void c(String str) {
        f75373a.getClass();
        HashSet hashSet = a.f75372a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void d(String str, Throwable th3) {
        f75373a.getClass();
        HashSet hashSet = a.f75372a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th3);
        hashSet.add(str);
    }
}
