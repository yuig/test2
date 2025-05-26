package nk2;

import java.util.concurrent.CountDownLatch;
import lb.l0;
import ok2.g;
import pk2.h;
import uj2.k;

/* loaded from: classes4.dex */
public final class c extends CountDownLatch implements k {

    /* renamed from: a, reason: collision with root package name */
    public Object f91191a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f91192b;

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f91193c;

    @Override // xp2.b
    public final void a() {
        countDown();
    }

    public final Object b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e13) {
                xp2.c cVar = this.f91193c;
                this.f91193c = g.CANCELLED;
                if (cVar != null) {
                    cVar.cancel();
                }
                throw h.d(e13);
            }
        }
        Throwable th3 = this.f91192b;
        if (th3 == null) {
            return this.f91191a;
        }
        throw h.d(th3);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f91191a == null) {
            this.f91191a = obj;
            this.f91193c.cancel();
            countDown();
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (g.validate(this.f91193c, cVar)) {
            this.f91193c = cVar;
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f91191a == null) {
            this.f91192b = th3;
        } else {
            l0.R0(th3);
        }
        countDown();
    }
}
