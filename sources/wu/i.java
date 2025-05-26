package wu;

import ac2.m;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdSize;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.f30;
import h32.f1;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import ps.q;
import x02.a2;
import yk1.n;

/* loaded from: classes3.dex */
public final class i extends AdsCoreScrollingModule implements n {
    public static final float K0 = kh2.d.p(-48);
    public static final float L0 = kh2.d.p(-32);
    public static final int M0 = kh2.d.p(8);
    public static final int N0 = kh2.d.p(32);
    public final xt.f F0;
    public final es.a G0;
    public FrameLayout H0;
    public final zu.c I0;
    public AnimatorSet J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, xt.f showcaseManager, es.a adFormats) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.F0 = showcaseManager;
        this.G0 = adFormats;
        zu.c cVar = new zu.c(context, showcaseManager);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.I0 = cVar;
        n1().addScrollListener(new f(this, 0));
        CloseupCarouselView n13 = n1();
        uk2.d observableIsVideoControlVisible = showcaseManager.f135876s;
        Intrinsics.checkNotNullParameter(observableIsVideoControlVisible, "observableIsVideoControlVisible");
        n13.N = observableIsVideoControlVisible;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void K1() {
        xt.f fVar = this.F0;
        if (fVar.f135864g == 0) {
            f30 f30Var = fVar.f135861d;
            if (f30Var != null) {
                fVar.f135858a.u(f1.PIN_CLOSEUP_NUDGE, f30Var.getUid(), null, null, false);
            }
        } else {
            f30 f30Var2 = fVar.f135860c;
            if (f30Var2 != null) {
                fVar.f135858a.u(f1.SHOWCASE_SUBPAGE_NUDGE, f30Var2.getUid(), xt.f.a(fVar.f135861d, fVar.f135860c, null), null, false);
            }
        }
        if (fVar.f135864g == 0) {
            n1().getPinterestRecyclerView().f52531a.b3(N0, 0, new DecelerateInterpolator(), AdSize.MEDIUM_RECTANGLE_WIDTH, false);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.TRANSLATION_Y;
        float f13 = M0;
        float f14 = K0;
        float f15 = f14 - f13;
        zu.c cVar = this.I0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cVar, (Property<zu.c, Float>) property, f14, f15);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        Unit unit = Unit.f80348a;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cVar, (Property<zu.c, Float>) property, f15, f14);
        ofFloat2.setDuration(150L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.start();
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void M1(int i13) {
        super.M1(i13);
        n1().s(i13);
        uk2.d dVar = n1().N;
        float f13 = (dVar == null || !Intrinsics.d(dVar.S(), Boolean.TRUE)) ? 0.0f : L0;
        FrameLayout frameLayout = this.H0;
        if (frameLayout != null) {
            frameLayout.setY(this.G + f13);
        } else {
            Intrinsics.r("moduleContainer");
            throw null;
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void O1() {
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void c2() {
        CloseupCarouselView n13 = n1();
        d2();
        n13.n(L0() + this.f35322i0);
        Context context = n13.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i13 = eo1.b.color_black_900;
        int i14 = eo1.b.sema_color_background_transparent;
        Intrinsics.checkNotNullParameter(context, "<this>");
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        Object obj = d5.a.f53679a;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{context.getColor(i13), context.getColor(i14)});
        Resources resources = n13.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a0.K(72, resources);
        L0();
        n13.m(gradientDrawable);
        n13.o(L0());
        L0();
        n13.b();
    }

    public final void f2(int i13, int i14) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i13, i14);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new androidx.media3.ui.c(this, 7));
        valueAnimator.setDuration(200L);
        valueAnimator.start();
    }

    public final void g2() {
        AnimatorSet animatorSet = this.J0;
        if (animatorSet == null || !animatorSet.isRunning()) {
            zu.c cVar = this.I0;
            cVar.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cVar, (Property<zu.c, Float>) View.TRANSLATION_Y, 0.0f, K0);
            ofFloat.setDuration(200L);
            ofFloat.setStartDelay(200L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            Unit unit = Unit.f80348a;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cVar, (Property<zu.c, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(200L);
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            animatorSet2.playTogether(ofFloat, ofFloat2);
            animatorSet2.start();
            this.J0 = animatorSet2;
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final int p1() {
        return q.ads_showcase_scrolling_module;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    /* renamed from: s1 */
    public final boolean getA0() {
        return false;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void w1(cu.i bottomSheet, AdsCarouselIndexModule carouselIndexModule, AdsToolbarModule toolbarModule, m videoManager, HashSet obstructionViews) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Intrinsics.checkNotNullParameter(carouselIndexModule, "carouselIndexModule");
        Intrinsics.checkNotNullParameter(toolbarModule, "toolbarModule");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
        super.w1(bottomSheet, carouselIndexModule, toolbarModule, videoManager, obstructionViews);
        xt.f fVar = this.F0;
        uk2.d dVar = fVar.f135875r;
        zt.b bVar = new zt.b(23, new g(this, 0));
        zt.b bVar2 = new zt.b(24, h.f131138j);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        dVar.F(bVar, bVar2, cVar, a2Var);
        fVar.f135876s.F(new zt.b(25, new g(this, 1)), new zt.b(26, h.f131139k), cVar, a2Var);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.height = L0() + this.f35322i0;
        frameLayout2.setLayoutParams(layoutParams);
        this.H0 = frameLayout2;
        zu.c cVar2 = this.I0;
        if (cVar2.getParent() == null) {
            FrameLayout frameLayout3 = this.H0;
            if (frameLayout3 == null) {
                Intrinsics.r("moduleContainer");
                throw null;
            }
            frameLayout3.addView(cVar2, new FrameLayout.LayoutParams(-1, -2, 80));
        }
        FrameLayout frameLayout4 = this.H0;
        if (frameLayout4 == null) {
            Intrinsics.r("moduleContainer");
            throw null;
        }
        if (frameLayout4.getParent() != null || (frameLayout = this.f35324k0) == null) {
            return;
        }
        FrameLayout frameLayout5 = this.H0;
        if (frameLayout5 != null) {
            frameLayout.addView(frameLayout5);
        } else {
            Intrinsics.r("moduleContainer");
            throw null;
        }
    }
}
