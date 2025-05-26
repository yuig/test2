package n7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 {
    public static final m0 O = a(new m0[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f89482J;
    public final int K;
    public final List L;
    public final List M;
    public final long[] N;

    /* renamed from: a, reason: collision with root package name */
    public final int f89483a;

    /* renamed from: b, reason: collision with root package name */
    public final List f89484b;

    /* renamed from: c, reason: collision with root package name */
    public final List f89485c;

    /* renamed from: d, reason: collision with root package name */
    public final long f89486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f89487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89488f;

    /* renamed from: g, reason: collision with root package name */
    public final int f89489g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89490h;

    /* renamed from: i, reason: collision with root package name */
    public final long f89491i;

    /* renamed from: j, reason: collision with root package name */
    public final int f89492j;

    /* renamed from: k, reason: collision with root package name */
    public final int f89493k;

    /* renamed from: l, reason: collision with root package name */
    public final int f89494l;

    /* renamed from: m, reason: collision with root package name */
    public final int f89495m;

    /* renamed from: n, reason: collision with root package name */
    public final int f89496n;

    /* renamed from: o, reason: collision with root package name */
    public final long f89497o;

    /* renamed from: p, reason: collision with root package name */
    public final int f89498p;

    /* renamed from: q, reason: collision with root package name */
    public final List f89499q;

    /* renamed from: r, reason: collision with root package name */
    public final List f89500r;

    /* renamed from: s, reason: collision with root package name */
    public final long f89501s;

    /* renamed from: t, reason: collision with root package name */
    public final long f89502t;

    /* renamed from: u, reason: collision with root package name */
    public final long f89503u;

    /* renamed from: v, reason: collision with root package name */
    public final long f89504v;

    /* renamed from: w, reason: collision with root package name */
    public final long f89505w;

    /* renamed from: x, reason: collision with root package name */
    public final long f89506x;

    /* renamed from: y, reason: collision with root package name */
    public final int f89507y;

    /* renamed from: z, reason: collision with root package name */
    public final int f89508z;

    public m0(int i13, long[] jArr, List list, List list2, long j13, int i14, int i15, int i16, int i17, long j14, int i18, int i19, int i23, int i24, int i25, long j15, int i26, List list3, List list4, long j16, long j17, long j18, long j19, long j23, long j24, int i27, int i28, int i29, long j25, int i33, long j26, long j27, long j28, long j29, long j33, int i34, int i35, int i36, List list5, List list6) {
        this.f89483a = i13;
        this.N = jArr;
        this.f89484b = Collections.unmodifiableList(list);
        this.f89485c = Collections.unmodifiableList(list2);
        this.f89486d = j13;
        this.f89487e = i14;
        this.f89488f = i15;
        this.f89489g = i16;
        this.f89490h = i17;
        this.f89491i = j14;
        this.f89492j = i18;
        this.f89493k = i19;
        this.f89494l = i23;
        this.f89495m = i24;
        this.f89496n = i25;
        this.f89497o = j15;
        this.f89498p = i26;
        this.f89499q = Collections.unmodifiableList(list3);
        this.f89500r = Collections.unmodifiableList(list4);
        this.f89501s = j16;
        this.f89502t = j17;
        this.f89503u = j18;
        this.f89504v = j19;
        this.f89505w = j23;
        this.f89506x = j24;
        this.f89507y = i27;
        this.f89508z = i28;
        this.A = i29;
        this.B = j25;
        this.C = i33;
        this.D = j26;
        this.E = j27;
        this.F = j28;
        this.G = j29;
        this.H = j33;
        this.I = i34;
        this.f89482J = i35;
        this.K = i36;
        this.L = Collections.unmodifiableList(list5);
        this.M = Collections.unmodifiableList(list6);
    }

    public static m0 a(m0... m0VarArr) {
        int i13 = 16;
        long[] jArr = new long[16];
        int length = m0VarArr.length;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1;
        long j26 = -9223372036854775807L;
        long j27 = -9223372036854775807L;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        long j28 = -9223372036854775807L;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i33 = 0;
        int i34 = 0;
        long j29 = -1;
        int i35 = 0;
        long j33 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        while (i14 < length) {
            m0 m0Var = m0VarArr[i14];
            i15 += m0Var.f89483a;
            for (int i39 = 0; i39 < i13; i39++) {
                jArr[i39] = jArr[i39] + m0Var.N[i39];
            }
            int i43 = length;
            long j34 = m0Var.f89486d;
            if (j27 == -9223372036854775807L) {
                j27 = j34;
            } else if (j34 != -9223372036854775807L) {
                j27 = Math.min(j27, j34);
            }
            i17 += m0Var.f89487e;
            i18 += m0Var.f89488f;
            i19 += m0Var.f89489g;
            i23 += m0Var.f89490h;
            long j35 = m0Var.f89491i;
            if (j28 == -9223372036854775807L) {
                j28 = j35;
            } else if (j35 != -9223372036854775807L) {
                j28 += j35;
            }
            i24 += m0Var.f89492j;
            i25 += m0Var.f89493k;
            i26 += m0Var.f89494l;
            i27 += m0Var.f89495m;
            i28 += m0Var.f89496n;
            long j36 = m0Var.f89497o;
            if (j26 == -9223372036854775807L) {
                j26 = j36;
            } else if (j36 != -9223372036854775807L) {
                j26 = Math.max(j26, j36);
            }
            i29 += m0Var.f89498p;
            j13 += m0Var.f89501s;
            j14 += m0Var.f89502t;
            j15 += m0Var.f89503u;
            j16 += m0Var.f89504v;
            j17 += m0Var.f89505w;
            j18 += m0Var.f89506x;
            i33 += m0Var.f89507y;
            i34 += m0Var.f89508z;
            int i44 = m0Var.A;
            if (i16 == -1) {
                i16 = i44;
            } else if (i44 != -1) {
                i16 += i44;
            }
            long j37 = m0Var.B;
            if (j29 == -1) {
                j29 = j37;
            } else if (j37 != -1) {
                j29 += j37;
            }
            i35 += m0Var.C;
            long j38 = m0Var.D;
            if (j33 == -1) {
                j33 = j38;
            } else if (j38 != -1) {
                j33 += j38;
            }
            j19 += m0Var.E;
            j23 += m0Var.F;
            j24 += m0Var.G;
            j25 += m0Var.H;
            i36 += m0Var.I;
            i37 += m0Var.f89482J;
            i38 += m0Var.K;
            i14++;
            length = i43;
            i13 = 16;
        }
        return new m0(i15, jArr, Collections.emptyList(), Collections.emptyList(), j27, i17, i18, i19, i23, j28, i24, i25, i26, i27, i28, j26, i29, Collections.emptyList(), Collections.emptyList(), j13, j14, j15, j16, j17, j18, i33, i34, i16, j29, i35, j33, j19, j23, j24, j25, i36, i37, i38, Collections.emptyList(), Collections.emptyList());
    }
}
