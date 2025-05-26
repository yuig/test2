package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93575r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f93576s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f93577t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f93578u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, u50.r rVar, d2 d2Var, bl2.c cVar) {
        super(2, cVar);
        this.f93576s = hVar;
        this.f93577t = rVar;
        this.f93578u = d2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f93576s, this.f93577t, this.f93578u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93575r;
        if (i13 == 0) {
            ue.c.H(obj);
            Object obj2 = ((x1) this.f93578u).f93746a;
            this.f93575r = 1;
            if (h.j(this.f93577t, this.f93576s, obj2, this) == aVar) {
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
