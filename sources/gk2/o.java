package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class o extends l {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f65549c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f65550d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f65551e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f65552f;

    public o(xp2.b bVar) {
        super(bVar);
        this.f65549c = new AtomicReference();
        this.f65552f = new AtomicInteger();
    }

    @Override // gk2.l, uj2.i
    public final boolean a(Throwable th3) {
        if (this.f65551e || this.f65491b.isDisposed()) {
            return false;
        }
        if (th3 == null) {
            e(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
        this.f65550d = th3;
        this.f65551e = true;
        h();
        return true;
    }

    @Override // uj2.g
    public final void c(Object obj) {
        if (this.f65551e || this.f65491b.isDisposed()) {
            return;
        }
        if (obj == null) {
            e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f65549c.set(obj);
            h();
        }
    }

    @Override // gk2.l
    public final void f() {
        h();
    }

    @Override // gk2.l
    public final void g() {
        if (this.f65552f.getAndIncrement() == 0) {
            this.f65549c.lazySet(null);
        }
    }

    public final void h() {
        if (this.f65552f.getAndIncrement() != 0) {
            return;
        }
        xp2.b bVar = this.f65490a;
        AtomicReference atomicReference = this.f65549c;
        int i13 = 1;
        do {
            long j13 = get();
            long j14 = 0;
            while (true) {
                if (j14 == j13) {
                    break;
                }
                if (this.f65491b.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z13 = this.f65551e;
                Object andSet = atomicReference.getAndSet(null);
                boolean z14 = andSet == null;
                if (z13 && z14) {
                    Throwable th3 = this.f65550d;
                    if (th3 != null) {
                        d(th3);
                        return;
                    } else {
                        b();
                        return;
                    }
                }
                if (z14) {
                    break;
                }
                bVar.c(andSet);
                j14++;
            }
            if (j14 == j13) {
                if (this.f65491b.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z15 = this.f65551e;
                boolean z16 = atomicReference.get() == null;
                if (z15 && z16) {
                    Throwable th4 = this.f65550d;
                    if (th4 != null) {
                        d(th4);
                        return;
                    } else {
                        b();
                        return;
                    }
                }
            }
            if (j14 != 0) {
                d7.b.l0(this, j14);
            }
            i13 = this.f65552f.addAndGet(-i13);
        } while (i13 != 0);
    }
}
