package tl;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f118027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f118028e;

    public /* synthetic */ b(f fVar, Object obj, long j13, TimeUnit timeUnit, int i13) {
        this.f118024a = i13;
        this.f118025b = fVar;
        this.f118028e = obj;
        this.f118026c = j13;
        this.f118027d = timeUnit;
    }

    @Override // tl.g
    public final ScheduledFuture a(ll.j jVar) {
        int i13 = this.f118024a;
        TimeUnit timeUnit = this.f118027d;
        long j13 = this.f118026c;
        int i14 = 1;
        f fVar = this.f118025b;
        Object obj = this.f118028e;
        switch (i13) {
            case 0:
                fVar.getClass();
                return fVar.f118043b.schedule(new d(fVar, (Runnable) obj, jVar, i14), j13, timeUnit);
            default:
                fVar.getClass();
                return fVar.f118043b.schedule(new com.airbnb.lottie.j(fVar, (Callable) obj, jVar, i14), j13, timeUnit);
        }
    }
}
