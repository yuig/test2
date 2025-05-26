package b2;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f21160r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f21161s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v3 f21162t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j1.d f21163u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v3 v3Var, j1.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f21162t = v3Var;
        this.f21163u = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h0 h0Var = new h0(this.f21162t, this.f21163u, cVar);
        h0Var.f21161s = obj;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f21160r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f21161s;
            pb.k Z1 = bs1.c.Z1(new q1.o(this.f21162t, 5));
            o1.f fVar = new o1.f(2, this.f21163u, j0Var);
            this.f21160r = 1;
            if (Z1.collect(fVar, this) == aVar) {
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
