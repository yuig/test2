package m7;

import android.util.Pair;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t1 extends a7.b1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f86391k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f86392b;

    /* renamed from: c, reason: collision with root package name */
    public final g8.e1 f86393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86394d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86395e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f86396f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f86397g;

    /* renamed from: h, reason: collision with root package name */
    public final a7.b1[] f86398h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f86399i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f86400j;

    public t1(a7.b1[] b1VarArr, Object[] objArr, g8.e1 e1Var) {
        this.f86393c = e1Var;
        this.f86392b = e1Var.f64239b.length;
        int length = b1VarArr.length;
        this.f86398h = b1VarArr;
        this.f86396f = new int[length];
        this.f86397g = new int[length];
        this.f86399i = objArr;
        this.f86400j = new HashMap();
        int length2 = b1VarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < length2) {
            a7.b1 b1Var = b1VarArr[i13];
            this.f86398h[i16] = b1Var;
            this.f86397g[i16] = i14;
            this.f86396f[i16] = i15;
            i14 += b1Var.p();
            i15 += this.f86398h[i16].i();
            this.f86400j.put(objArr[i16], Integer.valueOf(i16));
            i13++;
            i16++;
        }
        this.f86394d = i14;
        this.f86395e = i15;
    }

    @Override // a7.b1
    public final int a(boolean z13) {
        if (this.f86392b == 0) {
            return -1;
        }
        int i13 = 0;
        if (z13) {
            int[] iArr = this.f86393c.f64239b;
            i13 = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            a7.b1[] b1VarArr = this.f86398h;
            if (!b1VarArr[i13].q()) {
                return this.f86397g[i13] + b1VarArr[i13].a(z13);
            }
            i13 = r(i13, z13);
        } while (i13 != -1);
        return -1;
    }

    @Override // a7.b1
    public final int b(Object obj) {
        int b13;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f86400j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b13 = this.f86398h[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f86396f[intValue] + b13;
    }

    @Override // a7.b1
    public final int c(boolean z13) {
        int i13;
        int i14 = this.f86392b;
        if (i14 == 0) {
            return -1;
        }
        if (z13) {
            int[] iArr = this.f86393c.f64239b;
            i13 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i13 = i14 - 1;
        }
        do {
            a7.b1[] b1VarArr = this.f86398h;
            if (!b1VarArr[i13].q()) {
                return this.f86397g[i13] + b1VarArr[i13].c(z13);
            }
            i13 = s(i13, z13);
        } while (i13 != -1);
        return -1;
    }

    @Override // a7.b1
    public final int e(int i13, int i14, boolean z13) {
        int[] iArr = this.f86397g;
        int d2 = d7.n0.d(iArr, i13 + 1, false, false);
        int i15 = iArr[d2];
        a7.b1[] b1VarArr = this.f86398h;
        int e13 = b1VarArr[d2].e(i13 - i15, i14 != 2 ? i14 : 0, z13);
        if (e13 != -1) {
            return i15 + e13;
        }
        int r13 = r(d2, z13);
        while (r13 != -1 && b1VarArr[r13].q()) {
            r13 = r(r13, z13);
        }
        if (r13 != -1) {
            return b1VarArr[r13].a(z13) + iArr[r13];
        }
        if (i14 == 2) {
            return a(z13);
        }
        return -1;
    }

    @Override // a7.b1
    public final a7.z0 g(int i13, a7.z0 z0Var, boolean z13) {
        int[] iArr = this.f86396f;
        int d2 = d7.n0.d(iArr, i13 + 1, false, false);
        int i14 = this.f86397g[d2];
        this.f86398h[d2].g(i13 - iArr[d2], z0Var, z13);
        z0Var.f1253c += i14;
        if (z13) {
            Object obj = this.f86399i[d2];
            Object obj2 = z0Var.f1252b;
            obj2.getClass();
            z0Var.f1252b = Pair.create(obj, obj2);
        }
        return z0Var;
    }

    @Override // a7.b1
    public final a7.z0 h(Object obj, a7.z0 z0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f86400j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i13 = this.f86397g[intValue];
        this.f86398h[intValue].h(obj3, z0Var);
        z0Var.f1253c += i13;
        z0Var.f1252b = obj;
        return z0Var;
    }

    @Override // a7.b1
    public final int i() {
        return this.f86395e;
    }

    @Override // a7.b1
    public final int l(int i13, int i14, boolean z13) {
        int[] iArr = this.f86397g;
        int d2 = d7.n0.d(iArr, i13 + 1, false, false);
        int i15 = iArr[d2];
        a7.b1[] b1VarArr = this.f86398h;
        int l13 = b1VarArr[d2].l(i13 - i15, i14 != 2 ? i14 : 0, z13);
        if (l13 != -1) {
            return i15 + l13;
        }
        int s13 = s(d2, z13);
        while (s13 != -1 && b1VarArr[s13].q()) {
            s13 = s(s13, z13);
        }
        if (s13 != -1) {
            return b1VarArr[s13].c(z13) + iArr[s13];
        }
        if (i14 == 2) {
            return c(z13);
        }
        return -1;
    }

    @Override // a7.b1
    public final Object m(int i13) {
        int[] iArr = this.f86396f;
        int d2 = d7.n0.d(iArr, i13 + 1, false, false);
        return Pair.create(this.f86399i[d2], this.f86398h[d2].m(i13 - iArr[d2]));
    }

    @Override // a7.b1
    public final a7.a1 n(int i13, a7.a1 a1Var, long j13) {
        int[] iArr = this.f86397g;
        int d2 = d7.n0.d(iArr, i13 + 1, false, false);
        int i14 = iArr[d2];
        int i15 = this.f86396f[d2];
        this.f86398h[d2].n(i13 - i14, a1Var, j13);
        Object obj = this.f86399i[d2];
        if (!a7.a1.f927q.equals(a1Var.f929a)) {
            obj = Pair.create(obj, a1Var.f929a);
        }
        a1Var.f929a = obj;
        a1Var.f942n += i15;
        a1Var.f943o += i15;
        return a1Var;
    }

    @Override // a7.b1
    public final int p() {
        return this.f86394d;
    }

    public final int r(int i13, boolean z13) {
        if (!z13) {
            if (i13 < this.f86392b - 1) {
                return i13 + 1;
            }
            return -1;
        }
        g8.e1 e1Var = this.f86393c;
        int i14 = e1Var.f64240c[i13] + 1;
        int[] iArr = e1Var.f64239b;
        if (i14 < iArr.length) {
            return iArr[i14];
        }
        return -1;
    }

    public final int s(int i13, boolean z13) {
        if (!z13) {
            if (i13 > 0) {
                return i13 - 1;
            }
            return -1;
        }
        g8.e1 e1Var = this.f86393c;
        int i14 = e1Var.f64240c[i13] - 1;
        if (i14 >= 0) {
            return e1Var.f64239b[i14];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t1(java.util.List r7, g8.e1 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            a7.b1[] r0 = new a7.b1[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            m7.d1 r4 = (m7.d1) r4
            int r5 = r3 + 1
            a7.b1 r4 = r4.a()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            m7.d1 r3 = (m7.d1) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.b()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.t1.<init>(java.util.List, g8.e1):void");
    }
}
