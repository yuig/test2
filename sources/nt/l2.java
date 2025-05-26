package nt;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class l2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92092r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f92093s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f92094t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f92094t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l2 l2Var = new l2(this.f92094t, cVar);
        l2Var.f92093s = obj;
        return l2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92092r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f92093s;
            this.f92092r = 1;
            if (this.f92094t.invoke(j0Var, this) == aVar) {
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
