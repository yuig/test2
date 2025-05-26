package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59761r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f59762s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kl2.l f59763t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ do2.j f59764u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kl2.l lVar, do2.j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f59763t = lVar;
        this.f59764u = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f0 f0Var = new f0(this.f59763t, this.f59764u, cVar);
        f0Var.f59762s = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59761r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f59762s;
            this.f59761r = 1;
            if (this.f59763t.invoke(j0Var, this.f59764u, this) == aVar) {
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
