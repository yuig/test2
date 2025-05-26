package d10;

import dl2.j;
import ey.m;
import ey.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f53593r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f53593r = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f53593r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = this.f53593r;
        Function0 function0 = cVar.f53600e;
        if (function0 != null) {
            function0.invoke();
        }
        String parentMetricName = cVar.f53597b;
        Intrinsics.checkNotNullParameter(parentMetricName, "parentMetricName");
        new s(parentMetricName).i();
        new m().i();
        return Unit.f80348a;
    }
}
