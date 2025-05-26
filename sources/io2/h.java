package io2;

import ao2.j0;
import co2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73341r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f73342s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.j f73343t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f73344u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(do2.j jVar, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f73343t = jVar;
        this.f73344u = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f73343t, this.f73344u, cVar);
        hVar.f73342s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73341r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f73342s;
            i iVar = this.f73344u;
            b0 g13 = iVar.g(new ho2.c(j0Var.getCoroutineContext().plus(iVar.f59758a)));
            this.f73341r = 1;
            Object i03 = bs1.c.i0(this.f73343t, g13, true, this);
            if (i03 != obj2) {
                i03 = Unit.f80348a;
            }
            if (i03 == obj2) {
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
