package defpackage;

import a41.r;
import b01.d;
import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutDetailsView;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubStatsRow;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.feature.board.detail.actions.view.BoardActionUpsellBannerView;
import com.pinterest.feature.board.detail.actions.view.PinShareUpsellBannerView;
import com.pinterest.feature.board.edit.view.BoardHeaderImagePreview;
import com.pinterest.feature.boardpreview.view.ShareBoardUpsellView;
import com.pinterest.feature.ideaPinCreation.drafts.view.IdeaPinDraftPreview;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.feature.pin.edit.view.AttributeCoverImagePreviewView;
import com.pinterest.feature.profile.boardlesspins.components.UnorganizedIdeasHeader;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHeader;
import com.pinterest.feature.storypin.closeup.view.AdsIdeaPinHorizontalActionBarView;
import com.pinterest.feature.storypin.closeup.view.AdsIdeaPinVerticalActionBarView;
import com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads.AdsIdeaPinUserView;
import gm1.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import om1.l;
import rn1.f;
import sf1.e1;
import wm1.i0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f4b;

    public /* synthetic */ a(int i13, Function0 function0) {
        this.f3a = i13;
        this.f4b = function0;
    }

    @Override // gm1.a
    public final void h3(c it) {
        int i13 = this.f3a;
        Function0 listActionClick = this.f4b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(listActionClick, "$listActionClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof i0) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(listActionClick, "$unblockButtonClick");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 2:
                int i14 = HeroCollagesCarouselCutoutDetailsView.f35457i;
                Intrinsics.checkNotNullParameter(it, "event");
                if ((it instanceof xl1.a) && listActionClick != null) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 3:
                int i15 = BaseModalViewWrapper.f44748j;
                Intrinsics.checkNotNullParameter(listActionClick, "$onClickAction");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 4:
                int i16 = CreatorHubStatsRow.f44814h;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 5:
                int i17 = PinterestToolTip.f44898p;
                Intrinsics.checkNotNullParameter(listActionClick, "$onClickListener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(listActionClick, "$onClickAction");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 7:
                int i18 = BoardActionUpsellBannerView.f45173n;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 8:
                int i19 = BoardActionUpsellBannerView.f45173n;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 9:
                int i23 = PinShareUpsellBannerView.f45180k;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 10:
                int i24 = BoardHeaderImagePreview.f45248g;
                Intrinsics.checkNotNullParameter(listActionClick, "$editListener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 11:
                int i25 = BoardHeaderImagePreview.f45248g;
                Intrinsics.checkNotNullParameter(listActionClick, "$deleteListener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 12:
                int i26 = ShareBoardUpsellView.f45345m;
                Intrinsics.checkNotNullParameter(listActionClick, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 13:
                int i27 = ShareBoardUpsellView.f45345m;
                Intrinsics.checkNotNullParameter(listActionClick, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 14:
                int i28 = IdeaPinDraftPreview.f46466h;
                Intrinsics.checkNotNullParameter(listActionClick, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 15:
                int i29 = d.f20726g;
                Intrinsics.checkNotNullParameter(listActionClick, "$actionClick");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 16:
                int i33 = d.f20726g;
                Intrinsics.checkNotNullParameter(listActionClick, "$actionClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 17:
                int i34 = AttributeActionView.f47161l;
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 18:
                int i35 = AttributeCoverImagePreviewView.f47188g;
                Intrinsics.checkNotNullParameter(listActionClick, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 19:
                int i36 = UnorganizedIdeasHeader.f47496c;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xl1.a) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 20:
                int i37 = r.P1;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xl1.a) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 21:
                int i38 = LegoEmptyStateView.f47533d;
                Intrinsics.checkNotNullParameter(listActionClick, "$onClickAction");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 22:
                int i39 = SearchTypeaheadHeader.f47854d;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof l) && listActionClick != null) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 23:
                int i43 = ma1.c.f86772h;
                Intrinsics.checkNotNullParameter(listActionClick, "$eventHandler");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 24:
                int i44 = AdsIdeaPinHorizontalActionBarView.f48539o;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
            case 25:
                int i45 = AdsIdeaPinHorizontalActionBarView.f48539o;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof f) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 26:
                int i46 = AdsIdeaPinVerticalActionBarView.f48554c;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 27:
                int i47 = AdsIdeaPinVerticalActionBarView.f48554c;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof l) {
                    listActionClick.invoke();
                    break;
                }
                break;
            case 28:
                int i48 = e1.T;
                Intrinsics.checkNotNullParameter(listActionClick, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof f) {
                    listActionClick.invoke();
                    break;
                }
                break;
            default:
                int i49 = AdsIdeaPinUserView.f49736f;
                Intrinsics.checkNotNullParameter(listActionClick, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                listActionClick.invoke();
                break;
        }
    }
}
