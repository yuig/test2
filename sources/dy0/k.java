package dy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f56589s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f56589s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f56589s, cVar);
        kVar.f56588r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((e) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        if (!((e) this.f56588r).f56556a) {
            o oVar = this.f56589s;
            if (!oVar.f56605e0) {
                iy0.a aVar2 = oVar.f56604d0;
                if (aVar2 != null) {
                    iy0.a.c(aVar2, null, null, null, 7);
                }
                oVar.f56605e0 = true;
            }
        }
        return Unit.f80348a;
    }
}
