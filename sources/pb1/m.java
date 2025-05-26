package pb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.g0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpb1/m;", "Lnl1/d;", "<init>", "()V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class m extends nl1.d {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f99466f0 = 0;
    public com.pinterest.feature.settings.passcode.d X = com.pinterest.feature.settings.passcode.d.VERIFY;
    public LinearLayout Y;
    public GestaltText Z;

    /* renamed from: a0, reason: collision with root package name */
    public GestaltButton f99467a0;

    /* renamed from: b0, reason: collision with root package name */
    public GestaltTextField f99468b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f99469c0;

    /* renamed from: d0, reason: collision with root package name */
    public ScrollView f99470d0;

    /* renamed from: e0, reason: collision with root package name */
    public final k f99471e0;

    public m() {
        xk2.m.b(new h81.b(this, 13));
        this.f99471e0 = new k(this);
    }

    @Override // nl1.d
    public final void K7() {
        Window window;
        super.K7();
        View view = this.f99469c0;
        if (view == null) {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
        bs1.c.M1(view);
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        f7().h(this.f99471e0);
    }

    public final GestaltTextField V7() {
        GestaltTextField gestaltTextField = this.f99468b0;
        if (gestaltTextField != null) {
            return gestaltTextField;
        }
        Intrinsics.r("passcodeEditTextInput");
        throw null;
    }

    public final void W7(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        LinearLayout linearLayout = this.Y;
        int i13 = 0;
        if (linearLayout != null) {
            linearLayout.setVisibility(displayState.f() ? 0 : 8);
        }
        GestaltButton gestaltButton = this.f99467a0;
        if (gestaltButton == null) {
            Intrinsics.r("setPasscodeButton");
            throw null;
        }
        gestaltButton.d(new l(displayState, i13));
        V7().X(new l(displayState, 1));
    }

    @Override // nl1.d, nx.i1
    public final g0 b2() {
        int i13 = j.f99462a[this.X.ordinal()];
        if (i13 == 1) {
            return g0.PASSCODE_REQUIRED_MODAL;
        }
        if (i13 == 2) {
            return g0.PARENTAL_PASSCODE_DISABLING;
        }
        if (i13 == 3) {
            return g0.PASSWORD_RESET_PAGE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void deactivate() {
        Window window;
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        f7().j(this.f99471e0);
        super.deactivate();
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public boolean getF103154e0() {
        hf0.b.k(getView());
        nl1.d.J7();
        return false;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = c52.d.fragment_passcode_required;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(c52.c.scroll);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f99470d0 = (ScrollView) findViewById;
        View findViewById2 = onCreateView.findViewById(c52.c.gt_passcode_required_enter_code);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.Z = gestaltText;
        View findViewById3 = onCreateView.findViewById(c52.c.set_passcode_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f99467a0 = gestaltButton;
        View findViewById4 = onCreateView.findViewById(c52.c.eidtv_enter_code_required);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltTextField, "<set-?>");
        this.f99468b0 = gestaltTextField;
        this.Y = (LinearLayout) onCreateView.findViewById(c52.c.passcode_curtain);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view_passcode);
        settingsRoundHeaderView.k0(c52.e.settings_account_management_parental_passcode_title);
        settingsRoundHeaderView.g0(new x91.k(this, 16));
        settingsRoundHeaderView.d0(rm1.q.CANCEL);
        View findViewById5 = onCreateView.findViewById(c52.c.bottom_sheet_view_passcode);
        if (findViewById5 != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById5);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            findViewById5.requestLayout();
        }
        View findViewById6 = onCreateView.findViewById(c52.c.settings_menu_container_passcode);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f99469c0 = findViewById6;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltText gestaltText = this.Z;
        if (gestaltText != null) {
            gestaltText.i(new y0(this, 5));
        } else {
            Intrinsics.r("passcodeSubtitle");
            throw null;
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(t0.toolbar);
    }
}
