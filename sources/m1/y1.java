package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85642r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85643s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f85644t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o2 f85645u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(o2 o2Var, bl2.c cVar, Function2 function2) {
        super(2, cVar);
        this.f85644t = function2;
        this.f85645u = o2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y1 y1Var = new y1(this.f85645u, cVar, this.f85644t);
        y1Var.f85643s = obj;
        return y1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((l2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85642r;
        if (i13 == 0) {
            ue.c.H(obj);
            x1 x1Var = new x1(0, (l2) this.f85643s, this.f85645u);
            this.f85642r = 1;
            if (this.f85644t.invoke(x1Var, this) == aVar) {
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
