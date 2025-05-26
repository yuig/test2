package i9;

import android.util.Pair;
import d7.n0;
import q8.d0;
import q8.f0;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f71734a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f71735b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71736c;

    public c(long j13, long[] jArr, long[] jArr2) {
        this.f71734a = jArr;
        this.f71735b = jArr2;
        this.f71736c = j13 == -9223372036854775807L ? n0.X(jArr2[jArr2.length - 1]) : j13;
    }

    public static Pair a(long j13, long[] jArr, long[] jArr2) {
        int e13 = n0.e(jArr, j13, true);
        long j14 = jArr[e13];
        long j15 = jArr2[e13];
        int i13 = e13 + 1;
        if (i13 == jArr.length) {
            return Pair.create(Long.valueOf(j14), Long.valueOf(j15));
        }
        return Pair.create(Long.valueOf(j13), Long.valueOf(((long) ((jArr[i13] == j14 ? 0.0d : (j13 - j14) / (r6 - j14)) * (jArr2[i13] - j15))) + j15));
    }

    @Override // i9.f
    public final long c(long j13) {
        return n0.X(((Long) a(j13, this.f71734a, this.f71735b).second).longValue());
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        Pair a13 = a(n0.o0(n0.j(j13, 0L, this.f71736c)), this.f71735b, this.f71734a);
        f0 f0Var = new f0(n0.X(((Long) a13.first).longValue()), ((Long) a13.second).longValue());
        return new d0(f0Var, f0Var);
    }

    @Override // i9.f
    public final long g() {
        return -1L;
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // i9.f
    public final int k() {
        return -2147483647;
    }

    @Override // q8.e0
    public final long l() {
        return this.f71736c;
    }
}
