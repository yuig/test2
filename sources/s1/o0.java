package s1;

import a.cb;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.q1;
import i2.r1;
import i2.y3;
import java.util.List;
import k1.v1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m1.f1;
import m1.h2;

/* loaded from: classes2.dex */
public abstract class o0 implements h2 {
    public final q1 A;
    public final q1 B;
    public final ParcelableSnapshotMutableState C;
    public final ParcelableSnapshotMutableState D;
    public final ParcelableSnapshotMutableState E;
    public final ParcelableSnapshotMutableState F;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f110491a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f110492b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f110493c;

    /* renamed from: d, reason: collision with root package name */
    public int f110494d;

    /* renamed from: e, reason: collision with root package name */
    public int f110495e;

    /* renamed from: f, reason: collision with root package name */
    public long f110496f;

    /* renamed from: g, reason: collision with root package name */
    public long f110497g;

    /* renamed from: h, reason: collision with root package name */
    public float f110498h;

    /* renamed from: i, reason: collision with root package name */
    public float f110499i;

    /* renamed from: j, reason: collision with root package name */
    public final m1.u f110500j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f110501k;

    /* renamed from: l, reason: collision with root package name */
    public int f110502l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.k0 f110503m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f110504n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f110505o;

    /* renamed from: p, reason: collision with root package name */
    public n4.b f110506p;

    /* renamed from: q, reason: collision with root package name */
    public final o1.l f110507q;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f110508r;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f110509s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.l0 f110510t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.i f110511u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.c f110512v;

    /* renamed from: w, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f110513w;

    /* renamed from: x, reason: collision with root package name */
    public final q1.c0 f110514x;

    /* renamed from: y, reason: collision with root package name */
    public long f110515y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.i0 f110516z;

