package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85468r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85469s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t0 f85470t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, bl2.c cVar) {
        super(2, cVar);
        this.f85470t = t0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n0 n0Var = new n0(this.f85470t, cVar);
        n0Var.f85469s = obj;
        return n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85468r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f85469s;
            o3.f fVar = new o3.f();
            t0 t0Var = this.f85470t;
            j0 j0Var = new j0(t0Var, wVar, new m0(t0Var, fVar), new x1(2, fVar, t0Var), new l0(t0Var, 0), new l0(t0Var, i14), new k0(t0Var, fVar), null);
            this.f85468r = 1;
            if (dl2.b.O(j0Var, this) == aVar) {
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
