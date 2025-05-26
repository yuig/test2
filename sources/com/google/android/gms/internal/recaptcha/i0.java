package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class i0 extends h0 {
    @Override // com.google.android.gms.internal.recaptcha.h0
    public final void a(long j13, Object obj, Object obj2) {
        e0 e0Var = (e0) j1.k(obj, j13);
        e0 e0Var2 = (e0) j1.k(obj2, j13);
        int size = e0Var.size();
        int size2 = e0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((n) e0Var).f31771a) {
                e0Var = ((g0) e0Var).c(size2 + size);
            }
            e0Var.addAll(e0Var2);
        }
        if (size > 0) {
            e0Var2 = e0Var;
        }
        j1.d(j13, obj, e0Var2);
    }

    @Override // com.google.android.gms.internal.recaptcha.h0
    public final void b(long j13, b0 b0Var) {
        ((n) ((e0) j1.k(b0Var, j13))).f31771a = false;
    }
}
