package n02;

import com.pinterest.reportFlow.feature.view.ReportSecondaryReasonRow;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class p extends yk1.c implements v02.o {

    /* renamed from: a, reason: collision with root package name */
    public final w f88865a;

    /* renamed from: b, reason: collision with root package name */
    public final a11.n f88866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uk1.e pinalyticsFactory, uj2.q networkStateStream, a11.d clickThroughHelperFactory) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f88865a = wVar;
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f88866b = clickThroughHelperFactory.a(d0Var);
    }

    @Override // yk1.c
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void bindPinalytics(ReportSecondaryReasonRow view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        d4 p03 = view.getP0();
        a4 q03 = view.getQ0();
        g0 f13 = getPresenterPinalytics().f();
        presenterPinalytics.d(p03, q03, null, f13 == null ? view.f50450e : f13, null);
    }

    @Override // yk1.c, yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
