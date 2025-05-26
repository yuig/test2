package n02;

import com.pinterest.report.library.model.ReportData;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.z2;
import v02.t;

/* loaded from: classes4.dex */
public final class q extends wk1.q {

    /* renamed from: a, reason: collision with root package name */
    public final List f88867a;

    /* renamed from: b, reason: collision with root package name */
    public final ReportData f88868b;

    /* renamed from: c, reason: collision with root package name */
    public final z2 f88869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ArrayList secondaryReportReasons, ReportData reportData, z2 secondaryReasonRowPresenterFactory, uk1.e pinalyticsFactory, uj2.q networkStateStream) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(secondaryReportReasons, "secondaryReportReasons");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(secondaryReasonRowPresenterFactory, "secondaryReasonRowPresenterFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f88867a = secondaryReportReasons;
        this.f88868b = reportData;
        this.f88869c = secondaryReasonRowPresenterFactory;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(new l61.g(this.f88867a, this.f88868b, this.f88869c));
    }

    @Override // yk1.t
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void bindPinalytics(j02.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        t tVar = (t) view;
        d4 b03 = tVar.getB0();
        a4 c03 = tVar.getC0();
        g0 f13 = getPresenterPinalytics().f();
        presenterPinalytics.d(b03, c03, null, f13 == null ? tVar.C0 : f13, null);
    }

    @Override // yk1.t, yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
