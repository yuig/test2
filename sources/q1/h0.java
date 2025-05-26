package q1;

import androidx.compose.foundation.lazy.layout.l0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.q1;
import i2.r1;
import i2.y3;
import j1.i2;
import j1.q2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import m1.h2;
import q3.f1;

/* loaded from: classes2.dex */
public final class h0 implements h2 {

    /* renamed from: w, reason: collision with root package name */
    public static final d0.o f101906w = new d0.o(19, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final r2.s f101907x = kh2.j.s2(z.f102040i, u.f101998k);

    /* renamed from: b, reason: collision with root package name */
    public boolean f101909b;

    /* renamed from: c, reason: collision with root package name */
    public v f101910c;

    /* renamed from: d, reason: collision with root package name */
    public final y f101911d;

    /* renamed from: g, reason: collision with root package name */
    public float f101914g;

    /* renamed from: j, reason: collision with root package name */
    public f1 f101917j;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f101922o;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f101926s;

    /* renamed from: t, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f101927t;

    /* renamed from: u, reason: collision with root package name */
    public final q1 f101928u;

    /* renamed from: v, reason: collision with root package name */
    public j1.o f101929v;

    /* renamed from: a, reason: collision with root package name */
    public final a f101908a = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f101912e = bs1.c.u1(k0.f101938b, r1.f71258a);

    /* renamed from: f, reason: collision with root package name */
    public final o1.l f101913f = new o1.l();

    /* renamed from: h, reason: collision with root package name */
    public final m1.u f101915h = new m1.u(new q0.e(this, 12));

    /* renamed from: i, reason: collision with root package name */
    public final boolean f101916i = true;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f101918k = new c0(this, 0);

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.c f101919l = new androidx.compose.foundation.lazy.layout.c();

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.u f101920m = new androidx.compose.foundation.lazy.layout.u();

    /* renamed from: n, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.i f101921n = new androidx.compose.foundation.lazy.layout.i();

    /* renamed from: p, reason: collision with root package name */
    public final a0 f101923p = new a0(this);

    /* renamed from: q, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.i0 f101924q = new androidx.compose.foundation.lazy.layout.i0();

    /* renamed from: r, reason: collision with root package name */
    public final q1 f101925r = androidx.compose.foundation.lazy.layout.o.i();

    public h0(int i13, int i14) {
        this.f101911d = new y(i13, i14);
        this.f101922o = new l0(null, new b0(this, i13));
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f101926s = bs1.c.u1(bool, y3Var);
        this.f101927t = bs1.c.u1(bool, y3Var);
        this.f101928u = androidx.compose.foundation.lazy.layout.o.i();
        this.f101929v = new j1.o(q2.f74205a, Float.valueOf(0.0f), (j1.t) i2.f74104n.invoke(Float.valueOf(0.0f)), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // m1.h2
    public final boolean a() {
        return this.f101915h.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // m1.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(k1.v1 r6, kotlin.jvm.functions.Function2 r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q1.d0
            if (r0 == 0) goto L13
            r0 = r8
            q1.d0 r0 = (q1.d0) r0
            int r1 = r0.f101888w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101888w = r1
            goto L18
        L13:
            q1.d0 r0 = new q1.d0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f101886u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f101888w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.jvm.functions.Function2 r6 = r0.f101885t
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            k1.v1 r6 = r0.f101884s
            q1.h0 r2 = r0.f101883r
            ue.c.H(r8)
            goto L54
        L3f:
            ue.c.H(r8)
            r0.f101883r = r5
            r0.f101884s = r6
            r0.f101885t = r7
            r0.f101888w = r4
            androidx.compose.foundation.lazy.layout.c r8 = r5.f101919l
            java.lang.Object r8 = r8.m(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            m1.u r8 = r2.f101915h
            r2 = 0
            r0.f101883r = r2
            r0.f101884s = r2
            r0.f101885t = r2
            r0.f101888w = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.h0.b(k1.v1, kotlin.jvm.functions.Function2, bl2.c):java.lang.Object");
    }

    @Override // m1.h2
    public final boolean c() {
        return this.f101915h.c();
    }

    @Override // m1.h2
    public final boolean d() {
        return ((Boolean) this.f101927t.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final boolean e() {
        return ((Boolean) this.f101926s.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final float f(float f13) {
        return this.f101915h.f(f13);
    }

    @Override // m1.h2
    public final boolean g() {
        return this.f101915h.g();
    }

    public final void h(v vVar, boolean z13, boolean z14) {
        if (!z13 && this.f101909b) {
            this.f101910c = vVar;
            return;
        }
        if (z13) {
            this.f101909b = true;
        }
        w wVar = vVar.f102000a;
        this.f101927t.setValue(Boolean.valueOf(((wVar == null || wVar.f102017a == 0) && vVar.f102001b == 0) ? false : true));
        this.f101926s.setValue(Boolean.valueOf(vVar.f102002c));
        this.f101914g -= vVar.f102003d;
        this.f101912e.setValue(vVar);
        j1.t tVar = null;
        y yVar = this.f101911d;
        if (z14) {
            int i13 = vVar.f102001b;
            if (i13 < 0.0f) {
                yVar.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i13 + ')').toString());
            }
            yVar.f102036b.i(i13);
        } else {
            yVar.getClass();
            yVar.f102038d = wVar != null ? wVar.f102026j : null;
            if (yVar.f102037c || vVar.f102012m > 0) {
                yVar.f102037c = true;
                int i14 = vVar.f102001b;
                if (i14 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i14 + ')').toString());
                }
                yVar.c(wVar != null ? wVar.f102017a : 0, i14);
            }
            if (this.f101916i) {
                a aVar = this.f101908a;
                if (aVar.f101861b != -1) {
                    List list = vVar.f102009j;
                    if (!list.isEmpty()) {
                        if (aVar.f101861b != (aVar.f101863d ? ((w) ((j) CollectionsKt.b0(list))).f102017a + 1 : ((w) ((j) CollectionsKt.S(list))).f102017a - 1)) {
                            aVar.f101861b = -1;
                            androidx.compose.foundation.lazy.layout.k0 k0Var = aVar.f101862c;
                            if (k0Var != null) {
                                k0Var.cancel();
                            }
                            aVar.f101862c = null;
                        }
                    }
                }
            }
        }
        if (z13) {
            float l03 = vVar.f102007h.l0(k0.f101937a);
            float f13 = vVar.f102004e;
            if (f13 <= l03) {
                return;
            }
            s2.i P = bk.f.P();
            Function1 f14 = P != null ? P.f() : null;
            s2.i X = bk.f.X(P);
            try {
                float floatValue = ((Number) this.f101929v.f74169b.getValue()).floatValue();
                j1.o oVar = this.f101929v;
                boolean z15 = oVar.f74173f;
                ao2.j0 j0Var = vVar.f102006g;
                if (z15) {
                    this.f101929v = j1.e.l(oVar, floatValue - f13, 0.0f, 30);
                    kotlin.jvm.internal.j.z(j0Var, null, null, new f0(this, null), 3);
                } else {
                    this.f101929v = new j1.o(q2.f74205a, Float.valueOf(-f13), tVar, 60);
                    kotlin.jvm.internal.j.z(j0Var, null, null, new g0(this, null), 3);
                }
                bk.f.c0(P, X, f14);
            } catch (Throwable th3) {
                bk.f.c0(P, X, f14);
                throw th3;
            }
        }
    }

    public final t i() {
        return (t) this.f101912e.getValue();
    }

    public final void j(float f13, t tVar) {
        androidx.compose.foundation.lazy.layout.k0 k0Var;
        androidx.compose.foundation.lazy.layout.k0 k0Var2;
        androidx.compose.foundation.lazy.layout.k0 k0Var3;
        if (this.f101916i) {
            a aVar = this.f101908a;
            aVar.getClass();
            v vVar = (v) tVar;
            if (!vVar.f102009j.isEmpty()) {
                boolean z13 = f13 < 0.0f;
                List list = vVar.f102009j;
                int i13 = z13 ? ((w) ((j) CollectionsKt.b0(list))).f102017a + 1 : ((w) ((j) CollectionsKt.S(list))).f102017a - 1;
                if (i13 < 0 || i13 >= vVar.f102012m) {
                    return;
                }
                if (i13 != aVar.f101861b) {
                    if (aVar.f101863d != z13 && (k0Var3 = aVar.f101862c) != null) {
                        k0Var3.cancel();
                    }
                    aVar.f101863d = z13;
                    aVar.f101861b = i13;
                    h0 h0Var = this.f101923p.f101864a;
                    s2.i P = bk.f.P();
                    Function1 f14 = P != null ? P.f() : null;
                    s2.i X = bk.f.X(P);
                    try {
                        long j13 = ((v) h0Var.f101912e.getValue()).f102008i;
                        bk.f.c0(P, X, f14);
                        aVar.f101862c = h0Var.f101922o.a(i13, j13);
                    } catch (Throwable th3) {
                        bk.f.c0(P, X, f14);
                        throw th3;
                    }
                }
                if (!z13) {
                    if (vVar.f102010k - ((w) ((j) CollectionsKt.S(list))).f102029m >= f13 || (k0Var = aVar.f101862c) == null) {
                        return;
                    }
                    k0Var.a();
                    return;
                }
                w wVar = (w) ((j) CollectionsKt.b0(list));
                if (((wVar.f102029m + wVar.f102030n) + vVar.f102015p) - vVar.f102011l >= (-f13) || (k0Var2 = aVar.f101862c) == null) {
                    return;
                }
                k0Var2.a();
            }
        }
    }
}
