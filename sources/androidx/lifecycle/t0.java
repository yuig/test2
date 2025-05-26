package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f18687r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f18689t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f18689t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t0 t0Var = new t0(this.f18689t, cVar);
        t0Var.f18688s = obj;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f18687r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f18688s;
            this.f18687r = 1;
            if (this.f18689t.invoke(j0Var, this) == aVar) {
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
