package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class jt extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xz2 f6950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(xz2 xz2Var, bl2.c cVar) {
        super(2, cVar);
        this.f6950b = xz2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        jt jtVar = new jt(this.f6950b, cVar);
        jtVar.f6949a = obj;
        return jtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        jt jtVar = new jt(this.f6950b, (bl2.c) obj2);
        jtVar.f6949a = (ym0) obj;
        return jtVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ym0) this.f6949a).f14329o = this.f6950b;
        return Unit.f80348a;
    }
}
