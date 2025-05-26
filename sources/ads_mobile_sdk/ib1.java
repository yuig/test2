package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ib1 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vi2 f6305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj.d f6306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib1(vi2 vi2Var, dj.d dVar, bl2.c cVar) {
        super(1, cVar);
        this.f6305a = vi2Var;
        this.f6306b = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new ib1(this.f6305a, this.f6306b, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ib1(this.f6305a, this.f6306b, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        vi2 vi2Var = this.f6305a;
        dj.d signalGenerationCallback = this.f6306b;
        vi2Var.getClass();
        Intrinsics.checkNotNullParameter(signalGenerationCallback, "signalGenerationCallback");
        j0 j0Var = vi2Var.f12522a;
        pi2 block = new pi2(vi2Var, signalGenerationCallback, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return Unit.f80348a;
    }
}
