package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class l1 extends ok2.a implements uj2.k {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65511a;

    /* renamed from: b, reason: collision with root package name */
    public final dk2.h f65512b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65513c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.a f65514d;

    /* renamed from: e, reason: collision with root package name */
    public xp2.c f65515e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f65516f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f65517g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f65518h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f65519i = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public boolean f65520j;

    public l1(xp2.b bVar, int i13, boolean z13, boolean z14, ak2.a aVar) {
        this.f65511a = bVar;
        this.f65514d = aVar;
        this.f65513c = z14;
        this.f65512b = z13 ? new lk2.c(i13) : new lk2.b(i13);
    }

    @Override // xp2.b
    public final void a() {
        this.f65517g = true;
        if (this.f65520j) {
            this.f65511a.a();
        } else {
            g();
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65512b.offer(obj)) {
            if (this.f65520j) {
                this.f65511a.c(null);
                return;
            } else {
                g();
                return;
            }
        }
        this.f65515e.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.f65514d.run();
        } catch (Throwable th3) {
            bp1.h.H(th3);
            missingBackpressureException.initCause(th3);
        }
        onError(missingBackpressureException);
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65516f) {
            return;
        }
        this.f65516f = true;
        this.f65515e.cancel();
        if (this.f65520j || getAndIncrement() != 0) {
            return;
        }
        this.f65512b.clear();
    }

    @Override // dk2.i
    public final void clear() {
        this.f65512b.clear();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65515e, cVar)) {
            this.f65515e = cVar;
            this.f65511a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    public final boolean e(boolean z13, boolean z14, xp2.b bVar) {
        if (this.f65516f) {
            this.f65512b.clear();
            return true;
        }
        if (!z13) {
            return false;
        }
        if (this.f65513c) {
            if (!z14) {
                return false;
            }
            Throwable th3 = this.f65518h;
            if (th3 != null) {
                bVar.onError(th3);
            } else {
                bVar.a();
            }
            return true;
        }
        Throwable th4 = this.f65518h;
        if (th4 != null) {
            this.f65512b.clear();
            bVar.onError(th4);
            return true;
        }
        if (!z14) {
            return false;
        }
        bVar.a();
        return true;
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            dk2.h hVar = this.f65512b;
            xp2.b bVar = this.f65511a;
            int i13 = 1;
            while (!e(this.f65517g, hVar.isEmpty(), bVar)) {
                long j13 = this.f65519i.get();
                long j14 = 0;
                while (j14 != j13) {
                    boolean z13 = this.f65517g;
                    Object poll = hVar.poll();
                    boolean z14 = poll == null;
                    if (e(z13, z14, bVar)) {
                        return;
                    }
                    if (z14) {
                        break;
                    }
                    bVar.c(poll);
                    j14++;
                }
                if (j14 == j13 && e(this.f65517g, hVar.isEmpty(), bVar)) {
                    return;
                }
                if (j14 != 0 && j13 != Long.MAX_VALUE) {
                    this.f65519i.addAndGet(-j14);
                }
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            }
        }
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f65512b.isEmpty();
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f65518h = th3;
        this.f65517g = true;
        if (this.f65520j) {
            this.f65511a.onError(th3);
        } else {
            g();
        }
    }

    @Override // dk2.i
    public final Object poll() {
        return this.f65512b.poll();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (this.f65520j || !ok2.g.validate(j13)) {
            return;
        }
        d7.b.e(this.f65519i, j13);
        g();
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f65520j = true;
        return 2;
    }
}
