package fs;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;
import lh0.d;
import lh0.g1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i13) {
        super(0, dVar, d.class, "activateAdsVideoTimeStampRemoval", "activateAdsVideoTimeStampRemoval()V", 0);
        this.f62826a = i13;
        switch (i13) {
            case 1:
                super(0, dVar, d.class, "activateAdsDealIndicator", "activateAdsDealIndicator()V", 0);
                break;
            case 2:
                super(0, dVar, d.class, "activateAdsDealCollectionAdsExpansion", "activateAdsDealCollectionAdsExpansion()V", 0);
                break;
            case 3:
                super(0, dVar, d.class, "activateAdsDealIndicator", "activateAdsDealIndicator()V", 0);
                break;
            case 4:
                super(0, dVar, d.class, "activatePersonalizedDealIndicator", "activatePersonalizedDealIndicator()V", 0);
                break;
            case 5:
                super(0, dVar, d.class, "activatePersonalizedDealIndicator", "activatePersonalizedDealIndicator()V", 0);
                break;
            case 6:
                super(0, dVar, d.class, "activateAdsDealIndicator", "activateAdsDealIndicator()V", 0);
                break;
            case 7:
                super(0, dVar, d.class, "activateAdsDealIndicator", "activateAdsDealIndicator()V", 0);
                break;
            case 8:
                super(0, dVar, d.class, "activateAdsDealIndicator", "activateAdsDealIndicator()V", 0);
                break;
            default:
                break;
        }
    }

    public final void h() {
        switch (this.f62826a) {
            case 0:
                ((g1) ((d) this.receiver).f83323a).c("ads_android_deal_ads_expansion_video_remove_timestamp");
                break;
            case 1:
                ((g1) ((d) this.receiver).f83323a).c("ads_deal_indicator");
                break;
            case 2:
                ((g1) ((d) this.receiver).f83323a).c("android_deals_collection_expansion");
                break;
            case 3:
                ((g1) ((d) this.receiver).f83323a).c("ads_deal_indicator");
                break;
            case 4:
                ((g1) ((d) this.receiver).f83323a).c("personalized_deal_indicator");
                break;
            case 5:
                ((g1) ((d) this.receiver).f83323a).c("personalized_deal_indicator");
                break;
            case 6:
                ((g1) ((d) this.receiver).f83323a).c("ads_deal_indicator");
                break;
            case 7:
                ((g1) ((d) this.receiver).f83323a).c("ads_deal_indicator");
                break;
            default:
                ((g1) ((d) this.receiver).f83323a).c("ads_deal_indicator");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f62826a) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            case 2:
                h();
                break;
            case 3:
                h();
                break;
            case 4:
                h();
                break;
            case 5:
                h();
                break;
            case 6:
                h();
                break;
            case 7:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
