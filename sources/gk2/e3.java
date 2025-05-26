package gk2;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e3 extends AtomicReference implements dk2.a, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65394a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.c f65395b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f65396c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f65397d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f65398e = new AtomicReference();

    public e3(vk2.a aVar, ak2.c cVar) {
        this.f65394a = aVar;
        this.f65395b = cVar;
    }

    @Override // xp2.b
    public final void a() {
        ok2.g.cancel(this.f65398e);
        this.f65394a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (f(obj)) {
            return;
        }
        ((xp2.c) this.f65396c.get()).request(1L);
    }

    @Override // xp2.c
    public final void cancel() {
        ok2.g.cancel(this.f65396c);
        ok2.g.cancel(this.f65398e);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        ok2.g.deferredSetOnce(this.f65396c, this.f65397d, cVar);
    }

    @Override // dk2.a
    public final boolean f(Object obj) {
        xp2.b bVar = this.f65394a;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object apply = this.f65395b.apply(obj, obj2);
                ck2.i.b(apply, "The combiner returned a null value");
                bVar.c(apply);
                return true;
            } catch (Throwable th3) {
                bp1.h.H(th3);
                cancel();
                bVar.onError(th3);
            }
        }
        return false;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        ok2.g.cancel(this.f65398e);
        this.f65394a.onError(th3);
    }

    @Override // xp2.c
    public final void request(long j13) {
        ok2.g.deferredRequest(this.f65396c, this.f65397d, j13);
    }
}
