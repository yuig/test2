package f2;

import ao2.j0;
import c2.e1;
import do2.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60872r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.l f60873s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s2.t f60874t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o1.l lVar, s2.t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f60873s = lVar;
        this.f60874t = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f60873s, this.f60874t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60872r;
        if (i13 == 0) {
            ue.c.H(obj);
            f2 f2Var = this.f60873s.f92764a;
            e1 e1Var = new e1(this.f60874t, 2);
            this.f60872r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, e1Var, this) == aVar) {
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
