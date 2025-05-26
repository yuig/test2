package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class k2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93644r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m2 f93645s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f93646t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f93647u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m2 m2Var, Object obj, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f93645s = m2Var;
        this.f93646t = obj;
        this.f93647u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k2(this.f93645s, this.f93646t, this.f93647u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93644r;
        if (i13 == 0) {
            ue.c.H(obj);
            m2 m2Var = this.f93645s;
            do2.i j13 = m2Var.j(this.f93646t);
            o1.f fVar = new o1.f(20, this.f93647u, m2Var);
            this.f93644r = 1;
            if (j13.collect(fVar, this) == aVar) {
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
