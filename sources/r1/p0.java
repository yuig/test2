package r1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.q1;
import i2.r1;
import i2.y3;
import java.util.ArrayList;
import java.util.List;
import k1.v1;
import kh2.c3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import m1.h2;
import q3.f1;

/* loaded from: classes2.dex */
public final class p0 implements h2 {

    /* renamed from: t, reason: collision with root package name */
    public static final d0.o f105952t = new d0.o(21, 0);

    /* renamed from: u, reason: collision with root package name */
    public static final r2.s f105953u = kh2.j.s2(j.f105917k, y.f106015l);

    /* renamed from: b, reason: collision with root package name */
    public final f0 f105955b;

    /* renamed from: e, reason: collision with root package name */
    public float f105958e;

    /* renamed from: h, reason: collision with root package name */
    public f1 f105961h;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.l0 f105966m;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f105971r;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f105972s;

    /* renamed from: a, reason: collision with root package name */
    public final a f105954a = new a(2);

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f105956c = bs1.c.u1(q0.f105973a, r1.f71258a);

    /* renamed from: d, reason: collision with root package name */
    public final o1.l f105957d = new o1.l();

    /* renamed from: f, reason: collision with root package name */
    public final m1.u f105959f = new m1.u(new q0.e(this, 13));

    /* renamed from: g, reason: collision with root package name */
    public final boolean f105960g = true;

    /* renamed from: i, reason: collision with root package name */
    public final q1.c0 f105962i = new q1.c0(this, 1);

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.c f105963j = new androidx.compose.foundation.lazy.layout.c();

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.u f105964k = new androidx.compose.foundation.lazy.layout.u();

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.i f105965l = new androidx.compose.foundation.lazy.layout.i();

    /* renamed from: n, reason: collision with root package name */
    public final l0 f105967n = new l0(this);

    /* renamed from: o, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.i0 f105968o = new androidx.compose.foundation.lazy.layout.i0();

    /* renamed from: p, reason: collision with root package name */
    public final q1 f105969p = androidx.compose.foundation.lazy.layout.o.i();

    /* renamed from: q, reason: collision with root package name */
    public final q1 f105970q = androidx.compose.foundation.lazy.layout.o.i();

    public p0(int i13, int i14) {
        this.f105955b = new f0(i13, i14);
        this.f105966m = new androidx.compose.foundation.lazy.layout.l0(null, new m0(this, i13));
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f105971r = bs1.c.u1(bool, y3Var);
        this.f105972s = bs1.c.u1(bool, y3Var);
    }

