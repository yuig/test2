package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class s0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.s f18429a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f18430b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.x f18431c;

    public s0(androidx.lifecycle.s sVar, a.z0 z0Var, p0 p0Var) {
        this.f18429a = sVar;
        this.f18430b = z0Var;
        this.f18431c = p0Var;
    }

    @Override // androidx.fragment.app.b1
    public final void a(String str, Bundle bundle) {
        this.f18430b.a(str, bundle);
    }

    public final boolean b(androidx.lifecycle.r rVar) {
        return ((androidx.lifecycle.b0) this.f18429a).f18588d.isAtLeast(rVar);
    }

    public final void c() {
        this.f18429a.b(this.f18431c);
    }
}
