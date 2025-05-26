package r02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.banner.GestaltBanner;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.grid.PinterestRecyclerView;
import ea1.u0;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lr02/e0;", "Lo82/i3;", "<init>", "()V", "gi2/b", "r02/w", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e0 extends d {
    public static final /* synthetic */ int P0 = 0;
    public final m1 F0;
    public final d4 G0;
    public a4 H0;
    public p02.a I0;
    public GestaltIcon J0;
    public PinterestRecyclerView K0;
    public GestaltBanner L0;
    public mo1.d M0;
    public m60.e N0;
    public final d0 O0;

    public e0() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(7, new c0(this, 0)));
        int i13 = 28;
        this.F0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(s02.n.class), new u0(a13, 27), new ca1.m(a13, i13), new ca1.n(this, a13, i13));
        this.G0 = d4.REPORTS_AND_VIOLATION_CENTER;
        this.O0 = new d0(this);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(b9().a(), 15);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new kd1.j(b9().c(), 15);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.I(0, new yv1.i(this, 13), new t(this, 0), new p90.n(this, 11));
    }

    public final s02.n b9() {
        return (s02.n) this.F0.getValue();
    }

    public final void c9(boolean z13) {
        GestaltIcon gestaltIcon = this.J0;
        if (gestaltIcon != null) {
            gestaltIcon.g2(new fx1.d(z13, 10));
        } else {
            Intrinsics.r("gestaltIcon");
            throw null;
        }
    }

    public final boolean d9() {
        p02.a aVar = this.I0;
        if (aVar != null) {
            return aVar == p02.a.YOUR_ACCOUNT;
        }
        Intrinsics.r("actionTab");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF35234i() {
        a4 a4Var = this.H0;
        if (a4Var != null) {
            return a4Var;
        }
        Intrinsics.r("viewParameterType");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF2091g0() {
        return this.G0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(h02.d.rvc_section, h02.c.section_recyclerview);
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle f49207c;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ScreenDescription screenDescription = this.f76937a;
        Serializable serializable = (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) ? null : f49207c.getSerializable("EXTRA_ACTION_TAB");
        Intrinsics.g(serializable, "null cannot be cast to non-null type com.pinterest.reportFlow.feature.rvc.model.ActionTabEnum");
        p02.a aVar = (p02.a) serializable;
        this.I0 = aVar;
        a4 a4Var = aVar == p02.a.YOUR_ACCOUNT ? a4.RVC_YOUR_ACCOUNT_TAB : a4.RVC_YOUR_REPORTS_TAB;
        Intrinsics.checkNotNullParameter(a4Var, "<set-?>");
        this.H0 = a4Var;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(h02.c.gi_section_loading);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.J0 = (GestaltIcon) findViewById;
        View findViewById2 = onCreateView.findViewById(h02.c.section_recyclerview);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById2;
        Intrinsics.checkNotNullParameter(pinterestRecyclerView, "<set-?>");
        this.K0 = pinterestRecyclerView;
        View findViewById3 = onCreateView.findViewById(h02.c.container_data_result);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.L0 = (GestaltBanner) findViewById3;
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f7().j(this.O0);
        super.onDestroy();
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new a0(this, null), 3);
        b9().h(d9());
        f7().h(this.O0);
    }
}
