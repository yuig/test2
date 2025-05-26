package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class k0 extends AtomicReference implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f65476a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f65477b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65478c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65479d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f65480e;

    /* renamed from: f, reason: collision with root package name */
    public volatile dk2.i f65481f;

    /* renamed from: g, reason: collision with root package name */
    public long f65482g;

    /* renamed from: h, reason: collision with root package name */
    public int f65483h;

    public k0(l0 l0Var, long j13) {
        this.f65476a = j13;
        this.f65477b = l0Var;
        int i13 = l0Var.f65498e;
        this.f65479d = i13;
        this.f65478c = i13 >> 2;
    }

    @Override // xp2.b
    public final void a() {
        this.f65480e = true;
        this.f65477b.e();
    }

    public final void b(long j13) {
        if (this.f65483h != 1) {
            long j14 = this.f65482g + j13;
            if (j14 < this.f65478c) {
                this.f65482g = j14;
            } else {
                this.f65482g = 0L;
                ((xp2.c) get()).request(j14);
            }
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65483h == 2) {
            this.f65477b.e();
            return;
        }
        l0 l0Var = this.f65477b;
        if (l0Var.get() == 0 && l0Var.compareAndSet(0, 1)) {
            long j13 = l0Var.f65504k.get();
            dk2.i iVar = this.f65481f;
            if (j13 == 0 || !(iVar == null || iVar.isEmpty())) {
                if (iVar == null && (iVar = this.f65481f) == null) {
                    iVar = new lk2.b(l0Var.f65498e);
                    this.f65481f = iVar;
                }
                if (!iVar.offer(obj)) {
                    l0Var.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                }
            } else {
                l0Var.f65494a.c(obj);
                if (j13 != Long.MAX_VALUE) {
                    l0Var.f65504k.decrementAndGet();
                }
                b(1L);
            }
            if (l0Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            dk2.i iVar2 = this.f65481f;
            if (iVar2 == null) {
                iVar2 = new lk2.b(l0Var.f65498e);
                this.f65481f = iVar2;
            }
            if (!iVar2.offer(obj)) {
                l0Var.onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            } else if (l0Var.getAndIncrement() != 0) {
                return;
            }
        }
        l0Var.g();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.setOnce(this, cVar)) {
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f65483h = requestFusion;
                    this.f65481f = fVar;
                    this.f65480e = true;
                    this.f65477b.e();
                    return;
                }
                if (requestFusion == 2) {
                    this.f65483h = requestFusion;
                    this.f65481f = fVar;
                }
            }
            cVar.request(this.f65479d);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        ok2.g.cancel(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == ok2.g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        lazySet(ok2.g.CANCELLED);
        l0 l0Var = this.f65477b;
        pk2.c cVar = l0Var.f65501h;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        this.f65480e = true;
        if (!l0Var.f65496c) {
            l0Var.f65505l.cancel();
            for (k0 k0Var : (k0[]) l0Var.f65503j.getAndSet(l0.f65493s)) {
                k0Var.getClass();
                ok2.g.cancel(k0Var);
            }
        }
        l0Var.e();
    }
}
