package ads_mobile_sdk;

import a.d3;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class re0 implements a.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final ym0 f10595a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f10596b;

    public re0(ym0 gmaWebView, j0 uiScope) {
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f10595a = gmaWebView;
        this.f10596b = uiScope;
    }

    @Override // a.g6
    public final Object c(bl2.c cVar) {
        d3 d3Var = this.f10595a.f14327m;
        if (d3Var != null) {
            j0 j0Var = this.f10596b;
            qe0 block = new qe0(d3Var, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
