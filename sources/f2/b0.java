package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.n3;

/* loaded from: classes2.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60819r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f60820s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f60821t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, bl2.c cVar) {
        super(2, cVar);
        this.f60821t = e0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b0 b0Var = new b0(this.f60821t, cVar);
        b0Var.f60820s = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60819r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f60820s;
            e0 e0Var = this.f60821t;
            a0 a0Var = new a0(e0Var, null);
            w wVar2 = new w(e0Var, 2);
            this.f60819r = 1;
            if (n3.d(wVar, null, a0Var, wVar2, this, 3) == aVar) {
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
