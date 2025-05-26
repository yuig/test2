package mk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class i extends AtomicInteger implements Runnable, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f87377a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.b f87378b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Thread f87379c;

    public i(Runnable runnable, xj2.b bVar) {
        this.f87377a = runnable;
        this.f87378b = bVar;
    }

    @Override // xj2.c
    public final void dispose() {
        while (true) {
            int i13 = get();
            if (i13 >= 2) {
                return;
            }
            if (i13 == 0) {
                if (compareAndSet(0, 4)) {
                    bk2.b bVar = this.f87378b;
                    if (bVar != null) {
                        bVar.c(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.f87379c;
                if (thread != null) {
                    thread.interrupt();
                    this.f87379c = null;
                }
                set(4);
                bk2.b bVar2 = this.f87378b;
                if (bVar2 != null) {
                    bVar2.c(this);
                    return;
                }
                return;
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() >= 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.f87379c = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.f87379c = null;
                return;
            }
            try {
                this.f87377a.run();
                this.f87379c = null;
                if (!compareAndSet(1, 2)) {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } else {
                    bk2.b bVar = this.f87378b;
                    if (bVar != null) {
                        bVar.c(this);
                    }
                }
            } catch (Throwable th3) {
                this.f87379c = null;
                if (compareAndSet(1, 2)) {
                    bk2.b bVar2 = this.f87378b;
                    if (bVar2 != null) {
                        bVar2.c(this);
                    }
                } else {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                }
                throw th3;
            }
        }
    }
}
