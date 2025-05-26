package ao2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d2 extends k2 {

    /* renamed from: d, reason: collision with root package name */
    public final bl2.c f20134d;

    public d2(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.f20134d = cl2.h.a(function2, this, this);
    }

    @Override // ao2.a2
    public final void W() {
        try {
            bl2.c b13 = cl2.h.b(this.f20134d);
            xk2.q qVar = xk2.s.f135225b;
            ho2.f.a(Unit.f80348a, b13);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            resumeWith(ue.c.m(th3));
            throw th3;
        }
    }
}
