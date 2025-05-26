package n02;

import ao2.j0;
import com.pinterest.report.library.model.ReportData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88828r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f88829s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f88830t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ReportData.LinkReportData f88831u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f88832v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, ReportData.LinkReportData linkReportData, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88830t = oVar;
        this.f88831u = linkReportData;
        this.f88832v = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f88830t, this.f88831u, this.f88832v, cVar);
        iVar.f88829s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r12.f88828r
            r2 = 2
            r3 = 1
            n02.o r4 = r12.f88830t
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r12.f88829s
            com.pinterest.api.adapter.coroutine.NetworkResponse r0 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r0
            ue.c.H(r13)
            goto L61
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.f88829s
            ao2.p0 r1 = (ao2.p0) r1
            ue.c.H(r13)
            goto L53
        L26:
            ue.c.H(r13)
            java.lang.Object r13 = r12.f88829s
            ao2.j0 r13 = (ao2.j0) r13
            n02.h r1 = new n02.h
            java.lang.String r5 = r12.f88832v
            r6 = 0
            r1.<init>(r4, r5, r6)
            r5 = 3
            ao2.q0 r1 = kotlin.jvm.internal.j.d(r13, r6, r1, r5)
            com.pinterest.repository.pin.PinService r5 = r4.f88856d
            com.pinterest.report.library.model.ReportData$LinkReportData r13 = r12.f88831u
            java.lang.String r7 = r13.f50384a
            r12.f88829s = r1
            r12.f88828r = r3
            java.lang.String r8 = r12.f88832v
            java.lang.String r9 = r13.f50387d
            java.lang.String r10 = r13.f50388e
            r6 = r7
            r11 = r12
            java.lang.Object r13 = r5.reportLinkSuspend(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L53
            return r0
        L53:
            com.pinterest.api.adapter.coroutine.NetworkResponse r13 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r13
            r12.f88829s = r13
            r12.f88828r = r2
            java.lang.Object r1 = r1.await(r12)
            if (r1 != r0) goto L60
            return r0
        L60:
            r0 = r13
        L61:
            boolean r13 = kh2.k3.s1(r0)
            if (r13 == 0) goto L78
            i92.k r13 = r4.f88863k
            int r0 = w02.b.report_confirmation_toast_message
            r13.k(r0)
            boolean r13 = r4.isBound()
            if (r13 == 0) goto L7f
            r4.p3()
            goto L7f
        L78:
            i92.k r13 = r4.f88863k
            int r0 = h02.e.report_link_failure
            r13.k(r0)
        L7f:
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n02.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
