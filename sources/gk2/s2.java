package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class s2 extends AtomicReference implements uj2.k {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f65617a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65619c;

    /* renamed from: d, reason: collision with root package name */
    public volatile dk2.i f65620d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f65621e;

    /* renamed from: f, reason: collision with root package name */
    public int f65622f;

    public s2(t2 t2Var, long j13, int i13) {
        this.f65617a = t2Var;
        this.f65618b = j13;
        this.f65619c = i13;
    }

    @Override // xp2.b
    public final void a() {
        t2 t2Var = this.f65617a;
        if (this.f65618b == t2Var.f65647k) {
            this.f65621e = true;
            t2Var.e();
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        t2 t2Var = this.f65617a;
        if (this.f65618b == t2Var.f65647k) {
            if (this.f65622f != 0 || this.f65620d.offer(obj)) {
                t2Var.e();
            } else {
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.setOnce(this, cVar)) {
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f65622f = requestFusion;
                    this.f65620d = fVar;
                    this.f65621e = true;
                    this.f65617a.e();
                    return;
                }
                if (requestFusion == 2) {
                    this.f65622f = requestFusion;
                    this.f65620d = fVar;
                    cVar.request(this.f65619c);
                    return;
                }
            }
            this.f65620d = new lk2.b(this.f65619c);
            cVar.request(this.f65619c);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        t2 t2Var = this.f65617a;
        if (this.f65618b == t2Var.f65647k) {
            pk2.c cVar = t2Var.f65642f;
            cVar.getClass();
            if (pk2.h.a(cVar, th3)) {
                if (!t2Var.f65640d) {
                    t2Var.f65644h.cancel();
                    t2Var.f65641e = true;
                }
                this.f65621e = true;
                t2Var.e();
                return;
            }
        }
        lb.l0.R0(th3);
    }
}
