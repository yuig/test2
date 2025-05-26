package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r1 extends AtomicInteger implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65600a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f65601b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f65602c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f65603d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f65604e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f65605f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f65606g = new AtomicReference();

    public r1(xp2.b bVar) {
        this.f65600a = bVar;
    }

    @Override // xp2.b
    public final void a() {
        this.f65602c = true;
        e();
    }

    public final boolean b(boolean z13, boolean z14, xp2.b bVar, AtomicReference atomicReference) {
        if (this.f65604e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z13) {
            return false;
        }
        Throwable th3 = this.f65603d;
        if (th3 != null) {
            atomicReference.lazySet(null);
            bVar.onError(th3);
            return true;
        }
        if (!z14) {
            return false;
        }
        bVar.a();
        return true;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65606g.lazySet(obj);
        e();
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65604e) {
            return;
        }
        this.f65604e = true;
        this.f65601b.cancel();
        if (getAndIncrement() == 0) {
            this.f65606g.lazySet(null);
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65601b, cVar)) {
            this.f65601b = cVar;
            this.f65600a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        xp2.b bVar = this.f65600a;
        AtomicLong atomicLong = this.f65605f;
        AtomicReference atomicReference = this.f65606g;
        int i13 = 1;
        do {
            long j13 = 0;
            while (true) {
                if (j13 == atomicLong.get()) {
                    break;
                }
                boolean z13 = this.f65602c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z14 = andSet == null;
                if (b(z13, z14, bVar, atomicReference)) {
                    return;
                }
                if (z14) {
                    break;
                }
                bVar.c(andSet);
                j13++;
            }
            if (j13 == atomicLong.get()) {
                if (b(this.f65602c, atomicReference.get() == null, bVar, atomicReference)) {
                    return;
                }
            }
            if (j13 != 0) {
                d7.b.l0(atomicLong, j13);
            }
            i13 = addAndGet(-i13);
        } while (i13 != 0);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f65603d = th3;
        this.f65602c = true;
        e();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65605f, j13);
            e();
        }
    }
}
