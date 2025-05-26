package n02;

import com.pinterest.api.model.cd0;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.view.ReportReasonRowView;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import nx.d0;
import pk.a0;

/* loaded from: classes4.dex */
public final class b extends yk1.c implements v02.m {

    /* renamed from: a, reason: collision with root package name */
    public final w f88807a;

    /* renamed from: b, reason: collision with root package name */
    public final a11.n f88808b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.e pinalyticsFactory, uj2.q networkStateStream, a11.d clickThroughHelperFactory) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f88807a = wVar;
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f88808b = clickThroughHelperFactory.a(d0Var);
    }

    public final void q3(ReportReasonRowView view, cd0 reason, ReportData reportData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reason, "reportReason");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        view.f50440a = this;
        Intrinsics.checkNotNullParameter(reason, "reason");
        view.f50441b = reason;
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        view.f50442c = reportData;
        String primaryText = reason.H();
        Intrinsics.checkNotNullExpressionValue(primaryText, "getPrimaryText(...)");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        a0.p(view.f50443d, primaryText);
        String secondaryText = reason.J();
        if (secondaryText == null) {
            secondaryText = "";
        }
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        a0.p(view.f50444e, secondaryText);
    }

    @Override // yk1.c
    /* renamed from: r3, reason: merged with bridge method [inline-methods] */
    public final void bindPinalytics(ReportReasonRowView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        d4 b03 = view.getB0();
        a4 f87513d1 = view.getF87513d1();
        g0 f13 = getPresenterPinalytics().f();
        presenterPinalytics.d(b03, f87513d1, null, f13 == null ? view.f50445f : f13, null);
    }

    @Override // yk1.c, yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
