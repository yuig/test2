package nt;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class s2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92176r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f92177s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SbaAdsLeadGenExpandView f92178t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(f1 f1Var, SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView, bl2.c cVar) {
        super(2, cVar);
        this.f92177s = f1Var;
        this.f92178t = sbaAdsLeadGenExpandView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s2(this.f92177s, this.f92178t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92176r;
        int i14 = 2;
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = this.f92178t;
        f1 f1Var = this.f92177s;
        int i15 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.q0 q0Var = new do2.q0(new androidx.slidingpanelayout.widget.c(f1Var.f92039f, sbaAdsLeadGenExpandView, 3), i15);
            n2 n2Var = new n2(f1Var, sbaAdsLeadGenExpandView, null);
            this.f92176r = 1;
            if (lb.l0.I(q0Var, n2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        fd.r rVar = new fd.r(new do2.l(new do2.v(new Function1() { // from class: do2.p

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f55891a = 100;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Long.valueOf(this.f55891a);
            }
        }, new androidx.slidingpanelayout.widget.c(f1Var.f92039f, f1Var, 4), null), i14), sbaAdsLeadGenExpandView, f1Var, i15);
        o2 o2Var = new o2(f1Var, null);
        this.f92176r = 2;
        if (lb.l0.I(rVar, o2Var, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
