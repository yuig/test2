package ik2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.d0;

/* loaded from: classes4.dex */
public final class g extends AtomicReference implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f72436a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f72437b;

    public g(h hVar) {
        this.f72436a = hVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        h hVar = this.f72436a;
        AtomicReference atomicReference = hVar.f72443e;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                pk2.c cVar = hVar.f72442d;
                cVar.getClass();
                if (pk2.h.a(cVar, th3)) {
                    if (!hVar.f72441c) {
                        hVar.f72444f.dispose();
                        hVar.d();
                    }
                    hVar.e();
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        l0.R0(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f72437b = obj;
        this.f72436a.e();
    }
}
