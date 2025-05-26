package k1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 extends s3.n implements z2.d, s3.g2, s3.s, z2.t {

    /* renamed from: p, reason: collision with root package name */
    public z2.x f78039p;

    /* renamed from: q, reason: collision with root package name */
    public final s0 f78040q;

    /* renamed from: r, reason: collision with root package name */
    public final w0 f78041r;

    /* renamed from: s, reason: collision with root package name */
    public final x0 f78042s;

    public u0(o1.l lVar) {
        s0 s0Var = new s0();
        s0Var.f78002n = lVar;
        M0(s0Var);
        this.f78040q = s0Var;
        w0 w0Var = new w0();
        M0(w0Var);
        this.f78041r = w0Var;
        x0 x0Var = new x0();
        M0(x0Var);
        this.f78042s = x0Var;
        M0(new z2.z());
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // s3.s
    public final void E(s3.q1 q1Var) {
        this.f78042s.E(q1Var);
    }

    public final void P0(o1.l lVar) {
        o1.d dVar;
        s0 s0Var = this.f78040q;
        if (Intrinsics.d(s0Var.f78002n, lVar)) {
            return;
        }
        o1.l lVar2 = s0Var.f78002n;
        if (lVar2 != null && (dVar = s0Var.f78003o) != null) {
            lVar2.b(new o1.e(dVar));
        }
        s0Var.f78003o = null;
        s0Var.f78002n = lVar;
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        z2.x xVar = this.f78039p;
        boolean z13 = false;
        if (xVar != null && xVar.isFocused()) {
            z13 = true;
        }
        rl2.u[] uVarArr = z3.w.f140760a;
        z3.x xVar2 = z3.t.f140743l;
        rl2.u uVar = z3.w.f140760a[4];
        Boolean valueOf = Boolean.valueOf(z13);
        xVar2.getClass();
        jVar.e(xVar2, valueOf);
        jVar.e(z3.i.f140694u, new z3.a(null, new j1.q0(this, 4)));
    }

    @Override // z2.d
    public final void x(z2.x xVar) {
        z0 M0;
        if (Intrinsics.d(this.f78039p, xVar)) {
            return;
        }
        boolean isFocused = xVar.isFocused();
        androidx.compose.foundation.lazy.layout.h0 h0Var = null;
        if (isFocused) {
            kotlin.jvm.internal.j.z(z0(), null, null, new t0(this, null), 3);
        }
        if (this.f120054m) {
            com.bumptech.glide.c.m0(this);
        }
        s0 s0Var = this.f78040q;
        o1.l lVar = s0Var.f78002n;
        if (lVar != null) {
            if (isFocused) {
                o1.d dVar = s0Var.f78003o;
                if (dVar != null) {
                    s0Var.M0(lVar, new o1.e(dVar));
                    s0Var.f78003o = null;
                }
                o1.d dVar2 = new o1.d();
                s0Var.M0(lVar, dVar2);
                s0Var.f78003o = dVar2;
            } else {
                o1.d dVar3 = s0Var.f78003o;
                if (dVar3 != null) {
                    s0Var.M0(lVar, new o1.e(dVar3));
                    s0Var.f78003o = null;
                }
            }
        }
        x0 x0Var = this.f78042s;
        if (isFocused != x0Var.f78081n) {
            if (isFocused) {
                q3.x xVar2 = x0Var.f78082o;
                if (xVar2 != null && xVar2.h() && (M0 = x0Var.M0()) != null) {
                    M0.M0(x0Var.f78082o);
                }
            } else {
                z0 M02 = x0Var.M0();
                if (M02 != null) {
                    M02.M0(null);
                }
            }
            x0Var.f78081n = isFocused;
        }
        w0 w0Var = this.f78041r;
        if (isFocused) {
            w0Var.getClass();
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            com.bumptech.glide.c.L0(w0Var, new v0(0, j0Var, w0Var));
            androidx.compose.foundation.lazy.layout.h0 h0Var2 = (androidx.compose.foundation.lazy.layout.h0) j0Var.f80434a;
            if (h0Var2 != null) {
                h0Var2.a();
                h0Var = h0Var2;
            }
            w0Var.f78068n = h0Var;
        } else {
            androidx.compose.foundation.lazy.layout.h0 h0Var3 = w0Var.f78068n;
            if (h0Var3 != null) {
                h0Var3.b();
            }
            w0Var.f78068n = null;
        }
        w0Var.f78069o = isFocused;
        this.f78039p = xVar;
    }
}
