package ny0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.n3;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lny0/v;", "Lo82/v2;", "<init>", "()V", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v extends b {
    public static final /* synthetic */ int T0 = 0;
    public n3 L0;
    public final m1 M0;
    public GestaltButton N0;
    public iy0.a O0;
    public bb2.e P0;
    public final boolean Q0;
    public final d4 R0;
    public final a4 S0;

    public v() {
        int i13 = 12;
        int i14 = 11;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(i14, new kl0.w(this, i13)));
        this.M0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(w0.class), new ml0.v(a13, i14), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.P0 = new bb2.e(0.0f, (bb2.f) (0 == true ? 1 : 0), 7);
        this.Q0 = true;
        this.R0 = d4.ORIENTATION;
        this.S0 = a4.ORIENTATION_PIN_PICKER_STEP;
    }

    public static final qa2.e k9(v vVar) {
        vVar.getClass();
        boolean z13 = false;
        return new qa2.e(new wa2.m(2068839930, 2134898686, 1022, null, null, y32.f.UNKNOWN, null, null, vVar.P0, null, null, null, null, z13, z13, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false));
    }

    @Override // o82.i3
    public final u50.r T8() {
        return new tx0.j(l9().c(), 4);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(l9().a(), 26);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(l9().c(), 2);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 539203, new u(this, 0), z.f92657a, new ns.i(9), new mj.m(13), null, 96);
        int i13 = 3;
        b3.G(adapter, 539204, new u(this, i13), new d1(u50.h0.f120562a), new ns.i(10), new mj.m(14), null, 96);
        adapter.E(539205, new u(this, 1), new h90.m(this, 12), d.f92567k);
        b3.G(adapter, 539206, new u(this, 2), new b1(""), new com.pinterest.boardAutoCollages.l(this, i13), new mj.m(15), null, 96);
        adapter.A(true);
    }

    @Override // o82.v2
    public final int b9() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return bs1.c.U(eo1.c.space_100, resources);
    }

    @Override // o82.v2
    public final int c9() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return bs1.c.U(eo1.c.space_100, resources);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        kh2.j.x2(l9(), h.f92594a);
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF134484m0() {
        return this.S0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF134483l0() {
        return this.R0;
    }

    @Override // yq0.t
    /* renamed from: j8, reason: from getter */
    public final boolean getF139743q0() {
        return this.Q0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(l9().c(), 3);
    }

    public final w0 l9() {
        return (w0) this.M0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(jv1.f.fragment_nux_pin_feed, jv1.d.p_recycler_view);
        eVar.b(jv1.d.pin_feed_loading_layout);
        return eVar;
    }

    @Override // o82.v2, yq0.t
    public final androidx.recyclerview.widget.v0 n8() {
        Bundle arguments = getArguments();
        int i13 = 1;
        if (Math.max(arguments != null ? arguments.getInt(NUXActivity.NUM_USE_CASES_SELECTED) : 0, l9().j()) != 1) {
            cp.b bVar = new cp.b(this, 27);
            requireContext();
            PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(bVar, 2);
            pinterestGridLayoutManager.K = new kx0.c(this, i13);
            return new androidx.recyclerview.widget.v0(pinterestGridLayoutManager);
        }
        n3 n3Var = this.L0;
        if (n3Var == null) {
            Intrinsics.r("staggeredGridLayoutManagerFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl f13 = n3Var.f(r8(), 2);
        f13.f19176t = false;
        return new androidx.recyclerview.widget.v0(f13);
    }

    @Override // ny0.b, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LayoutInflater.Factory requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        if (requireActivity instanceof iy0.a) {
            this.O0 = (iy0.a) requireActivity;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l9().l(com.bumptech.glide.d.i0(null, this.S0, this.R0, ""));
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(jv1.d.pin_feed_cta);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.e(new np0.h(this, 22));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.N0 = gestaltButton;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.O0 = null;
        super.onDetach();
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int Z8 = Z8() / 2;
        H8(Z8, 0, Z8, 0);
        b8(new yq0.e0(s7()));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new t(this, null), 3);
    }
}
