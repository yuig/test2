package wa1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.c4;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class a extends t {

    /* renamed from: a, reason: collision with root package name */
    public final w f128629a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d pinalytics, q networkStateStream, w eventManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f128629a = eventManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        va1.g view = (va1.g) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((xa1.t) view).f134482k0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((xa1.t) ((va1.g) getView())).f134482k0 = null;
        super.onUnbind();
    }

    public final void p3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.PRIVACY_BLOCKER_CONFIRM_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        xa1.t tVar = (xa1.t) ((va1.g) getView());
        rg0.n nVar = tVar.f134485n0;
        if (nVar == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        nVar.a(null, null);
        tVar.D5();
    }

    public final void q3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.PRIVACY_BLOCKER_MANAGE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f128629a.d(Navigation.w1((ScreenLocation) c4.f50630a.getValue()));
        xa1.t tVar = (xa1.t) ((va1.g) getView());
        rg0.n nVar = tVar.f134485n0;
        if (nVar == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        nVar.a(null, null);
        tVar.D5();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        va1.g view = (va1.g) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((xa1.t) view).f134482k0 = this;
    }
}
