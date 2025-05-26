package n02;

import android.content.res.Resources;
import com.pinterest.api.model.cd0;
import com.pinterest.api.model.zc0;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.repository.pin.PinService;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import so.x2;
import yk1.v;

/* loaded from: classes4.dex */
public final class a extends wk1.q {

    /* renamed from: a, reason: collision with root package name */
    public final ReportData f88804a;

    /* renamed from: b, reason: collision with root package name */
    public final v f88805b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f88806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReportData reportData, yk1.a resources, x2 reasonRowPresenterFactory, uk1.e pinalyticsFactory, uj2.q networkStateStream) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(reasonRowPresenterFactory, "reasonRowPresenterFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f88804a = reportData;
        this.f88805b = resources;
        this.f88806c = reasonRowPresenterFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [wt1.e0] */
    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ReportData reportData = this.f88804a;
        boolean z13 = reportData instanceof ReportData.PinReportData;
        x2 reasonRowPresenterFactory = this.f88806c;
        if (z13) {
            Intrinsics.checkNotNullParameter(reportData, "reportData");
            Intrinsics.checkNotNullParameter(reasonRowPresenterFactory, "reasonRowPresenterFactory");
            ReportData.PinReportData pinReportData = z13 ? (ReportData.PinReportData) reportData : null;
            h0 dVar = new k02.d((pinReportData == null || !pinReportData.f50394i) ? a.a.k(PinService.PINS_URL, reportData.f50384a, "/report_reasons/") : a.a.k("thirdpartyad/", reportData.f50384a, "/report_reasons/"), new ke0.a[]{gh0.b.T()}, null, null, null, null, null, null, 0L, 2044);
            f0 f0Var = new f0();
            f0Var.e("fields", n00.b.a(n00.c.REPORT_FLOW_FIELDS));
            dVar.f49121k = f0Var;
            dVar.o(0, new k02.a(reportData, reasonRowPresenterFactory, 2));
            h0Var = dVar;
        } else if (reportData instanceof ReportData.UserReportData) {
            ReportData.UserReportData reportData2 = (ReportData.UserReportData) reportData;
            Intrinsics.checkNotNullParameter(reportData2, "reportData");
            Intrinsics.checkNotNullParameter(reasonRowPresenterFactory, "reasonRowPresenterFactory");
            h0 fVar = new k02.f(a.a.k("users/", reportData2.f50384a, "/report_reasons/"), new ke0.a[]{gh0.b.T()}, null, null, null, null, null, null, 0L, 2044);
            f0 f0Var2 = new f0();
            f0Var2.e("fields", n00.b.a(n00.c.REPORT_FLOW_FIELDS));
            fVar.f49121k = f0Var2;
            fVar.o(0, new k02.e(reportData2, reasonRowPresenterFactory));
            h0Var = fVar;
        } else if (reportData instanceof ReportData.LinkReportData) {
            ReportData.LinkReportData reportData3 = (ReportData.LinkReportData) reportData;
            Intrinsics.checkNotNullParameter(reportData3, "reportData");
            Intrinsics.checkNotNullParameter(reasonRowPresenterFactory, "reasonRowPresenterFactory");
            v resources = this.f88805b;
            Intrinsics.checkNotNullParameter(resources, "resources");
            ?? cVar = new k02.c();
            cVar.o(0, new k02.b(reportData3, reasonRowPresenterFactory));
            zc0 y13 = cd0.y();
            y13.n(reportData3.f50384a);
            y13.i("spam");
            yk1.a aVar = (yk1.a) resources;
            y13.k(aVar.f139224a.getString(h02.e.report_spam_link_title));
            int i13 = h02.e.report_spam_link_subtitle;
            Resources resources2 = aVar.f139224a;
            y13.m(resources2.getString(i13));
            q0 q0Var = q0.f80391a;
            y13.l(q0Var);
            y13.c(resources2.getString(h02.e.report_spam_link_page_title));
            y13.f(resources2.getString(h02.e.report_link_valid_reason_header));
            y13.g(kotlin.collections.f0.j(resources2.getString(h02.e.report_spam_link_reason_misleading), resources2.getString(h02.e.report_spam_link_reason_repetitive), resources2.getString(h02.e.report_spam_link_reason_unsolicited)));
            y13.e(q0Var);
            cd0 a13 = y13.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            zc0 y14 = cd0.y();
            String str = reportData3.f50384a;
            y14.n(str);
            y14.i("nudity");
            y14.k(resources2.getString(h02.e.report_pornography_link_title));
            y14.m(resources2.getString(h02.e.report_pornography_link_subtitle));
            y14.l(q0Var);
            y14.c(resources2.getString(h02.e.report_pornography_link_page_title));
            y14.f(resources2.getString(h02.e.report_link_valid_reason_header));
            y14.g(kotlin.collections.f0.j(resources2.getString(h02.e.report_pornography_reason_nudity), resources2.getString(h02.e.report_pornography_reason_acts), resources2.getString(h02.e.report_pornography_reason_fetish)));
            y14.e(q0Var);
            cd0 a14 = y14.a();
            Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
            zc0 y15 = cd0.y();
            y15.n(str);
            y15.i("broken-link");
            y15.k(resources2.getString(h02.e.report_broken_link_title));
            y15.m(resources2.getString(h02.e.report_broken_link_subtitle));
            y15.l(q0Var);
            y15.c(resources2.getString(h02.e.report_broken_link_page_title));
            y15.b(resources2.getString(h02.e.report_broken_link_reason));
            y15.g(q0Var);
            y15.e(q0Var);
            cd0 a15 = y15.a();
            Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
            zc0 y16 = cd0.y();
            y16.n(str);
            y16.i("other");
            y16.k(resources2.getString(h02.e.report_link_other_title));
            y16.m(resources2.getString(h02.e.report_link_other_subtitle));
            y16.l(q0Var);
            y16.c(resources2.getString(h02.e.report_link_other_page_title));
            y16.b(resources2.getString(h02.e.report_link_other_detail));
            y16.g(q0Var);
            y16.e(q0Var);
            cd0 a16 = y16.a();
            Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
            cVar.k(kotlin.collections.f0.j(a13, a14, a15, a16));
            h0Var = cVar;
        } else if (reportData instanceof ReportData.BoardReportData) {
            h0Var = new ov0.a(reportData, reasonRowPresenterFactory, 1);
        } else {
            if (!(reportData instanceof ReportData.ConversationReportData)) {
                throw new NoWhenBranchMatchedException();
            }
            h0Var = new ov0.a(reportData, reasonRowPresenterFactory, 2);
        }
        ((wk1.i) dataSources).b(h0Var);
    }

    @Override // yk1.t
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void bindPinalytics(j02.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        v02.q qVar = (v02.q) view;
        d4 f03 = qVar.getF0();
        a4 g03 = qVar.getG0();
        g0 f13 = getPresenterPinalytics().f();
        presenterPinalytics.d(f03, g03, null, f13 == null ? qVar.C0 : f13, null);
    }

    @Override // yk1.t, yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