    public o0(int i13, float f13) {
        double d2 = f13;
        if (-0.5d > d2 || d2 > 0.5d) {
            throw new IllegalArgumentException(cb.h("currentPageOffsetFraction ", f13, " is not within the range -0.5 to 0.5").toString());
        }
        a3.c cVar = new a3.c(0L);
        y3 y3Var = y3.f71400a;
        this.f110491a = bs1.c.u1(cVar, y3Var);
        this.f110492b = new b0(this);
        this.f110493c = new i0(i13, f13, this);
        this.f110494d = i13;
        this.f110496f = Long.MAX_VALUE;
        this.f110500j = new m1.u(new q0.e(this, 16));
        this.f110501k = true;
        this.f110502l = -1;
        this.f110505o = bs1.c.u1(s0.f110536b, r1.f71258a);
        this.f110506p = s0.f110537c;
        this.f110507q = new o1.l();
        this.f110508r = tb.f.X(-1);
        this.f110509s = tb.f.X(i13);
        bs1.c.R(y3Var, new g(this, 2));
        bs1.c.R(y3Var, new g(this, 3));
        this.f110510t = new androidx.compose.foundation.lazy.layout.l0(null, null);
        this.f110511u = new androidx.compose.foundation.lazy.layout.i();
        this.f110512v = new androidx.compose.foundation.lazy.layout.c();
        this.f110513w = bs1.c.u1(null, y3Var);
        this.f110514x = new q1.c0(this, 2);
        this.f110515y = bs1.c.b(0, 0, 15);
        this.f110516z = new androidx.compose.foundation.lazy.layout.i0();
        this.A = androidx.compose.foundation.lazy.layout.o.i();
        this.B = androidx.compose.foundation.lazy.layout.o.i();
        Boolean bool = Boolean.FALSE;
        this.C = bs1.c.u1(bool, y3Var);
        this.D = bs1.c.u1(bool, y3Var);
        this.E = bs1.c.u1(bool, y3Var);
        this.F = bs1.c.u1(bool, y3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(s1.o0 r5, k1.v1 r6, kotlin.jvm.functions.Function2 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof s1.m0
            if (r0 == 0) goto L13
            r0 = r8
            s1.m0 r0 = (s1.m0) r0
            int r1 = r0.f110484w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110484w = r1
            goto L18
        L13:
            s1.m0 r0 = new s1.m0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f110482u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f110484w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            s1.o0 r5 = r0.f110479r
            ue.c.H(r8)
            goto L7d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.jvm.functions.Function2 r5 = r0.f110481t
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            k1.v1 r6 = r0.f110480s
            s1.o0 r5 = r0.f110479r
            ue.c.H(r8)
            goto L5a
        L41:
            ue.c.H(r8)
            r0.f110479r = r5
            r0.f110480s = r6
            r0.f110481t = r7
            r0.f110484w = r4
            androidx.compose.foundation.lazy.layout.c r8 = r5.f110512v
            java.lang.Object r8 = r8.m(r0)
            if (r8 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r8 = kotlin.Unit.f80348a
        L57:
            if (r8 != r1) goto L5a
            return r1
        L5a:
            m1.u r8 = r5.f110500j
            boolean r8 = r8.c()
            if (r8 != 0) goto L6b
            int r8 = r5.l()
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r2 = r5.f110509s
            r2.i(r8)
        L6b:
            r0.f110479r = r5
            r8 = 0
            r0.f110480s = r8
            r0.f110481t = r8
            r0.f110484w = r3
            m1.u r8 = r5.f110500j
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L7d
            return r1
        L7d:
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r5 = r5.f110508r
            r6 = -1
            r5.i(r6)
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.o0.t(s1.o0, k1.v1, kotlin.jvm.functions.Function2, bl2.c):java.lang.Object");
    }

    @Override // m1.h2
    public final boolean a() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final Object b(v1 v1Var, Function2 function2, bl2.c cVar) {
        return t(this, v1Var, function2, cVar);
    }

    @Override // m1.h2
    public final boolean c() {
        return this.f110500j.c();
    }

    @Override // m1.h2
    public final boolean d() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final boolean e() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final float f(float f13) {
        return this.f110500j.f(f13);
    }

    @Override // m1.h2
    public final boolean g() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(int r12, float r13, j1.n r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.o0.h(int, float, j1.n, bl2.c):java.lang.Object");
    }

    public final void j(f0 f0Var, boolean z13) {
        i0 i0Var = this.f110493c;
        boolean z14 = true;
        if (z13) {
            i0Var.f110450c.i(f0Var.f110429l);
        } else {
            i0Var.getClass();
            l lVar = f0Var.f110428k;
            i0Var.f110452e = lVar != null ? lVar.f110462e : null;
            boolean z15 = i0Var.f110451d;
            List list = f0Var.f110418a;
            if (z15 || (!list.isEmpty())) {
                i0Var.f110451d = true;
                int i13 = lVar != null ? lVar.f110458a : 0;
                float f13 = f0Var.f110429l;
                i0Var.f110449b.i(i13);
                i0Var.f110453f.b(i13);
                i0Var.f110450c.i(f13);
            }
            if (this.f110502l != -1 && (!list.isEmpty())) {
                boolean z16 = this.f110504n;
                int i14 = f0Var.f110426i;
                if (this.f110502l != (z16 ? ((l) ((m) CollectionsKt.b0(list))).f110458a + i14 + 1 : (((l) ((m) CollectionsKt.S(list))).f110458a - i14) - 1)) {
                    this.f110502l = -1;
                    androidx.compose.foundation.lazy.layout.k0 k0Var = this.f110503m;
                    if (k0Var != null) {
                        k0Var.cancel();
                    }
                    this.f110503m = null;
                }
            }
        }
        this.f110505o.setValue(f0Var);
        this.C.setValue(Boolean.valueOf(f0Var.f110431n));
        l lVar2 = f0Var.f110427j;
        if ((lVar2 == null || lVar2.f110458a == 0) && f0Var.f110430m == 0) {
            z14 = false;
        }
        this.D.setValue(Boolean.valueOf(z14));
        if (lVar2 != null) {
            this.f110494d = lVar2.f110458a;
        }
        this.f110495e = f0Var.f110430m;
        s2.i P = bk.f.P();
        Function1 f14 = P != null ? P.f() : null;
        s2.i X = bk.f.X(P);
        try {
            if (Math.abs(this.f110499i) > 0.5f && this.f110501k && r(this.f110499i)) {
                s(this.f110499i, f0Var);
            }
            Unit unit = Unit.f80348a;
            bk.f.c0(P, X, f14);
            this.f110496f = s0.a(f0Var, n());
            n();
            f1 f1Var = f1.Horizontal;
            f1 f1Var2 = f0Var.f110422e;
            long a13 = f0Var.a();
            int i15 = (int) (f1Var2 == f1Var ? a13 >> 32 : a13 & 4294967295L);
            f0Var.f110432o.getClass();
            this.f110497g = ql2.s.g(0, 0, i15);
        } catch (Throwable th3) {
            bk.f.c0(P, X, f14);
            throw th3;
        }
    }

    public final int k(int i13) {
        if (n() > 0) {
            return ql2.s.g(i13, 0, n() - 1);
        }
        return 0;
    }

    public final int l() {
        return this.f110493c.f110449b.h();
    }

    public final z m() {
        return (z) this.f110505o.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((f0) this.f110505o.getValue()).f110419b;
    }

    public final int p() {
        return ((f0) this.f110505o.getValue()).f110420c + o();
    }

    public final long q() {
        return ((a3.c) this.f110491a.getValue()).f482a;
    }

    public final boolean r(float f13) {
        if (((f0) m()).f110422e != f1.Vertical ? Math.signum(f13) != Math.signum(-a3.c.d(q())) : Math.signum(f13) != Math.signum(-a3.c.e(q()))) {
            if (((int) a3.c.d(q())) != 0 || ((int) a3.c.e(q())) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void s(float f13, z zVar) {
        androidx.compose.foundation.lazy.layout.k0 k0Var;
        androidx.compose.foundation.lazy.layout.k0 k0Var2;
        androidx.compose.foundation.lazy.layout.k0 k0Var3;
        if (this.f110501k) {
            f0 f0Var = (f0) zVar;
            List list = f0Var.f110418a;
            if (!list.isEmpty()) {
                boolean z13 = f13 > 0.0f;
                int i13 = f0Var.f110426i;
                int i14 = z13 ? ((l) ((m) CollectionsKt.b0(list))).f110458a + i13 + 1 : (((l) ((m) CollectionsKt.S(list))).f110458a - i13) - 1;
                if (i14 < 0 || i14 >= n()) {
                    return;
                }
                if (i14 != this.f110502l) {
                    if (this.f110504n != z13 && (k0Var3 = this.f110503m) != null) {
                        k0Var3.cancel();
                    }
                    this.f110504n = z13;
                    this.f110502l = i14;
                    this.f110503m = this.f110510t.a(i14, this.f110515y);
                }
                if (z13) {
                    if ((((l) ((m) CollectionsKt.b0(list))).f110470m + (f0Var.f110419b + f0Var.f110420c)) - f0Var.f110424g >= f13 || (k0Var2 = this.f110503m) == null) {
                        return;
                    }
                    k0Var2.a();
                    return;
                }
                if (f0Var.f110423f - ((l) ((m) CollectionsKt.S(list))).f110470m >= (-f13) || (k0Var = this.f110503m) == null) {
                    return;
                }
                k0Var.a();
            }
        }
    }
}
