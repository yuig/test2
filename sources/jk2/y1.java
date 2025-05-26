package jk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class y1 extends AtomicInteger implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76765a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.a f76766b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.t f76767c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.g f76768d;

    /* renamed from: e, reason: collision with root package name */
    public long f76769e;

    public y1(uj2.v vVar, long j13, ak2.g gVar, bk2.a aVar, uj2.t tVar) {
        this.f76765a = vVar;
        this.f76766b = aVar;
        this.f76767c = tVar;
        this.f76768d = gVar;
        this.f76769e = j13;
    }

    @Override // uj2.v
    public final void a() {
        this.f76765a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.a aVar = this.f76766b;
        aVar.getClass();
        bk2.c.replace(aVar, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76765a.c(obj);
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            int i13 = 1;
            while (!this.f76766b.isDisposed()) {
                this.f76767c.d(this);
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            }
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        long j13 = this.f76769e;
        if (j13 != Long.MAX_VALUE) {
            this.f76769e = j13 - 1;
        }
        uj2.v vVar = this.f76765a;
        if (j13 == 0) {
            vVar.onError(th3);
            return;
        }
        try {
            if (this.f76768d.test(th3)) {
                d();
            } else {
                vVar.onError(th3);
            }
        } catch (Throwable th4) {
            bp1.h.H(th4);
            vVar.onError(new CompositeException(th3, th4));
        }
    }
}
