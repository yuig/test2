package dy0;

import androidx.compose.foundation.layout.FillElement;
import com.google.android.gms.ads.AdSize;
import i1.f1;
import i1.o1;
import i1.w1;
import i1.z1;
import i2.f2;
import i2.q1;
import i2.v3;
import i2.y3;
import j1.o2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.y f56582a = new j1.y(0.4f, 0.0f, 0.6f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final j1.y f56583b = new j1.y(0.3f, 0.0f, 0.7f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f56584c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f56585d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f56586e;

    static {
        zn2.a aVar = zn2.b.f142311b;
        zn2.d dVar = zn2.d.MILLISECONDS;
        f56584c = dl2.b.P2(400, dVar);
        f56585d = dl2.b.P2(100, dVar);
        f56586e = dl2.b.P2(1, zn2.d.SECONDS);
    }

    public static final void a(e eVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(906219047);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        sVar.W(1372077717);
        Object J2 = sVar.J();
        Object obj = i2.n.f71185a;
        y3 y3Var = y3.f71400a;
        if (J2 == obj) {
            J2 = bs1.c.u1(u50.h0.f120562a, y3Var);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        Object d2 = jq.b.d(sVar, false, 1372080323);
        if (d2 == obj) {
            d2 = bs1.c.u1(500, y3Var);
            sVar.g0(d2);
        }
        q1 q1Var2 = (q1) d2;
        Object d13 = jq.b.d(sVar, false, 1372082275);
        if (d13 == obj) {
            d13 = bs1.c.u1(Integer.valueOf(AdSize.MEDIUM_RECTANGLE_WIDTH), y3Var);
            sVar.g0(d13);
        }
        q1 q1Var3 = (q1) d13;
        sVar.r(false);
        Object c13 = androidx.compose.animation.a.c(new o2(((Number) q1Var2.getValue()).intValue(), ((Number) q1Var3.getValue()).intValue(), f56583b), 2);
        Object g13 = androidx.compose.animation.a.g(new o2(((Number) q1Var2.getValue()).intValue(), ((Number) q1Var3.getValue()).intValue(), j1.g0.f74070a), z.f56626j);
        long j13 = f56586e;
        Object d14 = androidx.compose.animation.a.d(j1.e.r((int) zn2.b.e(j13), 0, j1.g0.f74071b, 2), 2);
        Object o1Var = new o1(new z1(null, new w1(j1.e.r((int) zn2.b.e(j13), 0, null, 6), new f1(2, z.f56627k)), null, null, false, null, 61));
        i2.u.e(Unit.f80348a, new x(eVar, q1Var, q1Var2, q1Var3, null), sVar);
        String obj2 = dl2.b.u2((u50.i0) q1Var.getValue(), sVar).toString();
        u2.q p13 = androidx.compose.foundation.layout.b.p(qVar2, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 0.0f, 2);
        sVar.W(1372127324);
        boolean h10 = sVar.h(obj2);
        Object J3 = sVar.J();
        if (h10 || J3 == obj) {
            J3 = new zu0.c(obj2, 11);
            sVar.g0(J3);
        }
        sVar.r(false);
        u2.q a13 = z3.l.a(p13, true, (Function1) J3);
        u2.i iVar = u2.b.f120017e;
        q3.p0 e13 = p1.q.e(iVar, false);
        int i15 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, a13);
        s3.k.Qo.getClass();
        Function0 function0 = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(function0);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        u50.i0 i0Var = (u50.i0) q1Var.getValue();
        FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
        sVar.W(-1310955786);
        boolean h13 = sVar.h(c13) | sVar.h(g13) | sVar.h(d14) | sVar.h(o1Var);
        Object J4 = sVar.J();
        if (h13 || J4 == obj) {
            J4 = new aw0.j(c13, g13, d14, o1Var, 2);
            sVar.g0(J4);
        }
        sVar.r(false);
        kh2.r.b(i0Var, fillElement, (Function1) J4, iVar, null, null, c.f56544a, sVar, 1575992, 48);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new y(eVar, qVar2, i13, i14, 0);
        }
    }

    public static final void b(e eVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        float f13;
        e eVar2;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-678094076);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        float f14 = 0;
        float A = com.bumptech.glide.d.A(eo1.c.rounding_100, sVar);
        sVar.W(735924994);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        sVar.r(false);
        if (((Boolean) q1Var.getValue()).booleanValue()) {
            eVar2 = eVar;
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
            eVar2 = eVar;
        }
        v3 b13 = j1.i.b(f13, j1.e.r(eVar2.f56557b, 0, f56582a, 2), null, sVar, 0, 28);
        Unit unit = Unit.f80348a;
        sVar.W(735934851);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new a0(q1Var, null);
            sVar.g0(J3);
        }
        sVar.r(false);
        i2.u.e(unit, (Function2) J3, sVar);
        androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.b(qVar2, 1.0f), com.bumptech.glide.d.A(eo1.c.space_200, sVar)), null, false, q2.i.c(-1103829138, new b0(A, f14, b13), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new y(eVar, qVar2, i13, i14, 1);
        }
    }

    public static final void c(e displayState, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1326523875);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        if (i15 != 0) {
            qVar = nVar;
        }
        u2.q j13 = qVar.j(androidx.compose.foundation.layout.e.f17184c);
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120026n, sVar, 48);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, j13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        p1.a0 a0Var = p1.a0.f98480a;
        b(displayState, null, sVar, 8, 2);
        a(displayState, p1.z.a(a0Var, nVar, 1.0f), sVar, 8, 0);
        d(displayState.f56557b, displayState.f56560e, null, sVar, 64, 4);
        e(p1.z.a(a0Var, nVar, 1.0f), sVar, 0, 0);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new y(displayState, qVar, i13, i14, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(int r23, xk2.w r24, u2.q r25, i2.o r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.i0.d(int, xk2.w, u2.q, i2.o, int, int):void");
    }

    public static final void e(u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1618953925);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = 6;
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            u2.n nVar = u2.n.f120041b;
            if (i16 != 0) {
                qVar = nVar;
            }
            q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
            int i18 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            if (!(sVar.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, e13, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
            sVar.W(-1394275267);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                J2 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
                sVar.g0(J2);
            }
            q1 q1Var = (q1) J2;
            sVar.r(false);
            Unit unit = Unit.f80348a;
            sVar.W(-1394273147);
            Object J3 = sVar.J();
            if (J3 == dVar) {
                J3 = new h0(q1Var, null);
                sVar.g0(J3);
            }
            sVar.r(false);
            i2.u.e(unit, (Function2) J3, sVar);
            b7.c.c(((Boolean) q1Var.getValue()).booleanValue(), cVar.a(nVar, u2.b.f120017e), androidx.compose.animation.a.e(j1.e.q(0.5f, 1500.0f, null, 4), 0.0f, 6), o1.f70858b, null, c.f56545b, sVar, 196608, 16);
            sVar.r(true);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar, i13, i14, i17);
        }
    }

    public static final float f(int i13, q1 q1Var, z zVar, i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(1961277879);
        float floatValue = ((Number) j1.i.b(((Number) zVar.invoke((p0) q1Var.getValue())).floatValue(), j1.e.r(ml2.c.b(i13 * 0.08d), 0, j1.g0.f74070a, 2), null, sVar, 0, 28).getValue()).floatValue();
        sVar.r(false);
        return floatValue;
    }
}
