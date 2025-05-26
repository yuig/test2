package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes3.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31503a;

    /* renamed from: b, reason: collision with root package name */
    public final ok.g0 f31504b;

    public l4(Context context, ok.g0 g0Var) {
        this.f31503a = context;
        this.f31504b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l4) {
            l4 l4Var = (l4) obj;
            if (this.f31503a.equals(l4Var.f31503a)) {
                ok.g0 g0Var = l4Var.f31504b;
                ok.g0 g0Var2 = this.f31504b;
                if (g0Var2 != null ? g0Var2.equals(g0Var) : g0Var == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f31503a.hashCode() ^ 1000003) * 1000003;
        ok.g0 g0Var = this.f31504b;
        return hashCode ^ (g0Var == null ? 0 : g0Var.hashCode());
    }

    public final String toString() {
        return a.a.m("FlagsContext{context=", String.valueOf(this.f31503a), ", hermeticFileOverrides=", String.valueOf(this.f31504b), "}");
    }
}
