package q1;

import androidx.compose.foundation.lazy.layout.n0;
import k1.v1;
import kotlin.Unit;
import lb.l0;
import m1.f1;
import m1.h2;
import q3.q0;
import s1.o0;
import s1.s0;

/* loaded from: classes2.dex */
public final class e implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f101890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f101891c;

    public /* synthetic */ e(h2 h2Var, boolean z13, int i13) {
        this.f101889a = i13;
        this.f101891c = h2Var;
        this.f101890b = z13;
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final int a() {
        int i13 = this.f101889a;
        h2 h2Var = this.f101891c;
        switch (i13) {
            case 0:
                h0 h0Var = (h0) h2Var;
                return (-((v) h0Var.i()).f102010k) + ((v) h0Var.i()).f102014o;
            default:
                o0 o0Var = (o0) h2Var;
                return (-((s1.f0) o0Var.m()).f110423f) + ((s1.f0) o0Var.m()).f110421d;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final float b() {
        int i13 = this.f101889a;
        h2 h2Var = this.f101891c;
        switch (i13) {
            case 0:
                h0 h0Var = (h0) h2Var;
                int h10 = h0Var.f101911d.f102035a.h();
                int h13 = h0Var.f101911d.f102036b.h();
                return h0Var.e() ? (h10 * 500) + h13 + 100 : (h10 * 500) + h13;
            default:
                o0 o0Var = (o0) h2Var;
                return s0.a(o0Var.m(), o0Var.n());
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final z3.b c() {
        int i13 = this.f101889a;
        boolean z13 = this.f101890b;
        switch (i13) {
            case 0:
                return z13 ? new z3.b(-1, 1) : new z3.b(1, -1);
            default:
                h2 h2Var = this.f101891c;
                return z13 ? new z3.b(((o0) h2Var).n(), 1) : new z3.b(1, ((o0) h2Var).n());
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final int d() {
        long d2;
        int i13 = this.f101889a;
        h2 h2Var = this.f101891c;
        switch (i13) {
            case 0:
                h0 h0Var = (h0) h2Var;
                if (((v) h0Var.i()).f102013n == f1.Vertical) {
                    q0 q0Var = ((v) h0Var.i()).f102016q;
                    d2 = l0.d(q0Var.j(), q0Var.i()) & 4294967295L;
                } else {
                    q0 q0Var2 = ((v) h0Var.i()).f102016q;
                    d2 = l0.d(q0Var2.j(), q0Var2.i()) >> 32;
                }
                return (int) d2;
            default:
                o0 o0Var = (o0) h2Var;
                return (int) (((s1.f0) o0Var.m()).f110422e == f1.Vertical ? ((s1.f0) o0Var.m()).a() & 4294967295L : ((s1.f0) o0Var.m()).a() >> 32);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final float e() {
        int i13 = this.f101889a;
        h2 h2Var = this.f101891c;
        switch (i13) {
            case 0:
                h0 h0Var = (h0) h2Var;
                return (h0Var.f101911d.f102035a.h() * 500) + h0Var.f101911d.f102036b.h();
            default:
                o0 o0Var = (o0) h2Var;
                return ml2.c.d(o0Var.f110493c.a() * o0Var.p()) + (o0Var.l() * o0Var.p());
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n0
    public final Object f(int i13, bl2.c cVar) {
        int i14 = this.f101889a;
        h2 h2Var = this.f101891c;
        switch (i14) {
            case 0:
                h0 h0Var = (h0) h2Var;
                d0.o oVar = h0.f101906w;
                h0Var.getClass();
                Object b13 = h0Var.b(v1.Default, new e0(h0Var, i13, 0, null), cVar);
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (b13 != aVar) {
                    b13 = Unit.f80348a;
                }
                if (b13 != aVar) {
                    break;
                }
                break;
            default:
                o0 o0Var = (o0) h2Var;
                o0Var.getClass();
                Object b14 = o0Var.b(v1.Default, new s1.n0(o0Var, 0.0f, i13, null), cVar);
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                if (b14 != aVar2) {
                    b14 = Unit.f80348a;
                }
                if (b14 != aVar2) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
