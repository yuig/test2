package b2;

import kotlin.jvm.internal.Intrinsics;
import w1.l1;
import w1.r2;
import w1.y1;

/* loaded from: classes2.dex */
public final class r0 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f21205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21206b;

    public r0(t0 t0Var, boolean z13) {
        this.f21205a = t0Var;
        this.f21206b = z13;
    }

    @Override // w1.y1
    public final void a() {
        r2 d2;
        boolean z13 = this.f21206b;
        w1.v0 v0Var = z13 ? w1.v0.SelectionStart : w1.v0.SelectionEnd;
        t0 t0Var = this.f21205a;
        t0.b(t0Var, v0Var);
        long k13 = t0Var.k(z13);
        float f13 = d0.f21130a;
        long d13 = com.bumptech.glide.c.d(a3.c.d(k13), a3.c.e(k13) - 1.0f);
        l1 l1Var = t0Var.f21219d;
        if (l1Var == null || (d2 = l1Var.d()) == null) {
            return;
        }
        long e13 = d2.e(d13);
        t0Var.f21228m = e13;
        t0Var.f21232q.setValue(new a3.c(e13));
        t0Var.f21230o = 0L;
        t0Var.f21233r = -1;
        l1 l1Var2 = t0Var.f21219d;
        if (l1Var2 != null) {
            l1Var2.f127371q.setValue(Boolean.TRUE);
        }
        t0Var.u(false);
    }

    @Override // w1.y1
    public final void b() {
        t0 t0Var = this.f21205a;
        t0.b(t0Var, null);
        t0.a(t0Var, null);
        t0Var.u(true);
    }

    @Override // w1.y1
    public final void c(long j13) {
    }

    @Override // w1.y1
    public final void d() {
        t0 t0Var = this.f21205a;
        t0.b(t0Var, null);
        t0.a(t0Var, null);
        t0Var.u(true);
    }

    @Override // w1.y1
    public final void e(long j13) {
        t0 t0Var = this.f21205a;
        long h10 = a3.c.h(t0Var.f21230o, j13);
        t0Var.f21230o = h10;
        t0Var.f21232q.setValue(new a3.c(a3.c.h(t0Var.f21228m, h10)));
        h4.f0 l13 = t0Var.l();
        a3.c i13 = t0Var.i();
        Intrinsics.f(i13);
        a.e eVar = q.f21202d;
        t0.c(t0Var, l13, i13.f482a, false, this.f21206b, eVar, true);
        t0Var.u(false);
    }

    @Override // w1.y1
    public final void onCancel() {
    }
}
