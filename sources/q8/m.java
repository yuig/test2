package q8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102957a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f102958b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f102959c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f102960d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f102961e;

    /* renamed from: f, reason: collision with root package name */
    public final long f102962f;

    public m(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f102958b = iArr;
        this.f102959c = jArr;
        this.f102960d = jArr2;
        this.f102961e = jArr3;
        int length = iArr.length;
        this.f102957a = length;
        if (length > 0) {
            this.f102962f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f102962f = 0L;
        }
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        long[] jArr = this.f102961e;
        int e13 = d7.n0.e(jArr, j13, true);
        long j14 = jArr[e13];
        long[] jArr2 = this.f102959c;
        f0 f0Var = new f0(j14, jArr2[e13]);
        if (j14 >= j13 || e13 == this.f102957a - 1) {
            return new d0(f0Var);
        }
        int i13 = e13 + 1;
        return new d0(f0Var, new f0(jArr[i13], jArr2[i13]));
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // q8.e0
    public final long l() {
        return this.f102962f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f102957a + ", sizes=" + Arrays.toString(this.f102958b) + ", offsets=" + Arrays.toString(this.f102959c) + ", timeUs=" + Arrays.toString(this.f102961e) + ", durationsUs=" + Arrays.toString(this.f102960d) + ")";
    }
}
