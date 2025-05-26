package i9;

import d7.n0;
import java.math.RoundingMode;
import l0.k;
import q8.b0;
import q8.d0;

/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f71731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71732b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f71733c;

    public b(long j13, long j14, long j15) {
        this.f71733c = new b0(j13, new long[]{j14}, new long[]{0});
        this.f71731a = j15;
        int i13 = -2147483647;
        if (j13 == -9223372036854775807L) {
            this.f71732b = -2147483647;
            return;
        }
        long g03 = n0.g0(j14 - j15, 8L, j13, RoundingMode.HALF_UP);
        if (g03 > 0 && g03 <= 2147483647L) {
            i13 = (int) g03;
        }
        this.f71732b = i13;
    }

    @Override // i9.f
    public final long c(long j13) {
        b0 b0Var = this.f71733c;
        k kVar = b0Var.f102885b;
        if (kVar.f81235b == 0) {
            return -9223372036854775807L;
        }
        return kVar.m(n0.b(b0Var.f102884a, j13));
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        return this.f71733c.e(j13);
    }

    @Override // i9.f
    public final long g() {
        return this.f71731a;
    }

    @Override // q8.e0
    public final boolean h() {
        return this.f71733c.h();
    }

    @Override // i9.f
    public final int k() {
        return this.f71732b;
    }

    @Override // q8.e0
    public final long l() {
        return this.f71733c.f102886c;
    }
}
