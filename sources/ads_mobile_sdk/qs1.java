package ads_mobile_sdk;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qs1 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ a.e9 f10247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws1 f10248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs1(ws1 ws1Var, bl2.c cVar) {
        super(3, cVar);
        this.f10248b = ws1Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qs1 qs1Var = new qs1(this.f10248b, (bl2.c) obj3);
        qs1Var.f10247a = (a.e9) obj2;
        return qs1Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a.e9 e9Var = this.f10247a;
        List list = this.f10248b.f13237m;
        Intrinsics.checkNotNullExpressionValue(list, "access$getOmidRegisteredViews$p(...)");
        kotlin.collections.k0.C(list);
        List list2 = this.f10248b.f13237m;
        Intrinsics.checkNotNullExpressionValue(list2, "access$getOmidRegisteredViews$p(...)");
        View view = (View) CollectionsKt.d0(list2);
        if (view != null) {
            this.f10248b.f13229e.a(e9Var, view);
        }
        return Unit.f80348a;
    }
}
