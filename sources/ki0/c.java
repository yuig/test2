package ki0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.account.view.AvailableAccountsView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import i92.k;
import kh2.c3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import rq.o3;
import tq.j;
import uj2.q;
import yf0.h;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lki0/c;", "Lyk1/k;", "Lei0/a;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends f implements ei0.a {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f79783s0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public mo1.d f79784j0;

    /* renamed from: k0, reason: collision with root package name */
    public k f79785k0;

    /* renamed from: l0, reason: collision with root package name */
    public uk1.e f79786l0;

    /* renamed from: m0, reason: collision with root package name */
    public UserDeserializer f79787m0;

    /* renamed from: n0, reason: collision with root package name */
    public mr1.a f79788n0;

    /* renamed from: o0, reason: collision with root package name */
    public fi0.c f79789o0;

    /* renamed from: p0, reason: collision with root package name */
    public AvailableAccountsView f79790p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f79791q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f79792r0 = d4.ACCOUNT_SWITCHER;

    @Override // nl1.d
    public final void S6(h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        RelativeLayout relativeLayout = (RelativeLayout) fragmentRootView.findViewById(b52.a.bottom_sheet_view);
        if (relativeLayout != null) {
            c3.n(relativeLayout, false);
        }
    }

    @Override // yk1.k
    public final m V7() {
        uk1.e eVar = this.f79786l0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        q p73 = p7();
        UserDeserializer userDeserializer = this.f79787m0;
        if (userDeserializer == null) {
            Intrinsics.r("userDeserializer");
            throw null;
        }
        mr1.a aVar = this.f79788n0;
        if (aVar == null) {
            Intrinsics.r("accountSwitcher");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        mr1.b m13 = bs1.c.m(requireActivity);
        mo1.d dVar = this.f79784j0;
        if (dVar != null) {
            return new fi0.c(f13, p73, userDeserializer, aVar, m13, dVar, getActiveUserManager());
        }
        Intrinsics.r("intentHelper");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getK0() {
        return this.f79792r0;
    }

    @Override // ki0.f, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LayoutInflater.Factory requireActivity = requireActivity();
        yf0.f fVar = requireActivity instanceof yf0.f ? (yf0.f) requireActivity : null;
        if ((fVar != null ? fVar.getEdgeToEdgeConfiguration() : null) instanceof yf0.c) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            c3.t(requireActivity2, false);
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_account_switcher_bottom_sheet;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(b52.a.header_view);
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.k0(b52.c.account_switcher_toolbar_title);
            settingsRoundHeaderView.g0(new j(this, 26));
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(b52.a.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        View findViewById = onCreateView.findViewById(b52.a.available_accounts_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f79790p0 = (AvailableAccountsView) findViewById;
        View findViewById2 = onCreateView.findViewById(b52.a.account_switcher_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f79791q0 = (GestaltText) findViewById2;
        ((GestaltButton) onCreateView.findViewById(b52.a.add_account_button)).d(a.f79779j).e(new yb0.b(this, 15));
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        LayoutInflater.Factory requireActivity = requireActivity();
        yf0.f fVar = requireActivity instanceof yf0.f ? (yf0.f) requireActivity : null;
        if ((fVar != null ? fVar.getEdgeToEdgeConfiguration() : null) instanceof yf0.c) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.f(requireActivity2);
            c3.t(requireActivity2, !a0.q0(requireActivity2));
        }
        super.onDetach();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s7().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.ACCOUNT_SWITCHER_OPEN_SETTINGS_BTN, (r18 & 4) != 0 ? null : g0.ACCOUNT_SWITCHER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        AvailableAccountsView availableAccountsView = this.f79790p0;
        if (availableAccountsView == null) {
            Intrinsics.r("availableAccountsView");
            throw null;
        }
        availableAccountsView.L(new b(this));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltText gestaltText = this.f79791q0;
        if (gestaltText == null) {
            Intrinsics.r("accountSwitcherDescriptionView");
            throw null;
        }
        String string = getString(b52.c.account_switcher_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(b52.c.account_switcher_account_settings_link);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        f0.h.o(requireContext, gestaltText, string, string2, new o3(this, 2));
        GestaltText gestaltText2 = this.f79791q0;
        if (gestaltText2 != null) {
            gestaltText2.i(a.f79780k);
        } else {
            Intrinsics.r("accountSwitcherDescriptionView");
            throw null;
        }
    }
}
