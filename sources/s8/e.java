package s8;

import d7.n0;
import java.math.RoundingMode;
import net.quikkly.android.utils.BitmapUtils;
import q8.d0;
import q8.f0;
import q8.k0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f111441a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f111442b;

    /* renamed from: c, reason: collision with root package name */
    public final int f111443c;

    /* renamed from: d, reason: collision with root package name */
    public final int f111444d;

    /* renamed from: e, reason: collision with root package name */
    public final long f111445e;

    /* renamed from: f, reason: collision with root package name */
    public int f111446f;

    /* renamed from: g, reason: collision with root package name */
    public int f111447g;

    /* renamed from: h, reason: collision with root package name */
    public int f111448h;

    /* renamed from: i, reason: collision with root package name */
    public int f111449i;

    /* renamed from: j, reason: collision with root package name */
    public int f111450j;

    /* renamed from: k, reason: collision with root package name */
    public int f111451k;

    /* renamed from: l, reason: collision with root package name */
    public long f111452l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f111453m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f111454n;

    public e(int i13, d dVar, k0 k0Var) {
        this.f111441a = dVar;
        int a13 = dVar.a();
        boolean z13 = true;
        if (a13 != 1 && a13 != 2) {
            z13 = false;
        }
        bf.b.i(z13);
        int i14 = (((i13 % 10) + 48) << 8) | ((i13 / 10) + 48);
        this.f111443c = (a13 == 2 ? 1667497984 : 1651965952) | i14;
        int i15 = dVar.f111438d;
        long j13 = dVar.f111436b * 1000000;
        long j14 = dVar.f111437c;
        int i16 = n0.f53866a;
        this.f111445e = n0.g0(i15, j13, j14, RoundingMode.DOWN);
        this.f111442b = k0Var;
        this.f111444d = a13 == 2 ? i14 | 1650720768 : -1;
        this.f111452l = -1L;
        this.f111453m = new long[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        this.f111454n = new int[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        this.f111446f = i15;
    }

    public final f0 a(int i13) {
        return new f0(((this.f111445e * 1) / this.f111446f) * this.f111454n[i13], this.f111453m[i13]);
    }

    public final d0 b(long j13) {
        if (this.f111451k == 0) {
            f0 f0Var = new f0(0L, this.f111452l);
            return new d0(f0Var, f0Var);
        }
        int i13 = (int) (j13 / ((this.f111445e * 1) / this.f111446f));
        int d2 = n0.d(this.f111454n, i13, true, true);
        if (this.f111454n[d2] == i13) {
            f0 a13 = a(d2);
            return new d0(a13, a13);
        }
        f0 a14 = a(d2);
        int i14 = d2 + 1;
        return i14 < this.f111453m.length ? new d0(a14, a(i14)) : new d0(a14, a14);
    }
}
