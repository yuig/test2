package k8;

import android.os.SystemClock;
import d7.g0;
import d7.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pk.c1;
import pk.n2;
import pk.q2;
import pk.s2;
import pk.v2;
import pk.x0;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final l8.e f78478g;

    /* renamed from: h, reason: collision with root package name */
    public final long f78479h;

    /* renamed from: i, reason: collision with root package name */
    public final long f78480i;

    /* renamed from: j, reason: collision with root package name */
    public final long f78481j;

    /* renamed from: k, reason: collision with root package name */
    public final int f78482k;

    /* renamed from: l, reason: collision with root package name */
    public final int f78483l;

    /* renamed from: m, reason: collision with root package name */
    public final float f78484m;

    /* renamed from: n, reason: collision with root package name */
    public final float f78485n;

    /* renamed from: o, reason: collision with root package name */
    public final c1 f78486o;

    /* renamed from: p, reason: collision with root package name */
    public final d7.e f78487p;

    /* renamed from: q, reason: collision with root package name */
    public float f78488q;

    /* renamed from: r, reason: collision with root package name */
    public int f78489r;

    /* renamed from: s, reason: collision with root package name */
    public int f78490s;

    /* renamed from: t, reason: collision with root package name */
    public long f78491t;

    /* renamed from: u, reason: collision with root package name */
    public h8.p f78492u;

    /* renamed from: v, reason: collision with root package name */
    public long f78493v;

    public b(a7.c1 c1Var, int[] iArr, int i13, l8.e eVar, long j13, long j14, long j15, int i14, int i15, float f13, float f14, c1 c1Var2, d7.e eVar2) {
        super(c1Var, iArr);
        l8.e eVar3;
        long j16;
        if (j15 < j13) {
            d7.u.g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar3 = eVar;
            j16 = j13;
        } else {
            eVar3 = eVar;
            j16 = j15;
        }
        this.f78478g = eVar3;
        this.f78479h = j13 * 1000;
        this.f78480i = j14 * 1000;
        this.f78481j = j16 * 1000;
        this.f78482k = i14;
        this.f78483l = i15;
        this.f78484m = f13;
        this.f78485n = f14;
        this.f78486o = c1.r(c1Var2);
        this.f78487p = eVar2;
        this.f78488q = 1.0f;
        this.f78490s = 0;
        this.f78491t = -9223372036854775807L;
        this.f78493v = -2147483647L;
    }

    public static v2 w(r[] rVarArr) {
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i13 = 1;
            if (i16 >= rVarArr.length) {
                break;
            }
            r rVar = rVarArr[i16];
            if (rVar == null || rVar.f78574b.length <= 1) {
                arrayList.add(null);
            } else {
                x0 n13 = c1.n();
                n13.g(new a(0L, 0L));
                arrayList.add(n13);
            }
            i16++;
        }
        int length = rVarArr.length;
        long[][] jArr = new long[length][];
        for (int i17 = 0; i17 < rVarArr.length; i17++) {
            r rVar2 = rVarArr[i17];
            if (rVar2 == null) {
                jArr[i17] = new long[0];
            } else {
                int[] iArr = rVar2.f78574b;
                jArr[i17] = new long[iArr.length];
                for (int i18 = 0; i18 < iArr.length; i18++) {
                    long j13 = rVar2.f78573a.f967d[iArr[i18]].f18760j;
                    long[] jArr2 = jArr[i17];
                    if (j13 == -1) {
                        j13 = 0;
                    }
                    jArr2[i18] = j13;
                }
                Arrays.sort(jArr[i17]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i19 = 0; i19 < length; i19++) {
            long[] jArr4 = jArr[i19];
            jArr3[i19] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x(arrayList, jArr3);
        s2 s2Var = s2.f100480a;
        s2Var.getClass();
        q2 j14 = new n2(s2Var).j().j();
        int i23 = 0;
        while (i23 < length) {
            long[] jArr5 = jArr[i23];
            if (jArr5.length <= i13) {
                i14 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i24 = i15;
                while (true) {
                    long[] jArr6 = jArr[i23];
                    double d2 = 0.0d;
                    if (i24 >= jArr6.length) {
                        break;
                    }
                    int i25 = length;
                    long j15 = jArr6[i24];
                    if (j15 != -1) {
                        d2 = Math.log(j15);
                    }
                    dArr[i24] = d2;
                    i24++;
                    length = i25;
                }
                i14 = length;
                int i26 = length2 - 1;
                double d13 = dArr[i26] - dArr[0];
                int i27 = 0;
                while (i27 < i26) {
                    double d14 = dArr[i27];
                    i27++;
                    j14.k(Double.valueOf(d13 == 0.0d ? 1.0d : (((d14 + dArr[i27]) * 0.5d) - dArr[0]) / d13), Integer.valueOf(i23));
                }
            }
            i23++;
            length = i14;
            i15 = 0;
            i13 = 1;
        }
        c1 r13 = c1.r(j14.m());
        for (int i28 = 0; i28 < r13.size(); i28++) {
            int intValue = ((Integer) r13.get(i28)).intValue();
            int i29 = iArr2[intValue] + 1;
            iArr2[intValue] = i29;
            jArr3[intValue] = jArr[intValue][i29];
            x(arrayList, jArr3);
        }
        for (int i33 = 0; i33 < rVarArr.length; i33++) {
            if (arrayList.get(i33) != null) {
                jArr3[i33] = jArr3[i33] * 2;
            }
        }
        x(arrayList, jArr3);
        x0 n14 = c1.n();
        for (int i34 = 0; i34 < arrayList.size(); i34++) {
            x0 x0Var = (x0) arrayList.get(i34);
            n14.g(x0Var == null ? c1.u() : x0Var.i());
        }
        return n14.i();
    }

    public static void x(ArrayList arrayList, long[] jArr) {
        long j13 = 0;
        for (long j14 : jArr) {
            j13 += j14;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            x0 x0Var = (x0) arrayList.get(i13);
            if (x0Var != null) {
                x0Var.e(new a(j13, jArr[i13]));
            }
        }
    }

    public static long z(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        h8.p pVar = (h8.p) com.bumptech.glide.c.P(list);
        long j13 = pVar.f68029g;
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j14 = pVar.f68030h;
        if (j14 != -9223372036854775807L) {
            return j14 - j13;
        }
        return -9223372036854775807L;
    }

    public final long A(long j13, long j14) {
        long j15 = this.f78479h;
        if (j13 == -9223372036854775807L) {
            return j15;
        }
        if (j14 != -9223372036854775807L) {
            j13 -= j14;
        }
        return Math.min((long) (j13 * this.f78485n), j15);
    }

    @Override // k8.t
    public final int a() {
        return this.f78489r;
    }

    @Override // k8.t
    public final long b() {
        return this.f78493v;
    }

    @Override // k8.c, k8.t
    public final void g() {
        this.f78492u = null;
    }

    @Override // k8.c, k8.t
    public final void i(float f13) {
        this.f78488q = f13;
    }

    @Override // k8.t
    public final Object j() {
        return null;
    }

    @Override // k8.c, k8.t
    public final void o() {
        this.f78491t = -9223372036854775807L;
        this.f78492u = null;
    }

    @Override // k8.c, k8.t
    public final int p(long j13, List list) {
        int i13;
        int i14;
        ((g0) this.f78487p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = this.f78491t;
        if (j14 != -9223372036854775807L && elapsedRealtime - j14 < 1000 && (list.isEmpty() || ((h8.p) com.bumptech.glide.c.P(list)).equals(this.f78492u))) {
            return list.size();
        }
        this.f78491t = elapsedRealtime;
        this.f78492u = list.isEmpty() ? null : (h8.p) com.bumptech.glide.c.P(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = n0.H(((h8.p) list.get(size - 1)).f68029g - j13, this.f78488q);
        long j15 = this.f78481j;
        if (H < j15) {
            return size;
        }
        z(list);
        androidx.media3.common.b bVar = this.f78497d[y(elapsedRealtime)];
        for (int i15 = 0; i15 < size; i15++) {
            h8.p pVar = (h8.p) list.get(i15);
            androidx.media3.common.b bVar2 = pVar.f68026d;
            if (n0.H(pVar.f68029g - j13, this.f78488q) >= j15 && bVar2.f18760j < bVar.f18760j && (i13 = bVar2.f18773w) != -1 && i13 <= this.f78483l && (i14 = bVar2.f18772v) != -1 && i14 <= this.f78482k && i13 < bVar.f18773w) {
                return i15;
            }
        }
        return size;
    }

    @Override // k8.t
    public final int t() {
        return this.f78490s;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // k8.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(long r6, long r8, long r10, java.util.List r12, h8.q[] r13) {
        /*
            r5 = this;
            d7.e r6 = r5.f78487p
            d7.g0 r6 = (d7.g0) r6
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r0 = r5.f78489r
            int r1 = r13.length
            if (r0 >= r1) goto L26
            r0 = r13[r0]
            boolean r0 = r0.next()
            if (r0 == 0) goto L26
            int r0 = r5.f78489r
            r13 = r13[r0]
            long r0 = r13.k()
            long r2 = r13.g()
        L24:
            long r0 = r0 - r2
            goto L42
        L26:
            int r0 = r13.length
            r1 = 0
        L28:
            if (r1 >= r0) goto L3e
            r2 = r13[r1]
            boolean r3 = r2.next()
            if (r3 == 0) goto L3b
            long r0 = r2.k()
            long r2 = r2.g()
            goto L24
        L3b:
            int r1 = r1 + 1
            goto L28
        L3e:
            long r0 = z(r12)
        L42:
            int r13 = r5.f78490s
            if (r13 != 0) goto L50
            r8 = 1
            r5.f78490s = r8
            int r6 = r5.y(r6)
            r5.f78489r = r6
            return
        L50:
            int r2 = r5.f78489r
            boolean r3 = r12.isEmpty()
            r4 = -1
            if (r3 == 0) goto L5b
            r3 = r4
            goto L67
        L5b:
            java.lang.Object r3 = com.bumptech.glide.c.P(r12)
            h8.p r3 = (h8.p) r3
            androidx.media3.common.b r3 = r3.f68026d
            int r3 = r5.d(r3)
        L67:
            if (r3 == r4) goto L72
            java.lang.Object r12 = com.bumptech.glide.c.P(r12)
            h8.p r12 = (h8.p) r12
            int r13 = r12.f68027e
            r2 = r3
        L72:
            int r12 = r5.y(r6)
            if (r12 == r2) goto L9c
            boolean r6 = r5.c(r2, r6)
            if (r6 != 0) goto L9c
            androidx.media3.common.b[] r6 = r5.f78497d
            r7 = r6[r2]
            r6 = r6[r12]
            long r10 = r5.A(r10, r0)
            int r6 = r6.f18760j
            int r7 = r7.f18760j
            if (r6 <= r7) goto L93
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L93
            goto L9b
        L93:
            if (r6 >= r7) goto L9c
            long r6 = r5.f78480i
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 < 0) goto L9c
        L9b:
            r12 = r2
        L9c:
            if (r12 != r2) goto L9f
            goto La0
        L9f:
            r13 = 3
        La0:
            r5.f78490s = r13
            r5.f78489r = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.b.u(long, long, long, java.util.List, h8.q[]):void");
    }

    public final int y(long j13) {
        this.f78493v = this.f78478g.e();
        long j14 = (long) (((long) (r0 * this.f78484m)) / this.f78488q);
        c1 c1Var = this.f78486o;
        if (!c1Var.isEmpty()) {
            int i13 = 1;
            while (i13 < c1Var.size() - 1 && ((a) c1Var.get(i13)).f78476a < j14) {
                i13++;
            }
            a aVar = (a) c1Var.get(i13 - 1);
            a aVar2 = (a) c1Var.get(i13);
            long j15 = aVar.f78476a;
            long j16 = aVar2.f78477b;
            long j17 = aVar.f78477b;
            j14 = ((long) (((j14 - j15) / (aVar2.f78476a - j15)) * (j16 - j17))) + j17;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f78495b; i15++) {
            if (j13 == Long.MIN_VALUE || !c(i15, j13)) {
                if (e(i15).f18760j <= j14) {
                    return i15;
                }
                i14 = i15;
            }
        }
        return i14;
    }
}
