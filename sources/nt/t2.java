package nt;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class t2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92184r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaAdsLeadGenExpandView f92185s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView, bl2.c cVar) {
        super(2, cVar);
        this.f92185s = sbaAdsLeadGenExpandView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t2(this.f92185s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92184r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f92184r = 1;
            if (lb.l0.S(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = this.f92185s;
        sbaAdsLeadGenExpandView.f35290s = false;
        for (h1 h1Var : sbaAdsLeadGenExpandView.f35293v.values()) {
            if (h1Var instanceof a1) {
                ((a1) h1Var).f91979c = true;
            } else if (h1Var instanceof b1) {
                ((b1) h1Var).f91988c.f92023f = true;
            } else if (h1Var instanceof c1) {
                ((c1) h1Var).f91996c.f92023f = true;
            } else if (!(h1Var instanceof f1) && (h1Var instanceof g1)) {
                ((g1) h1Var).f92044d = true;
            }
        }
        return Unit.f80348a;
    }
}
