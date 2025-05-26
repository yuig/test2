package n02;

import ao2.j0;
import com.pinterest.report.library.model.ReportData;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.d0;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f88842r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReportData.UserReportData f88843s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f88844t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, ReportData.UserReportData userReportData, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88842r = oVar;
        this.f88843s = userReportData;
        this.f88844t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f88842r, this.f88843s, this.f88844t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d0 pinalytics = this.f88842r.getPinalytics();
        f1 f1Var = f1.USER_REPORT;
        g0 g0Var = g0.MODAL_REPORT_MENU;
        HashMap hashMap = new HashMap();
        hashMap.put("reportee_id", this.f88843s.f50384a);
        hashMap.put("reason", this.f88844t);
        Unit unit = Unit.f80348a;
        return d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
    }
}
