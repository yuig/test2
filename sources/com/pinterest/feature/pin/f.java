package com.pinterest.feature.pin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.RelativeLayout;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import h32.u0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class f extends d {

    /* renamed from: i, reason: collision with root package name */
    public final Context f47205i;

    /* renamed from: j, reason: collision with root package name */
    public final PathInterpolator f47206j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MainActivity context, View rootView, r70.a aVar, r70.f bottomNavConfiguration, ku1.j navigationManager) {
        super(context, rootView, aVar, bottomNavConfiguration, navigationManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(bottomNavConfiguration, "bottomNavConfiguration");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        this.f47205i = context;
        PathInterpolator pathInterpolator = new PathInterpolator(0.68f, -0.6f, 0.32f, 1.6f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(...)");
        this.f47206j = pathInterpolator;
    }

    @Override // com.pinterest.feature.pin.d
    public final u0 e(Set mostRecentPinUrls, View view) {
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        return d.i(mostRecentPinUrls, view) ? u0.REPIN_ANIMATION_DEFAULT_WITH_CONFETTI : u0.REPIN_ANIMATION_DEFAULT;
    }

    @Override // com.pinterest.feature.pin.d
    public final void j(f30 pin, Set mostRecentPinUrls, ky0.b getAnimationListener, RepinAnimationData repinAnimationData, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        Intrinsics.checkNotNullParameter(getAnimationListener, "getAnimationListener");
        View findViewById = bs1.c.k0(this.f47144a).findViewById(this.f47146c.f().f106384e);
        Context context = this.f47205i;
        WebImageView webImageView = new WebImageView(context);
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(r0.corner_radius_large);
        webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        webImageView.M1(context.getResources().getDimensionPixelOffset(eo1.c.lego_border_width_small));
        webImageView.o0(dl2.b.x0(context, eo1.a.sema_color_background_default));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context.getResources().getDimensionPixelOffset(eo1.c.space_1000), -2);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelOffset(r0.margin);
        webImageView.setLayoutParams(layoutParams);
        if (findViewById != null) {
            webImageView.setX(f(findViewById, layoutParams.width));
        }
        webImageView.loadUrl(bs1.c.p0(pin));
        webImageView.setAdjustViewBounds(true);
        webImageView.getViewTreeObserver().addOnGlobalLayoutListener(new e(webImageView, this, pin, mostRecentPinUrls, findViewById, getAnimationListener));
        RelativeLayout relativeLayout = this.f47150g;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = (int) r70.b.f106349i.k0().a();
            relativeLayout.addView(webImageView);
        }
    }
}
