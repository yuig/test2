package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85638r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85639s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f85640t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f85641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85640t = a1Var;
        this.f85641u = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y0 y0Var = new y0(this.f85640t, this.f85641u, cVar);
        y0Var.f85639s = obj;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85638r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f85639s;
            kl2.l lVar = this.f85640t.A;
            a3.c cVar = new a3.c(this.f85641u);
            this.f85638r = 1;
            if (lVar.invoke(j0Var, cVar, this) == aVar) {
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
