package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ys extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f14381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(n1 n1Var, bl2.c cVar) {
        super(2, cVar);
        this.f14381b = n1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        ys ysVar = new ys(this.f14381b, cVar);
        ysVar.f14380a = obj;
        return ysVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ys ysVar = new ys(this.f14381b, (bl2.c) obj2);
        ysVar.f14380a = (ym0) obj;
        return ysVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kn0 a13 = ((ym0) this.f14380a).a();
        a13.f7407m.setValue(a13, kn0.f7394t[3], this.f14381b);
        return Unit.f80348a;
    }
}
