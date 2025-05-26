package ads_mobile_sdk;

import a.af;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xf2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf2 f13644a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf2(yf2 yf2Var, bl2.c cVar) {
        super(2, cVar);
        this.f13644a = yf2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new xf2(this.f13644a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xf2(this.f13644a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        yf2 yf2Var = this.f13644a;
        af afVar = yf2Var.f14230i;
        if (afVar != null) {
            ku0 ku0Var = (ku0) afVar;
            if (yf2Var.f14229h == ((Number) ku0Var.f7518j.a("gads:inspector:shake_count", 3, oh0.f9285i)).intValue()) {
                j0 j0Var = ku0Var.f7513e;
                ut0 block = new ut0(ku0Var, null);
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
