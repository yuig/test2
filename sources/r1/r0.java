package r1;

import kotlin.Unit;
import m1.f1;

/* loaded from: classes2.dex */
public final class r0 implements androidx.compose.foundation.lazy.layout.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f105975a;

    public r0(p0 p0Var) {
        this.f105975a = p0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final int a() {
        p0 p0Var = this.f105975a;
        return (-((a0) p0Var.i()).f105842h) + ((a0) p0Var.i()).f105846l;
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final float b() {
        p0 p0Var = this.f105975a;
        int h10 = p0Var.f105955b.f105888a.h();
        int h13 = p0Var.f105955b.f105889b.h();
        return p0Var.e() ? (h10 * 500) + h13 + 100 : (h10 * 500) + h13;
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final z3.b c() {
        return new z3.b(-1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final int d() {
        long d2;
        p0 p0Var = this.f105975a;
        if (((a0) p0Var.i()).f105845k == f1.Vertical) {
            q3.q0 q0Var = ((a0) p0Var.i()).f105848n;
            d2 = lb.l0.d(q0Var.j(), q0Var.i()) & 4294967295L;
        } else {
            q3.q0 q0Var2 = ((a0) p0Var.i()).f105848n;
            d2 = lb.l0.d(q0Var2.j(), q0Var2.i()) >> 32;
        }
        return (int) d2;
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final float e() {
        p0 p0Var = this.f105975a;
        return (p0Var.f105955b.f105888a.h() * 500) + p0Var.f105955b.f105889b.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final Object f(int i13, bl2.c cVar) {
        Object k13 = p0.k(this.f105975a, i13, cVar);
        return k13 == cl2.a.COROUTINE_SUSPENDED ? k13 : Unit.f80348a;
    }
}
