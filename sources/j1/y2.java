package j1;

/* loaded from: classes.dex */
public final class y2 implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f74327a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f74328b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74329c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74330d;

    public y2(u2 u2Var, l1 l1Var, long j13) {
        this.f74327a = u2Var;
        this.f74328b = l1Var;
        this.f74329c = (u2Var.r() + u2Var.n()) * 1000000;
        this.f74330d = j13 * 1000000;
    }

    @Override // j1.r2
    public final boolean a() {
        return true;
    }

    @Override // j1.r2
    public final long b(t tVar, t tVar2, t tVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j13) {
        long j14 = this.f74330d;
        if (j13 + j14 <= 0) {
            return 0L;
        }
        long j15 = j13 + j14;
        long j16 = this.f74329c;
        long j17 = j15 / j16;
        return (this.f74328b == l1.Restart || j17 % ((long) 2) == 0) ? j15 - (j17 * j16) : ((j17 + 1) * j16) - j15;
    }

    public final t d(long j13, t tVar, t tVar2, t tVar3) {
        long j14 = this.f74330d;
        long j15 = j13 + j14;
        long j16 = this.f74329c;
        return j15 > j16 ? this.f74327a.g(j16 - j14, tVar, tVar3, tVar2) : tVar2;
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        return this.f74327a.g(c(j13), tVar, tVar2, d(j13, tVar, tVar3, tVar2));
    }

    @Override // j1.r2
    public final t o(long j13, t tVar, t tVar2, t tVar3) {
        return this.f74327a.o(c(j13), tVar, tVar2, d(j13, tVar, tVar3, tVar2));
    }
}
