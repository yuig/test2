package hc1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.search.results.view.b0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import java.util.List;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s3;
import m60.w;
import n00.s;
import pk.a0;
import so.oa;
import uj2.q;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhc1/n;", "Lyq0/b0;", "", "Lgc1/b;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class n extends c<Object> implements gc1.b {
    public static final /* synthetic */ int O0 = 0;
    public bq.c A0;
    public uk1.e B0;
    public lu1.b C0;
    public s D0;
    public c2 E0;
    public s3 F0;
    public GestaltButton G0;
    public int H0;
    public jc1.g I0;
    public jc1.g J0;
    public View K0;
    public final q01.o L0 = new q01.o(this, 1);
    public final d4 M0 = d4.SETTINGS;
    public final a4 N0 = a4.USER_SELF;

    /* renamed from: z0, reason: collision with root package name */
    public oc.c f68731z0;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            this.H0 = window.getAttributes().softInputMode;
            window.setSoftInputMode(16);
        }
        View view = this.K0;
        if (view != null) {
            bs1.c.M1(view);
        } else {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.H0);
            }
            hf0.b.l(E4);
        }
        super.L7();
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        String string;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "973459") && result.containsKey("pronouns")) {
            String[] stringArray = result.getStringArray("pronouns");
            List b03 = stringArray != null ? c0.b0(stringArray) : null;
            if (b03 != null) {
                jc1.g gVar = this.J0;
                if (gVar == null) {
                    Intrinsics.r("viewListener");
                    throw null;
                }
                gVar.F3(b03);
            }
        }
        if (Intrinsics.d(code, "edit_about_result_code") && result.containsKey("edit_about_result_key") && (string = result.getString("edit_about_result_key")) != null) {
            jc1.g gVar2 = this.J0;
            if (gVar2 != null) {
                gVar2.B3(string);
            } else {
                Intrinsics.r("viewListener");
                throw null;
            }
        }
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new l(requireContext, this, 0));
        adapter.G(7, new b0(requireContext, 26));
        adapter.G(6, new l(requireContext, this, 1));
        adapter.G(8, new l(requireContext, this, 2));
        adapter.G(2, new l(requireContext, this, 3));
        adapter.G(0, new l(requireContext, this, 4));
        adapter.G(5, new l(requireContext, this, 5));
        adapter.G(4, new b0(requireContext, 27));
        adapter.G(9, new b0(requireContext, 28));
    }

    @Override // nl1.d
    public final void S6(yf0.h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        RelativeLayout relativeLayout = (RelativeLayout) fragmentRootView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            c3.n(relativeLayout, false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            u2.z(g83);
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(j52.c.settings_menu_edit_profile));
        gestaltToolbarImpl.m();
        GestaltButton gestaltButton = this.G0;
        if (gestaltButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        gestaltToolbarImpl.c(gestaltButton);
        V8(false);
    }

    public final void U8(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        hf0.b.l(requireActivity());
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(message);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        d4 f49944f;
        Navigation navigation = this.I;
        d4 d4Var = (navigation == null || (f49944f = navigation.getF49944f()) == null) ? null : f49944f;
        oc.c cVar = this.f68731z0;
        if (cVar == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        w f73 = f7();
        bq.c cVar2 = this.A0;
        if (cVar2 == null) {
            Intrinsics.r("boardSortUtils");
            throw null;
        }
        uk1.e eVar = this.B0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        q p73 = p7();
        s sVar = this.D0;
        if (sVar != null) {
            return new jc1.g(cVar, aVar, f73, cVar2, d4Var, com.bumptech.glide.d.G(this, "EXTRAS_KEY_SHOW_PROFILE_LAYOUT_OPTION", false), g13, p73, sVar);
        }
        Intrinsics.r("profilePronounsEligibilityChecker");
        throw null;
    }

    public final void V8(boolean z13) {
        GestaltButton gestaltButton = this.G0;
        if (gestaltButton != null) {
            gestaltButton.d(new u81.h(z13, 28));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        jc1.g gVar = this.I0;
        if (gVar == null) {
            return true;
        }
        gVar.t3();
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF84417b1() {
        return this.N0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF84416a1() {
        return this.M0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        String stringExtra;
        super.onActivityResult(i13, i14, intent);
        if (i14 != 975 || intent == null || (stringExtra = intent.getStringExtra("com.pinterest.EXTRA_PHOTO_PATH")) == null) {
            return;
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        lu1.b bVar = this.C0;
        if (bVar == null) {
            Intrinsics.r("baseActivityHelper");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intent b13 = ((lu1.c) bVar).f84972b.b(context, lu1.a.USER_SET_ACTIVITY);
        b13.setFlags(603979776);
        b13.putExtra("com.pinterest.EXTRA_PHOTO_PATH", stringExtra);
        context.startActivity(b13);
    }

    @Override // hc1.c, nl1.d, androidx.fragment.app.Fragment
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
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.G0 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(h.f68717k).e(new ca1.h(this, 8));
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.d0(rm1.q.ARROW_BACK);
            settingsRoundHeaderView.g0(new x91.k(this, 28));
            settingsRoundHeaderView.k0(j52.c.settings_menu_edit_profile);
            settingsRoundHeaderView.setElevation(0.0f);
            GestaltButton gestaltButton = this.G0;
            if (gestaltButton == null) {
                Intrinsics.r("doneButton");
                throw null;
            }
            settingsRoundHeaderView.T(gestaltButton);
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
        this.K0 = findViewById;
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

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        L8();
        RecyclerView g83 = g8();
        Intrinsics.f(g83);
        k3.v((int) r70.b.f106349i.k0().b(), g83);
    }
}
