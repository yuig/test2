package jp2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f77385a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f77386b;

    public w(Runnable runnable) {
        this.f77386b = runnable;
    }

    public final void a() {
        if (this.f77385a.decrementAndGet() == 0) {
            this.f77386b.run();
        }
    }

    public final void b() {
        this.f77385a.incrementAndGet();
    }
}
