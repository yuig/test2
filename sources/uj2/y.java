package uj2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f122349a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.a f122350b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122351c;

    /* renamed from: d, reason: collision with root package name */
    public long f122352d;

    /* renamed from: e, reason: collision with root package name */
    public long f122353e;

    /* renamed from: f, reason: collision with root package name */
    public long f122354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f122355g;

    public y(z zVar, long j13, Runnable runnable, long j14, bk2.a aVar, long j15) {
        this.f122355g = zVar;
        this.f122349a = runnable;
        this.f122350b = aVar;
        this.f122351c = j15;
        this.f122353e = j14;
        this.f122354f = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j13;
        this.f122349a.run();
        bk2.a aVar = this.f122350b;
        if (aVar.isDisposed()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        z zVar = this.f122355g;
        zVar.getClass();
        long a13 = z.a(timeUnit);
        long j14 = a0.f122338b;
        long j15 = a13 + j14;
        long j16 = this.f122353e;
        long j17 = this.f122351c;
        if (j15 < j16 || a13 >= j16 + j17 + j14) {
            j13 = a13 + j17;
            long j18 = this.f122352d + 1;
            this.f122352d = j18;
            this.f122354f = j13 - (j17 * j18);
        } else {
            long j19 = this.f122354f;
            long j23 = this.f122352d + 1;
            this.f122352d = j23;
            j13 = (j23 * j17) + j19;
        }
        this.f122353e = a13;
        bk2.c.replace(aVar, zVar.c(this, j13 - a13, timeUnit));
    }
}
