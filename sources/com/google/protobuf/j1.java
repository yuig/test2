package com.google.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class j1 {
    public static com.google.firebase.messaging.q a(Object obj) {
        return ((h1) obj).f33902a;
    }

    public static i1 b(Object obj) {
        return (i1) obj;
    }

    public static int c(int i13, Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        h1 h1Var = (h1) obj2;
        int i14 = 0;
        if (!i1Var.isEmpty()) {
            for (Map.Entry entry : i1Var.entrySet()) {
                i14 += h1Var.a(i13, entry.getKey(), entry.getValue());
            }
        }
        return i14;
    }

    public static boolean d(Object obj) {
        return !((i1) obj).f33909a;
    }

    public static i1 e(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        i1 i1Var2 = (i1) obj2;
        if (!i1Var2.isEmpty()) {
            if (!i1Var.f33909a) {
                i1Var = i1Var.b();
            }
            i1Var.a();
            if (!i1Var2.isEmpty()) {
                i1Var.putAll(i1Var2);
            }
        }
        return i1Var;
    }

    public static i1 f() {
        return i1.f33908b.b();
    }

    public static void g(Object obj) {
        ((i1) obj).f33909a = false;
    }
}
