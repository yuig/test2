package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.n3;

/* loaded from: classes2.dex */
public final class q0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127451r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3.w f127452s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127453t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(n3.w wVar, b2.t0 t0Var, bl2.c cVar) {
        super(2, cVar);
        this.f127452s = wVar;
        this.f127453t = t0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q0(this.f127452s, this.f127453t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127451r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            y yVar = new y(this.f127453t, i14);
            this.f127451r = 1;
            if (n3.d(this.f127452s, null, null, yVar, this, 7) == aVar) {
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
