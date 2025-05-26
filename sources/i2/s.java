package i2;

import android.os.Trace;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;

/* loaded from: classes.dex */
public final class s implements o {
    public int A;
    public boolean B;
    public final r C;
    public final u3 D;
    public boolean E;
    public v2 F;
    public w2 G;
    public y2 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public z1 f71264J;
    public j2.a K;
    public final j2.b L;
    public d M;
    public j2.c N;
    public boolean O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final f f71265a;

    /* renamed from: b, reason: collision with root package name */
    public final w f71266b;

    /* renamed from: c, reason: collision with root package name */
    public final w2 f71267c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f71268d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.a f71269e;

    /* renamed from: f, reason: collision with root package name */
    public final j2.a f71270f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f71271g;

    /* renamed from: i, reason: collision with root package name */
    public y1 f71273i;

    /* renamed from: j, reason: collision with root package name */
    public int f71274j;

    /* renamed from: k, reason: collision with root package name */
    public int f71275k;

    /* renamed from: l, reason: collision with root package name */
    public int f71276l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f71278n;

    /* renamed from: o, reason: collision with root package name */
    public g1.s f71279o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f71280p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f71281q;

    /* renamed from: u, reason: collision with root package name */
    public k2.a f71285u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f71286v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f71288x;

    /* renamed from: z, reason: collision with root package name */
    public int f71290z;

    /* renamed from: h, reason: collision with root package name */
    public final u3 f71272h = new u3();

    /* renamed from: m, reason: collision with root package name */
    public final z0 f71277m = new z0();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f71282r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final z0 f71283s = new z0();

    /* renamed from: t, reason: collision with root package name */
    public z1 f71284t = q2.l.f102116g;

    /* renamed from: w, reason: collision with root package name */
    public final z0 f71287w = new z0();

    /* renamed from: y, reason: collision with root package name */
    public int f71289y = -1;

    public s(s3.l2 l2Var, w wVar, w2 w2Var, g1.f0 f0Var, j2.a aVar, j2.a aVar2, i0 i0Var) {
        this.f71265a = l2Var;
        this.f71266b = wVar;
        this.f71267c = w2Var;
        this.f71268d = f0Var;
        this.f71269e = aVar;
        this.f71270f = aVar2;
        this.f71271g = i0Var;
        this.B = wVar.e() || wVar.c();
        this.C = new r(this, 0);
        this.D = new u3();
        v2 f13 = w2Var.f();
        f13.c();
        this.F = f13;
        w2 w2Var2 = new w2();
        if (wVar.e()) {
            w2Var2.d();
        }
        if (wVar.c()) {
            w2Var2.c();
        }
        this.G = w2Var2;
        y2 i13 = w2Var2.i();
        i13.e(true);
        this.H = i13;
        this.L = new j2.b(this, aVar);
        v2 f14 = this.G.f();
        try {
            d a13 = f14.a(0);
            f14.c();
            this.M = a13;
            this.N = new j2.c();
        } catch (Throwable th3) {
            f14.c();
            throw th3;
        }
    }

    public static final int M(s sVar, int i13, boolean z13, int i14) {
        v2 v2Var = sVar.F;
        int[] iArr = v2Var.f71319b;
        int i15 = i13 * 5;
        if ((iArr[i15 + 1] & 134217728) != 0) {
            int i16 = iArr[i15];
            Object j13 = v2Var.j(iArr, i13);
            if (i16 != 206 || !Intrinsics.d(j13, u.f71309e)) {
                if (lb.l0.m(iArr, i13)) {
                    return 1;
                }
                return lb.l0.o(iArr, i13);
            }
            Object g13 = v2Var.g(i13, 0);
            p pVar = g13 instanceof p ? (p) g13 : null;
            if (pVar != null) {
                for (s sVar2 : pVar.f71232a.f71243e) {
                    sVar2.K();
                    sVar.f71266b.m(sVar2.f71271g);
                }
            }
            return lb.l0.o(iArr, i13);
        }
        if (!lb.l0.g(iArr, i13)) {
            if (lb.l0.m(iArr, i13)) {
                return 1;
            }
            return lb.l0.o(iArr, i13);
        }
        int i17 = iArr[i15 + 3] + i13;
        int i18 = 0;
        for (int i19 = i13 + 1; i19 < i17; i19 += iArr[(i19 * 5) + 3]) {
            boolean m13 = lb.l0.m(iArr, i19);
            j2.b bVar = sVar.L;
            if (m13) {
                bVar.h();
                Object i23 = v2Var.i(i19);
                bVar.h();
                bVar.f74431h.f71316a.add(i23);
            }
            i18 += M(sVar, i19, m13 || z13, m13 ? 0 : i14 + i18);
            if (m13) {
                bVar.h();
                bVar.e();
            }
        }
        if (lb.l0.m(iArr, i13)) {
            return 1;
        }
        return i18;
    }

    public static final void b(s sVar, z1 z1Var, Object obj) {
        Object obj2 = null;
        sVar.U(126665345, null);
        sVar.B();
        sVar.h0(obj);
        int i13 = sVar.P;
        try {
            sVar.P = 126665345;
            if (sVar.O) {
                y2.u(sVar.H);
            }
            boolean z13 = (sVar.O || Intrinsics.d(sVar.F.e(), z1Var)) ? false : true;
            if (z13) {
                sVar.H(z1Var);
            }
            sVar.R(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN, u.f71307c, z1Var, 0);
            sVar.f71264J = null;
            boolean z14 = sVar.f71286v;
            sVar.f71286v = z13;
            androidx.compose.foundation.lazy.layout.v vVar = new androidx.compose.foundation.lazy.layout.v(4, obj2, obj);
            Object obj3 = q2.i.f102113a;
            tb.f.P(sVar, new q2.h(vVar, true, 316014703));
            sVar.f71286v = z14;
            sVar.r(false);
            sVar.f71264J = null;
            sVar.P = i13;
            sVar.r(false);
        } catch (Throwable th3) {
            sVar.r(false);
            sVar.f71264J = null;
            sVar.P = i13;
            sVar.r(false);
            throw th3;
        }
    }

    public final void A(ArrayList arrayList) {
        j2.a aVar = this.f71270f;
        j2.b bVar = this.L;
        j2.a aVar2 = bVar.f74425b;
        try {
            bVar.f74425b = aVar;
            aVar.getClass();
            aVar.f74422a.F1(j2.z.f74482c);
            if (arrayList.size() <= 0) {
                j2.a aVar3 = bVar.f74425b;
                aVar3.getClass();
                aVar3.f74422a.F1(j2.n.f74470c);
                bVar.f74429f = 0;
                return;
            }
            Pair pair = (Pair) arrayList.get(0);
            k1 k1Var = (k1) pair.f80346a;
            k1Var.getClass();
            k1Var.getClass();
            throw null;
        } finally {
            bVar.f74425b = aVar2;
        }
    }

    public final Object B() {
        boolean z13 = this.O;
        am.d dVar = n.f71185a;
        if (z13) {
            k0();
            return dVar;
        }
        Object h10 = this.F.h();
        return (!this.f71288x || (h10 instanceof p)) ? h10 : dVar;
    }

    public final int C(int i13) {
        int p13 = lb.l0.p(this.F.f71319b, i13) + 1;
        int i14 = 0;
        while (p13 < i13) {
            if (!lb.l0.k(this.F.f71319b, p13)) {
                i14++;
            }
            p13 += lb.l0.i(this.F.f71319b, p13);
        }
        return i14;
    }

