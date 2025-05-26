package com.google.android.gms.internal.measurement;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x6 {
    public static w6 a(Object obj, Object obj2) {
        w6 w6Var = (w6) obj;
        w6 w6Var2 = (w6) obj2;
        if (!w6Var2.isEmpty()) {
            if (!w6Var.f31686a) {
                if (w6Var.isEmpty()) {
                    w6Var = new w6();
                } else {
                    w6 w6Var3 = new w6(w6Var);
                    w6Var3.f31686a = true;
                    w6Var = w6Var3;
                }
            }
            w6Var.b();
            if (!w6Var2.isEmpty()) {
                w6Var.putAll(w6Var2);
            }
        }
        return w6Var;
    }

    public static void b(Object obj) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw new NoSuchMethodError();
    }

    public static void c(Object obj, Object obj2) {
        w6 w6Var = (w6) obj;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        if (w6Var.isEmpty()) {
            return;
        }
        Iterator it = w6Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    public static w6 d() {
        w6 w6Var = w6.f31685b;
        if (w6Var.isEmpty()) {
            return new w6();
        }
        w6 w6Var2 = new w6(w6Var);
        w6Var2.f31686a = true;
        return w6Var2;
    }

    public static void e(Object obj) {
        ((w6) obj).f31686a = false;
    }

    public static w6 f(Object obj) {
        return (w6) obj;
    }

    public static boolean g(Object obj) {
        return !((w6) obj).f31686a;
    }
}
