package id;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d implements c, Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static Thread f72119c;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f72120a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f72121b;

    @Override // id.c
    public final Object a() {
        while (true) {
            int i13 = this.f72120a.get();
            if (i13 == 0) {
                Thread currentThread = Thread.currentThread();
                if (f72119c == null) {
                    f72119c = Looper.getMainLooper().getThread();
                }
                Thread thread = f72119c;
                Intrinsics.f(thread);
                if (currentThread == thread) {
                    b();
                } else {
                    run();
                }
            } else if (i13 == 1) {
                b();
            } else {
                if (i13 == 2) {
                    return this.f72121b;
                }
                if (i13 == 999) {
                    return null;
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            while (true) {
                int i13 = this.f72120a.get();
                if (i13 == 0 || i13 == 1) {
                    wait();
                } else {
                    Unit unit = Unit.f80348a;
                }
            }
        }
    }

    public abstract Object c();

    @Override // id.c
    public final Object get() {
        while (true) {
            int i13 = this.f72120a.get();
            if (i13 == 0) {
                Thread currentThread = Thread.currentThread();
                if (f72119c == null) {
                    f72119c = Looper.getMainLooper().getThread();
                }
                Thread thread = f72119c;
                Intrinsics.f(thread);
                if (currentThread == thread) {
                    b();
                } else {
                    run();
                }
            } else if (i13 == 1) {
                b();
            } else {
                if (i13 == 2) {
                    return this.f72121b;
                }
                if (i13 == 999) {
                    Object obj = this.f72121b;
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    throw ((Throwable) obj);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f72120a.compareAndSet(0, 1)) {
            try {
                this.f72121b = c();
                this.f72120a.set(2);
            } catch (Throwable th3) {
                try {
                    this.f72121b = th3;
                    this.f72120a.set(999);
                    synchronized (this) {
                        notifyAll();
                        Unit unit = Unit.f80348a;
                    }
                } catch (Throwable th4) {
                    synchronized (this) {
                        notifyAll();
                        Unit unit2 = Unit.f80348a;
                        throw th4;
                    }
                }
            }
            synchronized (this) {
                notifyAll();
                Unit unit3 = Unit.f80348a;
            }
        }
    }
}
