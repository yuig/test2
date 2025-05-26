package is1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lh0.g1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, int i13) {
        super(0, obj, lh0.j.class, "activateSimplerAdAttributionAdsModules", "activateSimplerAdAttributionAdsModules()V", 0);
        this.f73574a = i13;
        if (i13 == 1) {
            super(0, obj, lh0.j.class, "activateAdsIdeaPinGridStaticPlaytime", "activateAdsIdeaPinGridStaticPlaytime()V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, obj, lh0.j.class, "activateAdsMrcBtr1px1s", "activateAdsMrcBtr1px1s()V", 0);
        }
    }

    public final void h() {
        switch (this.f73574a) {
            case 0:
                ((g1) ((lh0.j) this.receiver).f83394a).c("android_simpler_ad_attribution_ads_modules");
                break;
            case 1:
                ((g1) ((lh0.j) this.receiver).f83394a).c("android_idea_ads_grid_static_playtime");
                break;
            default:
                ((g1) ((lh0.j) this.receiver).f83394a).c("android_ads_mrc_btr_1px1s");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f73574a) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
