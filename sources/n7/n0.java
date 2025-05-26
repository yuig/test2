package n7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n0 {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public int G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f89512J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public long O;
    public androidx.media3.common.b P;
    public androidx.media3.common.b Q;
    public long R;
    public long S;
    public float T;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f89513a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f89514b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public final List f89515c;

    /* renamed from: d, reason: collision with root package name */
    public final List f89516d;

    /* renamed from: e, reason: collision with root package name */
    public final List f89517e;

    /* renamed from: f, reason: collision with root package name */
    public final List f89518f;

    /* renamed from: g, reason: collision with root package name */
    public final List f89519g;

    /* renamed from: h, reason: collision with root package name */
    public final List f89520h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89521i;

    /* renamed from: j, reason: collision with root package name */
    public long f89522j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f89523k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f89524l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f89525m;

    /* renamed from: n, reason: collision with root package name */
    public int f89526n;

    /* renamed from: o, reason: collision with root package name */
    public int f89527o;

    /* renamed from: p, reason: collision with root package name */
    public int f89528p;

    /* renamed from: q, reason: collision with root package name */
    public int f89529q;

    /* renamed from: r, reason: collision with root package name */
    public long f89530r;

    /* renamed from: s, reason: collision with root package name */
    public int f89531s;

    /* renamed from: t, reason: collision with root package name */
    public long f89532t;

    /* renamed from: u, reason: collision with root package name */
    public long f89533u;

    /* renamed from: v, reason: collision with root package name */
    public long f89534v;

    /* renamed from: w, reason: collision with root package name */
    public long f89535w;

    /* renamed from: x, reason: collision with root package name */
    public long f89536x;

    /* renamed from: y, reason: collision with root package name */
    public long f89537y;

    /* renamed from: z, reason: collision with root package name */
    public long f89538z;

    public n0(b bVar, boolean z13) {
        this.f89513a = z13;
        this.f89515c = z13 ? new ArrayList() : Collections.emptyList();
        this.f89516d = z13 ? new ArrayList() : Collections.emptyList();
        this.f89517e = z13 ? new ArrayList() : Collections.emptyList();
        this.f89518f = z13 ? new ArrayList() : Collections.emptyList();
        this.f89519g = z13 ? new ArrayList() : Collections.emptyList();
        this.f89520h = z13 ? new ArrayList() : Collections.emptyList();
        boolean z14 = false;
        this.H = 0;
        this.I = bVar.f89378a;
        this.f89522j = -9223372036854775807L;
        this.f89530r = -9223372036854775807L;
        g8.e0 e0Var = bVar.f89381d;
        if (e0Var != null && e0Var.b()) {
            z14 = true;
        }
        this.f89521i = z14;
        this.f89533u = -1L;
        this.f89532t = -1L;
        this.f89531s = -1;
        this.T = 1.0f;
    }

    public static boolean c(int i13) {
        return i13 == 6 || i13 == 7 || i13 == 10;
    }

    public final m0 a(boolean z13) {
        long[] jArr;
        List list;
        long j13;
        int i13;
        long j14;
        int i14;
        long[] jArr2 = this.f89514b;
        List list2 = this.f89516d;
        if (z13) {
            jArr = jArr2;
            list = list2;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long[] copyOf = Arrays.copyOf(jArr2, 16);
            long max = Math.max(0L, elapsedRealtime - this.I);
            int i15 = this.H;
            copyOf[i15] = copyOf[i15] + max;
            g(elapsedRealtime);
            e(elapsedRealtime);
            d(elapsedRealtime);
            ArrayList arrayList = new ArrayList(list2);
            if (this.f89513a && this.H == 3) {
                arrayList.add(b(elapsedRealtime));
            }
            jArr = copyOf;
            list = arrayList;
        }
        int i16 = (this.f89525m || !this.f89523k) ? 1 : 0;
        long j15 = i16 != 0 ? -9223372036854775807L : jArr[2];
        int i17 = jArr[1] > 0 ? 1 : 0;
        List list3 = this.f89517e;
        List arrayList2 = z13 ? list3 : new ArrayList(list3);
        List list4 = this.f89518f;
        List arrayList3 = z13 ? list4 : new ArrayList(list4);
        List list5 = this.f89515c;
        List arrayList4 = z13 ? list5 : new ArrayList(list5);
        long j16 = this.f89522j;
        boolean z14 = this.K;
        int i18 = !this.f89523k ? 1 : 0;
        boolean z15 = this.f89524l;
        int i19 = i16 ^ 1;
        int i23 = this.f89526n;
        int i24 = this.f89527o;
        int i25 = this.f89528p;
        int i26 = this.f89529q;
        long j17 = this.f89530r;
        long[] jArr3 = jArr;
        long j18 = this.f89534v;
        long j19 = this.f89535w;
        long j23 = this.f89536x;
        long j24 = this.f89537y;
        long j25 = this.f89538z;
        long j26 = this.A;
        int i27 = this.f89531s;
        int i28 = i27 == -1 ? 0 : 1;
        long j27 = this.f89532t;
        if (j27 == -1) {
            j13 = j27;
            i13 = 0;
        } else {
            j13 = j27;
            i13 = 1;
        }
        long j28 = this.f89533u;
        if (j28 == -1) {
            j14 = j28;
            i14 = 0;
        } else {
            j14 = j28;
            i14 = 1;
        }
        long j29 = this.B;
        long j33 = this.C;
        long j34 = this.D;
        long j35 = this.E;
        int i29 = this.F;
        int i33 = i29 > 0 ? 1 : 0;
        int i34 = this.G;
        long j36 = j13;
        boolean z16 = this.f89521i;
        return new m0(1, jArr3, arrayList4, list, j16, z14 ? 1 : 0, i18, z15 ? 1 : 0, i17, j15, i19, i23, i24, i25, i26, j17, z16 ? 1 : 0, arrayList2, arrayList3, j18, j19, j23, j24, j25, j26, i28, i13, i27, j36, i14, j14, j29, j33, j34, j35, i33, i29, i34, this.f89519g, this.f89520h);
    }

    public final long[] b(long j13) {
        return new long[]{j13, ((long[]) ep.b.i(this.f89516d, 1))[1] + ((long) ((j13 - r0[0]) * this.T))};
    }

    public final void d(long j13) {
        androidx.media3.common.b bVar;
        int i13;
        if (this.H == 3 && (bVar = this.Q) != null && (i13 = bVar.f18760j) != -1) {
            long j14 = (long) ((j13 - this.S) * this.T);
            this.f89538z += j14;
            this.A = (j14 * i13) + this.A;
        }
        this.S = j13;
    }

    public final void e(long j13) {
        androidx.media3.common.b bVar;
        if (this.H == 3 && (bVar = this.P) != null) {
            long j14 = (long) ((j13 - this.R) * this.T);
            int i13 = bVar.f18773w;
            if (i13 != -1) {
                this.f89534v += j14;
                this.f89535w = (i13 * j14) + this.f89535w;
            }
            int i14 = bVar.f18760j;
            if (i14 != -1) {
                this.f89536x += j14;
                this.f89537y = (j14 * i14) + this.f89537y;
            }
        }
        this.R = j13;
    }

    public final void f(b bVar, androidx.media3.common.b bVar2) {
        int i13;
        if (Objects.equals(this.Q, bVar2)) {
            return;
        }
        d(bVar.f89378a);
        if (bVar2 != null && this.f89533u == -1 && (i13 = bVar2.f18760j) != -1) {
            this.f89533u = i13;
        }
        this.Q = bVar2;
        if (this.f89513a) {
            this.f89518f.add(new k0(bVar, bVar2));
        }
    }

    public final void g(long j13) {
        if (c(this.H)) {
            long j14 = j13 - this.O;
            long j15 = this.f89530r;
            if (j15 == -9223372036854775807L || j14 > j15) {
                this.f89530r = j14;
            }
        }
    }

    public final void h(long j13, long j14) {
        if (this.f89513a) {
            int i13 = this.H;
            List list = this.f89516d;
            if (i13 != 3) {
                if (j14 == -9223372036854775807L) {
                    return;
                }
                if (!list.isEmpty()) {
                    long j15 = ((long[]) ep.b.i(list, 1))[1];
                    if (j15 != j14) {
                        list.add(new long[]{j13, j15});
                    }
                }
            }
            if (j14 != -9223372036854775807L) {
                list.add(new long[]{j13, j14});
            } else {
                if (list.isEmpty()) {
                    return;
                }
                list.add(b(j13));
            }
        }
    }

    public final void i(b bVar, androidx.media3.common.b bVar2) {
        int i13;
        int i14;
        if (Objects.equals(this.P, bVar2)) {
            return;
        }
        e(bVar.f89378a);
        if (bVar2 != null) {
            if (this.f89531s == -1 && (i14 = bVar2.f18773w) != -1) {
                this.f89531s = i14;
            }
            if (this.f89532t == -1 && (i13 = bVar2.f18760j) != -1) {
                this.f89532t = i13;
            }
        }
        this.P = bVar2;
        if (this.f89513a) {
            this.f89517e.add(new k0(bVar, bVar2));
        }
    }

    public final void j(b bVar, int i13) {
        bf.b.i(bVar.f89378a >= this.I);
        long j13 = this.I;
        long j14 = bVar.f89378a;
        int i14 = this.H;
        long[] jArr = this.f89514b;
        jArr[i14] = jArr[i14] + (j14 - j13);
        if (this.f89522j == -9223372036854775807L) {
            this.f89522j = j14;
        }
        this.f89525m |= ((i14 != 1 && i14 != 2 && i14 != 14) || i13 == 1 || i13 == 2 || i13 == 14 || i13 == 3 || i13 == 4 || i13 == 9 || i13 == 11) ? false : true;
        this.f89523k |= i13 == 3 || i13 == 4 || i13 == 9;
        this.f89524l = (i13 == 11) | this.f89524l;
        if (i14 != 4 && i14 != 7 && (i13 == 4 || i13 == 7)) {
            this.f89526n++;
        }
        if (i13 == 5) {
            this.f89528p++;
        }
        if (!c(i14) && c(i13)) {
            this.f89529q++;
            this.O = j14;
        }
        if (c(this.H) && this.H != 7 && i13 == 7) {
            this.f89527o++;
        }
        g(j14);
        this.H = i13;
        this.I = j14;
        if (this.f89513a) {
            this.f89515c.add(new l0(bVar, i13));
        }
    }
}
