package ok2;

import ck2.i;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class f extends AtomicInteger implements xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public xp2.c f95472a;

    /* renamed from: b, reason: collision with root package name */
    public long f95473b;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95478g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f95479h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95477f = false;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f95474c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f95475d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f95476e = new AtomicLong();

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        e();
    }

    public void cancel() {
        if (this.f95478g) {
            return;
        }
        this.f95478g = true;
        b();
    }

    public void d(xp2.c cVar) {
        h(cVar);
    }

    public final void e() {
        int i13 = 1;
        long j13 = 0;
        xp2.c cVar = null;
        do {
            xp2.c cVar2 = (xp2.c) this.f95474c.get();
            if (cVar2 != null) {
                cVar2 = (xp2.c) this.f95474c.getAndSet(null);
            }
            long j14 = this.f95475d.get();
            if (j14 != 0) {
                j14 = this.f95475d.getAndSet(0L);
            }
            long j15 = this.f95476e.get();
            if (j15 != 0) {
                j15 = this.f95476e.getAndSet(0L);
            }
            xp2.c cVar3 = this.f95472a;
            if (this.f95478g) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f95472a = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long j16 = this.f95473b;
                if (j16 != Long.MAX_VALUE) {
                    j16 = d7.b.h(j16, j14);
                    if (j16 != Long.MAX_VALUE) {
                        j16 -= j15;
                        if (j16 < 0) {
                            g.reportMoreProduced(j16);
                            j16 = 0;
                        }
                    }
                    this.f95473b = j16;
                }
                if (cVar2 != null) {
                    if (cVar3 != null && this.f95477f) {
                        cVar3.cancel();
                    }
                    this.f95472a = cVar2;
                    if (j16 != 0) {
                        j13 = d7.b.h(j13, j16);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && j14 != 0) {
                    j13 = d7.b.h(j13, j14);
                    cVar = cVar3;
                }
            }
            i13 = addAndGet(-i13);
        } while (i13 != 0);
        if (j13 != 0) {
            cVar.request(j13);
        }
    }

    public final void g(long j13) {
        if (this.f95479h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            d7.b.e(this.f95476e, j13);
            b();
            return;
        }
        long j14 = this.f95473b;
        if (j14 != Long.MAX_VALUE) {
            long j15 = j14 - j13;
            if (j15 < 0) {
                g.reportMoreProduced(j15);
                j15 = 0;
            }
            this.f95473b = j15;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        e();
    }

    public final void h(xp2.c cVar) {
        if (this.f95478g) {
            cVar.cancel();
            return;
        }
        i.b(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            xp2.c cVar2 = (xp2.c) this.f95474c.getAndSet(cVar);
            if (cVar2 != null && this.f95477f) {
                cVar2.cancel();
            }
            b();
            return;
        }
        xp2.c cVar3 = this.f95472a;
        if (cVar3 != null && this.f95477f) {
            cVar3.cancel();
        }
        this.f95472a = cVar;
        long j13 = this.f95473b;
        if (decrementAndGet() != 0) {
            e();
        }
        if (j13 != 0) {
            cVar.request(j13);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (!g.validate(j13) || this.f95479h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            d7.b.e(this.f95475d, j13);
            b();
            return;
        }
        long j14 = this.f95473b;
        if (j14 != Long.MAX_VALUE) {
            long h10 = d7.b.h(j14, j13);
            this.f95473b = h10;
            if (h10 == Long.MAX_VALUE) {
                this.f95479h = true;
            }
        }
        xp2.c cVar = this.f95472a;
        if (decrementAndGet() != 0) {
            e();
        }
        if (cVar != null) {
            cVar.request(j13);
        }
    }
}
