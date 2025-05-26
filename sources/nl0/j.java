package nl0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ml0.a0;
import ml0.b0;
import tu.d0;
import u50.r;
import x02.x0;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f91265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f91266s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f91267t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f91268u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d0 d0Var, b0 b0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f91266s = d0Var;
        this.f91267t = b0Var;
        this.f91268u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f91266s, this.f91267t, this.f91268u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f91265r;
        if (i13 == 0) {
            ue.c.H(obj);
            d0 d0Var = this.f91266s;
            do2.c x13 = ve.h.x((x0) d0Var.f119280b, ((a0) this.f91267t).f87438a);
            r rVar = this.f91268u;
            do2.j0 j0Var = new do2.j0(x13, new c2.r(d0Var, rVar, null, 3));
            i iVar = new i(d0Var, rVar);
            this.f91265r = 1;
            if (j0Var.collect(iVar, this) == aVar) {
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
