package ao2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c2 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final bl2.c f20131d;

    public c2(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.f20131d = cl2.h.a(function2, this, this);
    }

    @Override // ao2.a2
    public final void W() {
        try {
            bl2.c b13 = cl2.h.b(this.f20131d);
            xk2.q qVar = xk2.s.f135225b;
            ho2.f.a(Unit.f80348a, b13);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            resumeWith(ue.c.m(th3));
            throw th3;
        }
    }
}
