package i9;

import d7.n0;
import q8.d0;
import q8.f0;

/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f71759a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f71760b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71761c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71762d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71763e;

    public g(long[] jArr, long[] jArr2, long j13, long j14, int i13) {
        this.f71759a = jArr;
        this.f71760b = jArr2;
        this.f71761c = j13;
        this.f71762d = j14;
        this.f71763e = i13;
    }

    @Override // i9.f
    public final long c(long j13) {
        return this.f71759a[n0.e(this.f71760b, j13, true)];
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        long[] jArr = this.f71759a;
        int e13 = n0.e(jArr, j13, true);
        long j14 = jArr[e13];
        long[] jArr2 = this.f71760b;
        f0 f0Var = new f0(j14, jArr2[e13]);
        if (j14 >= j13 || e13 == jArr.length - 1) {
            return new d0(f0Var, f0Var);
        }
        int i13 = e13 + 1;
        return new d0(f0Var, new f0(jArr[i13], jArr2[i13]));
    }

    @Override // i9.f
    public final long g() {
        return this.f71762d;
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // i9.f
    public final int k() {
        return this.f71763e;
    }

    @Override // q8.e0
    public final long l() {
        return this.f71761c;
    }
}
