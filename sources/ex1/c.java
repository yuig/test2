package ex1;

import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.PinsListEmptyView;
import com.pinterest.partnerAnalytics.feature.audience.top.categories.AudienceTopCategoriesView;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinStatsBusinessAccountUpsell;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.SaveToBoardCard;
import com.pinterest.ui.actionbar.LegoActionBar;
import com.pinterest.ui.components.banners.LegoBannerView;
import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rl1.t;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f60388b;

    public /* synthetic */ c(int i13, Function0 function0) {
        this.f60387a = i13;
        this.f60388b = function0;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f60387a;
        Function0 createPinAction = this.f60388b;
        switch (i13) {
            case 0:
                int i14 = PinsListEmptyView.f50120d;
                Intrinsics.checkNotNullParameter(createPinAction, "$createPinAction");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 1:
                int i15 = AudienceTopCategoriesView.f50148g;
                Intrinsics.checkNotNullParameter(createPinAction, "$callBack");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 2:
                int i16 = TopLocationsView.f50155j;
                Intrinsics.checkNotNullParameter(createPinAction, "$onClick");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 3:
                int i17 = PinStatsBusinessAccountUpsell.f50218b;
                Intrinsics.checkNotNullParameter(createPinAction, "$onClickListener");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 4:
                int i18 = SaveToBoardCard.f50223f;
                Intrinsics.checkNotNullParameter(createPinAction, "$seeAllAction");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 5:
                int i19 = LegoActionBar.f52202h;
                Intrinsics.checkNotNullParameter(createPinAction, "$actionHandler");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 6:
                int i23 = LegoBannerView.A;
                Intrinsics.checkNotNullParameter(createPinAction, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    createPinAction.invoke();
                    break;
                }
                break;
            case 7:
                int i24 = LegoUserRep.A;
                Intrinsics.checkNotNullParameter(createPinAction, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    createPinAction.invoke();
                    break;
                }
                break;
            case 8:
                int i25 = LegoUserRep.A;
                Intrinsics.checkNotNullParameter(createPinAction, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                createPinAction.invoke();
                break;
            case 9:
                int i26 = LegoUserRep.A;
                Intrinsics.checkNotNullParameter(createPinAction, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    createPinAction.invoke();
                    break;
                }
                break;
            default:
                int i27 = LegoUserRep.A;
                Intrinsics.checkNotNullParameter(createPinAction, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof t) {
                    createPinAction.invoke();
                    break;
                }
                break;
        }
    }
}
