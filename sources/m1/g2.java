package m1;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g2 extends t0 implements s3.u1, z2.q, l3.d, s3.g2 {
    public final n1 A;
    public final q B;
    public final o2 C;
    public final w1 D;
    public final o E;
    public a F;
    public i1.j G;
    public f2 H;

    /* renamed from: x, reason: collision with root package name */
    public k1.e2 f85352x;

    /* renamed from: y, reason: collision with root package name */
    public c1 f85353y;

    /* renamed from: z, reason: collision with root package name */
    public final m3.d f85354z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(k1.e2 e2Var, e eVar, c1 c1Var, f1 f1Var, h2 h2Var, o1.l lVar, boolean z13, boolean z14) {
        super(o1.f85492i, z13, lVar, f1Var);
        q1 q1Var = androidx.compose.foundation.gestures.a.f17142a;
        this.f85352x = e2Var;
        this.f85353y = c1Var;
        m3.d dVar = new m3.d();
        this.f85354z = dVar;
        n1 n1Var = new n1(z13);
        M0(n1Var);
        this.A = n1Var;
        q qVar = new q(new j1.a0(new i1.x1(androidx.compose.foundation.gestures.a.f17144c)));
        this.B = qVar;
        k1.e2 e2Var2 = this.f85352x;
        c1 c1Var2 = this.f85353y;
        o2 o2Var = new o2(e2Var2, c1Var2 == null ? qVar : c1Var2, f1Var, h2Var, dVar, z14);
        this.C = o2Var;
        w1 w1Var = new w1(o2Var, z13);
        this.D = w1Var;
        o oVar = new o(f1Var, o2Var, z14, eVar);
        M0(oVar);
        this.E = oVar;
        M0(new m3.g(w1Var, dVar));
        M0(new z2.z());
        t1.k kVar = new t1.k();
        kVar.f115761n = oVar;
        M0(kVar);
        M0(new k1.z0(new k1.s2(this, 2)));
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // u2.p
    public final void D0() {
        com.bumptech.glide.c.L0(this, new androidx.activity.a0(this, 2));
        this.F = a.f85276a;
    }

    @Override // s3.u1
    public final void P() {
        com.bumptech.glide.c.L0(this, new androidx.activity.a0(this, 2));
    }

    @Override // m1.t0
    public final Object T0(r0 r0Var, bl2.c cVar) {
        k1.v1 v1Var = k1.v1.UserInput;
        o2 o2Var = this.C;
        Object e13 = o2Var.e(v1Var, new y1(o2Var, null, r0Var), cVar);
        return e13 == cl2.a.COROUTINE_SUSPENDED ? e13 : Unit.f80348a;
    }

    @Override // m1.t0
    public final void U0(long j13) {
    }

    @Override // l3.d
    public final boolean V(KeyEvent keyEvent) {
        return false;
    }

    @Override // m1.t0
    public final void V0(long j13) {
        kotlin.jvm.internal.j.z(this.f85354z.c(), null, null, new z1(this, j13, null), 3);
    }

    @Override // m1.t0, s3.f2
    public final void W(n3.j jVar, n3.k kVar, long j13) {
        long j14;
        List list = jVar.f89070a;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            if (((Boolean) this.f85579q.invoke((n3.q) list.get(i13))).booleanValue()) {
                super.W(jVar, kVar, j13);
                break;
            }
            i13++;
        }
        if (kVar == n3.k.Main && n3.o.a(jVar.f89073d, 6)) {
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                if (!(!((n3.q) list.get(i14)).m())) {
                    return;
                }
            }
            Intrinsics.f(this.F);
            n4.b bVar = com.bumptech.glide.c.U0(this).f110830r;
            a3.c cVar = new a3.c(0L);
            int size3 = list.size();
            int i15 = 0;
            while (true) {
                j14 = cVar.f482a;
                if (i15 >= size3) {
                    break;
                }
                cVar = new a3.c(a3.c.h(j14, ((n3.q) list.get(i15)).j()));
                i15++;
            }
            kotlin.jvm.internal.j.z(z0(), null, null, new d2(this, a3.c.i(j14, -bVar.l0(64)), null), 3);
            int size4 = list.size();
            for (int i16 = 0; i16 < size4; i16++) {
                ((n3.q) list.get(i16)).a();
            }
        }
    }

    @Override // m1.t0
    public final boolean W0() {
        k1.e2 e2Var;
        o2 o2Var = this.C;
        return o2Var.f85493a.c() || ((e2Var = o2Var.f85494b) != null && e2Var.a());
    }

    public final void Y0() {
        this.G = new i1.j(this, 1);
        this.H = new f2(this, null);
    }

    @Override // z2.q
    public final void Z(z2.n nVar) {
        nVar.b(false);
    }

    @Override // l3.d
    public final boolean b0(KeyEvent keyEvent) {
        long d2;
        if (!this.f85580r) {
            return false;
        }
        long G = l3.c.G(keyEvent);
        int i13 = l3.a.f81492n;
        if ((!l3.a.a(G, jk.r.o()) && !l3.a.a(l3.c.G(keyEvent), jk.r.p())) || !pp2.a.p(l3.c.N(keyEvent), 2) || l3.c.E0(keyEvent)) {
            return false;
        }
        boolean z13 = this.C.f85496d == f1.Vertical;
        o oVar = this.E;
        if (z13) {
            int i14 = (int) (oVar.f85486v & 4294967295L);
            d2 = com.bumptech.glide.c.d(0.0f, l3.a.a(l3.c.G(keyEvent), jk.r.p()) ? i14 : -i14);
        } else {
            int i15 = (int) (oVar.f85486v >> 32);
            d2 = com.bumptech.glide.c.d(l3.a.a(l3.c.G(keyEvent), jk.r.p()) ? i15 : -i15, 0.0f);
        }
        kotlin.jvm.internal.j.z(z0(), null, null, new b2(this, d2, null), 3);
        return true;
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        if (this.f85580r && (this.G == null || this.H == null)) {
            Y0();
        }
        i1.j jVar2 = this.G;
        if (jVar2 != null) {
            z3.w.d(jVar, jVar2);
        }
        f2 f2Var = this.H;
        if (f2Var != null) {
            z3.w.e(jVar, f2Var);
        }
    }
}
