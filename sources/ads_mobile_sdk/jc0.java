package ads_mobile_sdk;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class jc0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile jc0 f6743a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile jc0 f6744b;

    /* renamed from: c, reason: collision with root package name */
    public static final jc0 f6745c = new jc0();

    public jc0() {
        Collections.emptyMap();
    }

    public static jc0 a() {
        k22 k22Var = k22.f7066c;
        jc0 jc0Var = f6743a;
        if (jc0Var == null) {
            synchronized (jc0.class) {
                try {
                    jc0Var = f6743a;
                    if (jc0Var == null) {
                        jc0Var = ic0.a("getEmptyRegistry");
                        if (jc0Var == null) {
                            jc0Var = f6745c;
                        }
                        f6743a = jc0Var;
                    }
                } finally {
                }
            }
        }
        return jc0Var;
    }

    public static jc0 b() {
        jc0 jc0Var = f6744b;
        if (jc0Var != null) {
            return jc0Var;
        }
        synchronized (jc0.class) {
            try {
                jc0 jc0Var2 = f6744b;
                if (jc0Var2 != null) {
                    return jc0Var2;
                }
                k22 k22Var = k22.f7066c;
                jc0 a13 = ic0.a("loadGeneratedRegistry");
                if (a13 == null && (a13 = a.l9.b()) == null && (a13 = ic0.a("getEmptyRegistry")) == null) {
                    a13 = f6745c;
                }
                f6744b = a13;
                return a13;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
