package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rh0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh0 f10639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh0(sh0 sh0Var, bl2.c cVar) {
        super(2, cVar);
        this.f10639a = sh0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new rh0(this.f10639a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rh0(this.f10639a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        sh0 sh0Var = this.f10639a;
        a.oa oaVar = sh0Var.f11105m;
        if (oaVar != null) {
            ku0 ku0Var = (ku0) oaVar;
            if (sh0Var.f11102j == ((Number) ku0Var.f7518j.a("gads:inspector:flick_count", 2, oh0.f9285i)).intValue()) {
                j0 j0Var = ku0Var.f7513e;
                tt0 block = new tt0(ku0Var, null);
                kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
            }
        }
        return Unit.f80348a;
    }
}
