package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59815r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f59816s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f59817t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ do2.j f59818u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, do2.j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f59817t = rVar;
        this.f59818u = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f59817t, this.f59818u, cVar);
        qVar.f59816s = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59815r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f59816s;
            kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
            r rVar = this.f59817t;
            do2.i iVar = rVar.f59794d;
            p pVar = new p(j0Var2, j0Var, rVar, this.f59818u);
            this.f59815r = 1;
            if (iVar.collect(pVar, this) == aVar) {
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
