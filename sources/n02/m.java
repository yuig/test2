package n02;

import ao2.j0;
import com.pinterest.report.library.model.ReportData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88845r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f88846s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f88847t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ReportData.UserReportData f88848u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f88849v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, ReportData.UserReportData userReportData, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88847t = oVar;
        this.f88848u = userReportData;
        this.f88849v = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f88847t, this.f88848u, this.f88849v, cVar);
        mVar.f88846s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f88845r
            r2 = 2
            r3 = 1
            n02.o r4 = r9.f88847t
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r9.f88846s
            com.pinterest.api.adapter.coroutine.NetworkResponse r0 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r0
            ue.c.H(r10)
            goto L59
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f88846s
            ao2.p0 r1 = (ao2.p0) r1
            ue.c.H(r10)
            goto L4b
        L26:
            ue.c.H(r10)
            java.lang.Object r10 = r9.f88846s
            ao2.j0 r10 = (ao2.j0) r10
            n02.l r1 = new n02.l
            com.pinterest.report.library.model.ReportData$UserReportData r5 = r9.f88848u
            java.lang.String r6 = r9.f88849v
            r7 = 0
            r1.<init>(r4, r5, r6, r7)
            r8 = 3
            ao2.q0 r1 = kotlin.jvm.internal.j.d(r10, r7, r1, r8)
            k22.m r10 = r4.f88855c
            java.lang.String r5 = r5.f50384a
            r9.f88846s = r1
            r9.f88845r = r3
            java.lang.Object r10 = r10.M(r5, r6, r9)
            if (r10 != r0) goto L4b
            return r0
        L4b:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            r9.f88846s = r10
            r9.f88845r = r2
            java.lang.Object r1 = r1.await(r9)
            if (r1 != r0) goto L58
            return r0
        L58:
            r0 = r10
        L59:
            boolean r10 = kh2.k3.s1(r0)
            if (r10 == 0) goto L70
            i92.k r10 = r4.f88863k
            int r0 = w02.b.report_confirmation_toast_message
            r10.k(r0)
            boolean r10 = r4.isBound()
            if (r10 == 0) goto L77
            r4.p3()
            goto L77
        L70:
            i92.k r10 = r4.f88863k
            int r0 = h02.e.report_account_failure
            r10.h(r0)
        L77:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n02.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
