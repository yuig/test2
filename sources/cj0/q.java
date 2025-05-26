package cj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27856r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f27858t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f27858t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f27858t, cVar);
        qVar.f27857s = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27856r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f27857s;
            this.f27856r = 1;
            if (this.f27858t.invoke(j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
