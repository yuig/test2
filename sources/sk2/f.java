package sk2;

import ck2.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: b, reason: collision with root package name */
    public final lk2.c f113109b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f113110c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f113111d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f113112e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f113113f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f113114g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f113115h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f113116i;

    /* renamed from: j, reason: collision with root package name */
    public final e f113117j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f113118k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f113119l;

    public f() {
        i.c(8, "capacityHint");
        this.f113109b = new lk2.c(8);
        this.f113110c = new AtomicReference(null);
        this.f113111d = true;
        this.f113114g = new AtomicReference();
        this.f113116i = new AtomicBoolean();
        this.f113117j = new e(this);
        this.f113118k = new AtomicLong();
    }

    @Override // xp2.b
    public final void a() {
        if (this.f113112e || this.f113115h) {
            return;
        }
        this.f113112e = true;
        Runnable runnable = (Runnable) this.f113110c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        p();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        i.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f113112e || this.f113115h) {
            return;
        }
        this.f113109b.offer(obj);
        p();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (this.f113112e || this.f113115h) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        if (this.f113116i.get() || !this.f113116i.compareAndSet(false, true)) {
            ok2.d.error(new IllegalStateException("This processor allows only a single Subscriber"), bVar);
            return;
        }
        bVar.d(this.f113117j);
        this.f113114g.set(bVar);
        if (this.f113115h) {
            this.f113114g.lazySet(null);
        } else {
            p();
        }
    }

    public final boolean o(boolean z13, boolean z14, boolean z15, xp2.b bVar, lk2.c cVar) {
        if (this.f113115h) {
            cVar.clear();
            this.f113114g.lazySet(null);
            return true;
        }
        if (!z14) {
            return false;
        }
        if (z13 && this.f113113f != null) {
            cVar.clear();
            this.f113114g.lazySet(null);
            bVar.onError(this.f113113f);
            return true;
        }
        if (!z15) {
            return false;
        }
        Throwable th3 = this.f113113f;
        this.f113114g.lazySet(null);
        if (th3 != null) {
            bVar.onError(th3);
        } else {
            bVar.a();
        }
        return true;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f113112e || this.f113115h) {
            l0.R0(th3);
            return;
        }
        this.f113113f = th3;
        this.f113112e = true;
        Runnable runnable = (Runnable) this.f113110c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        p();
    }

    public final void p() {
        if (this.f113117j.getAndIncrement() != 0) {
            return;
        }
        xp2.b bVar = (xp2.b) this.f113114g.get();
        int i13 = 1;
        int i14 = 1;
        while (bVar == null) {
            i14 = this.f113117j.addAndGet(-i14);
            if (i14 == 0) {
                return;
            } else {
                bVar = (xp2.b) this.f113114g.get();
            }
        }
        if (!this.f113119l) {
            q(bVar);
            return;
        }
        lk2.c cVar = this.f113109b;
        boolean z13 = !this.f113111d;
        while (!this.f113115h) {
            boolean z14 = this.f113112e;
            if (z13 && z14 && this.f113113f != null) {
                cVar.clear();
                this.f113114g.lazySet(null);
                bVar.onError(this.f113113f);
                return;
            }
            bVar.c(null);
            if (z14) {
                this.f113114g.lazySet(null);
                Throwable th3 = this.f113113f;
                if (th3 != null) {
                    bVar.onError(th3);
                    return;
                } else {
                    bVar.a();
                    return;
                }
            }
            i13 = this.f113117j.addAndGet(-i13);
            if (i13 == 0) {
                return;
            }
        }
        this.f113114g.lazySet(null);
    }

    public final void q(xp2.b bVar) {
        long j13;
        lk2.c cVar = this.f113109b;
        boolean z13 = true;
        boolean z14 = !this.f113111d;
        int i13 = 1;
        while (true) {
            long j14 = this.f113118k.get();
            long j15 = 0;
            while (true) {
                if (j14 == j15) {
                    j13 = j15;
                    break;
                }
                boolean z15 = this.f113112e;
                Object poll = cVar.poll();
                boolean z16 = poll == null ? z13 : false;
                j13 = j15;
                if (o(z14, z15, z16, bVar, cVar)) {
                    return;
                }
                if (z16) {
                    break;
                }
                bVar.c(poll);
                j15 = 1 + j13;
                z13 = true;
            }
            if (j14 == j15 && o(z14, this.f113112e, cVar.isEmpty(), bVar, cVar)) {
                return;
            }
            if (j13 != 0 && j14 != Long.MAX_VALUE) {
                this.f113118k.addAndGet(-j13);
            }
            i13 = this.f113117j.addAndGet(-i13);
            if (i13 == 0) {
                return;
            } else {
                z13 = true;
            }
        }
    }
}
