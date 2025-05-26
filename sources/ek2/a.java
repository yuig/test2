package ek2;

import lb.l0;
import uj2.v;

/* loaded from: classes2.dex */
public abstract class a implements v, dk2.d {

    /* renamed from: a, reason: collision with root package name */
    public final v f59410a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f59411b;

    /* renamed from: c, reason: collision with root package name */
    public dk2.d f59412c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f59413d;

    /* renamed from: e, reason: collision with root package name */
    public int f59414e;

    public a(v vVar) {
        this.f59410a = vVar;
    }

    @Override // uj2.v
    public void a() {
        if (this.f59413d) {
            return;
        }
        this.f59413d = true;
        this.f59410a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f59411b, cVar)) {
            this.f59411b = cVar;
            if (cVar instanceof dk2.d) {
                this.f59412c = (dk2.d) cVar;
            }
            this.f59410a.b(this);
        }
    }

    @Override // dk2.i
    public void clear() {
        this.f59412c.clear();
    }

    public final void d(Throwable th3) {
        bp1.h.H(th3);
        this.f59411b.dispose();
        onError(th3);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f59411b.dispose();
    }

    public final int e(int i13) {
        dk2.d dVar = this.f59412c;
        if (dVar == null || (i13 & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i13);
        if (requestFusion != 0) {
            this.f59414e = requestFusion;
        }
        return requestFusion;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f59411b.isDisposed();
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f59412c.isEmpty();
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // uj2.v
    public void onError(Throwable th3) {
        if (this.f59413d) {
            l0.R0(th3);
        } else {
            this.f59413d = true;
            this.f59410a.onError(th3);
        }
    }

    @Override // dk2.e
    public int requestFusion(int i13) {
        return e(i13);
    }
}
