package gk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g3 extends AtomicReference implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final f3 f65422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65423b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65424c;

    /* renamed from: d, reason: collision with root package name */
    public dk2.i f65425d;

    /* renamed from: e, reason: collision with root package name */
    public long f65426e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f65427f;

    /* renamed from: g, reason: collision with root package name */
    public int f65428g;

    public g3(f3 f3Var, int i13) {
        this.f65422a = f3Var;
        this.f65423b = i13;
        this.f65424c = i13 - (i13 >> 2);
    }

    @Override // xp2.b
    public final void a() {
        this.f65427f = true;
        this.f65422a.b();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65428g != 2) {
            this.f65425d.offer(obj);
        }
        this.f65422a.b();
    }

    @Override // xp2.c
    public final void cancel() {
        ok2.g.cancel(this);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.setOnce(this, cVar)) {
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f65428g = requestFusion;
                    this.f65425d = fVar;
                    this.f65427f = true;
                    this.f65422a.b();
                    return;
                }
                if (requestFusion == 2) {
                    this.f65428g = requestFusion;
                    this.f65425d = fVar;
                    cVar.request(this.f65423b);
                    return;
                }
            }
            this.f65425d = new lk2.b(this.f65423b);
            cVar.request(this.f65423b);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        f3 f3Var = this.f65422a;
        pk2.c cVar = f3Var.f65412e;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
        } else {
            this.f65427f = true;
            f3Var.b();
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (this.f65428g != 1) {
            long j14 = this.f65426e + j13;
            if (j14 < this.f65424c) {
                this.f65426e = j14;
            } else {
                this.f65426e = 0L;
                ((xp2.c) get()).request(j14);
            }
        }
    }
}
