package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class z0 extends AtomicLong implements xp2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65711a;

    /* renamed from: b, reason: collision with root package name */
    public long f65712b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f65713c = new AtomicReference();

    public z0(xp2.b bVar) {
        this.f65711a = bVar;
    }

    @Override // xp2.c
    public final void cancel() {
        bk2.c.dispose(this.f65713c);
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this, j13);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f65713c;
        if (atomicReference.get() != bk2.c.DISPOSED) {
            long j13 = get();
            xp2.b bVar = this.f65711a;
            if (j13 == 0) {
                bVar.onError(new MissingBackpressureException(a.a.o(new StringBuilder("Can't deliver value "), this.f65712b, " due to lack of requests")));
                bk2.c.dispose(atomicReference);
            } else {
                long j14 = this.f65712b;
                this.f65712b = j14 + 1;
                bVar.c(Long.valueOf(j14));
                d7.b.l0(this, 1L);
            }
        }
    }
}
