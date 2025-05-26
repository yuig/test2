package tb1;

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
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import dv0.q;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import n91.z;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb1/h;", "Lyk1/k;", "Lcom/pinterest/feature/settings/passcode/e;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h extends a implements com.pinterest.feature.settings.passcode.e, View.OnClickListener {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f117139z0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public z f117140j0;

    /* renamed from: k0, reason: collision with root package name */
    public i92.k f117141k0;

    /* renamed from: l0, reason: collision with root package name */
    public q f117142l0;

    /* renamed from: m0, reason: collision with root package name */
    public x10.a f117143m0;

    /* renamed from: n0, reason: collision with root package name */
    public LinearLayout f117144n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton f117145o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltTextField f117146p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f117147q0;

    /* renamed from: r0, reason: collision with root package name */
    public ScrollView f117148r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.pinterest.feature.settings.passcode.c f117149s0 = com.pinterest.feature.settings.passcode.c.VERIFY;

    /* renamed from: t0, reason: collision with root package name */
    public final f f117150t0;

    /* renamed from: u0, reason: collision with root package name */
    public final d4 f117151u0;

    /* renamed from: v0, reason: collision with root package name */
    public final a4 f117152v0;

    /* renamed from: w0, reason: collision with root package name */
    public final v f117153w0;

    /* renamed from: x0, reason: collision with root package name */
    public uk1.e f117154x0;

    /* renamed from: y0, reason: collision with root package name */
    public ob1.b f117155y0;

    public h() {
        m.b(new e(this, 1));
        this.f117150t0 = new f(this);
        this.f117151u0 = d4.SETTINGS;
        this.f117152v0 = a4.PARENTAL_PASSCODE_SETTINGS;
        this.f117153w0 = m.b(new e(this, 0));
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        View view = this.f117147q0;
        if (view == null) {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
        bs1.c.M1(view);
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        f7().h(this.f117150t0);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        if (this.f117140j0 == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f117154x0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        x10.a aVar = this.f117143m0;
        if (aVar != null) {
            return z.a(g13, p73, aVar);
        }
        Intrinsics.r("passcodeApiService");
        throw null;
    }

    public final i92.k b8() {
        i92.k kVar = this.f117141k0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void deactivate() {
        Window window;
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        f7().j(this.f117150t0);
        super.deactivate();
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        hf0.b.k(getView());
        s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DISMISS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final g0 getF53240t0() {
        return (g0) this.f117153w0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getH0() {
        return this.f117152v0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f117151u0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ob1.b bVar;
        n.a(view);
        s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CONTINUE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        LinearLayout linearLayout = this.f117144n0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        View view2 = getView();
        if (view2 != null) {
            hf0.b.k(view2);
        }
        q qVar = this.f117142l0;
        if (qVar == null) {
            Intrinsics.r("passcodeDelegate");
            throw null;
        }
        String e13 = qVar.e();
        if (e13 == null || (bVar = this.f117155y0) == null) {
            return;
        }
        bVar.q3(e13, this.f117149s0);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = c52.d.fragment_passcode_required;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(c52.c.scroll);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f117148r0 = (ScrollView) findViewById;
        View findViewById2 = onCreateView.findViewById(c52.c.set_passcode_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        this.f117145o0 = gestaltButton;
        if (gestaltButton == null) {
            Intrinsics.r("setPasscodeButton");
            throw null;
        }
        gestaltButton.e(new c(this, 2));
        View findViewById3 = onCreateView.findViewById(c52.c.eidtv_enter_code_required);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f117146p0 = (GestaltTextField) findViewById3;
        this.f117144n0 = (LinearLayout) onCreateView.findViewById(c52.c.passcode_curtain);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view_passcode);
        settingsRoundHeaderView.k0(c52.e.settings_account_management_parental_passcode_title);
        settingsRoundHeaderView.g0(new x91.k(this, 19));
        settingsRoundHeaderView.d0(rm1.q.CANCEL);
        View findViewById4 = onCreateView.findViewById(c52.c.bottom_sheet_view_passcode);
        if (findViewById4 != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById4);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            findViewById4.requestLayout();
        }
        View findViewById5 = onCreateView.findViewById(c52.c.settings_menu_container_passcode);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f117147q0 = findViewById5;
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_PASSCODE_MODE") : null;
        com.pinterest.feature.settings.passcode.c cVar = i03 instanceof com.pinterest.feature.settings.passcode.c ? (com.pinterest.feature.settings.passcode.c) i03 : null;
        if (cVar == null) {
            cVar = com.pinterest.feature.settings.passcode.c.VERIFY;
        }
        this.f117149s0 = cVar;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((GestaltText) view.findViewById(c52.c.gt_passcode_required_enter_code)).i(new y0(this, 10)).j(new c(this, 0));
        GestaltTextField gestaltTextField = this.f117146p0;
        if (gestaltTextField != null) {
            gestaltTextField.Z(new c(this, 1));
        } else {
            Intrinsics.r("passcodeEditTextInput");
            throw null;
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(t0.toolbar);
    }
}
