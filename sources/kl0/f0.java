package kl0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkl0/f0;", "Lmm1/l;", "<init>", "()V", "pe/i", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f0 extends i0 {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f80080k0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public o5.c f80081g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d4 f80082h0 = d4.ACTION_SHEET;

    /* renamed from: i0, reason: collision with root package name */
    public final xk2.k f80083i0;

    /* renamed from: j0, reason: collision with root package name */
    public final xk2.k f80084j0;

    public f0() {
        xk2.n nVar = xk2.n.NONE;
        this.f80083i0 = xk2.m.a(nVar, new c0(this, 1));
        this.f80084j0 = xk2.m.a(nVar, new c0(this, 0));
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(y60.d.fragment_board_view_type_modal, false, 0, 0, false, false, new e0(this), 764);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF80082h0() {
        return this.f80082h0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        LinearLayout linearLayout = (LinearLayout) v13.findViewById(y60.c.board_view_type_modal_container);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intrinsics.f(linearLayout);
        o5.c cVar = this.f80081g0;
        if (cVar == null) {
            Intrinsics.r("bidiFormatter");
            throw null;
        }
        ha2.e eVar = new ha2.e(requireContext, cVar);
        int i13 = d70.g.about_board_recommendations_title;
        vn1.g gVar = vn1.g.BODY_300;
        ha2.a0 a0Var = new ha2.a0(i13, 0, null, null, null, null, null, gVar, null, 764);
        int i14 = d70.g.send_feedback_title;
        int i15 = eo1.c.space_0;
        eVar.a(new ha2.z(null, kotlin.collections.f0.j(a0Var, new ha2.a0(i14, 1, new ha2.d0(i15, eo1.c.space_200, i15, i15), null, null, null, null, gVar, null, 760)), new d0(this, 0)));
        linearLayout.addView(eVar);
        o5.c cVar2 = this.f80081g0;
        if (cVar2 == null) {
            Intrinsics.r("bidiFormatter");
            throw null;
        }
        ha2.e eVar2 = new ha2.e(requireContext, cVar2);
        k41.e eVar3 = k41.f.Companion;
        zo.c cVar3 = (zo.c) this.f80083i0.getValue();
        eVar3.getClass();
        k41.f a13 = k41.e.a(cVar3);
        d0 d0Var = new d0(this, 1);
        int i16 = d70.g.set_grid_view_as;
        int i17 = eo1.c.space_0;
        int i18 = eo1.c.space_100;
        eVar2.a(kg.o.I(a13, d0Var, i16, new ha2.d0(i17, i18, i17, i18), gVar, vn1.c.SUBTLE, gVar));
        linearLayout.addView(eVar2);
        a8(b.f80064m);
    }
}
