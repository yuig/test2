package ads_mobile_sdk;

import a.na;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wf0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13021a;

    public wf0(bl2.c cVar) {
        super(2, cVar);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        wf0 wf0Var = new wf0(cVar);
        wf0Var.f13021a = obj;
        return wf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wf0 wf0Var = new wf0((bl2.c) obj2);
        wf0Var.f13021a = (sf0) obj;
        return wf0Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        qj0 q13 = ((sf0) this.f13021a).q();
        Intrinsics.checkNotNullExpressionValue(q13, "toBuilder(...)");
        na builder = (na) q13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        i13 = ((sf0) builder.f10110b).sessionsSinceUpdate_;
        builder.g(i13 + 1);
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (sf0) a13;
    }
}
