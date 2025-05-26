package jk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r2 extends AtomicLong implements uj2.v, xj2.c, s2 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76678a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76679b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76680c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.z f76681d;

    /* renamed from: e, reason: collision with root package name */
    public final bk2.a f76682e = new bk2.a();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f76683f = new AtomicReference();

    public r2(uj2.v vVar, long j13, TimeUnit timeUnit, uj2.z zVar) {
        this.f76678a = vVar;
        this.f76679b = j13;
        this.f76680c = timeUnit;
        this.f76681d = zVar;
    }

    @Override // uj2.v
    public final void a() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f76682e.dispose();
            this.f76678a.a();
            this.f76681d.dispose();
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this.f76683f, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        long j13 = get();
        if (j13 != Long.MAX_VALUE) {
            long j14 = 1 + j13;
            if (compareAndSet(j13, j14)) {
                bk2.a aVar = this.f76682e;
                ((xj2.c) aVar.get()).dispose();
                this.f76678a.c(obj);
                xj2.c c13 = this.f76681d.c(new t2(j14, this), this.f76679b, this.f76680c);
                aVar.getClass();
                bk2.c.replace(aVar, c13);
            }
        }
    }

    @Override // jk2.s2
    public final void d(long j13) {
        if (compareAndSet(j13, Long.MAX_VALUE)) {
            bk2.c.dispose(this.f76683f);
            this.f76678a.onError(new TimeoutException(pk2.h.c(this.f76679b, this.f76680c)));
            this.f76681d.dispose();
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f76683f);
        this.f76681d.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) this.f76683f.get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            lb.l0.R0(th3);
            return;
        }
        this.f76682e.dispose();
        this.f76678a.onError(th3);
        this.f76681d.dispose();
    }
}
