package yq0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.feature.articlecarousel.SeparatorTitleView;
import com.pinterest.feature.core.view.PinVideoViewCreator;
import com.pinterest.feature.core.view.PinnerAuthorityContainerViewCreator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.core.view.RelatedModuleCarouselViewCreator;
import com.pinterest.feature.core.view.RelatedSearchesStoryContainerViewCreator;
import com.pinterest.feature.core.view.SeparatorViewCreator;
import com.pinterest.feature.core.view.ShoppingGridSectionContainerViewCreator;
import com.pinterest.feature.core.view.SimpleActionStoryViewCreator;
import com.pinterest.feature.core.view.StoryBannerViewCreator;
import com.pinterest.feature.core.view.StoryTextViewCreator;
import com.pinterest.feature.core.view.StructuredFeedCarouselStoryViewCreator;
import com.pinterest.feature.core.view.StructuredFeedGridSectionStoryViewCreator;
import com.pinterest.feature.core.view.TodayTabUpsellDoubleViewCreator;
import com.pinterest.feature.core.view.TodayTabUpsellSingleViewCreator;
import com.pinterest.feature.core.view.VTOSingleItemUpsellViewCreator;
import com.pinterest.feature.core.view.VTOVideoUpsellViewCreator;
import com.pinterest.feature.core.view.VideoCarouselContainerViewCreator;
import com.pinterest.feature.core.view.WebviewPinViewCreator;
import com.pinterest.feature.dynamicgrid.view.viewholder.StoryBannerView;
import com.pinterest.feature.dynamicgrid.view.viewholder.StoryTextView;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import com.pinterest.feature.ideaPinCreation.canvas.view.AspectRatioButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.blurView.BlurView;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.f4;
import lh0.g1;
import lh0.z3;
import m60.m0;
import m60.r0;
import nx.d1;
import so.jb;
import so.oa;
import so.s8;
import tt0.y0;
import we1.a1;
import we1.b1;
import we1.h1;
import we1.n2;
import we1.q1;
import x02.i2;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139712i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f139713j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i13) {
        super(0);
        this.f139712i = i13;
        this.f139713j = obj;
    }

    public final LegoUserRep b() {
        int i13 = this.f139712i;
        Object obj = this.f139713j;
        switch (i13) {
            case 19:
                Context requireContext = ((mr0.e) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                LegoUserRep legoUserRep = new LegoUserRep(requireContext);
                legoUserRep.y1(ze0.a.List);
                legoUserRep.setPaddingRelative(0, 0, 0, bs1.c.Z(legoUserRep, eo1.c.lego_spacing_between_elements));
                return legoUserRep;
            default:
                Context requireContext2 = ((ht0.i) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                LegoUserRep legoUserRep2 = new LegoUserRep(requireContext2);
                legoUserRep2.y1(ze0.a.List);
                legoUserRep2.t0(true);
                legoUserRep2.setPaddingRelative(legoUserRep2.getResources().getDimensionPixelSize(r0.margin_half), 0, legoUserRep2.getResources().getDimensionPixelSize(r0.margin_half), legoUserRep2.getResources().getDimensionPixelSize(eo1.c.lego_bricks_one_and_a_quarter));
                return legoUserRep2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        qa2.j0 j0Var;
        boolean z14;
        int i13 = 6;
        int i14 = this.f139712i;
        AttributeSet attributeSet = null;
        Object obj = this.f139713j;
        switch (i14) {
            case 0:
                ab2.d dVar = PinVideoGridCell.Companion;
                PinVideoViewCreator pinVideoViewCreator = (PinVideoViewCreator) obj;
                z13 = pinVideoViewCreator.excludeVR;
                Context c13 = z13 ? s0.c1(pinVideoViewCreator.getContext()) : pinVideoViewCreator.getContext();
                nx.d0 pinalytics = pinVideoViewCreator.getPinalytics();
                ao2.j0 scope = pinVideoViewCreator.getScope();
                j0Var = pinVideoViewCreator.customPinGridCellFactory;
                return ab2.d.b(dVar, c13, pinalytics, scope, false, false, j0Var, pinVideoViewCreator.getGridFeatureConfig().f103320a, RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM);
            case 1:
                return new t21.a(((PinnerAuthorityContainerViewCreator) obj).getContext());
            case 2:
                m295invoke();
                return Unit.f80348a;
            case 3:
                RelatedModuleCarouselViewCreator relatedModuleCarouselViewCreator = (RelatedModuleCarouselViewCreator) obj;
                Context context = relatedModuleCarouselViewCreator.getContext();
                Context applicationContext = relatedModuleCarouselViewCreator.getContext().getApplicationContext();
                Intrinsics.g(applicationContext, "null cannot be cast to non-null type com.pinterest.base.PinterestApplication");
                so1.b bVar = ((m0) applicationContext).f85922q;
                if (bVar != null) {
                    return new ye1.a(context, (i2) ((oa) bVar).F3.get());
                }
                Intrinsics.r("baseApplicationComponent");
                throw null;
            case 4:
                RelatedSearchesStoryContainerViewCreator relatedSearchesStoryContainerViewCreator = (RelatedSearchesStoryContainerViewCreator) obj;
                return new cr.h(relatedSearchesStoryContainerViewCreator.getContext(), relatedSearchesStoryContainerViewCreator.getPinalytics());
            case 5:
                return new SeparatorTitleView(i13, ((SeparatorViewCreator) obj).getContext(), attributeSet);
            case 6:
                ShoppingGridSectionContainerViewCreator shoppingGridSectionContainerViewCreator = (ShoppingGridSectionContainerViewCreator) obj;
                return new ne1.b(shoppingGridSectionContainerViewCreator.getContext(), shoppingGridSectionContainerViewCreator.getPinalytics(), shoppingGridSectionContainerViewCreator.getNetworkStateStream());
            case 7:
                SimpleActionStoryViewCreator simpleActionStoryViewCreator = (SimpleActionStoryViewCreator) obj;
                return new tr0.a(simpleActionStoryViewCreator.getContext(), simpleActionStoryViewCreator.getPinalytics(), simpleActionStoryViewCreator.getGoToHomefeedListener());
            case 8:
                return new StoryBannerView(((StoryBannerViewCreator) obj).getContext());
            case 9:
                return new StoryTextView(((StoryTextViewCreator) obj).getContext());
            case 10:
                Context context2 = ((StructuredFeedCarouselStoryViewCreator) obj).getContext();
                Intrinsics.checkNotNullParameter(context2, "context");
                a1 a1Var = new a1(context2);
                if (!a1Var.f129253b) {
                    a1Var.f129253b = true;
                    jb jbVar = (jb) ((b1) a1Var.generatedComponent());
                    s8 s8Var = jbVar.f113485c;
                    a1Var.f129254c = (ku1.l) s8Var.f114476s.get();
                    oa oaVar = jbVar.f113483a;
                    a1Var.f129255d = (i2) oaVar.F3.get();
                    a1Var.f129256e = (m60.w) oaVar.f113885r0.get();
                    a1Var.f129257f = (b60.b) oaVar.f113850p0.get();
                    a1Var.f129258g = new gi2.b();
                    a1Var.f129259h = oaVar.j2();
                    a1Var.f129260i = (d1) oaVar.f113730i2.get();
                    a1Var.f129261j = s8Var.J6();
                    a1Var.f129262k = (xu1.g) oaVar.f113929t9.get();
                    a1Var.f129263l = (com.pinterest.feature.pin.j) s8Var.E.get();
                    a1Var.f129264m = s8Var.o6();
                    a1Var.f129265n = s8Var.k6();
                    a1Var.f129266o = oaVar.S2();
                    a1Var.f129267p = (k11.c) s8Var.F.get();
                    a1Var.f129268q = (nx.b0) oaVar.R8.get();
                    a1Var.f129269r = (a82.b) s8Var.A0.get();
                    a1Var.f129270s = s8Var.e5();
                }
                q1 q1Var = new q1(context2);
                q1Var.setVisibility(8);
                a1Var.f129273v = q1Var;
                we1.d1 d1Var = new we1.d1(context2);
                d1Var.setVisibility(8);
                a1Var.f129274w = d1Var;
                a82.b bVar2 = a1Var.f129269r;
                if (bVar2 == null) {
                    Intrinsics.r("offscreenRenderer");
                    throw null;
                }
                n2 n2Var = new n2(context2, bVar2);
                a1Var.f129275x = n2Var;
                a1Var.setVisibility(8);
                a1Var.setOrientation(1);
                a1Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                f4 f4Var = a1Var.f129261j;
                if (f4Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) f4Var.f83347a;
                if (g1Var.o("android_ctx_long_press_cleanup_animation", "enabled", z3Var) || g1Var.l("android_ctx_long_press_cleanup_animation")) {
                    a1Var.setClipChildren(false);
                }
                a1Var.addView(q1Var);
                a1Var.addView(n2Var);
                a1Var.addView(d1Var);
                return a1Var;
            case 11:
                StructuredFeedGridSectionStoryViewCreator structuredFeedGridSectionStoryViewCreator = (StructuredFeedGridSectionStoryViewCreator) obj;
                return new h1(structuredFeedGridSectionStoryViewCreator.getContext(), structuredFeedGridSectionStoryViewCreator.getScope());
            case 12:
                TodayTabUpsellDoubleViewCreator todayTabUpsellDoubleViewCreator = (TodayTabUpsellDoubleViewCreator) obj;
                Context context3 = todayTabUpsellDoubleViewCreator.getContext();
                nx.d0 pinalytics2 = todayTabUpsellDoubleViewCreator.getPinalytics();
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                return new gh1.d(context3, pinalytics2, n92.c.view_today_tab_upsell_double_story);
            case 13:
                TodayTabUpsellSingleViewCreator todayTabUpsellSingleViewCreator = (TodayTabUpsellSingleViewCreator) obj;
                return new gh1.f(todayTabUpsellSingleViewCreator.getContext(), todayTabUpsellSingleViewCreator.getPinalytics());
            case 14:
                VTOSingleItemUpsellViewCreator vTOSingleItemUpsellViewCreator = (VTOSingleItemUpsellViewCreator) obj;
                return new d91.m(vTOSingleItemUpsellViewCreator.getContext(), vTOSingleItemUpsellViewCreator.getPinalytics());
            case 15:
                VTOVideoUpsellViewCreator vTOVideoUpsellViewCreator = (VTOVideoUpsellViewCreator) obj;
                return new d91.n(vTOVideoUpsellViewCreator.getContext(), vTOVideoUpsellViewCreator.getPinalytics());
            case 16:
                VideoCarouselContainerViewCreator videoCarouselContainerViewCreator = (VideoCarouselContainerViewCreator) obj;
                return new ji1.g(videoCarouselContainerViewCreator.getContext(), videoCarouselContainerViewCreator.getPinalytics());
            case 17:
                int i15 = wc2.e.f129118r;
                WebviewPinViewCreator webviewPinViewCreator = (WebviewPinViewCreator) obj;
                z14 = webviewPinViewCreator.excludeVR;
                Context context4 = z14 ? s0.c1(webviewPinViewCreator.getContext()) : webviewPinViewCreator.getContext();
                nx.d0 pinalytics3 = webviewPinViewCreator.getPinalytics();
                ao2.j0 scope2 = webviewPinViewCreator.getScope();
                wa2.i pinFeatureConfig = webviewPinViewCreator.getGridFeatureConfig().f103320a;
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter(pinalytics3, "pinalytics");
                Intrinsics.checkNotNullParameter(scope2, "scope");
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                pinFeatureConfig.f128765d = true;
                pinFeatureConfig.f128783m = true;
                return new wc2.e(context4, pinalytics3, m60.f0.i0(pinFeatureConfig), scope2);
            case 18:
                Context requireContext = ((hr0.c) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new hr0.b(requireContext);
            case 19:
                return b();
            case 20:
                Context requireContext2 = ((wr0.s) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new wr0.c(requireContext2);
            case 21:
                m295invoke();
                return Unit.f80348a;
            case 22:
                m295invoke();
                return Unit.f80348a;
            case 23:
                return Boolean.valueOf(((b20.c) obj).r(a4.f83298b));
            case 24:
                SbaHfTunerActivityPinCellView sbaHfTunerActivityPinCellView = (SbaHfTunerActivityPinCellView) obj;
                b20.c cVar = sbaHfTunerActivityPinCellView.f45828e;
                if (cVar == null) {
                    Intrinsics.r("experimentV2Helper");
                    throw null;
                }
                if (!cVar.r(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                    return null;
                }
                int i16 = xp1.a.blur_view;
                Intrinsics.checkNotNullParameter(sbaHfTunerActivityPinCellView, "<this>");
                View findViewById = sbaHfTunerActivityPinCellView.findViewById(i16);
                BlurView blurView = (BlurView) findViewById;
                Intrinsics.f(blurView);
                blurView.a(bs1.c.B(blurView, eo1.b.color_background_dark_opacity_300));
                View rootView = blurView.getRootView();
                Intrinsics.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                BlurView.b(blurView, (ViewGroup) rootView, 0.0f, false, Shader.TileMode.REPEAT, 30).c(24.0f);
                Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
                return blurView;
            case 25:
                return b();
            case 26:
                m295invoke();
                return Unit.f80348a;
            case 27:
                m295invoke();
                return Unit.f80348a;
            case 28:
                Paint paint = new Paint(1);
                paint.setColor(((y0) obj).f119233b);
                return paint;
            default:
                Context context5 = ((AspectRatioButton) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context5, (AttributeSet) null);
                gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                gestaltText.i(xt0.a.f135899o);
                return gestaltText;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m295invoke() {
        int i13 = this.f139712i;
        int i14 = 0;
        Object obj = this.f139713j;
        switch (i13) {
            case 2:
                t tVar = (t) obj;
                new ly.h(s92.l.USER_NAVIGATION, tVar.getS1(), tVar.getT1()).i();
                break;
            case 21:
                ls0.n nVar = (ls0.n) obj;
                nVar.f84674h.j(f80.b.pin_more_download_fail);
                ms0.c cVar = ms0.c.PERMISSION_DENIED_BY_USER;
                String str = nVar.f84668b;
                if (str == null) {
                    str = "";
                }
                ms0.d.a(nVar.f84683q, cVar, nVar.f84682p, nVar.f84667a, str, null, null, null, null, nVar.f84677k, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
                break;
            case 22:
                ((ms0.b) obj).d();
                break;
            case 26:
                ((ot0.i) obj).f7().d(new dc0.h(false));
                break;
            default:
                tt0.k kVar = (tt0.k) obj;
                kVar.getClass();
                kVar.f119139b.post(new tt0.c(kVar, i14));
                kVar.f119141d.invoke();
                break;
        }
    }
}
