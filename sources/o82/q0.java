package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class q0 extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f93693r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f93694s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f93695t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f93696u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, u50.r rVar, d2 d2Var, bl2.c cVar) {
        super(1, cVar);
        this.f93694s = s0Var;
        this.f93695t = rVar;
        this.f93696u = d2Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new q0(this.f93694s, this.f93695t, this.f93696u, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q0) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93693r;
        if (i13 == 0) {
            ue.c.H(obj);
            d2 d2Var = this.f93696u;
            Object obj3 = ((b2) d2Var).f93538a;
            this.f93693r = 1;
            s0 s0Var = this.f93694s;
            s0Var.f93709d = Integer.parseInt(s0Var.f93707b.d());
            s0Var.f93708c = null;
            ko2.f fVar = ao2.v0.f20219a;
            Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new m0(3, this.f93695t, s0Var, d2Var, obj3, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
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
