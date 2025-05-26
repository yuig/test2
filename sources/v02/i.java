package v02;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.report.library.model.ReportData;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f123793i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ReportData.PinReportData f123794j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ReportData.PinReportData pinReportData) {
        super(1);
        this.f123793i = jVar;
        this.f123794j = pinReportData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        on1.i it = (on1.i) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        j02.b bVar = this.f123793i.f123798m0;
        if (bVar == null) {
            Intrinsics.r("viewListener");
            throw null;
        }
        boolean z13 = it instanceof on1.g;
        n02.o oVar = (n02.o) bVar;
        ReportData.PinReportData pinReportData = this.f123794j;
        Intrinsics.checkNotNullParameter(pinReportData, "pinReportData");
        String str = pinReportData.f50389d;
        if (str.length() > 0) {
            String str2 = oVar.f88864l;
            if (str2 == null) {
                Intrinsics.r("creatorName");
                throw null;
            }
            if (str2.length() > 0) {
                if (z13) {
                    kotlin.jvm.internal.j.z(oVar.getScope(), null, null, new n02.c(oVar, str, "pin_report", pinReportData.f50384a, null), 3);
                    oVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_BLOCK_BUTTON, (r18 & 4) != 0 ? null : g0.MODAL_REPORT_MENU, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                } else {
                    kotlin.jvm.internal.j.z(oVar.getScope(), null, null, new n02.n(oVar, str, null), 3);
                    oVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_UNBLOCK_BUTTON, (r18 & 4) != 0 ? null : g0.MODAL_REPORT_MENU, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                return Unit.f80348a;
            }
        }
        if (oVar.isBound()) {
            oVar.p3();
        }
        oVar.f88863k.h(x0.generic_error);
        return Unit.f80348a;
    }
}
