package com.google.crypto.tink.shaded.protobuf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y0 {
    public static void a(Object obj) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        if (x0Var.isEmpty()) {
            return;
        }
        Iterator it = x0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean c(Object obj) {
        return !((x0) obj).f33713a;
    }

    public static x0 d(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        x0 x0Var2 = (x0) obj2;
        if (!x0Var2.isEmpty()) {
            if (!x0Var.f33713a) {
                x0Var = x0Var.c();
            }
            x0Var.b();
            if (!x0Var2.isEmpty()) {
                x0Var.putAll(x0Var2);
            }
        }
        return x0Var;
    }

    public static x0 e() {
        return x0.f33712b.c();
    }

    public static void f(Object obj) {
        ((x0) obj).f33713a = false;
    }
}
