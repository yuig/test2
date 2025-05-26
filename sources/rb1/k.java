package rb1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrb1/k;", "Lo82/i3;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class k extends a {
    public static final /* synthetic */ int K0 = 0;
    public final d4 F0 = d4.PARENTAL_PASSCODE;
    public final a4 G0 = a4.PARENTAL_PASSCODE_SETTINGS;
    public final m1 H0;
    public SettingsRoundHeaderView I0;
    public final xk2.v J0;

    public k() {
        int i13 = 7;
        xk2.k r13 = d7.g.r(11, new t0(this, i13), xk2.n.NONE);
        int i14 = 8;
        this.H0 = a1.s(this, k0.f80436a.b(x.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.J0 = xk2.m.b(new f(this, 0));
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
        return new g0(((x) this.H0.getValue()).a(), 6);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(((x) this.H0.getValue()).c(), 27);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        m mVar = m.f107089a;
        mj.m mVar2 = new mj.m(25);
        b3.G(adapter, 3, new f(this, 1), mVar, new ns.i(13), mVar2, null, 96);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getT0() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF68107l0() {
        return this.F0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // rb1.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.D(E4);
        }
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(f52.c.settings_parental_passcode_header_title);
        settingsRoundHeaderView.g0(new x91.k(this, 17));
        this.I0 = settingsRoundHeaderView;
        View findViewById = onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (findViewById != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.g0();
            lockableBottomSheetBehavior.X(3);
            findViewById.requestLayout();
        }
        b8(new c0(this, 26));
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

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
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
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new j(this, null), 3);
    }
}
