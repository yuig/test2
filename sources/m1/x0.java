package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85624r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85625s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f85626t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a1 f85627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Function2 function2, a1 a1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85626t = function2;
        this.f85627u = a1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x0 x0Var = new x0(this.f85626t, this.f85627u, cVar);
        x0Var.f85625s = obj;
        return x0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85624r;
        if (i13 == 0) {
            ue.c.H(obj);
            x1 x1Var = new x1(3, (u0) this.f85625s, this.f85627u);
            this.f85624r = 1;
            if (this.f85626t.invoke(x1Var, this) == aVar) {
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
