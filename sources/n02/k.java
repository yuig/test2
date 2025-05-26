package n02;

import ao2.j0;
import com.pinterest.report.library.model.ReportData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88836r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f88837s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ReportData.PinReportData f88838t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f88839u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f88840v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f88841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReportData.PinReportData pinReportData, o oVar, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f88838t = pinReportData;
        this.f88839u = oVar;
        this.f88840v = str;
        this.f88841w = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f88838t, this.f88839u, this.f88840v, this.f88841w, cVar);
        kVar.f88837s = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n02.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