    public static Object k(p0 p0Var, int i13, bl2.c cVar) {
        p0Var.getClass();
        Object b13 = p0Var.b(v1.Default, new o0(p0Var, i13, 0, null), cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }

    @Override // m1.h2
    public final boolean a() {
        return this.f105959f.a();
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
            boolean r0 = r8 instanceof r1.n0
            if (r0 == 0) goto L13
            r0 = r8
            r1.n0 r0 = (r1.n0) r0
            int r1 = r0.f105945w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105945w = r1
            goto L18
        L13:
            r1.n0 r0 = new r1.n0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f105943u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f105945w
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
            kotlin.jvm.functions.Function2 r6 = r0.f105942t
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            k1.v1 r6 = r0.f105941s
            r1.p0 r2 = r0.f105940r
            ue.c.H(r8)
            goto L54
        L3f:
            ue.c.H(r8)
            r0.f105940r = r5
            r0.f105941s = r6
            r0.f105942t = r7
            r0.f105945w = r4
            androidx.compose.foundation.lazy.layout.c r8 = r5.f105963j
            java.lang.Object r8 = r8.m(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            m1.u r8 = r2.f105959f
            r2 = 0
            r0.f105940r = r2
            r0.f105941s = r2
            r0.f105942t = r2
            r0.f105945w = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.p0.b(k1.v1, kotlin.jvm.functions.Function2, bl2.c):java.lang.Object");
    }

    @Override // m1.h2
    public final boolean c() {
        return this.f105959f.c();
    }

    @Override // m1.h2
    public final boolean d() {
        return ((Boolean) this.f105972s.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final boolean e() {
        return ((Boolean) this.f105971r.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final float f(float f13) {
        return this.f105959f.f(f13);
    }

    @Override // m1.h2
    public final boolean g() {
        return this.f105959f.g();
    }

    public final void h(a0 a0Var, boolean z13) {
        b0[] b0VarArr;
        b0 b0Var;
        int i13;
        b0[] b0VarArr2;
        b0 b0Var2;
        this.f105958e -= a0Var.f105838d;
        this.f105956c.setValue(a0Var);
        int i14 = 0;
        d0 d0Var = a0Var.f105835a;
        this.f105972s.setValue(Boolean.valueOf(((d0Var == null || d0Var.f105873a == 0) && a0Var.f105836b == 0) ? false : true));
        this.f105971r.setValue(Boolean.valueOf(a0Var.f105837c));
        f0 f0Var = this.f105955b;
        if (z13) {
            int i15 = a0Var.f105836b;
            if (i15 >= 0.0f) {
                f0Var.f105889b.i(i15);
                return;
            }
            f0Var.getClass();
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i15 + ')').toString());
        }
        f0Var.getClass();
        f0Var.f105891d = (d0Var == null || (b0VarArr2 = d0Var.f105874b) == null || (b0Var2 = (b0) kotlin.collections.c0.C(b0VarArr2)) == null) ? null : b0Var2.f105851b;
        if (f0Var.f105890c || a0Var.f105844j > 0) {
            f0Var.f105890c = true;
            int i16 = a0Var.f105836b;
            if (i16 < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i16 + ')').toString());
            }
            f0Var.b((d0Var == null || (b0VarArr = d0Var.f105874b) == null || (b0Var = (b0) kotlin.collections.c0.C(b0VarArr)) == null) ? 0 : b0Var.f105850a, i16);
        }
        if (this.f105960g) {
            a aVar = this.f105954a;
            if (aVar.f105832b != -1) {
                List list = a0Var.f105841g;
                if (!list.isEmpty()) {
                    boolean z14 = aVar.f105834d;
                    m1.f1 f1Var = a0Var.f105845k;
                    if (z14) {
                        b0 b0Var3 = (b0) ((m) CollectionsKt.b0(list));
                        i13 = (f1Var == m1.f1.Vertical ? b0Var3.f105867r : b0Var3.f105868s) + 1;
                    } else {
                        b0 b0Var4 = (b0) ((m) CollectionsKt.S(list));
                        i13 = (f1Var == m1.f1.Vertical ? b0Var4.f105867r : b0Var4.f105868s) - 1;
                    }
                    if (aVar.f105832b != i13) {
                        aVar.f105832b = -1;
                        k2.e eVar = aVar.f105833c;
                        int i17 = eVar.f78184c;
                        if (i17 > 0) {
                            Object[] objArr = eVar.f78182a;
                            do {
                                ((androidx.compose.foundation.lazy.layout.k0) objArr[i14]).cancel();
                                i14++;
                            } while (i14 < i17);
                        }
                        eVar.h();
                    }
                }
            }
        }
    }

    public final x i() {
        return (x) this.f105956c.getValue();
    }

    public final void j(float f13, x xVar) {
        int i13;
        int i14;
        m1.f1 f1Var;
        List list;
        int i15;
        int i16;
        int i17;
        if (this.f105960g) {
            a aVar = this.f105954a;
            aVar.getClass();
            a0 a0Var = (a0) xVar;
            if (!a0Var.f105841g.isEmpty()) {
                boolean z13 = f13 < 0.0f;
                m1.f1 f1Var2 = a0Var.f105845k;
                List list2 = a0Var.f105841g;
                if (z13) {
                    b0 b0Var = (b0) ((m) CollectionsKt.b0(list2));
                    i13 = (f1Var2 == m1.f1.Vertical ? b0Var.f105867r : b0Var.f105868s) + 1;
                    i14 = ((b0) ((m) CollectionsKt.b0(list2))).f105850a + 1;
                } else {
                    b0 b0Var2 = (b0) ((m) CollectionsKt.S(list2));
                    i13 = (f1Var2 == m1.f1.Vertical ? b0Var2.f105867r : b0Var2.f105868s) - 1;
                    i14 = ((b0) ((m) CollectionsKt.S(list2))).f105850a - 1;
                }
                if (i14 < 0 || i14 >= a0Var.f105844j) {
                    return;
                }
                int i18 = aVar.f105832b;
                k2.e eVar = aVar.f105833c;
                if (i13 == i18 || i13 < 0) {
                    f1Var = f1Var2;
                    list = list2;
                } else {
                    if (aVar.f105834d != z13 && (i17 = eVar.f78184c) > 0) {
                        Object[] objArr = eVar.f78182a;
                        int i19 = 0;
                        do {
                            ((androidx.compose.foundation.lazy.layout.k0) objArr[i19]).cancel();
                            i19++;
                        } while (i19 < i17);
                    }
                    aVar.f105834d = z13;
                    aVar.f105832b = i13;
                    eVar.h();
                    l0 l0Var = this.f105967n;
                    l0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    p0 p0Var = l0Var.f105935a;
                    s2.i P = bk.f.P();
                    Function1 f14 = P != null ? P.f() : null;
                    s2.i X = bk.f.X(P);
                    try {
                        List list3 = (List) ((a0) p0Var.f105956c.getValue()).f105840f.invoke(Integer.valueOf(i13));
                        int size = list3.size();
                        int i23 = 0;
                        while (i23 < size) {
                            Pair pair = (Pair) list3.get(i23);
                            arrayList.add(p0Var.f105966m.a(((Number) pair.f80346a).intValue(), ((n4.a) pair.f80347b).f89168a));
                            i23++;
                            p0Var = p0Var;
                            f1Var2 = f1Var2;
                            list2 = list2;
                        }
                        f1Var = f1Var2;
                        list = list2;
                        Unit unit = Unit.f80348a;
                        bk.f.c0(P, X, f14);
                        eVar.c(eVar.f78184c, arrayList);
                    } catch (Throwable th3) {
                        bk.f.c0(P, X, f14);
                        throw th3;
                    }
                }
                if (!z13) {
                    if (a0Var.f105842h - c3.j0((m) CollectionsKt.S(list), f1Var) >= f13 || (i15 = eVar.f78184c) <= 0) {
                        return;
                    }
                    Object[] objArr2 = eVar.f78182a;
                    int i24 = 0;
                    do {
                        ((androidx.compose.foundation.lazy.layout.k0) objArr2[i24]).a();
                        i24++;
                    } while (i24 < i15);
                    return;
                }
                m mVar = (m) CollectionsKt.b0(list);
                if (((c3.j0(mVar, r4) + ((int) (f1Var == m1.f1.Vertical ? ((b0) mVar).f105865p & 4294967295L : ((b0) mVar).f105865p >> 32))) + a0Var.f105847m) - a0Var.f105843i >= (-f13) || (i16 = eVar.f78184c) <= 0) {
                    return;
                }
                Object[] objArr3 = eVar.f78182a;
                int i25 = 0;
                do {
                    ((androidx.compose.foundation.lazy.layout.k0) objArr3[i25]).a();
                    i25++;
                } while (i25 < i16);
            }
        }
    }
}
