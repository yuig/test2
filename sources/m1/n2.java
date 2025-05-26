package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85473r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85474s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o2 f85475t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function2 f85476u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, bl2.c cVar, Function2 function2) {
        super(2, cVar);
        this.f85475t = o2Var;
        this.f85476u = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n2 n2Var = new n2(this.f85475t, cVar, this.f85476u);
        n2Var.f85474s = obj;
        return n2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85473r;
        if (i13 == 0) {
            ue.c.H(obj);
            m1 m1Var = (m1) this.f85474s;
            o2 o2Var = this.f85475t;
            o2Var.f85500h = m1Var;
            l2 l2Var = o2Var.f85501i;
            this.f85473r = 1;
            if (this.f85476u.invoke(l2Var, this) == aVar) {
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
