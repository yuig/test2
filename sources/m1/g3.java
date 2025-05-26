package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85355r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kl2.l f85356s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j1 f85357t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n3.q f85358u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(kl2.l lVar, j1 j1Var, n3.q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f85356s = lVar;
        this.f85357t = j1Var;
        this.f85358u = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g3(this.f85356s, this.f85357t, this.f85358u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85355r;
        if (i13 == 0) {
            ue.c.H(obj);
            a3.c cVar = new a3.c(this.f85358u.f89109c);
            this.f85355r = 1;
            if (this.f85356s.invoke(this.f85357t, cVar, this) == aVar) {
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
