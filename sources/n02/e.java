package n02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.report.library.model.ReportData;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.d0;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88817r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f88818s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ReportData.BoardReportData f88819t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f88820u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, ReportData.BoardReportData boardReportData, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88818s = oVar;
        this.f88819t = boardReportData;
        this.f88820u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f88818s, this.f88819t, this.f88820u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88817r;
        String str = this.f88820u;
        ReportData.BoardReportData boardReportData = this.f88819t;
        o oVar = this.f88818s;
        if (i13 == 0) {
            ue.c.H(obj);
            e12.d dVar = oVar.f88858f;
            String str2 = boardReportData.f50384a;
            this.f88817r = 1;
            obj = dVar.E(str2, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        if (k3.s1((NetworkResponse) obj)) {
            d0 pinalytics = oVar.getPinalytics();
            f1 f1Var = f1.BOARD_REPORT;
            g0 g0Var = g0.MODAL_REPORT_MENU;
            HashMap hashMap = new HashMap();
            hashMap.put("board_id", boardReportData.f50384a);
            hashMap.put("reason", str);
            Unit unit = Unit.f80348a;
            d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
            oVar.f88863k.k(w02.b.report_confirmation_toast_message);
            if (oVar.isBound()) {
                oVar.p3();
            }
        } else {
            oVar.f88863k.k(h02.e.report_failure);
        }
        return Unit.f80348a;
    }
}
