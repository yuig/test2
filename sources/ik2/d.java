package ik2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes4.dex */
public final class d extends AtomicReference implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final e f72426a;

    public d(e eVar) {
        this.f72426a = eVar;
    }

    @Override // uj2.d
    public final void a() {
        e eVar = this.f72426a;
        AtomicReference atomicReference = eVar.f72431d;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        if (eVar.f72432e) {
            pk2.c cVar = eVar.f72430c;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            if (b13 == null) {
                eVar.f72428a.a();
            } else {
                eVar.f72428a.onError(b13);
            }
        }
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        e eVar = this.f72426a;
        AtomicReference atomicReference = eVar.f72431d;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                pk2.c cVar = eVar.f72430c;
                cVar.getClass();
                if (pk2.h.a(cVar, th3)) {
                    eVar.dispose();
                    Throwable b13 = pk2.h.b(cVar);
                    if (b13 != pk2.h.f100547a) {
                        eVar.f72428a.onError(b13);
                        return;
                    }
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        l0.R0(th3);
    }
}
