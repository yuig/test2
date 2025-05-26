package x52;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f133904r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f133905s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f133906t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f133906t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p pVar = new p(this.f133906t, cVar);
        pVar.f133905s = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f133904r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f133905s;
            this.f133904r = 1;
            if (this.f133906t.invoke(j0Var, this) == aVar) {
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
