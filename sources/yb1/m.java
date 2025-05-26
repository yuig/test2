package yb1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.qv;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.g4;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.p3;
import m60.w;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyb1/m;", "Lyq0/b0;", "", "Lcom/pinterest/feature/settings/permissions/b;", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class m extends c<Object> implements com.pinterest.feature.settings.permissions.b {
    public static final /* synthetic */ int J0 = 0;
    public uk1.e A0;
    public x10.d B0;
    public p3 C0;
    public qv D0;
    public com.pinterest.feature.settings.permissions.a F0;
    public View I0;

    /* renamed from: z0, reason: collision with root package name */
    public i92.k f138568z0;
    public Function1 E0 = e.f138556k;
    public final d4 G0 = d4.SETTINGS;
    public final a4 H0 = a4.PERMISSIONS_SETTINGS;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        View view = this.I0;
        if (view != null) {
            bs1.c.M1(view);
        } else {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "passcode_screen_code")) {
            boolean z13 = result.getBoolean("is_passcode_verified");
            String string = result.getString("passcode_verified");
            if (!z13 || string == null) {
                return;
            }
            this.E0.invoke(string);
        }
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new l(this, 0));
        adapter.G(0, new l(this, 1));
        adapter.G(0, new l(this, 2));
        adapter.G(17, new l(this, 3));
        adapter.G(22, new l(this, 4));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_MESSAGING_GROUP") : null;
        Intrinsics.g(i03, "null cannot be cast to non-null type com.pinterest.api.model.MessagingPermissionsGroup");
        qv qvVar = (qv) i03;
        this.D0 = qvVar;
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        w f73 = f7();
        x10.d dVar = this.B0;
        if (dVar == null) {
            Intrinsics.r("settingsApi");
            throw null;
        }
        i92.k kVar = this.f138568z0;
        if (kVar != null) {
            return new xb1.f(qvVar, g13, p73, f73, dVar, kVar, new yk1.a(getResources(), requireContext().getTheme()), A7());
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        hf0.b.k(getView());
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF20758n1() {
        return this.H0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF20757m1() {
        return this.G0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.d0(rm1.q.ARROW_BACK);
            settingsRoundHeaderView.g0(new x91.k(this, 24));
            qv qvVar = this.D0;
            if (qvVar == null) {
                Intrinsics.r("messagingGroup");
                throw null;
            }
            qv.a g13 = qvVar.g();
            Intrinsics.f(g13);
            settingsRoundHeaderView.k0(wb1.w.a(g13));
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        View findViewById = onCreateView.findViewById(c52.c.settings_menu_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.I0 = findViewById;
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        L8();
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
        }
    }

    @Override // com.pinterest.feature.settings.permissions.b
    public final void x5(com.pinterest.feature.settings.permissions.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.F0 = listener;
    }

    @Override // com.pinterest.feature.settings.permissions.b
    public final void y6(Function1 onPasscodeVerified) {
        Intrinsics.checkNotNullParameter(onPasscodeVerified, "onPasscodeVerified");
        p3 p3Var = this.C0;
        if (p3Var == null) {
            Intrinsics.r("settingsPermissionsExperiments");
            throw null;
        }
        NavigationImpl w13 = Navigation.w1(p3Var.a() ? g4.b() : g4.a());
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        M1(w13);
        this.E0 = onPasscodeVerified;
    }

    @Override // com.pinterest.feature.settings.permissions.b
    public final void z3(Function0 onUserConfirmedSkip) {
        Intrinsics.checkNotNullParameter(onUserConfirmedSkip, "onUserConfirmedSkip");
        w f73 = f7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        f73.d(new yb0.e(r91.b.a(requireContext, b7(), onUserConfirmedSkip)));
    }
}
