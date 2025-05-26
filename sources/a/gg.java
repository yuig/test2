package a;

import ads_mobile_sdk.sf0;
import ads_mobile_sdk.sj0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gg extends dl2.j implements Function2 {
    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gg(2, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gg(2, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        na builder = sf0.y();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (sf0) a13;
    }
}
