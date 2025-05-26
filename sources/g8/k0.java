package g8;

import a.y3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import m7.x1;
import pk.v2;

/* loaded from: classes3.dex */
public final class k0 implements c0, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0[] f64317a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f64318b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f64319c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.n1 f64320d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f64321e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f64322f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public b0 f64323g;

    /* renamed from: h, reason: collision with root package name */
    public m1 f64324h;

    /* renamed from: i, reason: collision with root package name */
    public c0[] f64325i;

    /* renamed from: j, reason: collision with root package name */
    public l f64326j;

    public k0(androidx.lifecycle.n1 n1Var, long[] jArr, c0... c0VarArr) {
        this.f64320d = n1Var;
        this.f64317a = c0VarArr;
        n1Var.getClass();
        pk.y0 y0Var = pk.c1.f100372b;
        v2 v2Var = v2.f100502e;
        this.f64326j = new l(v2Var, v2Var);
        this.f64319c = new IdentityHashMap();
        this.f64325i = new c0[0];
        this.f64318b = new boolean[c0VarArr.length];
        for (int i13 = 0; i13 < c0VarArr.length; i13++) {
            long j13 = jArr[i13];
            if (j13 != 0) {
                this.f64318b[i13] = true;
                this.f64317a[i13] = new l1(c0VarArr[i13], j13);
            }
        }
    }

    @Override // g8.d1
    public final long a() {
        return this.f64326j.a();
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        c0[] c0VarArr = this.f64325i;
        return (c0VarArr.length > 0 ? c0VarArr[0] : this.f64317a[0]).c(j13, x1Var);
    }

    @Override // g8.b0
    public final void e(c0 c0Var) {
        ArrayList arrayList = this.f64321e;
        arrayList.remove(c0Var);
        if (arrayList.isEmpty()) {
            c0[] c0VarArr = this.f64317a;
            int i13 = 0;
            for (c0 c0Var2 : c0VarArr) {
                i13 += c0Var2.r().f64348a;
            }
            a7.c1[] c1VarArr = new a7.c1[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < c0VarArr.length; i15++) {
                m1 r13 = c0VarArr[i15].r();
                int i16 = r13.f64348a;
                int i17 = 0;
                while (i17 < i16) {
                    a7.c1 a13 = r13.a(i17);
                    androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[a13.f964a];
                    for (int i18 = 0; i18 < a13.f964a; i18++) {
                        androidx.media3.common.b bVar = a13.f967d[i18];
                        a7.q a14 = bVar.a();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i15);
                        sb3.append(":");
                        String str = bVar.f18751a;
                        if (str == null) {
                            str = "";
                        }
                        sb3.append(str);
                        a14.f1168a = sb3.toString();
                        bVarArr[i18] = a14.a();
                    }
                    a7.c1 c1Var = new a7.c1(i15 + ":" + a13.f965b, bVarArr);
                    this.f64322f.put(c1Var, a13);
                    c1VarArr[i14] = c1Var;
                    i17++;
                    i14++;
                }
            }
            this.f64324h = new m1(c1VarArr);
            b0 b0Var = this.f64323g;
            b0Var.getClass();
            b0Var.e(this);
        }
    }

    @Override // g8.c0
    public final long f(long j13) {
        long f13 = this.f64325i[0].f(j13);
        int i13 = 1;
        while (true) {
            c0[] c0VarArr = this.f64325i;
            if (i13 >= c0VarArr.length) {
                return f13;
            }
            if (c0VarArr[i13].f(f13) != f13) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i13++;
        }
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f64326j.g();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f64323g = b0Var;
        ArrayList arrayList = this.f64321e;
        c0[] c0VarArr = this.f64317a;
        Collections.addAll(arrayList, c0VarArr);
        for (c0 c0Var : c0VarArr) {
            c0Var.h(this, j13);
        }
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        b0 b0Var = this.f64323g;
        b0Var.getClass();
        b0Var.i(this);
    }

    @Override // g8.c0
    public final long k() {
        long j13 = -9223372036854775807L;
        for (c0 c0Var : this.f64325i) {
            long k13 = c0Var.k();
            if (k13 != -9223372036854775807L) {
                if (j13 == -9223372036854775807L) {
                    for (c0 c0Var2 : this.f64325i) {
                        if (c0Var2 == c0Var) {
                            break;
                        }
                        if (c0Var2.f(k13) != k13) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j13 = k13;
                } else if (k13 != j13) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j13 != -9223372036854775807L && c0Var.f(j13) != j13) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j13;
    }

    @Override // g8.c0
    public final long l(k8.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.f64319c;
            if (i14 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i14];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr[i14] = num == null ? -1 : num.intValue();
            k8.t tVar = tVarArr[i14];
            if (tVar != null) {
                String str = tVar.m().f965b;
                iArr2[i14] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i14] = -1;
            }
            i14++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[tVarArr.length];
        k8.t[] tVarArr2 = new k8.t[tVarArr.length];
        c0[] c0VarArr = this.f64317a;
        ArrayList arrayList2 = new ArrayList(c0VarArr.length);
        long j14 = j13;
        int i15 = 0;
        while (i15 < c0VarArr.length) {
            int i16 = i13;
            while (i16 < tVarArr.length) {
                b1VarArr3[i16] = iArr[i16] == i15 ? b1VarArr[i16] : null;
                if (iArr2[i16] == i15) {
                    k8.t tVar2 = tVarArr[i16];
                    tVar2.getClass();
                    arrayList = arrayList2;
                    a7.c1 c1Var = (a7.c1) this.f64322f.get(tVar2.m());
                    c1Var.getClass();
                    tVarArr2[i16] = new j0(tVar2, c1Var);
                } else {
                    arrayList = arrayList2;
                    tVarArr2[i16] = null;
                }
                i16++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i17 = i15;
            c0[] c0VarArr2 = c0VarArr;
            k8.t[] tVarArr3 = tVarArr2;
            long l13 = c0VarArr[i15].l(tVarArr2, zArr, b1VarArr3, zArr2, j14);
            if (i17 == 0) {
                j14 = l13;
            } else if (l13 != j14) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z13 = false;
            for (int i18 = 0; i18 < tVarArr.length; i18++) {
                if (iArr2[i18] == i17) {
                    b1 b1Var2 = b1VarArr3[i18];
                    b1Var2.getClass();
                    b1VarArr2[i18] = b1VarArr3[i18];
                    identityHashMap.put(b1Var2, Integer.valueOf(i17));
                    z13 = true;
                } else if (iArr[i18] == i17) {
                    bf.b.t(b1VarArr3[i18] == null);
                }
            }
            if (z13) {
                arrayList3.add(c0VarArr2[i17]);
            }
            i15 = i17 + 1;
            arrayList2 = arrayList3;
            c0VarArr = c0VarArr2;
            tVarArr2 = tVarArr3;
            i13 = 0;
        }
        int i19 = i13;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(b1VarArr2, i19, b1VarArr, i19, length2);
        this.f64325i = (c0[]) arrayList4.toArray(new c0[i19]);
        AbstractList y03 = com.bumptech.glide.d.y0(new y3(14), arrayList4);
        this.f64320d.getClass();
        this.f64326j = new l(arrayList4, y03);
        return j14;
    }

    @Override // g8.c0
    public final void n() {
        for (c0 c0Var : this.f64317a) {
            c0Var.n();
        }
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        ArrayList arrayList = this.f64321e;
        if (arrayList.isEmpty()) {
            return this.f64326j.q(y0Var);
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((c0) arrayList.get(i13)).q(y0Var);
        }
        return false;
    }

    @Override // g8.c0
    public final m1 r() {
        m1 m1Var = this.f64324h;
        m1Var.getClass();
        return m1Var;
    }

    @Override // g8.d1
    public final long t() {
        return this.f64326j.t();
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        for (c0 c0Var : this.f64325i) {
            c0Var.u(j13, z13);
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
        this.f64326j.v(j13);
    }
}
