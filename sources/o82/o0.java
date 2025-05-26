package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class o0 extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f93678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f93679s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f93680t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f93681u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, u50.r rVar, d2 d2Var, bl2.c cVar) {
        super(1, cVar);
        this.f93679s = s0Var;
        this.f93680t = rVar;
        this.f93681u = d2Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new o0(this.f93679s, this.f93680t, this.f93681u, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o0) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93678r;
        if (i13 == 0) {
            ue.c.H(obj);
            d2 d2Var = this.f93681u;
            Object obj3 = ((v1) d2Var).f93733a;
            this.f93678r = 1;
            s0 s0Var = this.f93679s;
            s0Var.getClass();
            ko2.f fVar = ao2.v0.f20219a;
            Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new m0(3, this.f93680t, s0Var, d2Var, obj3, null));
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
