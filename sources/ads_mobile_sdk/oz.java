package ads_mobile_sdk;

import a.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class oz extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f9501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(ym0 ym0Var, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f9501a = ym0Var;
        this.f9502b = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new oz(this.f9501a, this.f9502b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new oz(this.f9501a, this.f9502b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d3 d3Var = this.f9501a.f14327m;
        if (d3Var != null) {
            wi0 wi0Var = (wi0) d3Var;
            if ((!this.f9502b || wi0Var.f()) && !wi0Var.d()) {
                wi0Var.f13061q = false;
            } else {
                wi0Var.f13061q = true;
            }
        }
        return Unit.f80348a;
    }
}
