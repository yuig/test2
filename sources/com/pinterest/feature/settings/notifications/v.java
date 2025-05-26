package com.pinterest.feature.settings.notifications;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import so.o3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/settings/notifications/v;", "Lo82/i3;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class v extends a {
    public static final /* synthetic */ int J0 = 0;
    public final m1 F0;
    public SettingsRoundHeaderView G0;
    public o3 H0;
    public final d4 I0;

    public v() {
        int i13 = 3;
        xk2.k r13 = d7.g.r(7, new ea1.t0(this, i13), xk2.n.NONE);
        int i14 = 4;
        this.F0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(z0.class), new ea1.u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.I0 = d4.SETTINGS;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        ((l82.c) ((z0) this.F0.getValue()).c()).a(new n(o82.d0.f93560a));
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(((z0) this.F0.getValue()).a(), 5);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(((z0) this.F0.getValue()).c(), 26);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.H(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, new u(this, 0));
        adapter.H(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new u(this, 1));
        adapter.I(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, new u(this, 2), new p90.m(7), new p90.n(this, 9));
        l0 l0Var = new l0();
        mj.m mVar = new mj.m(24);
        b3.G(adapter, 100, new u(this, 3), l0Var, new ns.i(12), mVar, null, 96);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getA0() {
        return this.I0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(c52.d.lego_fragment_settings_menu, e52.a.p_recycler_view);
        eVar.c(0);
        return eVar;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v(getResources().getDimensionPixelSize(c52.a.notif_settings_page_bottom_padding), g83);
        }
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) v13.findViewById(c52.c.header_view);
        this.G0 = settingsRoundHeaderView;
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.d0(rm1.q.ARROW_BACK);
            settingsRoundHeaderView.g0(new x91.k(this, 8));
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) v13.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new s(this, null), 3);
    }
}
