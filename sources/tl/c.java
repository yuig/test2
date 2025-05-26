package tl;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f118031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f118032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f118033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f118034f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j13, long j14, TimeUnit timeUnit, int i13) {
        this.f118029a = i13;
        this.f118030b = fVar;
        this.f118031c = runnable;
        this.f118032d = j13;
        this.f118033e = j14;
        this.f118034f = timeUnit;
    }

    @Override // tl.g
    public final ScheduledFuture a(ll.j jVar) {
        int i13 = this.f118029a;
        Runnable runnable = this.f118031c;
        f fVar = this.f118030b;
        fVar.getClass();
        switch (i13) {
            case 0:
                return fVar.f118043b.scheduleAtFixedRate(new d(fVar, runnable, jVar, 0), this.f118032d, this.f118033e, this.f118034f);
            default:
                return fVar.f118043b.scheduleWithFixedDelay(new d(fVar, runnable, jVar, 2), this.f118032d, this.f118033e, this.f118034f);
        }
    }
}
