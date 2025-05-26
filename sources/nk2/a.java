package nk2;

import bp1.h;
import dk2.f;
import lb.l0;
import ok2.g;

/* loaded from: classes2.dex */
public abstract class a implements dk2.a, f {

    /* renamed from: a, reason: collision with root package name */
    public final dk2.a f91181a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f91182b;

    /* renamed from: c, reason: collision with root package name */
    public f f91183c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91184d;

    /* renamed from: e, reason: collision with root package name */
    public int f91185e;

    public a(dk2.a aVar) {
        this.f91181a = aVar;
    }

    @Override // xp2.b
    public void a() {
        if (this.f91184d) {
            return;
        }
        this.f91184d = true;
        this.f91181a.a();
    }

    public final void b(Throwable th3) {
        h.H(th3);
        this.f91182b.cancel();
        onError(th3);
    }

    @Override // xp2.c
    public final void cancel() {
        this.f91182b.cancel();
    }

    @Override // dk2.i
    public final void clear() {
        this.f91183c.clear();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (g.validate(this.f91182b, cVar)) {
            this.f91182b = cVar;
            if (cVar instanceof f) {
                this.f91183c = (f) cVar;
            }
            this.f91181a.d(this);
        }
    }

    public final int e(int i13) {
        f fVar = this.f91183c;
        if (fVar == null || (i13 & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i13);
        if (requestFusion != 0) {
            this.f91185e = requestFusion;
        }
        return requestFusion;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f91183c.isEmpty();
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // xp2.b
    public void onError(Throwable th3) {
        if (this.f91184d) {
            l0.R0(th3);
        } else {
            this.f91184d = true;
            this.f91181a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f91182b.request(j13);
    }

    public int requestFusion(int i13) {
        return e(i13);
    }
}
