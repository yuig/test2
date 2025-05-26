package zp0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import ao2.j0;
import com.pinterest.feature.board.common.newideas.upsell.homefeedupsell.view.BaseUpsellSingleItemView;
import com.pinterest.feature.board.common.newideas.view.MoreIdeasFeedSectionTitleView;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import com.pinterest.feature.conversation.view.GifReactionTrayView;
import com.pinterest.feature.conversation.view.GifReactionView;
import com.pinterest.feature.core.view.ArticleCarouselContainerViewCreator;
import com.pinterest.feature.core.view.BaseUpsellSingleItemViewCreator;
import com.pinterest.feature.core.view.BoardGridCellLayoutViewCreator;
import com.pinterest.feature.core.view.BubbleContainerViewCreator;
import com.pinterest.feature.core.view.BubblesListViewCreator;
import com.pinterest.feature.core.view.EducationBannerViewCreator;
import com.pinterest.feature.core.view.ExperienceViewCreator;
import com.pinterest.feature.core.view.FeedCardDoubleViewCreator;
import com.pinterest.feature.core.view.FeedCardViewCreator;
import com.pinterest.feature.core.view.GeneralShoppingUpsellViewCreator;
import com.pinterest.feature.core.view.ImpressionableUserRepViewCreator;
import com.pinterest.feature.core.view.MoreIdeasFeedSectionTitleViewCreator;
import com.pinterest.feature.core.view.PinCarouselContainerViewCreator;
import com.pinterest.feature.core.view.PinCollageViewCreator;
import com.pinterest.feature.core.view.PinFeedbackWithGridActionsViewCreator;
import com.pinterest.feature.core.view.PinFeedbackWithoutGridActionsViewCreator;
import com.pinterest.feature.core.view.PinFullSpanVideoViewCreator;
import com.pinterest.feature.core.view.PinGridSavedOverlayContainerViewCreator;
import com.pinterest.feature.core.view.PinSpotlightCollectionsVideoViewCreator;
import com.pinterest.feature.core.view.PinStoryPinVideoGridCellViewCreator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import fk2.l;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kp.m;
import lq0.e0;
import m60.f0;
import m60.u;
import m60.w;
import nx.d0;
import qa2.k1;
import qa2.p0;
import qa2.r0;
import uj2.a0;
import x40.p6;
import xo0.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f142588j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(0);
        this.f142587i = i13;
        this.f142588j = obj;
    }

    public final ah0.d b() {
        int i13 = this.f142587i;
        Object obj = this.f142588j;
        switch (i13) {
            case 12:
                FeedCardDoubleViewCreator feedCardDoubleViewCreator = (FeedCardDoubleViewCreator) obj;
                return new ah0.d(feedCardDoubleViewCreator.getContext(), feedCardDoubleViewCreator.getPinalytics(), true);
            default:
                FeedCardViewCreator feedCardViewCreator = (FeedCardViewCreator) obj;
                return new ah0.d(feedCardViewCreator.getContext(), feedCardViewCreator.getPinalytics(), false);
        }
    }

    public final PinVideoGridCell e() {
        boolean z13;
        boolean z14;
        int i13 = this.f142587i;
        Object obj = this.f142588j;
        switch (i13) {
            case 26:
                ab2.d dVar = PinVideoGridCell.Companion;
                PinFullSpanVideoViewCreator pinFullSpanVideoViewCreator = (PinFullSpanVideoViewCreator) obj;
                z13 = pinFullSpanVideoViewCreator.excludeVR;
                return ab2.d.b(dVar, z13 ? s0.c1(pinFullSpanVideoViewCreator.getContext()) : pinFullSpanVideoViewCreator.getContext(), pinFullSpanVideoViewCreator.getPinalytics(), pinFullSpanVideoViewCreator.getScope(), true, false, null, pinFullSpanVideoViewCreator.getGridFeatureConfig().f103320a, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
            default:
                ab2.d dVar2 = PinVideoGridCell.Companion;
                PinSpotlightCollectionsVideoViewCreator pinSpotlightCollectionsVideoViewCreator = (PinSpotlightCollectionsVideoViewCreator) obj;
                z14 = pinSpotlightCollectionsVideoViewCreator.excludeVR;
                return ab2.d.b(dVar2, z14 ? s0.c1(pinSpotlightCollectionsVideoViewCreator.getContext()) : pinSpotlightCollectionsVideoViewCreator.getContext(), pinSpotlightCollectionsVideoViewCreator.getPinalytics(), pinSpotlightCollectionsVideoViewCreator.getScope(), true, false, null, pinSpotlightCollectionsVideoViewCreator.getGridFeatureConfig().f103320a, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
        }
    }

    public final p0 f() {
        int i13 = this.f142587i;
        Object obj = this.f142588j;
        switch (i13) {
            case 24:
                PinFeedbackWithGridActionsViewCreator pinFeedbackWithGridActionsViewCreator = (PinFeedbackWithGridActionsViewCreator) obj;
                return new p0(pinFeedbackWithGridActionsViewCreator.getContext(), true, pinFeedbackWithGridActionsViewCreator.getPinalytics().getUniqueScreenKey(), pinFeedbackWithGridActionsViewCreator.getScope(), pinFeedbackWithGridActionsViewCreator.getPinalytics(), f0.i0(pinFeedbackWithGridActionsViewCreator.getGridFeatureConfig().f103320a));
            default:
                PinFeedbackWithoutGridActionsViewCreator pinFeedbackWithoutGridActionsViewCreator = (PinFeedbackWithoutGridActionsViewCreator) obj;
                return new p0(pinFeedbackWithoutGridActionsViewCreator.getContext(), false, pinFeedbackWithoutGridActionsViewCreator.getPinalytics().getUniqueScreenKey(), pinFeedbackWithoutGridActionsViewCreator.getScope(), pinFeedbackWithoutGridActionsViewCreator.getPinalytics(), f0.i0(pinFeedbackWithoutGridActionsViewCreator.getGridFeatureConfig().f103320a));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        int i13 = 6;
        int i14 = this.f142587i;
        AttributeSet attributeSet = null;
        Object obj = this.f142588j;
        switch (i14) {
            case 0:
                m303invoke();
                return Unit.f80348a;
            case 1:
                m303invoke();
                return Unit.f80348a;
            case 2:
                m303invoke();
                return Unit.f80348a;
            case 3:
                return (ImageView) ((e0) obj).findViewById(xc0.e.reaction_item);
            case 4:
                Context context = ((GifReactionTrayView) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GifReactionView(context, null);
            case 5:
                return new bj0.e(((ArticleCarouselContainerViewCreator) obj).getContext());
            case 6:
                return new BaseUpsellSingleItemView(i13, ((BaseUpsellSingleItemViewCreator) obj).getContext(), attributeSet);
            case 7:
                return new BoardGridCellLayout(((BoardGridCellLayoutViewCreator) obj).getContext(), null);
            case 8:
                return new xo0.g(((BubbleContainerViewCreator) obj).getContext());
            case 9:
                Context context2 = ((BubblesListViewCreator) obj).getContext();
                Intrinsics.checkNotNullParameter(context2, "context");
                q qVar = new q(context2);
                if (!qVar.f135620b) {
                    qVar.f135620b = true;
                }
                qVar.setOrientation(1);
                qVar.setPaddingRelative(qVar.getPaddingStart(), qVar.getPaddingTop(), qVar.getPaddingEnd(), qVar.getResources().getDimensionPixelSize(eo1.c.space_300));
                return qVar;
            case 10:
                EducationBannerViewCreator educationBannerViewCreator = (EducationBannerViewCreator) obj;
                return new cg0.b(educationBannerViewCreator.getContext(), educationBannerViewCreator.getPinalytics());
            case 11:
                Context context3 = ((ExperienceViewCreator) obj).getContext();
                Intrinsics.checkNotNullParameter(context3, "context");
                return new ch0.e(new GestaltCallout(i13, context3, attributeSet));
            case 12:
                return b();
            case 13:
                return b();
            case 14:
                return new za2.b(((GeneralShoppingUpsellViewCreator) obj).getContext());
            case 15:
                Context context4 = ((yq0.d) obj).getContext();
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter(context4, "context");
                xv.f fVar = new xv.f(context4, 0);
                fVar.f136011f = 1.0f;
                fVar.b();
                return fVar;
            case 16:
                Context context5 = ((yq0.d) obj).getContext();
                Intrinsics.checkNotNullParameter(context5, "context");
                zv.e eVar = new zv.e(context5);
                eVar.b();
                return eVar;
            case 17:
                return new aw.f(((yq0.d) obj).getContext());
            case 18:
                Context context6 = ((yq0.d) obj).getContext();
                Intrinsics.checkNotNullParameter(context6, "context");
                bw.d dVar = new bw.d(context6);
                dVar.b();
                return dVar;
            case 19:
                return new cw.e(((yq0.d) obj).getContext());
            case 20:
                ImpressionableUserRep impressionableUserRep = new ImpressionableUserRep(((ImpressionableUserRepViewCreator) obj).getContext());
                Context context7 = impressionableUserRep.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                int Y = bs1.c.Y(context7, eo1.c.lego_spacing_vertical_small);
                impressionableUserRep.setPaddingRelative(impressionableUserRep.getPaddingStart(), Y, impressionableUserRep.getPaddingEnd(), Y);
                impressionableUserRep.y1(ze0.a.Default);
                impressionableUserRep.r0(false);
                return impressionableUserRep;
            case 21:
                return new MoreIdeasFeedSectionTitleView(i13, ((MoreIdeasFeedSectionTitleViewCreator) obj).getContext(), attributeSet);
            case 22:
                PinCarouselContainerViewCreator pinCarouselContainerViewCreator = (PinCarouselContainerViewCreator) obj;
                return new j21.f(pinCarouselContainerViewCreator.getContext(), pinCarouselContainerViewCreator.getPinalytics(), pinCarouselContainerViewCreator.getNetworkStateStream(), null, null, null, 0, false, 504);
            case 23:
                int i15 = v72.g.f124416x;
                PinCollageViewCreator pinCollageViewCreator = (PinCollageViewCreator) obj;
                z13 = pinCollageViewCreator.excludeVR;
                Context context8 = z13 ? s0.c1(pinCollageViewCreator.getContext()) : pinCollageViewCreator.getContext();
                d0 pinalytics = pinCollageViewCreator.getPinalytics();
                j0 scope = pinCollageViewCreator.getScope();
                wa2.i pinFeatureConfig = pinCollageViewCreator.getGridFeatureConfig().f103320a;
                Intrinsics.checkNotNullParameter(context8, "context");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                pinFeatureConfig.f128765d = true;
                pinFeatureConfig.f128783m = true;
                return new v72.g(context8, pinalytics, f0.i0(pinFeatureConfig), scope);
            case 24:
                return f();
            case 25:
                return f();
            case 26:
                return e();
            case 27:
                PinGridSavedOverlayContainerViewCreator pinGridSavedOverlayContainerViewCreator = (PinGridSavedOverlayContainerViewCreator) obj;
                return new r0(pinGridSavedOverlayContainerViewCreator.getContext(), pinGridSavedOverlayContainerViewCreator.getScope(), pinGridSavedOverlayContainerViewCreator.getPinalytics(), f0.i0(pinGridSavedOverlayContainerViewCreator.getGridFeatureConfig().f103320a));
            case 28:
                return e();
            default:
                int i16 = k1.f103281v;
                PinStoryPinVideoGridCellViewCreator pinStoryPinVideoGridCellViewCreator = (PinStoryPinVideoGridCellViewCreator) obj;
                return pe.i.s(pinStoryPinVideoGridCellViewCreator.getContext(), pinStoryPinVideoGridCellViewCreator.getPinalytics(), pinStoryPinVideoGridCellViewCreator.getScope(), pinStoryPinVideoGridCellViewCreator.getGridFeatureConfig().f103320a);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m303invoke() {
        int i13 = this.f142587i;
        Object obj = this.f142588j;
        switch (i13) {
            case 0:
                a.c.y(u.f85943a);
                nx.j0 j0Var = ((b) obj).f142600l;
                f1 eventType = wp0.e.UserSearchDismissed.getEventType();
                HashMap hashMap = new HashMap();
                hashMap.put("tag_type", String.valueOf(f32.c.USER.getValue()));
                Unit unit = Unit.f80348a;
                d0.B(j0Var, eventType, null, null, hashMap, 22);
                break;
            case 1:
                dq0.b bVar = (dq0.b) obj;
                m mVar = bVar.f56072e;
                mVar.getClass();
                String contactRequestId = bVar.f56069b;
                Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
                no1.d dVar = mVar.f80555j;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
                gk2.f0 u03 = com.bumptech.glide.d.u0(dVar.f91666a.a(new p6(contactRequestId)));
                a0 a0Var = tk2.e.f118017c;
                fk2.g i14 = u03.r(a0Var).l(wj2.c.a()).i();
                Intrinsics.checkNotNullExpressionValue(i14, "ignoreElement(...)");
                l h10 = i14.l(a0Var).h(wj2.c.a());
                int i15 = bVar.f56070c;
                mVar.f80557l = h10.i(new kp.d(mVar, i15, contactRequestId), new jp.d(7, new kp.k(mVar, 4)));
                kp.f fVar = new kp.f();
                fVar.f80536a = i15;
                w wVar = bVar.f56073f;
                wVar.d(fVar);
                wVar.d(new kp.g(i15, null, contactRequestId));
                break;
            default:
                hq0.f fVar2 = ((iq0.g) obj).X0;
                if (fVar2 != null) {
                    fVar2.getPinalytics().N(f1.TAP, u0.CONVERSATION_SEND_A_PIN_USER_EMPTY_STATE_BUTTON, g0.CONVERSATION_SEND_A_PIN_USER_EMPTY_STATE, fVar2.f69926a, false);
                    fVar2.f69928c.d(new eq0.i());
                    break;
                }
                break;
        }
    }
}
