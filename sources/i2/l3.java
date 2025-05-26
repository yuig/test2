package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71162r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f71163s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f71164t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q1 f71165u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Function2 function2, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f71164t = function2;
        this.f71165u = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l3 l3Var = new l3(this.f71164t, this.f71165u, cVar);
        l3Var.f71163s = obj;
        return l3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71162r;
        if (i13 == 0) {
            ue.c.H(obj);
            b2 b2Var = new b2(this.f71165u, ((ao2.j0) this.f71163s).getCoroutineContext());
            this.f71162r = 1;
            if (this.f71164t.invoke(b2Var, this) == aVar) {
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
