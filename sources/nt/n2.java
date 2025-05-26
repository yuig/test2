package nt;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f1 f92115r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaAdsLeadGenExpandView f92116s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(f1 f1Var, SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView, bl2.c cVar) {
        super(2, cVar);
        this.f92115r = f1Var;
        this.f92116s = sbaAdsLeadGenExpandView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n2(this.f92115r, this.f92116s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((String) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f1 f1Var = this.f92115r;
        String str = f1Var.f92049a instanceof m1 ? f1Var.f92040g : null;
        u50.r rVar = this.f92116s.f35285n;
        if (rVar != null) {
            rVar.a(new g0(str, f1Var.f92038e));
            return Unit.f80348a;
        }
        Intrinsics.r("eventIntake");
        throw null;
    }
}
