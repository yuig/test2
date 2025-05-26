package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59797r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f59798s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.j f59799t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f59800u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, do2.j jVar, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f59798s = rVar;
        this.f59799t = jVar;
        this.f59800u = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f59798s, this.f59799t, this.f59800u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59797r;
        if (i13 == 0) {
            ue.c.H(obj);
            kl2.l lVar = this.f59798s.f59819e;
            this.f59797r = 1;
            if (lVar.invoke(this.f59799t, this.f59800u, this) == aVar) {
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
