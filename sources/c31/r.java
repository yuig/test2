package c31;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.compose.foundation.lazy.layout.z0;
import androidx.lifecycle.m1;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import ey.c3;
import h32.d4;
import java.util.ArrayList;
import java.util.Set;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import o82.b3;
import so.n5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc31/r;", "Lo82/v2;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class r extends o0 {
    public static final /* synthetic */ int W0 = 0;
    public zf0.f L0;
    public n5 M0;
    public c3 N0;
    public final d4 O0;
    public GestaltStaticSearchBar P0;
    public a Q0;
    public final xk2.v R0;
    public final xk2.v S0;
    public final xk2.k T0;
    public final m1 U0;
    public final xk2.v V0;

    public r() {
        y32.d dVar = y32.f.Companion;
        this.O0 = d4.USER;
        this.Q0 = new a(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.R0 = xk2.m.b(new k(this, 1));
        this.S0 = xk2.m.b(new k(this, 4));
        xk2.n nVar = xk2.n.NONE;
        this.T0 = xk2.m.a(nVar, new k(this, 2));
        int i13 = 18;
        xk2.k a13 = xk2.m.a(nVar, new uv0.f(i13, new kl0.w(this, i13)));
        int i14 = 19;
        this.U0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(t.class), new ml0.v(a13, i13), new kl0.x(0 == true ? 1 : 0, a13, i14), new kl0.y(this, a13, i14));
        this.V0 = xk2.m.b(new k(this, 0));
    }

    public static final cn1.c k9(r rVar, f31.g gVar, dn1.a aVar, z0 z0Var) {
        u50.k0 k0Var;
        rVar.getClass();
        if (gVar.f61003b == null) {
            return null;
        }
        z0Var.invoke(gVar.f61007f);
        om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
        Integer num = gVar.f61004c;
        if (num != null) {
            int intValue = num.intValue();
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            k0Var = new u50.k0(intValue, new ArrayList(0));
        } else {
            k0Var = null;
        }
        return new cn1.c(gVar.f61003b, fVar, k0Var, aVar, gVar.f61006e);
    }

    @Override // o82.v2, yq0.t, yk1.k, nl1.d
    public final void L7() {
        kh2.j.x2(l9(), b.f25570a);
        super.L7();
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Q(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default, x0.back);
        IconView w13 = gestaltToolbarImpl.w();
        ViewGroup.LayoutParams layoutParams = w13.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        com.bumptech.glide.c.a1(marginLayoutParams, w13.getResources().getDimensionPixelOffset(r0.margin_half), 0, 0, 0);
        w13.setLayoutParams(marginLayoutParams);
        gestaltToolbarImpl.Y(nz1.f.all_pins);
        gestaltToolbarImpl.m();
    }

    @Override // o82.i3
    public final u50.r T8() {
        return new tx0.j(l9().c(), 10);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(l9().a(), 28);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(l9().c(), 7);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set set = h31.g.f66813a;
        c0.d.A2(adapter, bp1.h.n(), n.f25600k, (o82.y) this.T0.getValue());
        adapter.H(Integer.MAX_VALUE, new k(this, 3));
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.Q0.g().e();
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return this.Q0.f();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.Q0.g().f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF115278f0() {
        return this.O0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(l9().c(), 9);
    }

    public final t l9() {
        return (t) this.U0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(nz1.d.state_based_all_pins_fragment, nz1.c.p_recycler_view);
        eVar.f979c = nz1.c.empty_state_container;
        eVar.c(nz1.c.swipe_container);
        return eVar;
    }

    public final void m9() {
        ((l82.c) l9().c()).a(new i(f31.p.f61026a));
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l9().h((String) this.S0.getValue());
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(nz1.c.search_with_actions_bar_state_based);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.P0 = (GestaltStaticSearchBar) findViewById;
        return onCreateView;
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        addRecyclerViewEventListener((pr0.g) this.V0.getValue());
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new q(this, null), 3);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        ViewStub viewStub = (ViewStub) mainView.findViewById(nz1.c.toolbar_stub);
        if (viewStub == null) {
            return null;
        }
        viewStub.setLayoutResource(fo1.g.view_gestalt_toolbar);
        KeyEvent.Callback inflate = viewStub.inflate();
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.component.toolbar.Toolbar");
        return (nc0.f) inflate;
    }
}
