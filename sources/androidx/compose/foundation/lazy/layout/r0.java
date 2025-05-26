package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s3.g2;

/* loaded from: classes2.dex */
public final class r0 extends u2.p implements g2 {

    /* renamed from: n, reason: collision with root package name */
    public Function0 f17280n;

    /* renamed from: o, reason: collision with root package name */
    public n0 f17281o;

    /* renamed from: p, reason: collision with root package name */
    public m1.f1 f17282p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17283q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17284r;

    /* renamed from: s, reason: collision with root package name */
    public z3.h f17285s;

    /* renamed from: t, reason: collision with root package name */
    public final p0 f17286t = new p0(this, 0);

    /* renamed from: u, reason: collision with root package name */
    public p0 f17287u;

    public r0(Function0 function0, n0 n0Var, m1.f1 f1Var, boolean z13, boolean z14) {
        this.f17280n = function0;
        this.f17281o = n0Var;
        this.f17282p = f1Var;
        this.f17283q = z13;
        this.f17284r = z14;
        M0();
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    public final void M0() {
        int i13 = 1;
        this.f17285s = new z3.h(new o0(this, i13), new o0(this, 2), this.f17284r);
        this.f17287u = this.f17283q ? new p0(this, i13) : null;
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        rl2.u[] uVarArr = z3.w.f140760a;
        z3.x xVar = z3.t.f140744m;
        rl2.u[] uVarArr2 = z3.w.f140760a;
        rl2.u uVar = uVarArr2[6];
        Boolean bool = Boolean.TRUE;
        xVar.getClass();
        jVar.e(xVar, bool);
        jVar.e(z3.t.F, this.f17286t);
        if (this.f17282p == m1.f1.Vertical) {
            z3.h hVar = this.f17285s;
            if (hVar == null) {
                Intrinsics.r("scrollAxisRange");
                throw null;
            }
            z3.x xVar2 = z3.t.f140748q;
            rl2.u uVar2 = uVarArr2[11];
            xVar2.getClass();
            jVar.e(xVar2, hVar);
        } else {
            z3.h hVar2 = this.f17285s;
            if (hVar2 == null) {
                Intrinsics.r("scrollAxisRange");
                throw null;
            }
            z3.w.g(jVar, hVar2);
        }
        p0 p0Var = this.f17287u;
        if (p0Var != null) {
            jVar.e(z3.i.f140679f, new z3.a(null, p0Var));
        }
        jVar.e(z3.i.A, new z3.a(null, new m1.e0(2, new o0(this, 0))));
        z3.b c13 = this.f17281o.c();
        z3.x xVar3 = z3.t.f140738g;
        rl2.u uVar3 = uVarArr2[20];
        xVar3.getClass();
        jVar.e(xVar3, c13);
    }
}
