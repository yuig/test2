package p02;

import ao2.j0;
import com.pinterest.navigation.Navigation;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p70.e f98470r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s02.v f98471s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p70.e eVar, s02.v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f98470r = eVar;
        this.f98471s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f98470r, this.f98471s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p70.e eVar = this.f98470r;
        d7.g.s(Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_SUBMIT_APPEAL), (m60.w) eVar.f99073c);
        m60.w wVar = (m60.w) eVar.f99073c;
        s02.s sVar = (s02.s) this.f98471s;
        boolean z13 = sVar.f110347a;
        wVar.d(new i92.i(new r02.l(z13 ? h02.e.rvc_appeal_submitted : h02.e.rvc_appeal_error, z13)));
        if (sVar.f110347a) {
            ((m60.w) eVar.f99073c).d(new r02.v(sVar.f110348b));
        }
        return Unit.f80348a;
    }
}
