package w9;

import d7.n0;
import java.math.RoundingMode;
import q8.d0;
import q8.e0;
import q8.f0;

/* loaded from: classes3.dex */
public final class e implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final q8.c f128513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f128515c;

    /* renamed from: d, reason: collision with root package name */
    public final long f128516d;

    /* renamed from: e, reason: collision with root package name */
    public final long f128517e;

    public e(q8.c cVar, int i13, long j13, long j14) {
        this.f128513a = cVar;
        this.f128514b = i13;
        this.f128515c = j13;
        long j15 = (j14 - j13) / cVar.f102892f;
        this.f128516d = j15;
        this.f128517e = a(j15);
    }

    public final long a(long j13) {
        long j14 = j13 * this.f128514b;
        long j15 = this.f128513a.f102890d;
        int i13 = n0.f53866a;
        return n0.g0(j14, 1000000L, j15, RoundingMode.DOWN);
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        q8.c cVar = this.f128513a;
        long j14 = this.f128516d;
        long j15 = n0.j((cVar.f102890d * j13) / (this.f128514b * 1000000), 0L, j14 - 1);
        long j16 = this.f128515c;
        long a13 = a(j15);
        f0 f0Var = new f0(a13, (cVar.f102892f * j15) + j16);
        if (a13 >= j13 || j15 == j14 - 1) {
            return new d0(f0Var, f0Var);
        }
        long j17 = j15 + 1;
        return new d0(f0Var, new f0(a(j17), (cVar.f102892f * j17) + j16));
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // q8.e0
    public final long l() {
        return this.f128517e;
    }
}
