package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71146r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f71147s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kl2.l f71148t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i1 f71149u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(kl2.l lVar, i1 i1Var, bl2.c cVar) {
        super(2, cVar);
        this.f71148t = lVar;
        this.f71149u = i1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k2 k2Var = new k2(this.f71148t, this.f71149u, cVar);
        k2Var.f71147s = obj;
        return k2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71146r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f71147s;
            this.f71146r = 1;
            if (this.f71148t.invoke(j0Var, this.f71149u, this) == aVar) {
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
