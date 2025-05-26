package jk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class q2 extends AtomicReference implements uj2.v, xj2.c, s2 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76653a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76654b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76655c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.z f76656d;

    /* renamed from: e, reason: collision with root package name */
    public final bk2.a f76657e = new bk2.a();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f76658f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f76659g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public uj2.t f76660h;

    public q2(uj2.v vVar, long j13, TimeUnit timeUnit, uj2.z zVar, uj2.t tVar) {
        this.f76653a = vVar;
        this.f76654b = j13;
        this.f76655c = timeUnit;
        this.f76656d = zVar;
        this.f76660h = tVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76658f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f76657e.dispose();
            this.f76653a.a();
            this.f76656d.dispose();
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this.f76659g, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        AtomicLong atomicLong = this.f76658f;
        long j13 = atomicLong.get();
        if (j13 != Long.MAX_VALUE) {
            long j14 = 1 + j13;
            if (atomicLong.compareAndSet(j13, j14)) {
                ((xj2.c) this.f76657e.get()).dispose();
                this.f76653a.c(obj);
                e(j14);
            }
        }
    }

    @Override // jk2.s2
    public final void d(long j13) {
        if (this.f76658f.compareAndSet(j13, Long.MAX_VALUE)) {
            bk2.c.dispose(this.f76659g);
            uj2.t tVar = this.f76660h;
            this.f76660h = null;
            tVar.d(new p2(this.f76653a, this, 0));
            this.f76656d.dispose();
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f76659g);
        bk2.c.dispose(this);
        this.f76656d.dispose();
    }

    public final void e(long j13) {
        xj2.c c13 = this.f76656d.c(new t2(j13, this), this.f76654b, this.f76655c);
        bk2.a aVar = this.f76657e;
        aVar.getClass();
        bk2.c.replace(aVar, c13);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76658f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            lb.l0.R0(th3);
            return;
        }
        this.f76657e.dispose();
        this.f76653a.onError(th3);
        this.f76656d.dispose();
    }
}
