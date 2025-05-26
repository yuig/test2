package la0;

import android.content.Context;
import android.view.View;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f82376r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f82377s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, bl2.c cVar) {
        super(2, cVar);
        this.f82377s = f0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c0 c0Var = new c0(this.f82377s, cVar);
        c0Var.f82376r = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((g) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        v31.b bVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        g gVar = (g) this.f82376r;
        int i13 = f0.V0;
        f0 f0Var = this.f82377s;
        f0Var.getClass();
        f0Var.T0 = gVar.f82401f;
        if (gVar.f82397b) {
            FilterBarView filterBarView = f0Var.Q0;
            if (filterBarView == null) {
                Intrinsics.r("filterBar");
                throw null;
            }
            bs1.c.U1(filterBarView);
            FilterBarView filterBarView2 = f0Var.Q0;
            if (filterBarView2 == null) {
                Intrinsics.r("filterBar");
                throw null;
            }
            filterBarView2.o(ph.a.N0(gVar.f82400e, new ca0.y(f0Var.l9().f82454p.e(), 8)).f131617a);
        } else {
            FilterBarView filterBarView3 = f0Var.Q0;
            if (filterBarView3 == null) {
                Intrinsics.r("filterBar");
                throw null;
            }
            bs1.c.X0(filterBarView3);
        }
        if (f0Var.k9()) {
            Context requireContext = f0Var.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            boolean A1 = dl2.b.A1(requireContext);
            EmptyStateBannerView emptyStateBannerView = (EmptyStateBannerView) f0Var.U0.getValue();
            u50.i0 i0Var = gVar.f82398c;
            u50.i0 i0Var2 = gVar.f82399d;
            if (A1) {
                Integer drawableRes = tm1.d.COLLAGE.drawableRes(g92.d.CALICO, tm1.b.SPOT, tm1.a.RATIO_1_1);
                int intValue = drawableRes != null ? drawableRes.intValue() : ka0.y.collages_empty_state;
                Context requireContext2 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                String obj2 = i0Var.a(requireContext2).toString();
                Context requireContext3 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                String obj3 = i0Var2.a(requireContext3).toString();
                String string = f0Var.getString(ka0.b0.collages_retrieval_empty_state_button_calico);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                bVar = new v31.b(intValue, 0, obj2, obj3, string, new a0(f0Var, 4), null, 66);
            } else {
                int i14 = ka0.y.collages_empty_state;
                Context requireContext4 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                String obj4 = i0Var.a(requireContext4).toString();
                Context requireContext5 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                String obj5 = i0Var2.a(requireContext5).toString();
                String string2 = f0Var.getString(ka0.b0.collages_retrieval_empty_state_button);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                bVar = new v31.b(i14, 0, obj4, obj5, string2, new a0(f0Var, 5), null, 66);
            }
            emptyStateBannerView.o(bVar);
        }
        if (gVar.f82404i) {
            View view = f0Var.R0;
            if (view == null) {
                Intrinsics.r("progressOverlay");
                throw null;
            }
            if (view.getVisibility() != 0) {
                View view2 = f0Var.R0;
                if (view2 == null) {
                    Intrinsics.r("progressOverlay");
                    throw null;
                }
                kg.a.s(view2, 0L, null, 6);
                GestaltSpinner gestaltSpinner = f0Var.S0;
                if (gestaltSpinner == null) {
                    Intrinsics.r("progressOverlayLoadingView");
                    throw null;
                }
                dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
            }
        } else {
            View view3 = f0Var.R0;
            if (view3 == null) {
                Intrinsics.r("progressOverlay");
                throw null;
            }
            if (view3.getVisibility() == 0) {
                View view4 = f0Var.R0;
                if (view4 == null) {
                    Intrinsics.r("progressOverlay");
                    throw null;
                }
                bs1.c.X0(view4);
                GestaltSpinner gestaltSpinner2 = f0Var.S0;
                if (gestaltSpinner2 == null) {
                    Intrinsics.r("progressOverlayLoadingView");
                    throw null;
                }
                dl2.b.X2(gestaltSpinner2, ln1.e.NONE);
            }
        }
        return Unit.f80348a;
    }
}
