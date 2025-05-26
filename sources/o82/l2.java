package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class l2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93655r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m2 f93656s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f93657t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f93658u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, Object obj, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f93656s = m2Var;
        this.f93657t = obj;
        this.f93658u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l2(this.f93656s, this.f93657t, this.f93658u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93655r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i k13 = this.f93656s.k(this.f93657t);
            da0.b bVar = new da0.b(this.f93658u, 9);
            this.f93655r = 1;
            if (k13.collect(bVar, this) == aVar) {
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
