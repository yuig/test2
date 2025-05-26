package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ni2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj.d f8830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ad f8831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(a.ad adVar, dj.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f8830a = dVar;
        this.f8831b = adVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ni2(this.f8831b, this.f8830a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dj.d dVar = this.f8830a;
        return new ni2(this.f8831b, dVar, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        dj.c cVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        dj.d dVar = this.f8830a;
        jk0 jk0Var = (jk0) this.f8831b;
        if (jk0Var instanceof qk0) {
            dj.b bVar = dj.b.TIMEOUT;
            oc0 oc0Var = oc0.f9212b;
            cVar = new dj.c(bVar, "Operation timed out.");
        } else {
            cVar = new dj.c(dj.b.INTERNAL_ERROR, a.bb.d(jk0Var));
        }
        ((gw.d) dVar).a(cVar);
        return Unit.f80348a;
    }
}
