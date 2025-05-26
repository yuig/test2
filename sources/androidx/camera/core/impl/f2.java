package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class f2 extends g1 {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f16839b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f16840c;

    public f2(h0 h0Var, c0 c0Var) {
        super(h0Var);
        this.f16839b = h0Var;
        this.f16840c = c0Var;
        c0Var.p();
        Boolean bool = Boolean.FALSE;
        ((Boolean) c0Var.j(a0.Xm, bool)).getClass();
        ((Boolean) c0Var.j(a0.Ym, bool)).getClass();
    }

    @Override // androidx.camera.core.impl.g1, c0.r
    public final boolean f() {
        return this.f16839b.f();
    }

    @Override // androidx.camera.core.impl.g1, androidx.camera.core.impl.h0
    public final h0 k() {
        return this.f16839b;
    }

    @Override // androidx.camera.core.impl.g1, c0.r
    public final androidx.lifecycle.h0 q() {
        return this.f16839b.q();
    }
}
