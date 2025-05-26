package xe2;

import androidx.lifecycle.c1;
import androidx.lifecycle.g1;
import androidx.lifecycle.l1;
import androidx.lifecycle.p1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.b0;
import df.j1;
import java.io.Closeable;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import pk.a3;
import pk.h1;
import so.oa;
import so.rb;
import so.u8;

/* loaded from: classes4.dex */
public final class d implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ we2.a f134835a;

    public d(we2.a aVar) {
        this.f134835a = aVar;
    }

    @Override // androidx.lifecycle.p1
    public final l1 c(Class cls, u6.e eVar) {
        l1 l1Var;
        final i iVar = new i();
        we2.a aVar = this.f134835a;
        c1 a13 = g1.a(eVar);
        m.h hVar = (m.h) aVar;
        hVar.getClass();
        hVar.f85199d = a13;
        hVar.f85200e = iVar;
        rb rbVar = new rb((oa) hVar.f85197b, (u8) hVar.f85198c);
        rb rbVar2 = (rb) ((f) j1.b0(f.class, rbVar));
        rbVar2.getClass();
        b0 b13 = h1.b(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        b13.e("vs.h0", rbVar2.f114111e);
        b13.e("lt.m", rbVar2.f114115f);
        b13.e("c31.t", rbVar2.f114139l);
        b13.e("jm0.a0", rbVar2.f114151o);
        b13.e("uc0.b", rbVar2.f114155p);
        b13.e("jx1.t", rbVar2.f114159q);
        b13.e("v91.v", rbVar2.f114163r);
        b13.e("cj0.e0", rbVar2.f114175u);
        b13.e("uc0.d", rbVar2.f114179v);
        b13.e("uc0.f", rbVar2.f114183w);
        b13.e("x91.l0", rbVar2.f114187x);
        b13.e("com.pinterest.boardAutoCollages.m0", rbVar2.f114191y);
        b13.e("fk0.x", rbVar2.f114195z);
        b13.e("ml0.r0", rbVar2.A);
        b13.e("qm0.z1", rbVar2.B);
        b13.e("u52.p", rbVar2.H);
        b13.e("vn0.n", rbVar2.I);
        b13.e("n70.t0", rbVar2.K);
        b13.e("il0.v", rbVar2.L);
        b13.e("uc0.o", rbVar2.M);
        b13.e("uc0.q", rbVar2.N);
        b13.e("uc0.s", rbVar2.O);
        b13.e("uc0.u", rbVar2.P);
        b13.e("ws.a0", rbVar2.Q);
        b13.e("uc0.w", rbVar2.R);
        b13.e("ca1.v", rbVar2.S);
        b13.e("ea1.q1", rbVar2.T);
        b13.e("ga1.x", rbVar2.U);
        b13.e("z91.v", rbVar2.V);
        b13.e("aa1.z", rbVar2.W);
        b13.e("s80.p6", rbVar2.f114101b0);
        b13.e("m90.b1", rbVar2.f114105c0);
        b13.e("p90.v0", rbVar2.f114112e0);
        b13.e("v90.l1", rbVar2.f114120g0);
        b13.e("s90.q0", rbVar2.f114124h0);
        b13.e("w90.h0", rbVar2.f114132j0);
        b13.e("y90.y0", rbVar2.f114136k0);
        b13.e("sv.g", rbVar2.f114140l0);
        b13.e("ca0.b1", rbVar2.f114148n0);
        b13.e("la0.n1", rbVar2.f114152o0);
        b13.e("ka0.w", rbVar2.f114156p0);
        b13.e("kd1.b", rbVar2.f114176u0);
        b13.e("uc0.d0", rbVar2.f114180v0);
        b13.e("ma1.y", rbVar2.f114184w0);
        b13.e("ub1.a0", rbVar2.f114188x0);
        b13.e("h90.j0", rbVar2.f114192y0);
        b13.e("g90.c0", rbVar2.f114196z0);
        b13.e("uc0.f0", rbVar2.A0);
        b13.e("n91.c0", rbVar2.B0);
        b13.e("hg0.i", rbVar2.C0);
        b13.e("uc0.g0", rbVar2.D0);
        b13.e("uc0.p0", rbVar2.E0);
        b13.e("rw1.h", rbVar2.H0);
        b13.e("qp1.t0", rbVar2.I0);
        b13.e("uc0.r0", rbVar2.J0);
        b13.e("dt0.c0", rbVar2.K0);
        b13.e("tx1.n", rbVar2.L0);
        b13.e("uc0.b1", rbVar2.M0);
        b13.e("uc0.d1", rbVar2.N0);
        b13.e("uc0.f1", rbVar2.O0);
        b13.e("uc0.l1", rbVar2.P0);
        b13.e("h80.s", rbVar2.U0);
        b13.e("uc0.n1", rbVar2.V0);
        b13.e("mt.s", rbVar2.X0);
        b13.e("uc0.p1", rbVar2.Y0);
        b13.e("ba1.p0", rbVar2.Z0);
        b13.e("uc0.r1", rbVar2.f114098a1);
        b13.e("eu1.l", rbVar2.f114102b1);
        b13.e("gu1.p", rbVar2.f114106c1);
        b13.e("iu1.u", rbVar2.f114110d1);
        b13.e("tx0.a0", rbVar2.f114117f1);
        b13.e("com.pinterest.feature.settings.notifications.z0", rbVar2.f114121g1);
        b13.e("dy0.o0", rbVar2.f114125h1);
        b13.e("ny0.w0", rbVar2.f114157p1);
        b13.e("yy0.e0", rbVar2.f114161q1);
        b13.e("bx1.s", rbVar2.f114173t1);
        b13.e("pb1.f0", rbVar2.f114177u1);
        b13.e("rb1.x", rbVar2.f114181v1);
        b13.e("jb1.o", rbVar2.f114185w1);
        b13.e("kb1.u", rbVar2.f114189x1);
        b13.e("sb1.t", rbVar2.f114193y1);
        b13.e("iz0.g0", rbVar2.F1);
        b13.e("v21.c0", rbVar2.G1);
        b13.e("u21.d0", rbVar2.H1);
        b13.e("w21.y1", rbVar2.L1);
        b13.e("ay1.z", rbVar2.O1);
        b13.e("y01.q1", rbVar2.Q1);
        b13.e("uc0.t1", rbVar2.R1);
        b13.e("hw1.v", rbVar2.S1);
        b13.e("w41.s1", rbVar2.T1);
        b13.e("i51.b0", rbVar2.U1);
        b13.e("kc1.j", rbVar2.V1);
        b13.e("hp0.f0", rbVar2.X1);
        b13.e("com.pinterest.qrCodeLogin.j0", rbVar2.Y1);
        b13.e("fz0.u", rbVar2.Z1);
        b13.e("s02.i", rbVar2.f114099a2);
        b13.e("s02.n", rbVar2.f114103b2);
        b13.e("uc0.v1", rbVar2.f114107c2);
        b13.e("wr1.d1", rbVar2.d2);
        b13.e("ea0.k0", rbVar2.f114114e2);
        b13.e("fa0.k0", rbVar2.f114118f2);
        b13.e("t02.o", rbVar2.f114122g2);
        b13.e("od1.o0", rbVar2.f114138k2);
        b13.e("ou.l", rbVar2.f114142l2);
        b13.e("uu.k", rbVar2.f114146m2);
        b13.e("ys0.s", rbVar2.f114150n2);
        b13.e("bi1.b0", rbVar2.f114154o2);
        b13.e("uc0.x1", rbVar2.f114158p2);
        b13.e("ns.p0", rbVar2.f114166r2);
        b13.e("c61.m1", rbVar2.f114174t2);
        b13.e("uc0.z1", rbVar2.f114178u2);
        b13.e("s52.s", rbVar2.f114182v2);
        b13.e("y52.j0", rbVar2.f114186w2);
        b13.e("uc0.b2", rbVar2.f114190x2);
        b13.e("s02.x", rbVar2.f114194y2);
        b13.e("uc0.d2", rbVar2.f114198z2);
        b13.e("uc0.f2", rbVar2.A2);
        b13.e("d92.o0", rbVar2.B2);
        b13.e("uc0.h2", rbVar2.C2);
        b13.e("uc0.j2", rbVar2.D2);
        b13.e("uc0.l2", rbVar2.E2);
        b13.e("uc0.w2", rbVar2.F2);
        b13.e("jh1.h", rbVar2.G2);
        b13.e("com.pinterest.feature.unauth.sba.s0", rbVar2.H2);
        b13.e("y31.p0", rbVar2.J2);
        b13.e("zc2.w", rbVar2.K2);
        b13.e("ad2.u", rbVar2.L2);
        b13.e("cd2.p", rbVar2.M2);
        wk2.a aVar2 = (wk2.a) ((a3) b13.a()).get(cls.getName());
        Function1 function1 = (Function1) eVar.a(g.f134836d);
        rb rbVar3 = (rb) ((f) j1.b0(f.class, rbVar));
        rbVar3.getClass();
        Object obj = rbVar3.N2.get();
        Object obj2 = rbVar3.O2.get();
        Object obj3 = rbVar3.P2.get();
        a0.B("gz.p", obj);
        a0.B("bt0.v", obj2);
        a0.B("ct0.a0", obj3);
        Object obj4 = a3.k(3, new Object[]{"gz.p", obj, "bt0.v", obj2, "ct0.a0", obj3}, null).get(cls.getName());
        if (obj4 == null) {
            if (function1 != null) {
                throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
            }
            if (aVar2 == null) {
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            l1Var = (l1) aVar2.get();
        } else {
            if (aVar2 != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (function1 == null) {
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }
            l1Var = (l1) function1.invoke(obj4);
        }
        Closeable closeable = new Closeable() { // from class: xe2.c
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                i.this.a();
            }
        };
        l1Var.getClass();
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        w6.b bVar = l1Var.f18658a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (bVar.f128108b) {
                w6.b.a(closeable);
            } else {
                synchronized (((bk.f) bVar.f128109c)) {
                    ((Set) bVar.f128110d).add(closeable);
                    Unit unit = Unit.f80348a;
                }
            }
        }
        return l1Var;
    }
}
