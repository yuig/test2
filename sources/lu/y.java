package lu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends AdsCoreScrollingModule {
    public static final /* synthetic */ int I0 = 0;
    public final vt.e F0;
    public FrameLayout G0;
    public final xj2.b H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, vt.e adsQuizManager) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        this.F0 = adsQuizManager;
        this.H0 = new xj2.b();
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void K1() {
        fu.c cVar = this.f35327n0;
        if (cVar != null) {
            cVar.d5();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void M1(int i13) {
        CloseupCarouselView n13 = n1();
        d2();
        n13.s(i13);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void X1(AdsCarouselIndexModule carouselIndexModule, AdsToolbarModule toolbarModule, ac2.m videoManager, HashSet obstructionViews) {
        Intrinsics.checkNotNullParameter(carouselIndexModule, "carouselIndexModule");
        Intrinsics.checkNotNullParameter(toolbarModule, "toolbarModule");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
        Intrinsics.checkNotNullParameter(videoManager, "<set-?>");
        this.f35319f0 = videoManager;
        Intrinsics.checkNotNullParameter(carouselIndexModule, "<set-?>");
        this.f35317d0 = carouselIndexModule;
        Intrinsics.checkNotNullParameter(toolbarModule, "<set-?>");
        this.f35318e0 = toolbarModule;
        Intrinsics.checkNotNullParameter(obstructionViews, "<set-?>");
        this.f35320g0 = obstructionViews;
        V1();
        ek2.f i13 = fk2.m.f62459a.d(100L, TimeUnit.MILLISECONDS).h(wj2.c.a()).i(new cp.b0(this, 3), new zt.b(16, a.f84856w));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        this.H0.a(i13);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, com.pinterest.ui.scrollview.ObservableScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.H0.d();
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, android.view.View.OnTouchListener
    public final boolean onTouch(View v13, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v13, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void w1(cu.i bottomSheet, AdsCarouselIndexModule carouselIndexModule, AdsToolbarModule toolbarModule, ac2.m videoManager, HashSet obstructionViews) {
        PinterestVideoView pinterestVideoView;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Intrinsics.checkNotNullParameter(carouselIndexModule, "carouselIndexModule");
        Intrinsics.checkNotNullParameter(toolbarModule, "toolbarModule");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
        super.w1(bottomSheet, carouselIndexModule, toolbarModule, videoManager, obstructionViews);
        CloseupCarouselView n13 = n1();
        tq.j listener = new tq.j(this, 12);
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.pinterest.feature.pincarouselads.view.a0 b13 = n13.b();
        if (b13 == null || (pinterestVideoView = b13.f47367l) == null) {
            return;
        }
        pinterestVideoView.setOnClickListener(listener);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final boolean y1() {
        return n1().f35422i <= ((float) this.f35322i0);
    }
}
