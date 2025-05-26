package tl;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class h extends r4.h implements ScheduledFuture {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f118044i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f118045h;

    public h(g gVar) {
        this.f118045h = gVar.a(new ll.j(this, 4));
    }

    @Override // r4.h
    public final void b() {
        ScheduledFuture scheduledFuture = this.f118045h;
        Object obj = this.f106119a;
        scheduledFuture.cancel((obj instanceof r4.a) && ((r4.a) obj).f106099a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f118045h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f118045h.getDelay(timeUnit);
    }
}
