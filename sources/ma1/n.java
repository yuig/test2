package ma1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import kh2.a1;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import o82.b3;
import pk.a0;
import w41.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lma1/n;", "Lo82/i3;", "<init>", "()V", "n91/z", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class n extends z {
    public static final /* synthetic */ int K0 = 0;
    public final d4 F0 = d4.SETTINGS;
    public final a4 G0 = a4.CONNECTED_DEVICES;
    public final m1 H0;
    public SettingsRoundHeaderView I0;
    public final xk2.v J0;

    public n() {
        xk2.k r13 = d7.g.r(6, new t0(this, 2), xk2.n.NONE);
        this.H0 = a1.s(this, k0.f80436a.b(y.class), new u0(r13, 2), new ca1.m(r13, 3), new ca1.n(this, r13, 3));
        this.J0 = xk2.m.b(new k(this, 0));
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

    @Override // o82.i3
    public final do2.i U8() {
        return new g0(b9().a(), 4);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(b9().c(), 25);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 1, new k(this, 1), new w(), new ns.i(11), new mj.m(22), null, 96);
        q qVar = new q();
        mj.m mVar = new mj.m(23);
        b3.G(adapter, 100, new k(this, 2), qVar, new com.pinterest.boardAutoCollages.l(this, 6), mVar, b9(), 32);
    }

    public final y b9() {
        return (y) this.H0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22548u0() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22547t0() {
        return this.F0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // ma1.z, nl1.d, androidx.fragment.app.Fragment
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
        b9().h();
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(c52.c.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) findViewById;
        this.I0 = settingsRoundHeaderView;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        settingsRoundHeaderView.g0(new x91.k(this, 3));
        settingsRoundHeaderView.k0(l52.c.settings_security_connected_devices_title);
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        b8(new c0(this, 23));
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

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(true);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