    public final boolean D(k2.h hVar) {
        j2.a aVar = this.f71269e;
        if (!aVar.f74422a.C1()) {
            u.i("Expected applyChanges() to have been called");
            throw null;
        }
        if (hVar.f78194a.f63242e <= 0 && !(!this.f71282r.isEmpty())) {
            return false;
        }
        p(hVar, null);
        return aVar.f74422a.D1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(i2.i0 r9, i2.i0 r10, java.lang.Integer r11, java.util.List r12, kotlin.jvm.functions.Function0 r13) {
        /*
            r8 = this;
            boolean r0 = r8.E
            int r1 = r8.f71274j
            r2 = 1
            r8.E = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f71274j = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f80346a     // Catch: java.lang.Throwable -> L24
            i2.f2 r7 = (i2.f2) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f80347b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.c0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L66
        L26:
            r8.c0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L5d
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            i2.z r9 = (i2.z) r9     // Catch: java.lang.Throwable -> L24
            if (r10 == 0) goto L57
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r10, r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L57
            if (r11 < 0) goto L57
            i2.z r10 = (i2.z) r10     // Catch: java.lang.Throwable -> L24
            r9.f71416p = r10     // Catch: java.lang.Throwable -> L24
            r9.f71417q = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L51
            r9.f71416p = r5     // Catch: java.lang.Throwable -> L24
            r9.f71417q = r2     // Catch: java.lang.Throwable -> L24
            goto L5b
        L51:
            r10 = move-exception
            r9.f71416p = r5     // Catch: java.lang.Throwable -> L24
            r9.f71417q = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L57:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5b:
            if (r10 != 0) goto L61
        L5d:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L61:
            r8.E = r0
            r8.f71274j = r1
            return r10
        L66:
            r8.E = r0
            r8.f71274j = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.E(i2.i0, i2.i0, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r10.f71071b < r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0073, code lost:
    
        if (i2.f2.a((i2.p0) r11, r12) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.F():void");
    }

    public final void G() {
        L(this.F.f71324g);
        j2.b bVar = this.L;
        bVar.i(false);
        s sVar = bVar.f74424a;
        v2 v2Var = sVar.F;
        if (v2Var.f71320c > 0) {
            int i13 = v2Var.f71326i;
            z0 z0Var = bVar.f74427d;
            int i14 = z0Var.f71424b;
            if ((i14 > 0 ? z0Var.f71423a[i14 - 1] : -2) != i13) {
                if (!bVar.f74426c && bVar.f74428e) {
                    bVar.i(false);
                    j2.a aVar = bVar.f74425b;
                    aVar.getClass();
                    aVar.f74422a.F1(j2.p.f74472c);
                    bVar.f74426c = true;
                }
                if (i13 > 0) {
                    d a13 = v2Var.a(i13);
                    z0Var.b(i13);
                    bVar.i(false);
                    j2.a aVar2 = bVar.f74425b;
                    aVar2.getClass();
                    j2.o oVar = j2.o.f74471c;
                    j2.l0 l0Var = aVar2.f74422a;
                    l0Var.G1(oVar);
                    bf.b.o0(l0Var, 0, a13);
                    int i15 = l0Var.f74467g;
                    int i16 = oVar.f74453a;
                    int z13 = j2.l0.z1(l0Var, i16);
                    int i17 = oVar.f74454b;
                    if (i15 != z13 || l0Var.f74468h != j2.l0.z1(l0Var, i17)) {
                        StringBuilder sb3 = new StringBuilder();
                        int i18 = 0;
                        for (int i19 = 0; i19 < i16; i19++) {
                            if (((1 << i19) & l0Var.f74467g) != 0) {
                                if (i18 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(oVar.b(i19));
                                i18++;
                            }
                        }
                        String sb4 = sb3.toString();
                        StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
                        int i23 = 0;
                        for (int i24 = 0; i24 < i17; i24++) {
                            if (((1 << i24) & l0Var.f74468h) != 0) {
                                if (i18 > 0) {
                                    n13.append(", ");
                                }
                                n13.append(oVar.c(i24));
                                i23++;
                            }
                        }
                        String sb5 = n13.toString();
                        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb6 = new StringBuilder("Error while pushing ");
                        sb6.append(oVar);
                        sb6.append(". Not all arguments were provided. Missing ");
                        a.a.A(sb6, i18, " int arguments (", sb4, ") and ");
                        ep.b.B(sb6, i23, " object arguments (", sb5, ").");
                        throw null;
                    }
                    bVar.f74426c = true;
                }
            }
        }
        j2.a aVar3 = bVar.f74425b;
        aVar3.getClass();
        aVar3.f74422a.F1(j2.x.f74480c);
        int i25 = bVar.f74429f;
        v2 v2Var2 = sVar.F;
        bVar.f74429f = lb.l0.i(v2Var2.f71319b, v2Var2.f71324g) + i25;
    }

    public final void H(z1 z1Var) {
        k2.a aVar = this.f71285u;
        if (aVar == null) {
            aVar = new k2.a();
            this.f71285u = aVar;
        }
        aVar.b(this.F.f71324g, z1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(int r8, int r9, int r10) {
        /*
            r7 = this;
            i2.v2 r0 = r7.F
            if (r8 != r9) goto L7
        L4:
            r10 = r8
            goto L79
        L7:
            if (r8 == r10) goto L79
            if (r9 != r10) goto Ld
            goto L79
        Ld:
            int[] r1 = r0.f71319b
            int r1 = lb.l0.p(r1, r8)
            if (r1 != r9) goto L18
            r10 = r9
            goto L79
        L18:
            int[] r1 = r0.f71319b
            int r2 = lb.l0.p(r1, r9)
            if (r2 != r8) goto L21
            goto L4
        L21:
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r2 != r3) goto L31
            r10 = r2
            goto L79
        L31:
            r2 = 0
            r3 = r8
            r4 = r2
        L34:
            if (r3 <= 0) goto L3f
            if (r3 == r10) goto L3f
            int r3 = lb.l0.p(r1, r3)
            int r4 = r4 + 1
            goto L34
        L3f:
            r3 = r9
            r5 = r2
        L41:
            if (r3 <= 0) goto L4c
            if (r3 == r10) goto L4c
            int r3 = lb.l0.p(r1, r3)
            int r5 = r5 + 1
            goto L41
        L4c:
            int r10 = r4 - r5
            r6 = r8
            r3 = r2
        L50:
            if (r3 >= r10) goto L5b
            int r6 = r6 * 5
            int r6 = r6 + 2
            r6 = r1[r6]
            int r3 = r3 + 1
            goto L50
        L5b:
            int r5 = r5 - r4
            r10 = r9
        L5d:
            if (r2 >= r5) goto L68
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L5d
        L68:
            r2 = r10
            r10 = r6
        L6a:
            if (r10 == r2) goto L79
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L6a
        L79:
            if (r8 <= 0) goto L91
            if (r8 == r10) goto L91
            int[] r1 = r0.f71319b
            boolean r1 = lb.l0.m(r1, r8)
            if (r1 == 0) goto L8a
            j2.b r1 = r7.L
            r1.e()
        L8a:
            int[] r1 = r0.f71319b
            int r8 = lb.l0.p(r1, r8)
            goto L79
        L91:
            r7.q(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.I(int, int, int):void");
    }

    public final Object J() {
        boolean z13 = this.O;
        am.d dVar = n.f71185a;
        if (z13) {
            k0();
            return dVar;
        }
        Object h10 = this.F.h();
        return (!this.f71288x || (h10 instanceof p)) ? h10 instanceof r2 ? ((r2) h10).f71259a : h10 : dVar;
    }

    public final void K() {
        j2.b bVar = this.L;
        w2 w2Var = this.f71267c;
        if (w2Var.f71341b <= 0 || !lb.l0.g(w2Var.f71340a, 0)) {
            return;
        }
        j2.a aVar = new j2.a();
        this.K = aVar;
        v2 f13 = w2Var.f();
        try {
            this.F = f13;
            j2.a aVar2 = bVar.f74425b;
            try {
                bVar.f74425b = aVar;
                L(0);
                bVar.f();
                if (bVar.f74426c) {
                    j2.a aVar3 = bVar.f74425b;
                    aVar3.getClass();
                    aVar3.f74422a.F1(j2.b0.f74436c);
                    if (bVar.f74426c) {
                        bVar.i(false);
                        bVar.i(false);
                        j2.a aVar4 = bVar.f74425b;
                        aVar4.getClass();
                        aVar4.f74422a.F1(j2.m.f74469c);
                        bVar.f74426c = false;
                    }
                }
                bVar.f74425b = aVar2;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                bVar.f74425b = aVar2;
                throw th3;
            }
        } finally {
            f13.c();
        }
    }

    public final void L(int i13) {
        M(this, i13, false, 0);
        this.L.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f71282r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            r12.O()
            goto Ld7
        Ld:
            i2.v2 r0 = r12.F
            int r1 = r0.f()
            int r2 = r0.f71324g
            int r3 = r0.f71325h
            r4 = 0
            int[] r5 = r0.f71319b
            if (r2 >= r3) goto L21
            java.lang.Object r2 = r0.j(r5, r2)
            goto L22
        L21:
            r2 = r4
        L22:
            java.lang.Object r3 = r0.e()
            int r6 = r12.f71276l
            am.d r7 = i2.n.f71185a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r2 != 0) goto L5b
            if (r3 == 0) goto L4c
            if (r1 != r8) goto L4c
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r3, r7)
            if (r10 != 0) goto L4c
            int r10 = r3.hashCode()
            int r11 = r12.P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.P = r10
            goto L77
        L4c:
            int r10 = r12.P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L58:
            r12.P = r10
            goto L77
        L5b:
            boolean r10 = r2 instanceof java.lang.Enum
            if (r10 == 0) goto L72
            r10 = r2
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L66:
            int r11 = r12.P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L58
        L72:
            int r10 = r2.hashCode()
            goto L66
        L77:
            int r10 = r0.f71324g
            boolean r5 = lb.l0.m(r5, r10)
            r12.V(r4, r5)
            r12.F()
            r0.d()
            if (r2 != 0) goto Lbc
            if (r3 == 0) goto La9
            if (r1 != r8) goto La9
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r7)
            if (r0 != 0) goto La9
            int r0 = r3.hashCode()
            int r1 = r12.P
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.P = r0
            goto Ld7
        La9:
            int r0 = r12.P
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lb5:
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.P = r0
            goto Ld7
        Lbc:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Ld2
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lc6:
            int r1 = r12.P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lb5
        Ld2:
            int r0 = r2.hashCode()
            goto Lc6
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.N():void");
    }

    public final void O() {
        this.f71275k = this.F.l() + this.f71275k;
    }

    public final void P() {
        v2 v2Var = this.F;
        int i13 = v2Var.f71326i;
        this.f71275k = i13 >= 0 ? lb.l0.o(v2Var.f71319b, i13) : 0;
        this.F.m();
    }

    public final void Q() {
        if (this.f71275k != 0) {
            u.i("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        f2 x13 = x();
        if (x13 != null) {
            x13.f71110a |= 16;
        }
        if (this.f71282r.isEmpty()) {
            P();
        } else {
            F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(int r27, java.lang.Object r28, java.lang.Object r29, int r30) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.R(int, java.lang.Object, java.lang.Object, int):void");
    }

    public final void S() {
        R(NetError.ERR_PROXY_AUTH_REQUESTED, null, null, 0);
    }

    public final void T(int i13, t1 t1Var) {
        R(i13, t1Var, null, 0);
    }

    public final void U(int i13, Object obj) {
        R(i13, obj, null, 0);
    }

    public final void V(Object obj, boolean z13) {
        if (z13) {
            v2 v2Var = this.F;
            if (v2Var.f71328k <= 0) {
                if (lb.l0.m(v2Var.f71319b, v2Var.f71324g)) {
                    v2Var.n();
                    return;
                } else {
                    ao2.m0.o0("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            j2.b bVar = this.L;
            bVar.getClass();
            bVar.i(false);
            j2.a aVar = bVar.f74425b;
            aVar.getClass();
            j2.e0 e0Var = j2.e0.f74443c;
            j2.l0 l0Var = aVar.f74422a;
            l0Var.G1(e0Var);
            bf.b.o0(l0Var, 0, obj);
            int i13 = l0Var.f74467g;
            int i14 = e0Var.f74453a;
            int z14 = j2.l0.z1(l0Var, i14);
            int i15 = e0Var.f74454b;
            if (i13 != z14 || l0Var.f74468h != j2.l0.z1(l0Var, i15)) {
                StringBuilder sb3 = new StringBuilder();
                int i16 = 0;
                for (int i17 = 0; i17 < i14; i17++) {
                    if (((1 << i17) & l0Var.f74467g) != 0) {
                        if (i16 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(e0Var.b(i17));
                        i16++;
                    }
                }
                String sb4 = sb3.toString();
                StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
                int i18 = 0;
                for (int i19 = 0; i19 < i15; i19++) {
                    if (((1 << i19) & l0Var.f74468h) != 0) {
                        if (i16 > 0) {
                            n13.append(", ");
                        }
                        n13.append(e0Var.c(i19));
                        i18++;
                    }
                }
                String sb5 = n13.toString();
                Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb6 = new StringBuilder("Error while pushing ");
                sb6.append(e0Var);
                sb6.append(". Not all arguments were provided. Missing ");
                a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
                ep.b.B(sb6, i18, " object arguments (", sb5, ").");
                throw null;
            }
        }
        this.F.n();
    }

    public final void W(int i13) {
        int i14;
        int i15;
        if (this.f71273i != null) {
            R(i13, null, null, 0);
            return;
        }
        k0();
        this.P = this.f71276l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i13, 3);
        this.f71276l++;
        v2 v2Var = this.F;
        boolean z13 = this.O;
        am.d dVar = n.f71185a;
        if (z13) {
            v2Var.f71328k++;
            this.H.L(dVar, dVar, false, i13);
            v(false, null);
            return;
        }
        if (v2Var.f() == i13 && ((i15 = v2Var.f71324g) >= v2Var.f71325h || !lb.l0.k(v2Var.f71319b, i15))) {
            v2Var.n();
            v(false, null);
            return;
        }
        if (v2Var.f71328k <= 0 && (i14 = v2Var.f71324g) != v2Var.f71325h) {
            int i16 = this.f71274j;
            G();
            this.L.k(i16, v2Var.l());
            u.g(i14, v2Var.f71324g, this.f71282r);
        }
        v2Var.f71328k++;
        this.O = true;
        this.f71264J = null;
        if (this.H.f71398w) {
            y2 i17 = this.G.i();
            this.H = i17;
            i17.G();
            this.I = false;
            this.f71264J = null;
        }
        y2 y2Var = this.H;
        y2Var.d();
        int i18 = y2Var.f71395t;
        y2Var.L(dVar, dVar, false, i13);
        this.M = y2Var.b(i18);
        v(false, null);
    }

    public final void X(int i13) {
        R(i13, null, null, 0);
    }

    public final s Y(int i13) {
        W(i13);
        c();
        return this;
    }

    public final void Z(Object obj) {
        if (!this.O && this.F.f() == 207 && !Intrinsics.d(this.F.e(), obj) && this.f71289y < 0) {
            this.f71289y = this.F.f71324g;
            this.f71288x = true;
        }
        R(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER, null, obj, 0);
    }

    public final void a() {
        k();
        this.f71272h.f71316a.clear();
        this.f71277m.f71424b = 0;
        this.f71283s.f71424b = 0;
        this.f71287w.f71424b = 0;
        this.f71285u = null;
        j2.c cVar = this.N;
        cVar.f74438b.A1();
        cVar.f74437a.A1();
        this.P = 0;
        this.f71290z = 0;
        this.f71281q = false;
        this.O = false;
        this.f71288x = false;
        this.E = false;
        this.f71289y = -1;
        v2 v2Var = this.F;
        if (!v2Var.f71323f) {
            v2Var.c();
        }
        if (this.H.f71398w) {
            return;
        }
        w();
    }

    public final void a0() {
        R(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, null, null, 2);
        this.f71281q = true;
    }

    public final void b0() {
        this.f71276l = 0;
        w2 w2Var = this.f71267c;
        this.F = w2Var.f();
        R(100, null, null, 0);
        w wVar = this.f71266b;
        wVar.n();
        this.f71284t = wVar.f();
        this.f71287w.b(this.f71286v ? 1 : 0);
        this.f71286v = h(this.f71284t);
        this.f71264J = null;
        if (!this.f71280p) {
            this.f71280p = wVar.d();
        }
        if (!this.B) {
            this.B = wVar.e();
        }
        Set set = (Set) bf.b.Y(this.f71284t, t2.b.f115818a);
        if (set != null) {
            set.add(w2Var);
            wVar.k(set);
        }
        R(wVar.g(), null, null, 0);
    }

    public final void c() {
        f2 f2Var;
        boolean z13 = this.O;
        u3 u3Var = this.D;
        i0 i0Var = this.f71271g;
        if (z13) {
            Intrinsics.g(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            f2 f2Var2 = new f2((z) i0Var);
            u3Var.f71316a.add(f2Var2);
            h0(f2Var2);
            f2Var2.f71114e = this.A;
            f2Var2.f71110a &= -17;
            return;
        }
        ArrayList arrayList = this.f71282r;
        int m13 = u.m(this.F.f71326i, arrayList);
        a1 a1Var = m13 >= 0 ? (a1) arrayList.remove(m13) : null;
        Object h10 = this.F.h();
        if (Intrinsics.d(h10, n.f71185a)) {
            Intrinsics.g(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            f2Var = new f2((z) i0Var);
            h0(f2Var);
        } else {
            Intrinsics.g(h10, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            f2Var = (f2) h10;
        }
        if (a1Var == null) {
            int i13 = f2Var.f71110a;
            boolean z14 = (i13 & 64) != 0;
            if (z14) {
                f2Var.f71110a = i13 & (-65);
            }
            if (!z14) {
                f2Var.f71110a &= -9;
                u3Var.f71316a.add(f2Var);
                f2Var.f71114e = this.A;
                f2Var.f71110a &= -17;
            }
        }
        f2Var.f71110a |= 8;
        u3Var.f71316a.add(f2Var);
        f2Var.f71114e = this.A;
        f2Var.f71110a &= -17;
    }

    public final boolean c0(f2 f2Var, Object obj) {
        d dVar = f2Var.f71112c;
        if (dVar == null) {
            return false;
        }
        int b13 = this.F.f71318a.b(dVar);
        if (!this.E || b13 < this.F.f71324g) {
            return false;
        }
        ArrayList arrayList = this.f71282r;
        int m13 = u.m(b13, arrayList);
        if (m13 < 0) {
            int i13 = -(m13 + 1);
            if (!(obj instanceof p0)) {
                obj = null;
            }
            arrayList.add(i13, new a1(f2Var, b13, obj));
        } else {
            a1 a1Var = (a1) arrayList.get(m13);
            if (obj instanceof p0) {
                Object a13 = a1Var.a();
                if (a13 == null) {
                    a1Var.b(obj);
                } else if (a13 instanceof g1.g0) {
                    ((g1.g0) a13).d(obj);
                } else {
                    a1Var.b(g1.n0.a(a13, obj));
                }
            } else {
                a1Var.b(null);
            }
        }
        return true;
    }

    public final void d(Object obj, Function2 function2) {
        int i13 = 0;
        if (this.O) {
            j2.c cVar = this.N;
            cVar.getClass();
            j2.f0 f0Var = j2.f0.f74445c;
            j2.l0 l0Var = cVar.f74437a;
            l0Var.G1(f0Var);
            bf.b.o0(l0Var, 0, obj);
            Intrinsics.g(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            dl2.b.y(2, function2);
            bf.b.o0(l0Var, 1, function2);
            int i14 = l0Var.f74467g;
            int i15 = f0Var.f74453a;
            int z13 = j2.l0.z1(l0Var, i15);
            int i16 = f0Var.f74454b;
            if (i14 == z13 && l0Var.f74468h == j2.l0.z1(l0Var, i16)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            int i17 = 0;
            while (i17 < i15) {
                int i18 = i15;
                if (((1 << i17) & l0Var.f74467g) != 0) {
                    if (i13 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(f0Var.b(i17));
                    i13++;
                }
                i17++;
                i15 = i18;
            }
            String sb4 = sb3.toString();
            StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
            int i19 = 0;
            int i23 = 0;
            while (i23 < i16) {
                int i24 = i16;
                if (((1 << i23) & l0Var.f74468h) != 0) {
                    if (i13 > 0) {
                        n13.append(", ");
                    }
                    n13.append(f0Var.c(i23));
                    i19++;
                }
                i23++;
                i16 = i24;
            }
            String sb5 = n13.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb6 = new StringBuilder("Error while pushing ");
            sb6.append(f0Var);
            sb6.append(". Not all arguments were provided. Missing ");
            a.a.A(sb6, i13, " int arguments (", sb4, ") and ");
            ep.b.B(sb6, i19, " object arguments (", sb5, ").");
            throw null;
        }
        j2.b bVar = this.L;
        bVar.f();
        j2.a aVar = bVar.f74425b;
        aVar.getClass();
        j2.f0 f0Var2 = j2.f0.f74445c;
        j2.l0 l0Var2 = aVar.f74422a;
        l0Var2.G1(f0Var2);
        int i25 = 0;
        bf.b.o0(l0Var2, 0, obj);
        Intrinsics.g(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        dl2.b.y(2, function2);
        bf.b.o0(l0Var2, 1, function2);
        int i26 = l0Var2.f74467g;
        int i27 = f0Var2.f74453a;
        int z14 = j2.l0.z1(l0Var2, i27);
        int i28 = f0Var2.f74454b;
        if (i26 == z14 && l0Var2.f74468h == j2.l0.z1(l0Var2, i28)) {
            return;
        }
        StringBuilder sb7 = new StringBuilder();
        for (int i29 = 0; i29 < i27; i29++) {
            if (((1 << i29) & l0Var2.f74467g) != 0) {
                if (i25 > 0) {
                    sb7.append(", ");
                }
                sb7.append(f0Var2.b(i29));
                i25++;
            }
        }
        String sb8 = sb7.toString();
        StringBuilder n14 = ep.b.n(sb8, "StringBuilder().apply(builderAction).toString()");
        int i33 = 0;
        int i34 = 0;
        while (i33 < i28) {
            int i35 = i28;
            if (((1 << i33) & l0Var2.f74468h) != 0) {
                if (i25 > 0) {
                    n14.append(", ");
                }
                n14.append(f0Var2.c(i33));
                i34++;
            }
            i33++;
            i28 = i35;
        }
        String sb9 = n14.toString();
        Intrinsics.checkNotNullExpressionValue(sb9, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb10 = new StringBuilder("Error while pushing ");
        sb10.append(f0Var2);
        sb10.append(". Not all arguments were provided. Missing ");
        a.a.A(sb10, i25, " int arguments (", sb8, ") and ");
        ep.b.B(sb10, i34, " object arguments (", sb9, ").");
        throw null;
    }

    public final void d0(int i13, int i14) {
        if (i0(i13) != i14) {
            if (i13 < 0) {
                g1.s sVar = this.f71279o;
                if (sVar == null) {
                    sVar = new g1.s();
                    this.f71279o = sVar;
                }
                sVar.j(i13, i14);
                return;
            }
            int[] iArr = this.f71278n;
            if (iArr == null) {
                iArr = new int[this.F.f71320c];
                kotlin.collections.z.p(iArr, -1);
                this.f71278n = iArr;
            }
            iArr[i13] = i14;
        }
    }

    public final boolean e(float f13) {
        Object B = B();
        if ((B instanceof Float) && f13 == ((Number) B).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f13));
        return true;
    }

    public final void e0(int i13, int i14) {
        int i03 = i0(i13);
        if (i03 != i14) {
            int i15 = i14 - i03;
            u3 u3Var = this.f71272h;
            int size = u3Var.f71316a.size() - 1;
            while (i13 != -1) {
                int i04 = i0(i13) + i15;
                d0(i13, i04);
                int i16 = size;
                while (true) {
                    if (-1 < i16) {
                        y1 y1Var = (y1) u3Var.f71316a.get(i16);
                        if (y1Var != null && y1Var.a(i13, i04)) {
                            size = i16 - 1;
                            break;
                        }
                        i16--;
                    } else {
                        break;
                    }
                }
                if (i13 < 0) {
                    i13 = this.F.f71326i;
                } else if (lb.l0.m(this.F.f71319b, i13)) {
                    return;
                } else {
                    i13 = lb.l0.p(this.F.f71319b, i13);
                }
            }
        }
    }

    public final boolean f(int i13) {
        Object B = B();
        if ((B instanceof Integer) && i13 == ((Number) B).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i13));
        return true;
    }

    public final q2.l f0(z1 z1Var, q2.l lVar) {
        q2.l lVar2 = (q2.l) z1Var;
        lVar2.getClass();
        q2.k kVar = new q2.k(lVar2);
        kVar.putAll(lVar);
        q2.l h10 = kVar.h();
        T(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR, u.f71308d);
        B();
        h0(h10);
        B();
        h0(lVar);
        r(false);
        return h10;
    }

    public final boolean g(long j13) {
        Object B = B();
        if ((B instanceof Long) && j13 == ((Number) B).longValue()) {
            return false;
        }
        h0(Long.valueOf(j13));
        return true;
    }

    public final void g0(Object obj) {
        int i13;
        v2 v2Var;
        int i14;
        y2 y2Var;
        if (obj instanceof q2) {
            d dVar = null;
            if (this.O) {
                j2.a aVar = this.L.f74425b;
                aVar.getClass();
                j2.w wVar = j2.w.f74479c;
                j2.l0 l0Var = aVar.f74422a;
                l0Var.G1(wVar);
                bf.b.o0(l0Var, 0, (q2) obj);
                int i15 = l0Var.f74467g;
                int i16 = wVar.f74453a;
                int z13 = j2.l0.z1(l0Var, i16);
                int i17 = wVar.f74454b;
                if (i15 != z13 || l0Var.f74468h != j2.l0.z1(l0Var, i17)) {
                    StringBuilder sb3 = new StringBuilder();
                    int i18 = 0;
                    for (int i19 = 0; i19 < i16; i19++) {
                        if (((1 << i19) & l0Var.f74467g) != 0) {
                            if (i18 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(wVar.b(i19));
                            i18++;
                        }
                    }
                    String sb4 = sb3.toString();
                    StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
                    int i23 = 0;
                    for (int i24 = 0; i24 < i17; i24++) {
                        if (((1 << i24) & l0Var.f74468h) != 0) {
                            if (i18 > 0) {
                                n13.append(", ");
                            }
                            n13.append(wVar.c(i24));
                            i23++;
                        }
                    }
                    String sb5 = n13.toString();
                    Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb6 = new StringBuilder("Error while pushing ");
                    sb6.append(wVar);
                    sb6.append(". Not all arguments were provided. Missing ");
                    a.a.A(sb6, i18, " int arguments (", sb4, ") and ");
                    ep.b.B(sb6, i23, " object arguments (", sb5, ").");
                    throw null;
                }
            }
            this.f71268d.add(obj);
            q2 q2Var = (q2) obj;
            if (this.O) {
                y2 y2Var2 = this.H;
                int i25 = y2Var2.f71395t;
                if (i25 > y2Var2.f71397v + 1) {
                    int i26 = i25 - 1;
                    int z14 = y2Var2.z(y2Var2.f71377b, i26);
                    while (true) {
                        i14 = i26;
                        i26 = z14;
                        y2Var = this.H;
                        if (i26 == y2Var.f71397v || i26 < 0) {
                            break;
                        } else {
                            z14 = y2Var.z(y2Var.f71377b, i26);
                        }
                    }
                    dVar = y2Var.b(i14);
                }
            } else {
                v2 v2Var2 = this.F;
                int i27 = v2Var2.f71324g;
                if (i27 > v2Var2.f71326i + 1) {
                    int i28 = i27 - 1;
                    int p13 = lb.l0.p(v2Var2.f71319b, i28);
                    while (true) {
                        i13 = i28;
                        i28 = p13;
                        v2Var = this.F;
                        if (i28 == v2Var.f71326i || i28 < 0) {
                            break;
                        } else {
                            p13 = lb.l0.p(v2Var.f71319b, i28);
                        }
                    }
                    dVar = v2Var.a(i13);
                }
            }
            r2 r2Var = new r2();
            r2Var.f71259a = q2Var;
            r2Var.f71260b = dVar;
            obj = r2Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (Intrinsics.d(B(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        int i13;
        int i14;
        if (this.O) {
            this.H.N(obj);
            return;
        }
        v2 v2Var = this.F;
        boolean z13 = v2Var.f71331n;
        int i15 = 1;
        j2.b bVar = this.L;
        if (!z13) {
            d a13 = v2Var.a(v2Var.f71326i);
            j2.a aVar = bVar.f74425b;
            aVar.getClass();
            j2.e eVar = j2.e.f74442c;
            j2.l0 l0Var = aVar.f74422a;
            l0Var.G1(eVar);
            int i16 = 0;
            bf.b.o0(l0Var, 0, a13);
            bf.b.o0(l0Var, 1, obj);
            int i17 = l0Var.f74467g;
            int i18 = eVar.f74453a;
            int z14 = j2.l0.z1(l0Var, i18);
            int i19 = eVar.f74454b;
            if (i17 == z14 && l0Var.f74468h == j2.l0.z1(l0Var, i19)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            int i23 = 0;
            while (i23 < i18) {
                if (((i15 << i23) & l0Var.f74467g) != 0) {
                    if (i16 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(eVar.b(i23));
                    i16++;
                }
                i23++;
                i15 = 1;
            }
            String sb4 = sb3.toString();
            StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
            int i24 = 0;
            int i25 = 0;
            while (i24 < i19) {
                int i26 = i19;
                if (((1 << i24) & l0Var.f74468h) != 0) {
                    if (i16 > 0) {
                        n13.append(", ");
                    }
                    n13.append(eVar.c(i24));
                    i25++;
                }
                i24++;
                i19 = i26;
            }
            String sb5 = n13.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb6 = new StringBuilder("Error while pushing ");
            sb6.append(eVar);
            sb6.append(". Not all arguments were provided. Missing ");
            a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
            ep.b.B(sb6, i25, " object arguments (", sb5, ").");
            throw null;
        }
        int s13 = (v2Var.f71329l - lb.l0.s(v2Var.f71319b, v2Var.f71326i)) - 1;
        if (bVar.f74424a.F.f71326i - bVar.f74429f >= 0) {
            bVar.i(true);
            j2.a aVar2 = bVar.f74425b;
            j2.g0 g0Var = j2.g0.f74447c;
            j2.l0 l0Var2 = aVar2.f74422a;
            l0Var2.G1(g0Var);
            bf.b.o0(l0Var2, 0, obj);
            bf.b.n0(l0Var2, 0, s13);
            if (l0Var2.f74467g == j2.l0.z1(l0Var2, 1) && l0Var2.f74468h == j2.l0.z1(l0Var2, 1)) {
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            if ((l0Var2.f74467g & 1) != 0) {
                sb7.append(g0Var.b(0));
                i13 = 1;
            } else {
                i13 = 0;
            }
            String sb8 = sb7.toString();
            StringBuilder n14 = ep.b.n(sb8, "StringBuilder().apply(builderAction).toString()");
            if ((l0Var2.f74468h & 1) != 0) {
                if (i13 > 0) {
                    n14.append(", ");
                }
                n14.append(g0Var.c(0));
            } else {
                i15 = 0;
            }
            String sb9 = n14.toString();
            Intrinsics.checkNotNullExpressionValue(sb9, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb10 = new StringBuilder("Error while pushing ");
            sb10.append(g0Var);
            sb10.append(". Not all arguments were provided. Missing ");
            a.a.A(sb10, i13, " int arguments (", sb8, ") and ");
            ep.b.B(sb10, i15, " object arguments (", sb9, ").");
            throw null;
        }
        v2 v2Var2 = this.F;
        d a14 = v2Var2.a(v2Var2.f71326i);
        j2.a aVar3 = bVar.f74425b;
        j2.d0 d0Var = j2.d0.f74441c;
        j2.l0 l0Var3 = aVar3.f74422a;
        l0Var3.G1(d0Var);
        bf.b.o0(l0Var3, 0, obj);
        bf.b.o0(l0Var3, 1, a14);
        bf.b.n0(l0Var3, 0, s13);
        if (l0Var3.f74467g == j2.l0.z1(l0Var3, 1) && l0Var3.f74468h == j2.l0.z1(l0Var3, 2)) {
            return;
        }
        StringBuilder sb11 = new StringBuilder();
        if ((l0Var3.f74467g & 1) != 0) {
            sb11.append(d0Var.b(0));
            i14 = 1;
        } else {
            i14 = 0;
        }
        String sb12 = sb11.toString();
        StringBuilder n15 = ep.b.n(sb12, "StringBuilder().apply(builderAction).toString()");
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 2; i27 < i29; i29 = 2) {
            if (((1 << i27) & l0Var3.f74468h) != 0) {
                if (i14 > 0) {
                    n15.append(", ");
                }
                n15.append(d0Var.c(i27));
                i28++;
            }
            i27++;
        }
        String sb13 = n15.toString();
        Intrinsics.checkNotNullExpressionValue(sb13, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb14 = new StringBuilder("Error while pushing ");
        sb14.append(d0Var);
        sb14.append(". Not all arguments were provided. Missing ");
        a.a.A(sb14, i14, " int arguments (", sb12, ") and ");
        ep.b.B(sb14, i28, " object arguments (", sb13, ").");
        throw null;
    }

    public final boolean i(boolean z13) {
        Object B = B();
        if ((B instanceof Boolean) && z13 == ((Boolean) B).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z13));
        return true;
    }

    public final int i0(int i13) {
        int i14;
        if (i13 >= 0) {
            int[] iArr = this.f71278n;
            return (iArr == null || (i14 = iArr[i13]) < 0) ? lb.l0.o(this.F.f71319b, i13) : i14;
        }
        g1.s sVar = this.f71279o;
        if (sVar == null || sVar.e(i13) < 0) {
            return 0;
        }
        return sVar.f(i13);
    }

    public final boolean j(Object obj) {
        if (B() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void j0() {
        if (!this.f71281q) {
            u.i("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f71281q = false;
        if (!(!this.O)) {
            u.i("useNode() called while inserting");
            throw null;
        }
        v2 v2Var = this.F;
        Object i13 = v2Var.i(v2Var.f71326i);
        j2.b bVar = this.L;
        bVar.h();
        bVar.f74431h.f71316a.add(i13);
        if (this.f71288x && (i13 instanceof m)) {
            bVar.l(i13);
        }
    }

    public final void k() {
        this.f71273i = null;
        this.f71274j = 0;
        this.f71275k = 0;
        this.P = 0;
        this.f71281q = false;
        j2.b bVar = this.L;
        bVar.f74426c = false;
        bVar.f74427d.f71424b = 0;
        bVar.f74429f = 0;
        this.D.f71316a.clear();
        this.f71278n = null;
        this.f71279o = null;
    }

    public final void k0() {
        if (!this.f71281q) {
            return;
        }
        u.i("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final int l(int i13, int i14, int i15, int i16) {
        int i17;
        Object b13;
        if (i13 == i15) {
            return i16;
        }
        v2 v2Var = this.F;
        boolean k13 = lb.l0.k(v2Var.f71319b, i13);
        int[] iArr = v2Var.f71319b;
        if (k13) {
            Object j13 = v2Var.j(iArr, i13);
            i17 = j13 != null ? j13 instanceof Enum ? ((Enum) j13).ordinal() : j13.hashCode() : 0;
        } else {
            int i18 = iArr[i13 * 5];
            if (i18 == 207 && (b13 = v2Var.b(iArr, i13)) != null && !Intrinsics.d(b13, n.f71185a)) {
                i18 = b13.hashCode();
            }
            i17 = i18;
        }
        if (i17 == 126665345) {
            return i17;
        }
        int p13 = lb.l0.p(this.F.f71319b, i13);
        if (p13 != i15) {
            i16 = l(p13, C(p13), i15, i16);
        }
        if (lb.l0.k(this.F.f71319b, i13)) {
            i14 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i16, 3) ^ i17, 3) ^ i14;
    }

    public final Object m(c2 c2Var) {
        return bf.b.Y(o(), c2Var);
    }

    public final void n(Function0 function0) {
        int i13;
        int i14;
        int i15;
        if (!this.f71281q) {
            u.i("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f71281q = false;
        if (!this.O) {
            u.i("createNode() can only be called when inserting");
            throw null;
        }
        z0 z0Var = this.f71277m;
        int i16 = z0Var.f71423a[z0Var.f71424b - 1];
        y2 y2Var = this.H;
        d b13 = y2Var.b(y2Var.f71397v);
        this.f71275k++;
        j2.c cVar = this.N;
        j2.q qVar = j2.q.f74473c;
        j2.l0 l0Var = cVar.f74437a;
        l0Var.G1(qVar);
        bf.b.o0(l0Var, 0, function0);
        bf.b.n0(l0Var, 0, i16);
        bf.b.o0(l0Var, 1, b13);
        if (!(l0Var.f74467g == j2.l0.z1(l0Var, 1) && l0Var.f74468h == j2.l0.z1(l0Var, 2))) {
            StringBuilder sb3 = new StringBuilder();
            if ((l0Var.f74467g & 1) != 0) {
                sb3.append(qVar.b(0));
                i15 = 1;
            } else {
                i15 = 0;
            }
            String sb4 = sb3.toString();
            StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
            int i17 = 0;
            for (int i18 = 0; i18 < 2; i18++) {
                if (((1 << i18) & l0Var.f74468h) != 0) {
                    if (i15 > 0) {
                        n13.append(", ");
                    }
                    n13.append(qVar.c(i18));
                    i17++;
                }
            }
            String sb5 = n13.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb6 = new StringBuilder("Error while pushing ");
            sb6.append(qVar);
            sb6.append(". Not all arguments were provided. Missing ");
            a.a.A(sb6, i15, " int arguments (", sb4, ") and ");
            ep.b.B(sb6, i17, " object arguments (", sb5, ").");
            throw null;
        }
        j2.v vVar = j2.v.f74478c;
        j2.l0 l0Var2 = cVar.f74438b;
        l0Var2.G1(vVar);
        bf.b.n0(l0Var2, 0, i16);
        bf.b.o0(l0Var2, 0, b13);
        if (l0Var2.f74467g == j2.l0.z1(l0Var2, 1) && l0Var2.f74468h == j2.l0.z1(l0Var2, 1)) {
            return;
        }
        StringBuilder sb7 = new StringBuilder();
        if ((l0Var2.f74467g & 1) != 0) {
            sb7.append(vVar.b(0));
            i13 = 1;
        } else {
            i13 = 0;
        }
        String sb8 = sb7.toString();
        StringBuilder n14 = ep.b.n(sb8, "StringBuilder().apply(builderAction).toString()");
        if ((l0Var2.f74468h & 1) != 0) {
            if (i13 > 0) {
                n14.append(", ");
            }
            n14.append(vVar.c(0));
            i14 = 1;
        } else {
            i14 = 0;
        }
        String sb9 = n14.toString();
        Intrinsics.checkNotNullExpressionValue(sb9, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb10 = new StringBuilder("Error while pushing ");
        sb10.append(vVar);
        sb10.append(". Not all arguments were provided. Missing ");
        a.a.A(sb10, i13, " int arguments (", sb8, ") and ");
        ep.b.B(sb10, i14, " object arguments (", sb9, ").");
        throw null;
    }

    public final z1 o() {
        z1 z1Var;
        z1 z1Var2;
        Object obj;
        Object obj2;
        z1 z1Var3 = this.f71264J;
        if (z1Var3 != null) {
            return z1Var3;
        }
        int i13 = this.F.f71326i;
        boolean z13 = this.O;
        t1 t1Var = u.f71307c;
        if (z13 && this.I) {
            int i14 = this.H.f71397v;
            while (i14 > 0) {
                y2 y2Var = this.H;
                if (y2Var.f71377b[y2Var.p(i14) * 5] == 202) {
                    y2 y2Var2 = this.H;
                    int p13 = y2Var2.p(i14);
                    if (lb.l0.k(y2Var2.f71377b, p13)) {
                        Object[] objArr = y2Var2.f71378c;
                        int[] iArr = y2Var2.f71377b;
                        int i15 = p13 * 5;
                        obj = objArr[lb.l0.O(iArr[i15 + 1] >> 30) + iArr[i15 + 4]];
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.d(obj, t1Var)) {
                        y2 y2Var3 = this.H;
                        int p14 = y2Var3.p(i14);
                        if (lb.l0.j(y2Var3.f71377b, p14)) {
                            Object[] objArr2 = y2Var3.f71378c;
                            int[] iArr2 = y2Var3.f71377b;
                            obj2 = objArr2[lb.l0.O(iArr2[(p14 * 5) + 1] >> 29) + y2Var3.f(iArr2, p14)];
                        } else {
                            obj2 = n.f71185a;
                        }
                        Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        z1 z1Var4 = (z1) obj2;
                        this.f71264J = z1Var4;
                        return z1Var4;
                    }
                }
                y2 y2Var4 = this.H;
                i14 = y2Var4.z(y2Var4.f71377b, i14);
            }
        }
        if (this.F.f71320c > 0) {
            while (i13 > 0) {
                v2 v2Var = this.F;
                int[] iArr3 = v2Var.f71319b;
                if (iArr3[i13 * 5] == 202 && Intrinsics.d(v2Var.j(iArr3, i13), t1Var)) {
                    k2.a aVar = this.f71285u;
                    if (aVar == null || (z1Var2 = (z1) aVar.a(i13)) == null) {
                        v2 v2Var2 = this.F;
                        Object b13 = v2Var2.b(v2Var2.f71319b, i13);
                        Intrinsics.g(b13, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        z1Var = (z1) b13;
                    } else {
                        z1Var = z1Var2;
                    }
                    this.f71264J = z1Var;
                    return z1Var;
                }
                i13 = lb.l0.p(this.F.f71319b, i13);
            }
        }
        z1 z1Var5 = this.f71284t;
        this.f71264J = z1Var5;
        return z1Var5;
    }

    public final void p(k2.h hVar, q2.h hVar2) {
        int i13;
        if (!(!this.E)) {
            u.i("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = s2.p.k().d();
            this.f71285u = null;
            g1.c0 c0Var = hVar.f78194a;
            Object[] objArr = c0Var.f63239b;
            Object[] objArr2 = c0Var.f63240c;
            long[] jArr = c0Var.f63238a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f71282r;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j13 = jArr[i14];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j13 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                Object obj = objArr[i18];
                                Object obj2 = objArr2[i18];
                                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                d dVar = ((f2) obj).f71112c;
                                if (dVar != null) {
                                    int i19 = dVar.f71087a;
                                    f2 f2Var = (f2) obj;
                                    if (obj2 == n.f71187c) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new a1(f2Var, i19, obj2));
                                }
                                i13 = 8;
                            } else {
                                i13 = i15;
                            }
                            j13 >>= i13;
                            i17++;
                            i15 = i13;
                        }
                        if (i16 != i15) {
                            break;
                        }
                    }
                    if (i14 == length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            kotlin.collections.j0.t(arrayList, u.f71310f);
            this.f71274j = 0;
            this.E = true;
            try {
                b0();
                Object B = B();
                if (B != hVar2 && hVar2 != null) {
                    h0(hVar2);
                }
                r rVar = this.C;
                k2.e Q = bs1.c.Q();
                try {
                    Q.b(rVar);
                    t1 t1Var = u.f71305a;
                    if (hVar2 != null) {
                        T(200, t1Var);
                        tb.f.P(this, hVar2);
                        r(false);
                    } else if (!this.f71286v || B == null || Intrinsics.d(B, n.f71185a)) {
                        N();
                    } else {
                        T(200, t1Var);
                        dl2.b.y(2, B);
                        tb.f.P(this, (Function2) B);
                        r(false);
                    }
                    Q.o(Q.f78184c - 1);
                    u();
                    this.E = false;
                    arrayList.clear();
                    u.o(this.H.f71398w);
                    w();
                    Unit unit = Unit.f80348a;
                    Trace.endSection();
                } finally {
                    Q.o(Q.f78184c - 1);
                }
            } catch (Throwable th3) {
                this.E = false;
                arrayList.clear();
                a();
                u.o(this.H.f71398w);
                w();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void q(int i13, int i14) {
        if (i13 <= 0 || i13 == i14) {
            return;
        }
        q(lb.l0.p(this.F.f71319b, i13), i14);
        if (lb.l0.m(this.F.f71319b, i13)) {
            Object i15 = this.F.i(i13);
            j2.b bVar = this.L;
            bVar.h();
            bVar.f74431h.f71316a.add(i15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0813  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(boolean r41) {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.r(boolean):void");
    }

    public final void s() {
        r(false);
        f2 x13 = x();
        if (x13 != null) {
            int i13 = x13.f71110a;
            if ((i13 & 1) != 0) {
                x13.f71110a = i13 | 2;
            }
        }
    }

    public final f2 t() {
        f2 f2Var;
        f2 f2Var2;
        d a13;
        k1.v2 v2Var;
        u3 u3Var = this.D;
        int i13 = 1;
        if (!u3Var.f71316a.isEmpty()) {
            ArrayList arrayList = u3Var.f71316a;
            f2Var = (f2) arrayList.remove(arrayList.size() - 1);
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.f71110a &= -9;
        }
        if (f2Var != null) {
            int i14 = this.A;
            g1.z zVar = f2Var.f71115f;
            if (zVar != null && (f2Var.f71110a & 16) == 0) {
                Object[] objArr = zVar.f63354b;
                int[] iArr = zVar.f63355c;
                long[] jArr = zVar.f63353a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    loop0: while (true) {
                        long j13 = jArr[i15];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j13 & 255) < 128) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj = objArr[i18];
                                    if (iArr[i18] != i14) {
                                        v2Var = new k1.v2(f2Var, i14, zVar, i13);
                                        break loop0;
                                    }
                                }
                                j13 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                    }
                }
            }
            v2Var = null;
            if (v2Var != null) {
                j2.a aVar = this.L.f74425b;
                aVar.getClass();
                j2.l lVar = j2.l.f74460c;
                j2.l0 l0Var = aVar.f74422a;
                l0Var.G1(lVar);
                bf.b.o0(l0Var, 0, v2Var);
                bf.b.o0(l0Var, 1, this.f71271g);
                int i19 = l0Var.f74467g;
                int i23 = lVar.f74453a;
                int z13 = j2.l0.z1(l0Var, i23);
                int i24 = lVar.f74454b;
                if (i19 != z13 || l0Var.f74468h != j2.l0.z1(l0Var, i24)) {
                    StringBuilder sb3 = new StringBuilder();
                    int i25 = 0;
                    for (int i26 = 0; i26 < i23; i26++) {
                        if (((1 << i26) & l0Var.f74467g) != 0) {
                            if (i25 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(lVar.b(i26));
                            i25++;
                        }
                    }
                    String sb4 = sb3.toString();
                    StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
                    int i27 = 0;
                    for (int i28 = 0; i28 < i24; i28++) {
                        if (((1 << i28) & l0Var.f74468h) != 0) {
                            if (i25 > 0) {
                                n13.append(", ");
                            }
                            n13.append(lVar.c(i28));
                            i27++;
                        }
                    }
                    String sb5 = n13.toString();
                    Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb6 = new StringBuilder("Error while pushing ");
                    sb6.append(lVar);
                    sb6.append(". Not all arguments were provided. Missing ");
                    a.a.A(sb6, i25, " int arguments (", sb4, ") and ");
                    ep.b.B(sb6, i27, " object arguments (", sb5, ").");
                    throw null;
                }
            }
        }
        if (f2Var != null) {
            int i29 = f2Var.f71110a;
            if ((i29 & 16) == 0 && ((1 & i29) != 0 || this.f71280p)) {
                if (f2Var.f71112c == null) {
                    if (this.O) {
                        y2 y2Var = this.H;
                        a13 = y2Var.b(y2Var.f71397v);
                    } else {
                        v2 v2Var2 = this.F;
                        a13 = v2Var2.a(v2Var2.f71326i);
                    }
                    f2Var.f71112c = a13;
                }
                f2Var.f71110a &= -5;
                f2Var2 = f2Var;
                r(false);
                return f2Var2;
            }
        }
        f2Var2 = null;
        r(false);
        return f2Var2;
    }

    public final void u() {
        r(false);
        this.f71266b.b();
        r(false);
        j2.b bVar = this.L;
        if (bVar.f74426c) {
            bVar.i(false);
            bVar.i(false);
            j2.a aVar = bVar.f74425b;
            aVar.getClass();
            aVar.f74422a.F1(j2.m.f74469c);
            bVar.f74426c = false;
        }
        bVar.f();
        if (!(bVar.f74427d.f71424b == 0)) {
            u.i("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f71272h.f71316a.isEmpty()) {
            u.i("Start/end imbalance");
            throw null;
        }
        k();
        this.F.c();
        this.f71286v = this.f71287w.a() != 0;
    }

    public final void v(boolean z13, y1 y1Var) {
        this.f71272h.f71316a.add(this.f71273i);
        this.f71273i = y1Var;
        int i13 = this.f71275k;
        z0 z0Var = this.f71277m;
        z0Var.b(i13);
        z0Var.b(this.f71276l);
        z0Var.b(this.f71274j);
        if (z13) {
            this.f71274j = 0;
        }
        this.f71275k = 0;
        this.f71276l = 0;
    }

    public final void w() {
        w2 w2Var = new w2();
        if (this.B) {
            w2Var.d();
        }
        if (this.f71266b.c()) {
            w2Var.c();
        }
        this.G = w2Var;
        y2 i13 = w2Var.i();
        i13.e(true);
        this.H = i13;
    }

    public final f2 x() {
        if (this.f71290z == 0) {
            u3 u3Var = this.D;
            if (!u3Var.f71316a.isEmpty()) {
                return (f2) ep.b.h(u3Var.f71316a, 1);
            }
        }
        return null;
    }

    public final boolean y() {
        f2 x13;
        return (z() && !this.f71286v && ((x13 = x()) == null || (x13.f71110a & 4) == 0)) ? false : true;
    }

    public final boolean z() {
        f2 x13;
        return (this.O || this.f71288x || this.f71286v || (x13 = x()) == null || (x13.f71110a & 8) != 0) ? false : true;
    }
}
