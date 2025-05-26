package ads_mobile_sdk;

import ao2.j0;
import java.util.Optional;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i03 implements a.qe {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f6172a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f6173b;

    public i03(Optional optionalGmaWebView, j0 uiScope) {
        Intrinsics.checkNotNullParameter(optionalGmaWebView, "optionalGmaWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f6172a = optionalGmaWebView;
        this.f6173b = uiScope;
    }

    @Override // a.qe
    public final Object a(boolean z13, bl2.c cVar) {
        ym0 ym0Var = (ym0) m2.U0(this.f6172a);
        if (ym0Var == null) {
            return Unit.f80348a;
        }
        if (z13) {
            j0 j0Var = this.f6173b;
            g03 block = new g03(ym0Var, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        } else {
            j0 j0Var2 = this.f6173b;
            h03 block2 = new h03(ym0Var, null);
            kotlin.coroutines.j context2 = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var2, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(block2, "block");
            kotlin.jvm.internal.j.z(j0Var2, context2, null, new et2(block2, null), 2);
        }
        return Unit.f80348a;
    }
}
