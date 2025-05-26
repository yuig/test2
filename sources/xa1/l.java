package xa1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.settings.shared.view.SettingsEducationOverlay;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.settings.SettingsRoundHeaderView;
import df.j1;
import h32.d4;
import h32.g0;
import h32.u0;
import java.util.List;
import java.util.WeakHashMap;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.e0;
import m60.x0;
import pk.a0;
import rq.o0;
import so.n3;
import va1.c1;
import va1.d1;
import va1.e1;
import va1.f1;
import va1.k0;
import va1.k1;
import va1.s0;
import va1.t0;
import va1.v0;
import va1.z0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxa1/l;", "Lyq0/b0;", "", "Lcom/pinterest/feature/settings/menu/b;", "<init>", "()V", "n91/z", "menu_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l extends c<Object> implements com.pinterest.feature.settings.menu.b {
    public static final /* synthetic */ int O0 = 0;
    public mr1.a A0;
    public lu1.b B0;
    public i92.k C0;
    public n3 D0;
    public lh0.n3 E0;
    public com.pinterest.feature.settings.menu.a H0;
    public View I0;
    public SettingsEducationOverlay J0;
    public float K0;
    public boolean M0;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f134458z0;
    public final xk2.v F0 = xk2.m.b(new j(this, 0));
    public final xk2.v G0 = xk2.m.b(new j(this, 2));
    public final List L0 = f0.j(Integer.valueOf(v0.f125251f.getId()), Integer.valueOf(z0.f125291f.getId()), Integer.valueOf(s0.f125237f.getId()), Integer.valueOf(va1.y.f125278f.getId()));
    public final d4 N0 = d4.SETTINGS;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void U8(l lVar, e1 e1Var) {
        lVar.getClass();
        if (e1Var instanceof f1) {
            com.pinterest.feature.settings.menu.a aVar = lVar.H0;
            if (aVar != null) {
                ((wa1.k) aVar).w3((f1) e1Var);
                return;
            }
            return;
        }
        if (e1Var instanceof va1.q) {
            int i13 = 1;
            if (i.f134454a[((va1.q) e1Var).j().ordinal()] == 1) {
                lVar.f7().d(new y42.e(new j(lVar, i13)));
                return;
            }
            return;
        }
        if (e1Var instanceof va1.u) {
            k1 j13 = ((va1.u) e1Var).j();
            Context requireContext = lVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            String V = j1.V(j13.a(requireContext), e0.a());
            if (e1Var instanceof c1) {
                lVar.V8(V, u0.TEEN_SAFETY_RESOURCES_LINK);
                return;
            }
            if (e1Var instanceof k0) {
                lVar.V8(V, u0.SUPPORT_BUTTON);
            } else if (e1Var instanceof d1) {
                lVar.V8(V, u0.TOS_BUTTON);
            } else if (e1Var instanceof t0) {
                lVar.V8(V, u0.PRIVACY_LINK);
            }
        }
    }

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

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new j(this, 3));
        adapter.H(new int[]{8, 13, 2}, new j(this, 4));
        adapter.G(19, new j(this, 5));
        adapter.G(20, new j(this, 6));
        if (this.M0) {
            adapter.G(23, new j(this, 7));
        }
    }

    @Override // nl1.d
    public final void S6(yf0.h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        RelativeLayout relativeLayout = (RelativeLayout) fragmentRootView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            c3.m(relativeLayout, false);
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
        gestaltToolbarImpl.b0(getResources().getString(x0.settings));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        n3 n3Var = this.D0;
        if (n3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f134458z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return n3Var.a(g13, bs1.c.m(requireActivity), com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_USE_PROFILE_PREVIEW", false), com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_ALLOW_CREATOR_HUB_ENTRY_POINTS", false));
    }

    public final void V8(String str, u0 u0Var) {
        s7().F(g0.NAVIGATION, u0Var);
        lu1.b bVar = this.B0;
        if (bVar == null) {
            Intrinsics.r("baseActivityHelper");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ((lu1.c) bVar).m(requireContext, str);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        SettingsEducationOverlay settingsEducationOverlay = this.J0;
        if (settingsEducationOverlay == null) {
            Intrinsics.r("settingsEducationOverlay");
            throw null;
        }
        if (!bs1.c.o1(settingsEducationOverlay)) {
            nl1.d.J7();
            return false;
        }
        SettingsEducationOverlay settingsEducationOverlay2 = this.J0;
        if (settingsEducationOverlay2 != null) {
            settingsEducationOverlay2.a();
            return true;
        }
        Intrinsics.r("settingsEducationOverlay");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF84302r0() {
        return this.N0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // xa1.c, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        FragmentActivity E4;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_USE_MODAL_DISPLAY", true) && (E4 = E4()) != null) {
            a0.D(E4);
        }
        lh0.n3 n3Var = this.E0;
        if (n3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        n3Var.b();
        lh0.n3 n3Var2 = this.E0;
        if (n3Var2 != null) {
            this.M0 = n3Var2.a();
        } else {
            Intrinsics.r("experiments");
            throw null;
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.K0 = bundle != null ? bundle.getFloat("BOTTOM_NAV_PRE_CONFIG_CHANGE_HEIGHT") : 0.0f;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(c52.c.settings_menu_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.I0 = findViewById;
        View findViewById2 = onCreateView.findViewById(c52.c.settings_education_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.J0 = (SettingsEducationOverlay) findViewById2;
        View findViewById3 = onCreateView.findViewById(c52.c.bottom_sheet_view);
        xk2.v vVar = this.G0;
        if (findViewById3 != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById3);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.g0();
            lockableBottomSheetBehavior.X(3);
            if (!com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_USE_MODAL_DISPLAY", true)) {
                findViewById3.setBackgroundColor(((Number) vVar.getValue()).intValue());
            }
            findViewById3.requestLayout();
        }
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            if (!com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_USE_MODAL_DISPLAY", true)) {
                RecyclerView g83 = g8();
                onCreateView.setBackground(null);
                onCreateView.setPaddingRelative(onCreateView.getPaddingStart(), 0, onCreateView.getPaddingEnd(), onCreateView.getPaddingBottom());
                settingsRoundHeaderView.setBackground(null);
                settingsRoundHeaderView.setElevation(0.0f);
                settingsRoundHeaderView.setBackgroundColor(((Number) vVar.getValue()).intValue());
                settingsRoundHeaderView.X();
                if (g83 != null) {
                    g83.setBackgroundColor(((Number) vVar.getValue()).intValue());
                }
            }
            settingsRoundHeaderView.k0(com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_USE_PROFILE_PREVIEW", false) ? c52.e.account : c52.e.settings);
            settingsRoundHeaderView.g0(new x91.k(this, 5));
            b8(new o0(3, settingsRoundHeaderView, this));
        }
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        FragmentActivity E4;
        if (com.bumptech.glide.d.G(this, "SETTINGS_EXTRAS_KEY_USE_MODAL_DISPLAY", true) && (E4 = E4()) != null) {
            a0.d1(E4);
        }
        super.onDetach();
    }

    @Override // yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putFloat("BOTTOM_NAV_PRE_CONFIG_CHANGE_HEIGHT", this.K0);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = this.I0;
        if (view2 == null) {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.k0.c(view2);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            m60.f0 f0Var = r70.b.f106349i;
            if (((int) f0Var.k0().b()) != 0) {
                this.K0 = f0Var.k0().b();
            }
            k3.v((int) this.K0, g83);
        }
    }
}
