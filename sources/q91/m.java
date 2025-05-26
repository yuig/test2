package q91;

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
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq91/m;", "Lyq0/b0;", "", "Ll91/d;", "<init>", "()V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class m extends w<Object> implements l91.d {
    public static final /* synthetic */ int C0 = 0;
    public p91.i A0;
    public final d4 B0 = d4.SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public so.o0 f103143z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new k(this, 0));
        adapter.G(1, new k(this, 1));
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
    public void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(c52.e.country));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public yk1.m V7() {
        so.o0 o0Var = this.f103143z0;
        if (o0Var != null) {
            return o0Var.a(true);
        }
        Intrinsics.r("countrySettingsPresenterFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public d4 getJ0() {
        return this.B0;
    }

    @Override // yq0.t
    public a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // q91.w, nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.d0(rm1.q.ARROW_BACK);
            settingsRoundHeaderView.g0(new x61.e(this, 25));
            settingsRoundHeaderView.k0(c52.e.country);
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
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        LayoutInflater.Factory requireActivity = requireActivity();
        yf0.f fVar = requireActivity instanceof yf0.f ? (yf0.f) requireActivity : null;
        if ((fVar != null ? fVar.getEdgeToEdgeConfiguration() : null) instanceof yf0.c) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.f(requireActivity2);
            c3.t(requireActivity2, !pk.a0.q0(requireActivity2));
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
