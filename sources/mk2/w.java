package mk2;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class w extends AtomicReferenceArray implements Runnable, Callable, xj2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f87420b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f87421c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f87422d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f87423e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f87424a;

    public w(Runnable runnable, bk2.b bVar) {
        super(3);
        this.f87424a = runnable;
        lazySet(0, bVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f87423e) {
                return;
            }
            if (obj == f87421c) {
                future.cancel(false);
                return;
            } else if (obj == f87422d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // xj2.c
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f87423e;
            if (obj6 == obj || obj6 == (obj4 = f87421c) || obj6 == (obj5 = f87422d)) {
                break;
            }
            boolean z13 = get(2) != Thread.currentThread();
            if (z13) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z13);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f87420b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((bk2.b) obj2).c(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == f87420b || obj == f87423e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean compareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = f87422d;
        Object obj5 = f87421c;
        Object obj6 = f87420b;
        Object obj7 = f87423e;
        lazySet(2, Thread.currentThread());
        try {
            this.f87424a.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((bk2.b) obj2).c(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th3) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((bk2.b) obj2).c(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
