package androidx.fragment.app;

import android.content.Context;

/* loaded from: classes.dex */
public final class o0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f18392b;

    public o0(w0 w0Var) {
        this.f18392b = w0Var;
    }

    @Override // androidx.fragment.app.f0
    public final Fragment a(ClassLoader classLoader, String str) {
        g0 g0Var = this.f18392b.f18470v;
        Context context = g0Var.f18325b;
        g0Var.getClass();
        return Fragment.instantiate(context, str, null);
    }
}
