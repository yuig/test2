package ua1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import i92.k;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import mf0.l;
import pk.a0;
import so.r3;
import ta1.f;
import xk2.m;
import xk2.v;
import yf0.h;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lua1/d;", "Lyq0/b0;", "", "Lra1/a;", "<init>", "()V", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a<Object> implements ra1.a {
    public static final /* synthetic */ int F0 = 0;
    public r3 A0;
    public SettingsRoundHeaderView B0;
    public f C0;
    public final v D0 = m.b(new b(this, 0));
    public final d4 E0 = d4.SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public k f121418z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(3, new b(this, 1));
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

    public final k U8() {
        k kVar = this.f121418z0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        r3 r3Var = this.A0;
        if (r3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return r3Var.a(bs1.c.m(requireActivity));
    }

    public final void V8(boolean z13) {
        of0.a aVar;
        w f73 = f7();
        if (z13) {
            aVar = new of0.a(new l());
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new of0.a(null);
        }
        f73.d(aVar);
    }

    public final void W8(String str) {
        k U8 = U8();
        if (str == null) {
            str = getString(x0.generic_error);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        U8.i(str);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getM0() {
        return this.E0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // ua1.a, nl1.d, androidx.fragment.app.Fragment
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
        this.B0 = settingsRoundHeaderView;
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.g0(new x91.k(this, 4));
            settingsRoundHeaderView.k0(c52.e.login_options);
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
        b8(new c0(this, 24));
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
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
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
