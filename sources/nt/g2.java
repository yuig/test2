package nt;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class g2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92047r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaAdsLeadGenExpandView f92048s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView, bl2.c cVar) {
        super(2, cVar);
        this.f92048s = sbaAdsLeadGenExpandView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g2(this.f92048s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92047r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f92047r = 1;
            if (lb.l0.S(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        if (this.f92048s.f35289r <= 0) {
            hf0.b.k(this.f92048s);
        }
        return Unit.f80348a;
    }
}
