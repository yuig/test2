package p91;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z3;
import h32.f1;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qr1.f0;

/* loaded from: classes5.dex */
public final class j extends yk1.t {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f99294a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d pinalytics, uj2.q networkStateStream, m60.w eventManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f99294a = eventManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        l91.e view = (l91.e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.j) view).f78840m0 = this;
    }

    public final void p3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.LOGIN_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        k91.j jVar = (k91.j) ((l91.e) getView());
        lu1.b bVar = jVar.f78838k0;
        if (bVar == null) {
            Intrinsics.r("activityHelper");
            throw null;
        }
        FragmentActivity requireActivity = jVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.pinterest.EXTRA_BLOCK_AUTOLOGIN", true);
        Unit unit = Unit.f80348a;
        ((lu1.c) bVar).q(requireActivity, bundle);
    }

    public final void q3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ADD_BUSINESS_ACCOUNT_BTN, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        NavigationImpl w13 = Navigation.w1((ScreenLocation) z3.f51689o.getValue());
        w13.b("com.pinterest.EXTRA_SIGNUP_TYPE", f0.BUSINESS);
        this.f99294a.d(w13);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        l91.e view = (l91.e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.j) view).f78840m0 = this;
    }
}
