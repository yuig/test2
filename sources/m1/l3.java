package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85440r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85441s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n3.w f85442t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kl2.l f85443u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f85444v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f85445w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f85446x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(n3.w wVar, bl2.c cVar, Function1 function1, Function1 function12, Function1 function13, kl2.l lVar) {
        super(2, cVar);
        this.f85442t = wVar;
        this.f85443u = lVar;
        this.f85444v = function1;
        this.f85445w = function12;
        this.f85446x = function13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l3 l3Var = new l3(this.f85442t, cVar, this.f85444v, this.f85445w, this.f85446x, this.f85443u);
        l3Var.f85441s = obj;
        return l3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85440r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f85441s;
            n3.w wVar = this.f85442t;
            j1 j1Var = new j1(wVar);
            k3 k3Var = new k3(j0Var, this.f85443u, this.f85444v, this.f85445w, this.f85446x, j1Var, null);
            this.f85440r = 1;
            if (kh2.u2.w(wVar, k3Var, this) == aVar) {
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
