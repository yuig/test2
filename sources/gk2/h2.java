package gk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class h2 extends AtomicInteger implements uj2.k {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65446a;

    /* renamed from: b, reason: collision with root package name */
    public final ok2.f f65447b;

    /* renamed from: c, reason: collision with root package name */
    public final xp2.a f65448c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.g f65449d;

    /* renamed from: e, reason: collision with root package name */
    public long f65450e;

    /* renamed from: f, reason: collision with root package name */
    public long f65451f;

    public h2(xp2.b bVar, long j13, ak2.g gVar, ok2.f fVar, uj2.h hVar) {
        this.f65446a = bVar;
        this.f65447b = fVar;
        this.f65448c = hVar;
        this.f65449d = gVar;
        this.f65450e = j13;
    }

    @Override // xp2.b
    public final void a() {
        this.f65446a.a();
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            int i13 = 1;
            while (!this.f65447b.f95478g) {
                long j13 = this.f65451f;
                if (j13 != 0) {
                    this.f65451f = 0L;
                    this.f65447b.g(j13);
                }
                this.f65448c.b(this);
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            }
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65451f++;
        this.f65446a.c(obj);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        this.f65447b.h(cVar);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        long j13 = this.f65450e;
        if (j13 != Long.MAX_VALUE) {
            this.f65450e = j13 - 1;
        }
        xp2.b bVar = this.f65446a;
        if (j13 == 0) {
            bVar.onError(th3);
            return;
        }
        try {
            if (this.f65449d.test(th3)) {
                b();
            } else {
                bVar.onError(th3);
            }
        } catch (Throwable th4) {
            bp1.h.H(th4);
            bVar.onError(new CompositeException(th3, th4));
        }
    }
}
