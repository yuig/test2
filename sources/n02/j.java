package n02;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.report.library.model.ReportData;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.w0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.d0;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f88833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReportData.PinReportData f88834s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f88835t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, ReportData.PinReportData pinReportData, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88833r = oVar;
        this.f88834s = pinReportData;
        this.f88835t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f88833r, this.f88834s, this.f88835t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        w0 h03;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d0 pinalytics = this.f88833r.getPinalytics();
        f1 f1Var = f1.PIN_REPORT;
        g0 g0Var = g0.MODAL_REPORT_MENU;
        u0 u0Var = u0.PIN_FEEDBACK_REASON_OTHER;
        ReportData.PinReportData pinReportData = this.f88834s;
        String str = pinReportData.f50384a;
        HashMap hashMap = new HashMap();
        hashMap.put("reason", this.f88835t);
        String str2 = pinReportData.f50392g;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("image_signature", str2);
        h03 = pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        return h03;
    }
}
