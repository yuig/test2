package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85631r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85632s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n3.w f85633t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kl2.l f85634u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f85635v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j1 f85636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(n3.w wVar, kl2.l lVar, Function1 function1, j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85633t = wVar;
        this.f85634u = lVar;
        this.f85635v = function1;
        this.f85636w = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x2 x2Var = new x2(this.f85633t, this.f85634u, this.f85635v, this.f85636w, cVar);
        x2Var.f85632s = obj;
        return x2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85631r;
        if (i13 == 0) {
            ue.c.H(obj);
            w2 w2Var = new w2((ao2.j0) this.f85632s, this.f85634u, this.f85635v, this.f85636w, null);
            this.f85631r = 1;
            if (kh2.u2.w(this.f85633t, w2Var, this) == aVar) {
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
