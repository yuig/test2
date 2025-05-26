package l5;

import android.util.Log;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81575r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f81576s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f81577t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Integer num, bl2.c cVar) {
        super(2, cVar);
        this.f81576s = iVar;
        this.f81577t = num;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f81576s, this.f81577t, cVar);
        hVar.f81575r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f81575r;
        i iVar = this.f81576s;
        String str = iVar.f81579b;
        StringBuilder sb3 = new StringBuilder("Got mediaPerformanceClass ");
        Integer result = this.f81577t;
        sb3.append(result);
        Log.v(str, sb3.toString());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        kotlin.jvm.internal.j.z(j0Var, null, null, new g(iVar, Math.max(result.intValue(), iVar.f81580c.f78311e), null), 3);
        return Unit.f80348a;
    }
}
