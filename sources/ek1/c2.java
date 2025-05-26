package ek1;

import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e7;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.k;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.v2;
import com.pinterest.api.model.wy0;
import h32.a4;
import h32.g3;
import h32.x2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class c2 {
    public static final h32.c1 a(String str, f30 f30Var, f30 productPin, boolean z13, Integer num, boolean z14, String str2, Short sh3, boolean z15, boolean z16, es.a adFormats, boolean z17, boolean z18, boolean z19, es.h adsCommonDisplay, vr.a adsCommonAnalytics) {
        h32.a0 a0Var;
        b01 M6;
        h01 W;
        String uid;
        Intrinsics.checkNotNullParameter(productPin, "productPin");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        x2 h10 = (!z14 || str2 == null) ? null : h(str, str2);
        Double d2 = null;
        String uid2 = f30Var != null ? f30Var.getUid() : null;
        if (z13) {
            h32.z zVar = new h32.z();
            String uid3 = productPin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            zVar.e(StringsKt.h0(uid3));
            zVar.d(productPin.z4());
            wy0 a63 = productPin.a6();
            zVar.b((a63 == null || (uid = a63.getUid()) == null) ? null : StringsKt.h0(uid));
            zVar.f(Short.valueOf((short) (num != null ? num.intValue() - 1 : 0)));
            zVar.g(uid2);
            String r53 = productPin.r5();
            zVar.c(r53 != null ? StringsKt.h0(r53) : null);
            a0Var = zVar.a();
        } else {
            a0Var = null;
        }
        h32.k0 g13 = ((es.v) adsCommonDisplay).g(f30Var, z18, z19);
        h32.f fVar = ((es.c) adFormats).j0(f30Var) ? new h32.f() : null;
        if (f30Var != null && (M6 = f30Var.M6()) != null && (W = d7.b.W(M6)) != null) {
            d2 = W.m();
        }
        g3 g3Var = (d2 == null || d2.doubleValue() <= 0.0d) ? null : new g3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf((long) d2.doubleValue()), null, null, null, null, null);
        h32.e f13 = f(f30Var, adFormats, adsCommonAnalytics, z15, z16, z17);
        return new h32.c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, g3Var, null, null, null, null, null, null, null, null, null, a0Var, null, null, null, null, null, null, h10, null, null, null, null, null, null, null, null, null, null, null, null, null, g13, null, null, fVar, null, null, null, null, sh3, f13 != null ? f13 : null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final h32.c1 c(java.lang.String r93, com.pinterest.api.model.f30 r94, boolean r95, java.lang.String r96, boolean r97, boolean r98, boolean r99, es.a r100, x32.b r101, java.lang.Short r102, boolean r103, boolean r104, es.h r105, vr.a r106) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek1.c2.c(java.lang.String, com.pinterest.api.model.f30, boolean, java.lang.String, boolean, boolean, boolean, es.a, x32.b, java.lang.Short, boolean, boolean, es.h, vr.a):h32.c1");
    }

    public static final void e(l82.e resultBuilder, x event) {
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        Intrinsics.checkNotNullParameter(event, "event");
        r1 r1Var = (r1) resultBuilder.f82219b;
        f30 f30Var = r1Var.f59338a;
        resultBuilder.h(new k1(yi1.r.a(r1Var.f59351m, false, null, 0L, -1L, false, false, null, 479), 2));
        h32.z1 z1Var = null;
        if (event.f59390a != null) {
            resultBuilder.f(new u00.e(event, 22));
            if (r1Var.f59349k) {
                e1[] e1VarArr = new e1[1];
                a4 a4Var = r1Var.f59341c.f143086a.f67082b;
                nx.q qVar = ((r) resultBuilder.f82218a).f59329b.f20693a.f92380b;
                e1VarArr[0] = new m0(a4Var, f30Var, event.f59390a, false, qVar != null ? qVar.b() : null);
                resultBuilder.d(e1VarArr);
            }
        }
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        h32.z1 z1Var2 = ((r) resultBuilder.f82218a).f59329b.f20694b;
        h32.z1 source = ((r1) resultBuilder.f82219b).f59343e.f20696a;
        if (z1Var2 != null && source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            z1Var = new h32.z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, z1Var2.f67490g, source.f67492h, source.f67494i, source.f67496j, z1Var2.f67498k, source.f67500l, source.f67502m, z1Var2.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, z1Var2.f67515z, z1Var2.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
        }
        resultBuilder.f(new u00.e(z1Var, 23));
    }

    public static final h32.e f(f30 f30Var, es.a aVar, vr.a adsCommonAnalytics, boolean z13, boolean z14, boolean z15) {
        se0 g63;
        v2 s13;
        String h10;
        Double valueOf;
        h32.r0 r0Var;
        se0 g64;
        v2 s14;
        h32.g gVar;
        com.pinterest.api.model.k L;
        k.a h13;
        com.pinterest.api.model.k L2;
        k.d k13;
        com.pinterest.api.model.k L3;
        k.c j13;
        com.pinterest.api.model.k L4;
        k.b i13;
        e7 O;
        e7.a g13;
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        if (f30Var == null || !f30Var.d5().booleanValue() || aVar == null) {
            return null;
        }
        if (z14 || z13) {
            es.c cVar = (es.c) aVar;
            String k14 = cVar.k(f30Var);
            String j14 = k14 != null ? cVar.j(f30Var) : null;
            if (!z13) {
                k14 = null;
            } else if (k14 == null) {
                k14 = b40.J(f30Var);
            }
            if (!z13) {
                j14 = null;
            }
            if (z14) {
                try {
                    g63 = f30Var.g6();
                } catch (NumberFormatException unused) {
                }
                if (g63 != null && (s13 = g63.s()) != null && (h10 = s13.h()) != null) {
                    valueOf = Double.valueOf(Double.parseDouble(h10));
                    r0Var = new h32.r0(k14, j14, valueOf, (z14 || (g64 = f30Var.g6()) == null || (s14 = g64.s()) == null) ? null : s14.g());
                }
            }
            valueOf = null;
            r0Var = new h32.r0(k14, j14, valueOf, (z14 || (g64 = f30Var.g6()) == null || (s14 = g64.s()) == null) ? null : s14.g());
        } else {
            r0Var = null;
        }
        com.pinterest.api.model.g t33 = f30Var.t3();
        h32.s sVar = (t33 == null || (O = t33.O()) == null || (g13 = O.g()) == null) ? null : new h32.s(Integer.valueOf(g13.getValue()));
        if (((es.c) aVar).J(f30Var)) {
            com.pinterest.api.model.g t34 = f30Var.t3();
            Integer valueOf2 = (t34 == null || (L4 = t34.L()) == null || (i13 = L4.i()) == null) ? null : Integer.valueOf(i13.getValue());
            com.pinterest.api.model.g t35 = f30Var.t3();
            Integer valueOf3 = (t35 == null || (L3 = t35.L()) == null || (j13 = L3.j()) == null) ? null : Integer.valueOf(j13.getValue());
            com.pinterest.api.model.g t36 = f30Var.t3();
            Integer valueOf4 = (t36 == null || (L2 = t36.L()) == null || (k13 = L2.k()) == null) ? null : Integer.valueOf(k13.getValue());
            com.pinterest.api.model.g t37 = f30Var.t3();
            gVar = new h32.g(valueOf2, (t37 == null || (L = t37.L()) == null || (h13 = L.h()) == null) ? null : Integer.valueOf(h13.getValue()), valueOf3, valueOf4);
        } else {
            gVar = null;
        }
        e32.b e13 = ((vr.b) adsCommonAnalytics).e(f30Var, null, null);
        if (!(r0Var == null && sVar == null && gVar == null && e13 == null) && z15) {
            return new h32.e(r0Var, sVar, gVar, e13);
        }
        return null;
    }

    public static final void g(l82.e resultBuilder) {
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        resultBuilder.f(m1.f59283m);
    }

    public static x2 h(String str, String str2) {
        Object m13;
        Object m14;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        Long l13 = (Long) m13;
        try {
            m14 = Long.valueOf(Long.parseLong(str2));
        } catch (Throwable th4) {
            xk2.q qVar3 = xk2.s.f135225b;
            m14 = ue.c.m(th4);
        }
        if (m14 instanceof xk2.r) {
            m14 = null;
        }
        return new x2(l13, str2, (Long) m14, null);
    }

    public static final void i(l82.e resultBuilder, int i13, int i14, long j13) {
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        az.b bVar = ((r) resultBuilder.f82218a).f59329b;
        h32.z1 z1Var = bVar.f20694b;
        if (z1Var == null) {
            return;
        }
        List list = z1Var.G;
        ArrayList H0 = list != null ? CollectionsKt.H0(list) : new ArrayList();
        h32.a2 a2Var = new h32.a2();
        a2Var.c(Integer.valueOf(i13));
        a2Var.d(Integer.valueOf(i14));
        a2Var.b(Long.valueOf(j13));
        H0.add(a2Var.a());
        resultBuilder.f(new bi1.a0(az.b.e(bVar, null, com.bumptech.glide.d.A0(z1Var, new w1.g(H0, 25)), null, 5), 12));
    }
}
