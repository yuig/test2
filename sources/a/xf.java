package a;

import ads_mobile_sdk.oo;
import ads_mobile_sdk.s81;
import ads_mobile_sdk.t81;
import ads_mobile_sdk.w81;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xf implements mf {
    public static int a(int i13, Object obj, Object obj2) {
        w81 w81Var = (w81) obj;
        t81 t81Var = (t81) obj2;
        int i14 = 0;
        if (!w81Var.isEmpty()) {
            for (Map.Entry entry : w81Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                t81Var.getClass();
                int h10 = oo.h(i13);
                int a13 = t81.a(t81Var.f11451a, key, value);
                i14 += oo.i(a13) + a13 + h10;
            }
        }
        return i14;
    }

    public static s81 b(Object obj) {
        return ((t81) obj).f11451a;
    }

    public static w81 c() {
        return w81.f12896b.b();
    }

    public static w81 d(Object obj, Object obj2) {
        w81 w81Var = (w81) obj;
        w81 w81Var2 = (w81) obj2;
        if (!w81Var2.isEmpty()) {
            if (!w81Var.f12897a) {
                w81Var = w81Var.b();
            }
            if (!w81Var.f12897a) {
                throw new UnsupportedOperationException();
            }
            if (!w81Var2.isEmpty()) {
                w81Var.putAll(w81Var2);
            }
        }
        return w81Var;
    }

    public static w81 e(Object obj) {
        return (w81) obj;
    }

    public static boolean f(Object obj) {
        return !((w81) obj).f12897a;
    }

    public static void g(Object obj) {
        ((w81) obj).f12897a = false;
    }
}
