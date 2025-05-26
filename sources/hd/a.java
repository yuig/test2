package hd;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a implements Future {

    /* renamed from: a, reason: collision with root package name */
    public final FutureTask f68784a;

    /* renamed from: b, reason: collision with root package name */
    public final n f68785b;

    public a(FutureTask futureTask, n nVar) {
        this.f68784a = futureTask;
        this.f68785b = nVar;
    }

    public final void a() {
        FutureTask futureTask = this.f68784a;
        if (futureTask.isDone()) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        o oVar = currentThread instanceof o ? (o) currentThread : null;
        if ((oVar != null ? oVar.f68842a : null) == this.f68785b) {
            futureTask.run();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return this.f68784a.cancel(z13);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        a();
        return this.f68784a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f68784a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f68784a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        a();
        return this.f68784a.get(j13, timeUnit);
    }
}
