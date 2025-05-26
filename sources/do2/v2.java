package do2;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v2 extends eo2.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f55983a = new AtomicReference(null);

    @Override // eo2.c
    public final boolean a(eo2.a aVar) {
        AtomicReference atomicReference = this.f55983a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(u2.f55967a);
        return true;
    }

    @Override // eo2.c
    public final bl2.c[] b(eo2.a aVar) {
        this.f55983a.set(null);
        return eo2.b.f59738a;
    }

    public final Object c(s2 frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        AtomicReference atomicReference = this.f55983a;
        fi.b bVar = u2.f55967a;
        while (true) {
            if (atomicReference.compareAndSet(bVar, oVar)) {
                break;
            }
            if (atomicReference.get() != bVar) {
                xk2.q qVar = xk2.s.f135225b;
                oVar.resumeWith(Unit.f80348a);
                break;
            }
        }
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }
}
