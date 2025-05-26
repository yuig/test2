package mk2;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class f implements Future {

    /* renamed from: a, reason: collision with root package name */
    public final xj2.c f87373a;

    public f(xj2.c cVar) {
        this.f87373a = cVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        this.f87373a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return null;
    }
}
