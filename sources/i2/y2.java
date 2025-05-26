package i2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f71376a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f71377b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f71378c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f71379d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f71380e;

    /* renamed from: f, reason: collision with root package name */
    public g1.u f71381f;

    /* renamed from: g, reason: collision with root package name */
    public int f71382g;

    /* renamed from: h, reason: collision with root package name */
    public int f71383h;

    /* renamed from: i, reason: collision with root package name */
    public int f71384i;

    /* renamed from: j, reason: collision with root package name */
    public int f71385j;

    /* renamed from: k, reason: collision with root package name */
    public int f71386k;

    /* renamed from: l, reason: collision with root package name */
    public int f71387l;

    /* renamed from: m, reason: collision with root package name */
    public int f71388m;

    /* renamed from: n, reason: collision with root package name */
    public int f71389n;

    /* renamed from: o, reason: collision with root package name */
    public int f71390o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f71391p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f71392q;

    /* renamed from: r, reason: collision with root package name */
    public final z0 f71393r;

    /* renamed from: s, reason: collision with root package name */
    public g1.u f71394s;

    /* renamed from: t, reason: collision with root package name */
    public int f71395t;

    /* renamed from: u, reason: collision with root package name */
    public int f71396u;

    /* renamed from: v, reason: collision with root package name */
    public int f71397v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f71398w;

    /* renamed from: x, reason: collision with root package name */
    public a2 f71399x;

    public y2(w2 w2Var) {
        this.f71376a = w2Var;
        int[] iArr = w2Var.f71340a;
        this.f71377b = iArr;
        Object[] objArr = w2Var.f71342c;
        this.f71378c = objArr;
        this.f71379d = w2Var.f71347h;
        this.f71380e = w2Var.f71348i;
        this.f71381f = w2Var.f71349j;
        int i13 = w2Var.f71341b;
        this.f71382g = i13;
        this.f71383h = (iArr.length / 5) - i13;
        int i14 = w2Var.f71343d;
        this.f71386k = i14;
        this.f71387l = objArr.length - i14;
        this.f71388m = i13;
        this.f71391p = new z0();
        this.f71392q = new z0();
        this.f71393r = new z0();
        this.f71396u = i13;
        this.f71397v = -1;
    }

    public static int h(int i13, int i14, int i15, int i16) {
        return i13 > i14 ? -(((i16 - i15) - i13) + 1) : i13;
    }

    public static void u(y2 y2Var) {
        int i13 = y2Var.f71397v;
        int p13 = y2Var.p(i13);
        int[] iArr = y2Var.f71377b;
        int i14 = (p13 * 5) + 1;
        int i15 = iArr[i14];
        if ((i15 & 134217728) != 0) {
            return;
        }
        iArr[i14] = i15 | 134217728;
        if (lb.l0.g(iArr, p13)) {
            return;
        }
        y2Var.P(y2Var.z(y2Var.f71377b, i13));
    }

    public final Object A(Object obj) {
        if (this.f71389n > 0) {
            t(1, this.f71397v);
        }
        Object[] objArr = this.f71378c;
        int i13 = this.f71384i;
        this.f71384i = i13 + 1;
        Object obj2 = objArr[g(i13)];
        int i14 = this.f71384i;
        if (i14 <= this.f71385j) {
            this.f71378c[g(i14 - 1)] = obj;
            return obj2;
        }
        u.i("Writing to an invalid slot");
        throw null;
    }

    public final void B() {
        boolean z13;
        a2 a2Var = this.f71399x;
        if (a2Var != null) {
            while (!a2Var.f71073a.isEmpty()) {
                int i13 = a2Var.i();
                int p13 = p(i13);
                int i14 = i13 + 1;
                int q13 = q(i13) + i13;
                while (true) {
                    if (i14 >= q13) {
                        z13 = false;
                        break;
                    } else {
                        if ((this.f71377b[(p(i14) * 5) + 1] & 201326592) != 0) {
                            z13 = true;
                            break;
                        }
                        i14 += q(i14);
                    }
                }
                if (lb.l0.g(this.f71377b, p13) != z13) {
                    int[] iArr = this.f71377b;
                    int i15 = (p13 * 5) + 1;
                    if (z13) {
                        iArr[i15] = iArr[i15] | 67108864;
                    } else {
                        iArr[i15] = iArr[i15] & (-67108865);
                    }
                    int z14 = z(iArr, i13);
                    if (z14 >= 0) {
                        a2Var.d(z14);
                    }
                }
            }
        }
    }

    public final boolean C() {
        if (this.f71389n != 0) {
            u.i("Cannot remove group while inserting");
            throw null;
        }
        int i13 = this.f71395t;
        int i14 = this.f71384i;
        int f13 = f(this.f71377b, p(i13));
        int F = F();
        J(this.f71397v);
        a2 a2Var = this.f71399x;
        if (a2Var != null) {
            while (true) {
                List list = a2Var.f71073a;
                if (!(!list.isEmpty()) || ((Number) CollectionsKt.S(list)).intValue() < i13) {
                    break;
                }
                a2Var.i();
            }
        }
        boolean D = D(i13, this.f71395t - i13);
        E(f13, this.f71384i - f13, i13 - 1);
        this.f71395t = i13;
        this.f71384i = i14;
        this.f71390o -= F;
        return D;
    }

    public final boolean D(int i13, int i14) {
        if (i14 > 0) {
            ArrayList arrayList = this.f71379d;
            w(i13);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f71380e;
                int i15 = i13 + i14;
                int n13 = lb.l0.n(this.f71379d, i15, m() - this.f71383h);
                if (n13 >= this.f71379d.size()) {
                    n13--;
                }
                int i16 = n13 + 1;
                int i17 = 0;
                while (n13 >= 0) {
                    d dVar = (d) this.f71379d.get(n13);
                    int c13 = c(dVar);
                    if (c13 < i13) {
                        break;
                    }
                    if (c13 < i15) {
                        dVar.f71087a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i17 == 0) {
                            i17 = n13 + 1;
                        }
                        i16 = n13;
                    }
                    n13--;
                }
                r0 = i16 < i17;
                if (r0) {
                    this.f71379d.subList(i16, i17).clear();
                }
            }
            this.f71382g = i13;
            this.f71383h += i14;
            int i18 = this.f71388m;
            if (i18 > i13) {
                this.f71388m = Math.max(i13, i18 - i14);
            }
            int i19 = this.f71396u;
            if (i19 >= this.f71382g) {
                this.f71396u = i19 - i14;
            }
            int i23 = this.f71397v;
            if (i23 >= 0 && lb.l0.g(this.f71377b, p(i23))) {
                P(i23);
            }
        }
        return r0;
    }

    public final void E(int i13, int i14, int i15) {
        if (i14 > 0) {
            int i16 = this.f71387l;
            int i17 = i13 + i14;
            x(i17, i15);
            this.f71386k = i13;
            this.f71387l = i16 + i14;
            kotlin.collections.z.o(i13, i17, null, this.f71378c);
            int i18 = this.f71385j;
            if (i18 >= i13) {
                this.f71385j = i18 - i14;
            }
        }
    }

    public final int F() {
        int p13 = p(this.f71395t);
        int i13 = lb.l0.i(this.f71377b, p13) + this.f71395t;
        this.f71395t = i13;
        this.f71384i = f(this.f71377b, p(i13));
        if (lb.l0.m(this.f71377b, p13)) {
            return 1;
        }
        return lb.l0.o(this.f71377b, p13);
    }

    public final void G() {
        int i13 = this.f71396u;
        this.f71395t = i13;
        this.f71384i = f(this.f71377b, p(i13));
    }

    public final int H(int[] iArr, int i13) {
        if (i13 >= m()) {
            return this.f71378c.length - this.f71387l;
        }
        int s13 = lb.l0.s(iArr, i13);
        return s13 < 0 ? (this.f71378c.length - this.f71387l) + s13 + 1 : s13;
    }

    public final int I(int i13, int i14) {
        int H = H(this.f71377b, p(i13));
        int i15 = H + i14;
        if (i15 >= H && i15 < f(this.f71377b, p(i13 + 1))) {
            return i15;
        }
        u.i("Write to an invalid slot index " + i14 + " for group " + i13);
        throw null;
    }

    public final y0 J(int i13) {
        d M;
        HashMap hashMap = this.f71380e;
        if (hashMap == null || (M = M(i13)) == null) {
            return null;
        }
        return (y0) hashMap.get(M);
    }

    public final void K() {
        if (this.f71389n != 0) {
            u.i("Key must be supplied when inserting");
            throw null;
        }
        am.d dVar = n.f71185a;
        L(dVar, dVar, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Object obj, Object obj2, boolean z13, int i13) {
        int i14;
        int i15 = this.f71397v;
        byte b13 = this.f71389n > 0;
        this.f71393r.b(this.f71390o);
        am.d dVar = n.f71185a;
        if (b13 == true) {
            int i16 = this.f71395t;
            int f13 = f(this.f71377b, p(i16));
            s(1);
            this.f71384i = f13;
            this.f71385j = f13;
            int p13 = p(i16);
            int i17 = obj != dVar ? 1 : 0;
            int i18 = (z13 || obj2 == dVar) ? 0 : 1;
            int h10 = h(f13, this.f71386k, this.f71387l, this.f71378c.length);
            if (h10 >= 0 && this.f71388m < i16) {
                h10 = -(((this.f71378c.length - this.f71387l) - h10) + 1);
            }
            int[] iArr = this.f71377b;
            int i19 = this.f71397v;
            int i23 = z13 ? 1073741824 : 0;
            int i24 = i17 != 0 ? 536870912 : 0;
            int i25 = i18 != 0 ? 268435456 : 0;
            int i26 = p13 * 5;
            iArr[i26] = i13;
            iArr[i26 + 1] = i23 | i24 | i25;
            iArr[i26 + 2] = i19;
            iArr[i26 + 3] = 0;
            iArr[i26 + 4] = h10;
            int i27 = (z13 ? 1 : 0) + i17 + i18;
            if (i27 > 0) {
                t(i27, i16);
                Object[] objArr = this.f71378c;
                int i28 = this.f71384i;
                if (z13) {
                    objArr[i28] = obj2;
                    i28++;
                }
                if (i17 != 0) {
                    objArr[i28] = obj;
                    i28++;
                }
                if (i18 != 0) {
                    objArr[i28] = obj2;
                    i28++;
                }
                this.f71384i = i28;
            }
            this.f71390o = 0;
            i14 = i16 + 1;
            this.f71397v = i16;
            this.f71395t = i14;
            if (i15 >= 0) {
                J(i15);
            }
        } else {
            this.f71391p.b(i15);
            this.f71392q.b((m() - this.f71383h) - this.f71396u);
            int i29 = this.f71395t;
            int p14 = p(i29);
            if (!Intrinsics.d(obj2, dVar)) {
                if (z13) {
                    Q(this.f71395t, obj2);
                } else {
                    O(obj2);
                }
            }
            this.f71384i = H(this.f71377b, p14);
            this.f71385j = f(this.f71377b, p(this.f71395t + 1));
            this.f71390o = lb.l0.o(this.f71377b, p14);
            this.f71397v = i29;
            this.f71395t = i29 + 1;
            i14 = i29 + lb.l0.i(this.f71377b, p14);
        }
        this.f71396u = i14;
    }

    public final d M(int i13) {
        ArrayList arrayList;
        int h13;
        if (i13 < 0 || i13 >= n() || (h13 = lb.l0.h1((arrayList = this.f71379d), i13, n())) < 0) {
            return null;
        }
        return (d) arrayList.get(h13);
    }

    public final void N(Object obj) {
        if (this.f71389n <= 0 || this.f71384i == this.f71386k) {
            A(obj);
            return;
        }
        g1.u uVar = this.f71394s;
        if (uVar == null) {
            uVar = new g1.u();
        }
        this.f71394s = uVar;
        int i13 = this.f71397v;
        Object h10 = uVar.h(i13);
        if (h10 == null) {
            h10 = new g1.a0();
            uVar.l(i13, h10);
        }
        ((g1.a0) h10).a(obj);
    }

    public final void O(Object obj) {
        int p13 = p(this.f71395t);
        if (!lb.l0.j(this.f71377b, p13)) {
            u.i("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f71378c;
        int[] iArr = this.f71377b;
        objArr[g(lb.l0.O(iArr[(p13 * 5) + 1] >> 29) + f(iArr, p13))] = obj;
    }

    public final void P(int i13) {
        if (i13 >= 0) {
            a2 a2Var = this.f71399x;
            if (a2Var == null) {
                a2Var = new a2();
                this.f71399x = a2Var;
            }
            a2Var.d(i13);
        }
    }

    public final void Q(int i13, Object obj) {
        int p13 = p(i13);
        int[] iArr = this.f71377b;
        if (p13 < iArr.length && lb.l0.m(iArr, p13)) {
            this.f71378c[g(f(this.f71377b, p13))] = obj;
            return;
        }
        u.i("Updating the node of a group at " + i13 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i13) {
        boolean z13 = false;
        if (!(i13 >= 0)) {
            u.i("Cannot seek backwards");
            throw null;
        }
        if (!(this.f71389n <= 0)) {
            ao2.m0.p0("Cannot call seek() while inserting");
            throw null;
        }
        if (i13 == 0) {
            return;
        }
        int i14 = this.f71395t + i13;
        if (i14 >= this.f71397v && i14 <= this.f71396u) {
            z13 = true;
        }
        if (z13) {
            this.f71395t = i14;
            int f13 = f(this.f71377b, p(i14));
            this.f71384i = f13;
            this.f71385j = f13;
            return;
        }
        u.i("Cannot seek outside the current group (" + this.f71397v + '-' + this.f71396u + ')');
        throw null;
    }

    public final d b(int i13) {
        ArrayList arrayList = this.f71379d;
        int h13 = lb.l0.h1(arrayList, i13, n());
        if (h13 >= 0) {
            return (d) arrayList.get(h13);
        }
        if (i13 > this.f71382g) {
            i13 = -(n() - i13);
        }
        d dVar = new d(i13);
        arrayList.add(-(h13 + 1), dVar);
        return dVar;
    }

    public final int c(d dVar) {
        int i13 = dVar.f71087a;
        return i13 < 0 ? i13 + n() : i13;
    }

    public final void d() {
        int i13 = this.f71389n;
        this.f71389n = i13 + 1;
        if (i13 == 0) {
            this.f71392q.b((m() - this.f71383h) - this.f71396u);
        }
    }

    public final void e(boolean z13) {
        this.f71398w = true;
        if (z13 && this.f71391p.f71424b == 0) {
            w(n());
            x(this.f71378c.length - this.f71387l, this.f71382g);
            int i13 = this.f71386k;
            kotlin.collections.z.o(i13, this.f71387l + i13, null, this.f71378c);
            B();
        }
        int[] iArr = this.f71377b;
        int i14 = this.f71382g;
        Object[] objArr = this.f71378c;
        int i15 = this.f71386k;
        ArrayList arrayList = this.f71379d;
        HashMap hashMap = this.f71380e;
        g1.u uVar = this.f71381f;
        w2 w2Var = this.f71376a;
        w2Var.getClass();
        if (!w2Var.f71345f) {
            ao2.m0.o0("Unexpected writer close()");
            throw null;
        }
        w2Var.f71345f = false;
        w2Var.f71340a = iArr;
        w2Var.f71341b = i14;
        w2Var.f71342c = objArr;
        w2Var.f71343d = i15;
        w2Var.f71347h = arrayList;
        w2Var.f71348i = hashMap;
        w2Var.f71349j = uVar;
    }

    public final int f(int[] iArr, int i13) {
        if (i13 >= m()) {
            return this.f71378c.length - this.f71387l;
        }
        int h10 = lb.l0.h(iArr, i13);
        return h10 < 0 ? (this.f71378c.length - this.f71387l) + h10 + 1 : h10;
    }

    public final int g(int i13) {
        return i13 < this.f71386k ? i13 : i13 + this.f71387l;
    }

    public final void i() {
        g1.a0 a0Var;
        boolean z13 = this.f71389n > 0;
        int i13 = this.f71395t;
        int i14 = this.f71396u;
        int i15 = this.f71397v;
        int p13 = p(i15);
        int i16 = this.f71390o;
        int i17 = i13 - i15;
        boolean m13 = lb.l0.m(this.f71377b, p13);
        z0 z0Var = this.f71393r;
        if (z13) {
            g1.u uVar = this.f71394s;
            if (uVar != null && (a0Var = (g1.a0) uVar.h(i15)) != null) {
                Object[] objArr = a0Var.f63228a;
                int i18 = a0Var.f63229b;
                for (int i19 = 0; i19 < i18; i19++) {
                    A(objArr[i19]);
                }
            }
            lb.l0.t(p13, i17, this.f71377b);
            lb.l0.u(p13, i16, this.f71377b);
            int a13 = z0Var.a();
            if (m13) {
                i16 = 1;
            }
            this.f71390o = a13 + i16;
            int z14 = z(this.f71377b, i15);
            this.f71397v = z14;
            int n13 = z14 < 0 ? n() : p(z14 + 1);
            int f13 = n13 >= 0 ? f(this.f71377b, n13) : 0;
            this.f71384i = f13;
            this.f71385j = f13;
            return;
        }
        if (i13 != i14) {
            u.i("Expected to be at the end of a group");
            throw null;
        }
        int i23 = lb.l0.i(this.f71377b, p13);
        int o13 = lb.l0.o(this.f71377b, p13);
        lb.l0.t(p13, i17, this.f71377b);
        lb.l0.u(p13, i16, this.f71377b);
        int a14 = this.f71391p.a();
        this.f71396u = (m() - this.f71383h) - this.f71392q.a();
        this.f71397v = a14;
        int z15 = z(this.f71377b, i15);
        int a15 = z0Var.a();
        this.f71390o = a15;
        if (z15 == a14) {
            this.f71390o = a15 + (m13 ? 0 : i16 - o13);
            return;
        }
        int i24 = i17 - i23;
        int i25 = m13 ? 0 : i16 - o13;
        if (i24 != 0 || i25 != 0) {
            while (z15 != 0 && z15 != a14 && (i25 != 0 || i24 != 0)) {
                int p14 = p(z15);
                if (i24 != 0) {
                    lb.l0.t(p14, lb.l0.i(this.f71377b, p14) + i24, this.f71377b);
                }
                if (i25 != 0) {
                    int[] iArr = this.f71377b;
                    lb.l0.u(p14, lb.l0.o(iArr, p14) + i25, iArr);
                }
                if (lb.l0.m(this.f71377b, p14)) {
                    i25 = 0;
                }
                z15 = z(this.f71377b, z15);
            }
        }
        this.f71390o += i25;
    }

    public final void j() {
        int i13 = this.f71389n;
        if (!(i13 > 0)) {
            ao2.m0.p0("Unbalanced begin/end insert");
            throw null;
        }
        int i14 = i13 - 1;
        this.f71389n = i14;
        if (i14 == 0) {
            if (this.f71393r.f71424b == this.f71391p.f71424b) {
                this.f71396u = (m() - this.f71383h) - this.f71392q.a();
            } else {
                u.i("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i13) {
        boolean z13 = false;
        if (!(this.f71389n <= 0)) {
            u.i("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i14 = this.f71397v;
        if (i14 != i13) {
            if (i13 >= i14 && i13 < this.f71396u) {
                z13 = true;
            }
            if (!z13) {
                u.i("Started group at " + i13 + " must be a subgroup of the group at " + i14);
                throw null;
            }
            int i15 = this.f71395t;
            int i16 = this.f71384i;
            int i17 = this.f71385j;
            this.f71395t = i13;
            K();
            this.f71395t = i15;
            this.f71384i = i16;
            this.f71385j = i17;
        }
    }

    public final void l(int i13, int i14, int i15) {
        if (i13 >= this.f71382g) {
            i13 = -((n() - i13) + 2);
        }
        while (i15 < i14) {
            this.f71377b[(p(i15) * 5) + 2] = i13;
            int i16 = lb.l0.i(this.f71377b, p(i15)) + i15;
            l(i15, i16, i15 + 1);
            i15 = i16;
        }
    }

    public final int m() {
        return this.f71377b.length / 5;
    }

    public final int n() {
        return m() - this.f71383h;
    }

    public final int o() {
        return this.f71378c.length - this.f71387l;
    }

    public final int p(int i13) {
        return i13 < this.f71382g ? i13 : i13 + this.f71383h;
    }

    public final int q(int i13) {
        return lb.l0.i(this.f71377b, p(i13));
    }

    public final boolean r(int i13, int i14) {
        int m13;
        int q13;
        if (i14 == this.f71397v) {
            m13 = this.f71396u;
        } else {
            z0 z0Var = this.f71391p;
            int i15 = z0Var.f71424b;
            if (i14 > (i15 > 0 ? z0Var.f71423a[i15 - 1] : 0)) {
                q13 = q(i14);
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        i16 = -1;
                        break;
                    }
                    if (z0Var.f71423a[i16] == i14) {
                        break;
                    }
                    i16++;
                }
                if (i16 < 0) {
                    q13 = q(i14);
                } else {
                    m13 = (m() - this.f71383h) - this.f71392q.f71423a[i16];
                }
            }
            m13 = q13 + i14;
        }
        return i13 > i14 && i13 < m13;
    }

    public final void s(int i13) {
        if (i13 > 0) {
            int i14 = this.f71395t;
            w(i14);
            int i15 = this.f71382g;
            int i16 = this.f71383h;
            int[] iArr = this.f71377b;
            int length = iArr.length / 5;
            int i17 = length - i16;
            if (i16 < i13) {
                int max = Math.max(Math.max(length * 2, i17 + i13), 32);
                int[] iArr2 = new int[max * 5];
                int i18 = max - i17;
                kotlin.collections.z.g(0, 0, i15 * 5, iArr, iArr2);
                kotlin.collections.z.g((i15 + i18) * 5, (i16 + i15) * 5, length * 5, iArr, iArr2);
                this.f71377b = iArr2;
                i16 = i18;
            }
            int i19 = this.f71396u;
            if (i19 >= i15) {
                this.f71396u = i19 + i13;
            }
            int i23 = i15 + i13;
            this.f71382g = i23;
            this.f71383h = i16 - i13;
            int h10 = h(i17 > 0 ? f(this.f71377b, p(i14 + i13)) : 0, this.f71388m >= i15 ? this.f71386k : 0, this.f71387l, this.f71378c.length);
            for (int i24 = i15; i24 < i23; i24++) {
                this.f71377b[(i24 * 5) + 4] = h10;
            }
            int i25 = this.f71388m;
            if (i25 >= i15) {
                this.f71388m = i25 + i13;
            }
        }
    }

    public final void t(int i13, int i14) {
        if (i13 > 0) {
            x(this.f71384i, i14);
            int i15 = this.f71386k;
            int i16 = this.f71387l;
            if (i16 < i13) {
                Object[] objArr = this.f71378c;
                int length = objArr.length;
                int i17 = length - i16;
                int max = Math.max(Math.max(length * 2, i17 + i13), 32);
                Object[] objArr2 = new Object[max];
                for (int i18 = 0; i18 < max; i18++) {
                    objArr2[i18] = null;
                }
                int i19 = max - i17;
                kotlin.collections.z.h(0, 0, i15, objArr, objArr2);
                kotlin.collections.z.h(i15 + i19, i16 + i15, length, objArr, objArr2);
                this.f71378c = objArr2;
                i16 = i19;
            }
            int i23 = this.f71385j;
            if (i23 >= i15) {
                this.f71385j = i23 + i13;
            }
            this.f71386k = i15 + i13;
            this.f71387l = i16 - i13;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f71395t + " end=" + this.f71396u + " size = " + n() + " gap=" + this.f71382g + '-' + (this.f71382g + this.f71383h) + ')';
    }

    public final void v(w2 w2Var, int i13) {
        u.o(this.f71389n > 0);
        if (i13 == 0 && this.f71395t == 0 && this.f71376a.f71341b == 0) {
            int i14 = lb.l0.i(w2Var.f71340a, i13);
            int i15 = w2Var.f71341b;
            if (i14 == i15) {
                int[] iArr = this.f71377b;
                Object[] objArr = this.f71378c;
                ArrayList arrayList = this.f71379d;
                HashMap hashMap = this.f71380e;
                g1.u uVar = this.f71381f;
                int[] iArr2 = w2Var.f71340a;
                Object[] objArr2 = w2Var.f71342c;
                int i16 = w2Var.f71343d;
                HashMap hashMap2 = w2Var.f71348i;
                g1.u uVar2 = w2Var.f71349j;
                this.f71377b = iArr2;
                this.f71378c = objArr2;
                this.f71379d = w2Var.f71347h;
                this.f71382g = i15;
                this.f71383h = (iArr2.length / 5) - i15;
                this.f71386k = i16;
                this.f71387l = objArr2.length - i16;
                this.f71388m = i15;
                this.f71380e = hashMap2;
                this.f71381f = uVar2;
                w2Var.f71340a = iArr;
                w2Var.f71341b = 0;
                w2Var.f71342c = objArr;
                w2Var.f71343d = 0;
                w2Var.f71347h = arrayList;
                w2Var.f71348i = hashMap;
                w2Var.f71349j = uVar;
                return;
            }
        }
        y2 i17 = w2Var.i();
        try {
            bk.f.Z(i17, i13, this, true, true, false);
            i17.e(true);
        } catch (Throwable th3) {
            i17.e(false);
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r2 = r8.f71377b;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        kotlin.collections.z.g(r5 + r4, r4, r6, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        kotlin.collections.z.g(r6, r6 + r5, r4 + r5, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(int r9) {
        /*
            r8 = this;
            int r0 = r8.f71383h
            int r1 = r8.f71382g
            if (r1 == r9) goto Lb0
            java.util.ArrayList r2 = r8.f71379d
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L5d
            int r2 = r8.f71383h
            int r4 = r8.m()
            int r4 = r4 - r2
            if (r1 >= r9) goto L3b
            java.util.ArrayList r2 = r8.f71379d
            int r2 = lb.l0.n(r2, r1, r4)
        L1f:
            java.util.ArrayList r5 = r8.f71379d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.f71379d
            java.lang.Object r5 = r5.get(r2)
            i2.d r5 = (i2.d) r5
            int r6 = r5.f71087a
            if (r6 >= 0) goto L5d
            int r6 = r6 + r4
            if (r6 >= r9) goto L5d
            r5.f71087a = r6
            int r2 = r2 + 1
            goto L1f
        L3b:
            java.util.ArrayList r2 = r8.f71379d
            int r2 = lb.l0.n(r2, r9, r4)
        L41:
            java.util.ArrayList r5 = r8.f71379d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.f71379d
            java.lang.Object r5 = r5.get(r2)
            i2.d r5 = (i2.d) r5
            int r6 = r5.f71087a
            if (r6 < 0) goto L5d
            int r6 = r4 - r6
            int r6 = -r6
            r5.f71087a = r6
            int r2 = r2 + 1
            goto L41
        L5d:
            if (r0 <= 0) goto L74
            int[] r2 = r8.f71377b
            int r4 = r9 * 5
            int r5 = r0 * 5
            int r6 = r1 * 5
            if (r9 >= r1) goto L6e
            int r5 = r5 + r4
            kotlin.collections.z.g(r5, r4, r6, r2, r2)
            goto L74
        L6e:
            int r7 = r6 + r5
            int r4 = r4 + r5
            kotlin.collections.z.g(r6, r7, r4, r2, r2)
        L74:
            if (r9 >= r1) goto L78
            int r1 = r9 + r0
        L78:
            int r2 = r8.m()
            if (r1 >= r2) goto L7f
            goto L80
        L7f:
            r3 = 0
        L80:
            i2.u.o(r3)
        L83:
            if (r1 >= r2) goto Lb0
            int[] r3 = r8.f71377b
            int r3 = lb.l0.p(r3, r1)
            r4 = -2
            if (r3 <= r4) goto L90
            r5 = r3
            goto L96
        L90:
            int r5 = r8.n()
            int r5 = r5 + r3
            int r5 = r5 - r4
        L96:
            if (r5 >= r9) goto L99
            goto La0
        L99:
            int r6 = r8.n()
            int r6 = r6 - r5
            int r6 = r6 - r4
            int r5 = -r6
        La0:
            if (r5 == r3) goto Laa
            int[] r3 = r8.f71377b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3[r4] = r5
        Laa:
            int r1 = r1 + 1
            if (r1 != r9) goto L83
            int r1 = r1 + r0
            goto L83
        Lb0:
            r8.f71382g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.y2.w(int):void");
    }

    public final void x(int i13, int i14) {
        int i15 = this.f71387l;
        int i16 = this.f71386k;
        int i17 = this.f71388m;
        if (i16 != i13) {
            Object[] objArr = this.f71378c;
            if (i13 < i16) {
                kotlin.collections.z.h(i13 + i15, i13, i16, objArr, objArr);
            } else {
                kotlin.collections.z.h(i16, i16 + i15, i13 + i15, objArr, objArr);
            }
        }
        int min = Math.min(i14 + 1, n());
        if (i17 != min) {
            int length = this.f71378c.length - i15;
            if (min < i17) {
                int p13 = p(min);
                int p14 = p(i17);
                int i18 = this.f71382g;
                while (p13 < p14) {
                    int h10 = lb.l0.h(this.f71377b, p13);
                    if (h10 < 0) {
                        u.i("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    this.f71377b[(p13 * 5) + 4] = -((length - h10) + 1);
                    p13++;
                    if (p13 == i18) {
                        p13 += this.f71383h;
                    }
                }
            } else {
                int p15 = p(i17);
                int p16 = p(min);
                while (p15 < p16) {
                    int h13 = lb.l0.h(this.f71377b, p15);
                    if (h13 >= 0) {
                        u.i("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    this.f71377b[(p15 * 5) + 4] = h13 + length + 1;
                    p15++;
                    if (p15 == this.f71382g) {
                        p15 += this.f71383h;
                    }
                }
            }
            this.f71388m = min;
        }
        this.f71386k = i13;
    }

    public final Object y(int i13) {
        int p13 = p(i13);
        if (lb.l0.m(this.f71377b, p13)) {
            return this.f71378c[g(f(this.f71377b, p13))];
        }
        return null;
    }

    public final int z(int[] iArr, int i13) {
        int p13 = lb.l0.p(iArr, p(i13));
        return p13 > -2 ? p13 : n() + p13 + 2;
    }
}
