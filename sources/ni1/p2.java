package ni1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s2 f90781s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(s2 s2Var, bl2.c cVar) {
        super(2, cVar);
        this.f90781s = s2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p2 p2Var = new p2(this.f90781s, cVar);
        p2Var.f90780r = obj;
        return p2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        s2 s2Var = this.f90781s;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ao2.j0 j0Var = (ao2.j0) this.f90780r;
        while (ao2.m0.S(j0Var.getCoroutineContext())) {
            try {
                z1 z1Var = (z1) ((LinkedBlockingQueue) s2Var.f90798f.getValue()).poll(10L, TimeUnit.MILLISECONDS);
                if (z1Var != null) {
                    s2Var.f90794b.e().a(z1Var);
                }
            } catch (InterruptedException unused) {
                ((v2) s2Var.f90795c.getValue()).a(u2.PIN_REP_EVENT_QUEUE_INTERRUPTED, null);
            }
        }
        return Unit.f80348a;
    }
}
