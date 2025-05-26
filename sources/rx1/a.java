package rx1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes4.dex */
public final class a extends t {

    /* renamed from: a, reason: collision with root package name */
    public final w f110198a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d presenterPinalytics, q networkStateStream, w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f110198a = eventManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        c view = (c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((d) view).f110205x0 = this;
    }

    public final void p3(nl1.d fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_FILTER_MENU_BUTTON, (r18 & 4) != 0 ? null : g0.ANALYTICS_MOBILE_HEADER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f110198a.d(Navigation.w1(PartnerAnalyticsLocation.ANALYTICS_FILTER));
    }

    public final void q3(qx1.d tabPosition) {
        Intrinsics.checkNotNullParameter(tabPosition, "tabPosition");
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : tabPosition.getElementType(), (r18 & 4) != 0 ? null : g0.ANALYTICS_TABS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        c view = (c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((d) view).f110205x0 = this;
    }
}
