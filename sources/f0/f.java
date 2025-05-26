package f0;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import r4.l;

/* loaded from: classes2.dex */
public final class f implements RunnableScheduledFuture {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f60732a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f60733b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f60734c;

    /* renamed from: d, reason: collision with root package name */
    public final l f60735d;

    public f(Handler handler, long j13, Callable callable) {
        this.f60733b = j13;
        this.f60734c = callable;
        this.f60735d = com.bumptech.glide.d.L(new androidx.appcompat.app.d(this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return this.f60735d.cancel(z13);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f60735d.f106128b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f60733b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f60735d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f60735d.f106128b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        r4.i iVar = (r4.i) this.f60732a.getAndSet(null);
        if (iVar != null) {
            try {
                iVar.b(this.f60734c.call());
            } catch (Exception e13) {
                iVar.d(e13);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return this.f60735d.f106128b.get(j13, timeUnit);
    }
}
