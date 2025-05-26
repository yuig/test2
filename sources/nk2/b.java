package nk2;

import bp1.h;
import dk2.f;
import lb.l0;
import ok2.g;
import uj2.k;

/* loaded from: classes2.dex */
public abstract class b implements k, f {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f91186a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f91187b;

    /* renamed from: c, reason: collision with root package name */
    public f f91188c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91189d;

    /* renamed from: e, reason: collision with root package name */
    public int f91190e;

    public b(xp2.b bVar) {
        this.f91186a = bVar;
    }

    @Override // xp2.b
    public void a() {
        if (this.f91189d) {
            return;
        }
        this.f91189d = true;
        this.f91186a.a();
    }

    public final void b(Throwable th3) {
        h.H(th3);
        this.f91187b.cancel();
        onError(th3);
    }

    @Override // xp2.c
    public final void cancel() {
        this.f91187b.cancel();
    }

    public void clear() {
        this.f91188c.clear();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (g.validate(this.f91187b, cVar)) {
            this.f91187b = cVar;
            if (cVar instanceof f) {
                this.f91188c = (f) cVar;
            }
            this.f91186a.d(this);
        }
    }

    public final int e(int i13) {
        f fVar = this.f91188c;
        if (fVar == null || (i13 & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i13);
        if (requestFusion != 0) {
            this.f91190e = requestFusion;
        }
        return requestFusion;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f91188c.isEmpty();
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // xp2.b
    public void onError(Throwable th3) {
        if (this.f91189d) {
            l0.R0(th3);
        } else {
            this.f91189d = true;
            this.f91186a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f91187b.request(j13);
    }

    @Override // dk2.e
    public int requestFusion(int i13) {
        return e(i13);
    }
}
