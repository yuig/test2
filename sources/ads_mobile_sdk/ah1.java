package ads_mobile_sdk;

import a.yc;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ah1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah1(long j13, bl2.c cVar) {
        super(2, cVar);
        this.f2408a = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ah1(this.f2408a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ah1(this.f2408a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        long j13 = this.f2408a;
        yc builder = ug1.u();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.b();
        ((ug1) builder.f10110b).appVersionCode_ = j13;
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (ug1) a13;
    }
}
