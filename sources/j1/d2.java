package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public float f74036r;

    /* renamed from: s, reason: collision with root package name */
    public int f74037s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f74038t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g2 f74039u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g2 g2Var, bl2.c cVar) {
        super(2, cVar);
        this.f74039u = g2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d2 d2Var = new d2(this.f74039u, cVar);
        d2Var.f74038t = obj;
        return d2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        float n13;
        ao2.j0 j0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74037s;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var2 = (ao2.j0) this.f74038t;
            n13 = e.n(j0Var2.getCoroutineContext());
            j0Var = j0Var2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n13 = this.f74036r;
            j0Var = (ao2.j0) this.f74038t;
            ue.c.H(obj);
        }
        while (dl2.b.x1(j0Var)) {
            c2 c2Var = new c2(this.f74039u, n13);
            this.f74038t = j0Var;
            this.f74036r = n13;
            this.f74037s = 1;
            if (bs1.c.K0(getContext()).d(c2Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
