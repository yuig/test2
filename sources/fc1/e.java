package fc1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ap.o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.settings.SettingsRoundHeaderView;
import ec1.j;
import h32.a4;
import h32.d4;
import i92.k;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.r3;
import m60.w;
import pk.a0;
import uj2.q;
import x02.x2;
import xk2.m;
import xk2.v;
import yf0.h;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfc1/e;", "Lyq0/b0;", "", "Lcom/pinterest/feature/settings/privacydata/a;", "<init>", "()V", "privacyData_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a<Object> implements com.pinterest.feature.settings.privacydata.a {
    public static final /* synthetic */ int P0 = 0;
    public uk1.e A0;
    public x10.d B0;
    public vb0.c C0;
    public o D0;
    public cr1.a E0;
    public oc.c F0;
    public kc2.a G0;
    public r3 H0;
    public SettingsRoundHeaderView I0;
    public j K0;
    public View L0;

    /* renamed from: z0, reason: collision with root package name */
    public k f61738z0;
    public Function1 J0 = c.f61733j;
    public final v M0 = m.b(new b(this, 0));
    public final d4 N0 = d4.SETTINGS;
    public final a4 O0 = a4.PRIVACY_AND_DATA_SETTINGS;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        View view = this.L0;
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
            this.J0.invoke(string);
        }
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(3, new b(this, 1));
        adapter.G(8, new b(this, 2));
        adapter.G(0, new b(this, 3));
        adapter.G(1, new b(this, 4));
        adapter.G(2, new b(this, 5));
        adapter.G(16, new b(this, 6));
    }

    @Override // nl1.d
    public final void S6(h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        View findViewById = fragmentRootView.findViewById(c52.c.bottom_sheet_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        c3.n(findViewById, false);
        RecyclerView g83 = g8();
        if (g83 != null) {
            u2.z(g83);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        q p73 = p7();
        w f73 = f7();
        k kVar = this.f61738z0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        x2 A7 = A7();
        o oVar = this.D0;
        if (oVar == null) {
            Intrinsics.r("uploadContactsUtil");
            throw null;
        }
        x10.d dVar = this.B0;
        if (dVar == null) {
            Intrinsics.r("settingsApi");
            throw null;
        }
        vb0.c cVar = this.C0;
        if (cVar == null) {
            Intrinsics.r("applicationUtils");
            throw null;
        }
        oc.c cVar2 = this.F0;
        if (cVar2 == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        cr1.a aVar2 = this.E0;
        if (aVar2 == null) {
            Intrinsics.r("accountService");
            throw null;
        }
        r3 r3Var = this.H0;
        if (r3Var == null) {
            Intrinsics.r("settingsPrivacyDataExperiments");
            throw null;
        }
        kc2.a aVar3 = this.G0;
        if (aVar3 != null) {
            return new j(g13, p73, f73, kVar, aVar, A7, oVar, dVar, cVar, cVar2, aVar2, r3Var, aVar3);
        }
        Intrinsics.r("videoPreferences");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getU0() {
        return this.O0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getS0() {
        return this.N0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // fc1.a, nl1.d, androidx.fragment.app.Fragment
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

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        this.I0 = settingsRoundHeaderView;
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.g0(new x91.k(this, 27));
            settingsRoundHeaderView.k0(i52.c.settings_privacy_data_title);
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
        b8(new cc1.c(this, 1));
        View findViewById = onCreateView.findViewById(c52.c.settings_menu_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.L0 = findViewById;
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.K0 = null;
        super.onDestroyView();
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
}
