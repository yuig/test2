package cc1;

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
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.q3;
import ll.j;
import m60.w;
import pk.a0;
import uj2.q;
import x02.x2;
import x91.k;
import xk2.m;
import xk2.v;
import yf0.h;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcc1/d;", "Lyq0/b0;", "", "Lzb1/a;", "<init>", "()V", "personalInformation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a<Object> implements zb1.a {
    public static final /* synthetic */ int J0 = 0;
    public oc.c A0;
    public bc1.d B0;
    public SettingsRoundHeaderView C0;
    public View D0;
    public q3 E0;
    public r F0;
    public final v G0 = m.b(new b(this, 0));
    public final d4 H0 = d4.SETTINGS;
    public final a4 I0 = a4.PERSONAL_INFORMATION_SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f27451z0;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        View view = this.D0;
        if (view != null) {
            bs1.c.M1(view);
        } else {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new b(this, 1));
        adapter.G(1, new b(this, 2));
        adapter.G(2, new b(this, 3));
    }

    @Override // nl1.d
    public final void S6(h insetMode, View fragmentRootView) {
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

    @Override // yk1.k
    public final yk1.m V7() {
        oc.c cVar = this.A0;
        if (cVar == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        uk1.e eVar = this.f27451z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        q p73 = p7();
        x2 A7 = A7();
        w f73 = f7();
        j jVar = new j(new yk1.a(getResources(), requireContext().getTheme()));
        q3 q3Var = this.E0;
        if (q3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        r rVar = this.F0;
        if (rVar != null) {
            return new bc1.d(cVar, g13, p73, A7, f73, jVar, q3Var, rVar);
        }
        Intrinsics.r("prefsManagerUser");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.I0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF103135g0() {
        return this.H0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // cc1.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.D(E4);
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(h52.c.settings_personal_information_title);
        settingsRoundHeaderView.g0(new k(this, 26));
        this.C0 = settingsRoundHeaderView;
        View findViewById = onCreateView.findViewById(c52.c.settings_menu_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.D0 = findViewById;
        bd1.e.a();
        View findViewById2 = onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (findViewById2 != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById2);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            findViewById2.requestLayout();
        }
        b8(new c(this, 0));
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.d1(E4);
        }
        super.onDetach();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
        }
    }
}
