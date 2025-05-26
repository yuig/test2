package com.pinterest.feature.pincarouselads.view;

import a.m2;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.lego.CarouselPinStatsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SingleColumnCarouselPinView f47416j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(SingleColumnCarouselPinView singleColumnCarouselPinView, int i13) {
        super(0);
        this.f47415i = i13;
        this.f47416j = singleColumnCarouselPinView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f47415i;
        SingleColumnCarouselPinView singleColumnCarouselPinView = this.f47416j;
        switch (i13) {
            case 0:
                return (GestaltText) singleColumnCarouselPinView.findViewById(sy1.a.carouselBadgeView);
            case 1:
                return (FrameLayout) singleColumnCarouselPinView.findViewById(sy1.a.carouselBadgeViewBackground);
            case 2:
                return (CarouselPinStatsView) singleColumnCarouselPinView.findViewById(sy1.a.carouselPinStats);
            case 3:
                return (PinCellClipRecyclerView) singleColumnCarouselPinView.findViewById(sy1.a.carouselRecyclerView);
            case 4:
                return (ViewGroup) singleColumnCarouselPinView.findViewById(sy1.a.carouselViewWrapper);
            case 5:
                switch (i13) {
                    case 5:
                        singleColumnCarouselPinView.setCarouselIndexTrackerMargin();
                        break;
                    default:
                        ((g1) singleColumnCarouselPinView.getPinCarouselAdsLibraryExperiments().f83457a).c("ads_android_deal_ads_expansion_carousel_ads");
                        break;
                }
                return Unit.f80348a;
            case 6:
                Context context = singleColumnCarouselPinView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new l(context, 0, true, new x(singleColumnCarouselPinView, 0), 24);
            case 7:
                Context context2 = singleColumnCarouselPinView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new a0(context2, 0, false, bc2.m.GRID, null, null, new m2(singleColumnCarouselPinView, 13), 436);
            default:
                switch (i13) {
                    case 5:
                        singleColumnCarouselPinView.setCarouselIndexTrackerMargin();
                        break;
                    default:
                        ((g1) singleColumnCarouselPinView.getPinCarouselAdsLibraryExperiments().f83457a).c("ads_android_deal_ads_expansion_carousel_ads");
                        break;
                }
                return Unit.f80348a;
        }
    }
}
