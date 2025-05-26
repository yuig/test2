package es;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lh0.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lh0.d dVar, int i13) {
        super(0, dVar, lh0.d.class, "activateAdsVideoLetterbox", "activateAdsVideoLetterbox()V", 0);
        this.f60007a = i13;
        if (i13 == 1) {
            super(0, dVar, lh0.d.class, "activateAdsAmazonNativeVideoNewChin", "activateAdsAmazonNativeVideoNewChin()V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, dVar, lh0.d.class, "activateAdsVideoLetterBoxPharmaFinserv", "activateAdsVideoLetterBoxPharmaFinserv()V", 0);
        }
    }

    public final void h() {
        switch (this.f60007a) {
            case 0:
                ((g1) ((lh0.d) this.receiver).f83323a).c("android_ads_short_video_letterbox");
                break;
            case 1:
                ((g1) ((lh0.d) this.receiver).f83323a).c("ads_amazon_native_video_new_chin");
                break;
            default:
                ((g1) ((lh0.d) this.receiver).f83323a).c("android_ads_short_video_letterbox_pharma_finserv");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f60007a) {
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
