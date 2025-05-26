package um0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f122720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f122721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h0 f122722t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f122723u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, h0 h0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f122721s = n0Var;
        this.f122722t = h0Var;
        this.f122723u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j0(this.f122721s, this.f122722t, this.f122723u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f122720r;
        if (i13 == 0) {
            ue.c.H(obj);
            g0 g0Var = (g0) this.f122722t;
            this.f122720r = 1;
            n0 n0Var = this.f122721s;
            n0Var.getClass();
            ko2.f fVar = ao2.v0.f20219a;
            Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new l0(n0Var, g0Var, this.f122723u, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
            if (M == obj2) {
                return obj2;
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
