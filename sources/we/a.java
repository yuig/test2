package we;

import df.j1;
import ja.y;
import java.util.Set;
import kotlin.collections.h1;
import le.v;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f129234a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f129235b = h1.f("fb_mobile_purchase", "StartTrial", "Subscribe");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class<we.a>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public static final boolean a() {
        Object obj = a.class;
        if (p001if.a.b(obj)) {
            return false;
        }
        try {
            if (v.g(v.a()) || j1.O0()) {
                return false;
            }
            f fVar = f.f129239a;
            if (p001if.a.b(f.class)) {
                return false;
            }
            try {
                if (f.f129240b == null) {
                    f.f129240b = Boolean.valueOf(f.f129239a.a(v.a()) != null);
                }
                Boolean bool = f.f129240b;
                if (bool == null) {
                    return false;
                }
                obj = bool.booleanValue();
                return obj != 0;
            } catch (Throwable th3) {
                p001if.a.a(f.class, th3);
                return false;
            }
        } catch (Throwable th4) {
            p001if.a.a(obj, th4);
            return false;
        }
    }

    public static final void b(String str) {
        String str2 = "com.facebook.sdk.attributionTracking";
        if (p001if.a.b(a.class)) {
            return;
        }
        try {
            v.d().execute(new y(v.a(), str2, str, 4));
        } catch (Throwable th3) {
            p001if.a.a(a.class, th3);
        }
    }
}
