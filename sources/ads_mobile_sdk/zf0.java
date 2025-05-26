package ads_mobile_sdk;

import a.na;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zf0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(String str, bl2.c cVar) {
        super(2, cVar);
        this.f14735b = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        zf0 zf0Var = new zf0(this.f14735b, cVar);
        zf0Var.f14734a = obj;
        return zf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zf0 zf0Var = new zf0(this.f14735b, (bl2.c) obj2);
        zf0Var.f14734a = (sf0) obj;
        return zf0Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        sf0 sf0Var = (sf0) this.f14734a;
        String value = this.f14735b;
        qj0 q13 = sf0Var.q();
        Intrinsics.checkNotNullExpressionValue(q13, "toBuilder(...)");
        na builder = (na) q13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.b();
        sf0 sf0Var2 = (sf0) builder.f10110b;
        sf0Var2.getClass();
        value.getClass();
        i13 = sf0Var2.bitField0_;
        sf0Var2.bitField0_ = i13 | 8;
        sf0Var2.cachedUserAgent_ = value;
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (sf0) a13;
    }
}
