package cu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.r0;
import pk.a0;

/* loaded from: classes3.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53187i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f53188j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, int i13) {
        super(0);
        this.f53187i = i13;
        this.f53188j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GradientDrawable gradientDrawable;
        int i13 = this.f53187i;
        i iVar = this.f53188j;
        switch (i13) {
            case 0:
                bs1.c.U1(iVar.f53207i);
                a aVar = iVar.f53211m;
                if (aVar != null) {
                    BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) aVar;
                    if (((Boolean) baseAdsScrollingModule.f35335v0.getValue()).booleanValue()) {
                        AdsCarouselIndexModule adsCarouselIndexModule = baseAdsScrollingModule.f35317d0;
                        GradientDrawable gradientDrawable2 = null;
                        if (adsCarouselIndexModule == null) {
                            Intrinsics.r("carouselIndexModule");
                            throw null;
                        }
                        adsCarouselIndexModule.f35296b = baseAdsScrollingModule.y1();
                        int i14 = baseAdsScrollingModule.f35322i0;
                        int i15 = baseAdsScrollingModule.n1().f35423j;
                        if (hf0.b.n()) {
                            ViewGroup.LayoutParams layoutParams = adsCarouselIndexModule.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                            }
                            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) layoutParams;
                            ((ViewGroup.MarginLayoutParams) cVar).width = com.bumptech.glide.c.G();
                            ((ViewGroup.MarginLayoutParams) cVar).height = -1;
                            cVar.f17902c = 8388611;
                            adsCarouselIndexModule.setLayoutParams(cVar);
                        }
                        CarouselIndexView carouselIndexView = adsCarouselIndexModule.f35295a;
                        ViewGroup.LayoutParams layoutParams2 = carouselIndexView.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        Resources resources = carouselIndexView.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        Intrinsics.checkNotNullParameter(resources, "<this>");
                        marginLayoutParams.bottomMargin = carouselIndexView.getResources().getDimensionPixelSize(ps.n.onetap_opaque_carousel_index_bottom_padding) + ((int) resources.getDimension(r0.onetap_pin_media_corner_radius));
                        carouselIndexView.setLayoutParams(marginLayoutParams);
                        bs1.c.U1(carouselIndexView);
                        carouselIndexView.d(i15);
                        Context context = carouselIndexView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        if (dl2.b.T1(context)) {
                            carouselIndexView.c(eo1.b.color_white_0, eo1.b.color_white_mochimalist_0_opacity_40);
                        } else {
                            carouselIndexView.c(eo1.b.color_white_0, eo1.b.color_gray_500);
                        }
                        Context context2 = adsCarouselIndexModule.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        float dimension = dl2.b.T1(context2) ? adsCarouselIndexModule.getResources().getDimension(ps.n.ads_closeup_bottom_sheet_index_shadow_height) : adsCarouselIndexModule.getResources().getDimension(ps.n.onetap_footer_opaque2_gradient_height);
                        adsCarouselIndexModule.f35297c = dimension;
                        float f13 = i14 - dimension;
                        Resources resources2 = adsCarouselIndexModule.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        Intrinsics.checkNotNullParameter(resources2, "<this>");
                        float dimension2 = f13 + ((int) resources2.getDimension(r0.onetap_pin_media_corner_radius));
                        Context context3 = adsCarouselIndexModule.getContext();
                        if (context3 != null) {
                            int i16 = eo1.a.color_background_dark_opacity_300;
                            int i17 = eo1.a.sema_color_background_transparent;
                            Intrinsics.checkNotNullParameter(context3, "<this>");
                            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{dl2.b.x0(context3, i16), dl2.b.x0(context3, i17)});
                        } else {
                            gradientDrawable = null;
                        }
                        if (!adsCarouselIndexModule.f35296b) {
                            Context context4 = adsCarouselIndexModule.getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                            if (!dl2.b.T1(context4)) {
                                Context context5 = adsCarouselIndexModule.getContext();
                                if (context5 != null) {
                                    int i18 = eo1.a.color_black_cosmicore_900;
                                    int i19 = eo1.a.sema_color_background_transparent;
                                    Intrinsics.checkNotNullParameter(context5, "<this>");
                                    gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{dl2.b.x0(context5, i18), dl2.b.x0(context5, i19)});
                                }
                                gradientDrawable = gradientDrawable2;
                            }
                        }
                        a0.k1(adsCarouselIndexModule, (int) adsCarouselIndexModule.f35297c);
                        adsCarouselIndexModule.setBackground(gradientDrawable);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adsCarouselIndexModule, (Property<AdsCarouselIndexModule, Float>) View.TRANSLATION_Y, adsCarouselIndexModule.f35297c + dimension2, dimension2);
                        ofFloat.setDuration(420L);
                        ofFloat.start();
                    }
                }
                return Unit.f80348a;
            default:
                return new g(iVar);
        }
    }
}
