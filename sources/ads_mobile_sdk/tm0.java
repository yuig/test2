package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class tm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f11594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(ym0 ym0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f11594a = ym0Var;
        this.f11595b = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new tm0(this.f11594a, this.f11595b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tm0(this.f11594a, this.f11595b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a.j3 j3Var = this.f11594a.f14319e;
        ks2 ks2Var = (ks2) j3Var;
        ks2Var.a(this.f11595b, new Exception(this.f11595b));
        return Unit.f80348a;
    }
}
