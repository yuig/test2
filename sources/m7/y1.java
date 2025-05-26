package m7;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class y1 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final d7.e f86489a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86490b;

    /* renamed from: c, reason: collision with root package name */
    public long f86491c;

    /* renamed from: d, reason: collision with root package name */
    public long f86492d;

    /* renamed from: e, reason: collision with root package name */
    public a7.p0 f86493e = a7.p0.f1163d;

    public y1(d7.e eVar) {
        this.f86489a = eVar;
    }

    public final void b(long j13) {
        this.f86491c = j13;
        if (this.f86490b) {
            ((d7.g0) this.f86489a).getClass();
            this.f86492d = SystemClock.elapsedRealtime();
        }
    }

    @Override // m7.z0
    public final void c(a7.p0 p0Var) {
        if (this.f86490b) {
            b(e());
        }
        this.f86493e = p0Var;
    }

    @Override // m7.z0
    public final a7.p0 d() {
        return this.f86493e;
    }

    @Override // m7.z0
    public final long e() {
        long j13 = this.f86491c;
        if (!this.f86490b) {
            return j13;
        }
        ((d7.g0) this.f86489a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f86492d;
        a7.p0 p0Var = this.f86493e;
        return j13 + (p0Var.f1164a == 1.0f ? d7.n0.X(elapsedRealtime) : p0Var.a(elapsedRealtime));
    }

    public final void f() {
        if (this.f86490b) {
            return;
        }
        ((d7.g0) this.f86489a).getClass();
        this.f86492d = SystemClock.elapsedRealtime();
        this.f86490b = true;
    }
}
