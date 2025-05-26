package n02;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import com.pinterest.repository.pin.PinService;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import lh0.c3;
import lh0.n1;
import m60.w;
import m60.x0;
import yk1.r;

/* loaded from: classes4.dex */
public final class o extends yk1.p implements j02.b {

    /* renamed from: a, reason: collision with root package name */
    public final ReportData f88853a;

    /* renamed from: b, reason: collision with root package name */
    public final ReportReasonData f88854b;

    /* renamed from: c, reason: collision with root package name */
    public final k22.m f88855c;

    /* renamed from: d, reason: collision with root package name */
    public final PinService f88856d;

    /* renamed from: e, reason: collision with root package name */
    public final i02.a f88857e;

    /* renamed from: f, reason: collision with root package name */
    public final e12.d f88858f;

    /* renamed from: g, reason: collision with root package name */
    public final q12.b f88859g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f88860h;

    /* renamed from: i, reason: collision with root package name */
    public final c3 f88861i;

    /* renamed from: j, reason: collision with root package name */
    public final w f88862j;

    /* renamed from: k, reason: collision with root package name */
    public final i92.k f88863k;

    /* renamed from: l, reason: collision with root package name */
    public String f88864l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ReportData reportData, ReportReasonData reportReasonData, k22.m userService, PinService pinService, i02.a reportService, e12.d boardService, q12.b conversationService, n1 experiments, c3 reportFlowExperiments, w eventManager, uk1.e pinalyticsFactory, uj2.q networkStateStream, i92.k toastUtils) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(reportReasonData, "reportReasonData");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(reportService, "reportService");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(reportFlowExperiments, "reportFlowExperiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f88853a = reportData;
        this.f88854b = reportReasonData;
        this.f88855c = userService;
        this.f88856d = pinService;
        this.f88857e = reportService;
        this.f88858f = boardService;
        this.f88859g = conversationService;
        this.f88860h = experiments;
        this.f88861i = reportFlowExperiments;
        this.f88862j = eventManager;
        this.f88863k = toastUtils;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        j02.a view = (j02.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        v02.j jVar = (v02.j) view;
        d4 f68302m1 = jVar.getF68302m1();
        a4 f68303n1 = jVar.getF68303n1();
        g0 f13 = getPresenterPinalytics().f();
        presenterPinalytics.d(f68302m1, f68303n1, null, f13 == null ? jVar.f123811z0 : f13, null);
    }

    public final void onBackPressed() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.BACK_BUTTON, (r18 & 4) != 0 ? null : g0.MODAL_REPORT_MENU, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final void p3() {
        this.f88862j.d(new l02.a());
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(j02.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "viewListener");
        ((v02.j) view).f123798m0 = this;
        ReportData reportData = this.f88853a;
        if (reportData instanceof ReportData.PinReportData) {
            ReportData.PinReportData pinReportData = (ReportData.PinReportData) reportData;
            if (pinReportData.f50394i) {
                return;
            }
            kotlin.jvm.internal.j.z(getScope(), null, null, new d(this, pinReportData, null), 3);
        }
    }

    public final void r3() {
        ReportReasonData reportReasonData = this.f88854b;
        String str = reportReasonData.f50416a;
        if (str == null || str.length() <= 0) {
            if (isBound()) {
                p3();
            }
            this.f88863k.h(x0.generic_error);
            return;
        }
        ReportData reportData = this.f88853a;
        if (reportData instanceof ReportData.PinReportData) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new k((ReportData.PinReportData) reportData, this, reportReasonData.f50416a, reportReasonData.f50425j, null), 3);
            return;
        }
        boolean z13 = reportData instanceof ReportData.UserReportData;
        String str2 = reportReasonData.f50416a;
        if (z13) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new m(this, (ReportData.UserReportData) reportData, str2, null), 3);
            return;
        }
        if (reportData instanceof ReportData.LinkReportData) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new i(this, (ReportData.LinkReportData) reportData, str2, null), 3);
        } else if (reportData instanceof ReportData.BoardReportData) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new e(this, (ReportData.BoardReportData) reportData, str2, null), 3);
        } else if (reportData instanceof ReportData.ConversationReportData) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new g(this, (ReportData.ConversationReportData) reportData, str2, null), 3);
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
