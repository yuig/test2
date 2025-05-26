package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class p1 extends AtomicLong implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65573a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f65574b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65575c;

    public p1(xp2.b bVar) {
        this.f65573a = bVar;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65575c) {
            return;
        }
        this.f65575c = true;
        this.f65573a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65575c) {
            return;
        }
        if (get() != 0) {
            this.f65573a.c(obj);
            d7.b.l0(this, 1L);
        } else {
            this.f65574b.cancel();
            onError(new MissingBackpressureException("could not emit value due to lack of requests"));
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65574b.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65574b, cVar)) {
            this.f65574b = cVar;
            this.f65573a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65575c) {
            lb.l0.R0(th3);
        } else {
            this.f65575c = true;
            this.f65573a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this, j13);
        }
    }
}
