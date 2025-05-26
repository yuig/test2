package y90;

import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import kh2.m2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Object obj, int i13) {
        super(1, obj, d0.class, "updateEffectsRecyclerView", "updateEffectsRecyclerView(Lcom/pinterest/shuffles/composer/ui/effects/EffectsModel;)V", 0);
        this.f138124a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, d0.class, "updateCurrentPanel", "updateCurrentPanel(Lcom/pinterest/shuffles/composer/ui/effects/EffectsPanel;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 1;
        switch (this.f138124a) {
            case 0:
                m62.s p03 = (m62.s) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                d0 d0Var = (d0) this.receiver;
                int i14 = d0.f138146w0;
                d0Var.getClass();
                if (p03.f86048d instanceof m62.u) {
                    q1 q1Var = d0Var.f138155k0;
                    if (q1Var == null) {
                        Intrinsics.r("effectsPanelView");
                        throw null;
                    }
                    RecyclerView recyclerView = q1Var.f138222b;
                    recyclerView.setPaddingRelative(0, recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
                    l2 l2Var = recyclerView.f19242n;
                    Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) l2Var;
                    gridLayoutManager.R1(1);
                    m2 m2Var = p03.f86050f;
                    if (m2Var instanceof m62.p) {
                        ((p1) d0Var.f138159o0.getValue()).f138219h = p03.f86045a;
                    } else if (m2Var instanceof m62.q) {
                        gridLayoutManager.R1(2);
                        int X = bs1.c.X(d0Var, w1.collage_effect_font_item_spacing);
                        recyclerView.setPaddingRelative(X, recyclerView.getPaddingTop(), X, recyclerView.getPaddingBottom());
                    } else if (m2Var instanceof m62.o) {
                        gridLayoutManager.R1(2);
                    }
                }
                return Unit.f80348a;
            default:
                m62.v p04 = (m62.v) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                d0 d0Var2 = (d0) this.receiver;
                int i15 = d0.f138146w0;
                d0Var2.getClass();
                if (p04 instanceof m62.u) {
                    i13 = 0;
                } else if (!(p04 instanceof m62.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewSwitcher viewSwitcher = d0Var2.f138153i0;
                if (viewSwitcher == null) {
                    Intrinsics.r("panelContainer");
                    throw null;
                }
                if (viewSwitcher.getDisplayedChild() != i13) {
                    ViewSwitcher viewSwitcher2 = d0Var2.f138153i0;
                    if (viewSwitcher2 == null) {
                        Intrinsics.r("panelContainer");
                        throw null;
                    }
                    viewSwitcher2.setDisplayedChild(i13);
                }
                return Unit.f80348a;
        }
    }
}
