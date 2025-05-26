package am0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.x0;
import rm1.q;
import so.oa;
import so.p5;
import uk1.e;
import wa2.i;
import x02.i2;
import yk1.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lam0/b;", "Ltj0/d;", "", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "jumpstart_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends a implements mj0.c {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f15516e1 = 0;
    public f0 Y0;
    public i2 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public e f15517a1;

    /* renamed from: b1, reason: collision with root package name */
    public p5 f15518b1;

    /* renamed from: c1, reason: collision with root package name */
    public final d4 f15519c1;

    /* renamed from: d1, reason: collision with root package name */
    public final a4 f15520d1;

    public b() {
        this.Y = true;
        this.f15519c1 = d4.BOARD;
        this.f15520d1 = a4.BOARD_IDEAS;
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        q qVar = q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Q(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_icon_default, x0.cancel);
        gestaltToolbarImpl.b0(getString(c70.c.add_pins));
        gestaltToolbarImpl.b(c70.b.fragment_board_create_jumpstart_actionbar);
    }

    @Override // mj0.c
    public final void U5() {
    }

    @Override // yk1.k
    public final m V7() {
        i iVar = W8().f103320a;
        iVar.f128803w = false;
        iVar.f128799u = true;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        e eVar = this.f15517a1;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.Z0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        p5 p5Var = this.f15518b1;
        if (p5Var != null) {
            return p5Var.a(new nj0.a(l9(), null, null, null, 30), hk0.m.BOARD, x22.c.PROFILE_POST_BOARD_CREATE_BOTTOM_SHEET, a13);
        }
        Intrinsics.r("jumpstartBoardPresenterFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getT0() {
        return this.f15520d1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF68107l0() {
        return this.f15519c1;
    }

    public final String l9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null;
        f0 f0Var = this.Y0;
        if (f0Var != null) {
            f0Var.N(v03, "Board id not sent to fragment through navigation!", new Object[0]);
            return v03 == null ? "" : v03;
        }
        Intrinsics.r("devUtils");
        throw null;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(c70.b.fragment_board_create_jumpstart, c70.a.p_recycler_view);
        eVar.b(c70.a.loading_container);
        return eVar;
    }

    @Override // tj0.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        GestaltButton gestaltButton = (GestaltButton) view.findViewById(c70.a.done_button);
        if (gestaltButton != null) {
            gestaltButton.e(new yb0.b(this, 21));
        }
    }
}
