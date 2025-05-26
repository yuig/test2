package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18685r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f18686s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f18686s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t tVar = new t(this.f18686s, cVar);
        tVar.f18685r = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ao2.j0 j0Var = (ao2.j0) this.f18685r;
        u uVar = this.f18686s;
        if (((b0) uVar.f18691a).f18588d.compareTo(r.INITIALIZED) >= 0) {
            uVar.f18691a.a(uVar);
        } else {
            ao2.o1 o1Var = (ao2.o1) j0Var.getCoroutineContext().get(ao2.g0.f20154b);
            if (o1Var != null) {
                o1Var.cancel((CancellationException) null);
            }
        }
        return Unit.f80348a;
    }
}
