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
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88822r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f88823s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ReportData.ConversationReportData f88824t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f88825u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, ReportData.ConversationReportData conversationReportData, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88823s = oVar;
        this.f88824t = conversationReportData;
        this.f88825u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f88823s, this.f88824t, this.f88825u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88822r;
        String str = this.f88825u;
        ReportData.ConversationReportData conversationReportData = this.f88824t;
        o oVar = this.f88823s;
        if (i13 == 0) {
            ue.c.H(obj);
            q12.b bVar = oVar.f88859g;
            String str2 = conversationReportData.f50384a;
            this.f88822r = 1;
            obj = bVar.d(str2, str, this);
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
            f1 f1Var = f1.CONVERSATION_REPORT;
            g0 g0Var = g0.MODAL_REPORT_MENU;
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", conversationReportData.f50384a);
            hashMap.put("reason", str);
            Unit unit = Unit.f80348a;
            d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
            oVar.f88859g.e(conversationReportData.f50384a).l(tk2.e.f118017c).h(wj2.c.a()).i(new g51.h(oVar, 21), new yx1.l(23, f.f88821i));
            if (oVar.isBound()) {
                oVar.p3();
            }
        } else {
            oVar.f88863k.k(h02.e.report_failure);
        }
        return Unit.f80348a;
    }
}
