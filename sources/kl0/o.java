package kl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f80105r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f80106s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f80106s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f80106s, cVar);
        oVar.f80105r = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((il0.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        il0.a aVar2 = (il0.a) this.f80105r;
        z zVar = this.f80106s;
        rk0.j jVar = zVar.B1;
        if (jVar != null) {
            rk0.c.d(jVar, aVar2.f72524c);
        }
        rk0.j jVar2 = zVar.B1;
        if (jVar2 != null) {
            jVar2.l(aVar2.f72525d);
        }
        return Unit.f80348a;
    }
}
