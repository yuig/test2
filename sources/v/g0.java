package v;

/* loaded from: classes2.dex */
public final class g0 extends androidx.lifecycle.j0 {

    /* renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.h0 f123463m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f123464n;

    public g0(Object obj) {
        this.f123464n = obj;
    }

    @Override // androidx.lifecycle.h0
    public final Object d() {
        androidx.lifecycle.h0 h0Var = this.f123463m;
        return h0Var == null ? this.f123464n : h0Var.d();
    }

    @Override // androidx.lifecycle.j0
    public final void l(androidx.lifecycle.h0 h0Var, androidx.lifecycle.m0 m0Var) {
        throw null;
    }

    public final void m(androidx.lifecycle.l0 l0Var) {
        androidx.lifecycle.i0 i0Var;
        androidx.lifecycle.h0 h0Var = this.f123463m;
        if (h0Var != null && (i0Var = (androidx.lifecycle.i0) this.f18649l.d(h0Var)) != null) {
            i0Var.f18645a.j(i0Var);
        }
        this.f123463m = l0Var;
        super.l(l0Var, new f0(this, 0));
    }
}
