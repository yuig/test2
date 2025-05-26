package ua2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final e0 f121490j;

    /* renamed from: k, reason: collision with root package name */
    public final va2.o f121491k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(LegoPinGridCellImpl legoGridCell, int i13, int i14, int i15, int i16, LegoPinGridCellImpl tapHandler) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(tapHandler, "tapHandler");
        this.f121490j = tapHandler;
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        va2.o oVar = new va2.o(context);
        oVar.m(i13, i14, i15, i16);
        oVar.j(rm1.q.INFO_CIRCLE, rm1.i.XS, rm1.c.DEFAULT, bs1.c.W(legoGridCell, fk1.c.f62347e));
        oVar.p(tn1.c.f118617i);
        this.f121491k = oVar;
    }

    @Override // ua2.h0
    public final boolean B() {
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this.f121490j;
        f30 f30Var = legoPinGridCellImpl.C0;
        if (f30Var == null) {
            return true;
        }
        LegoPinGridCellImpl.J1(legoPinGridCellImpl, null, h32.u0.PIN_GRID_CLICKTHROUGH_BUTTON, legoPinGridCellImpl.Y(), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
        LegoPinGridCellImpl.J1(legoPinGridCellImpl, h32.f1.AD_DISCLOSURE_CLICKTHROUGH, h32.u0.AD_CLICKTHROUGH_DISCLOSURE, legoPinGridCellImpl.Y(), f30Var.getUid(), legoPinGridCellImpl.I0(), 48);
        com.pinterest.api.model.g t33 = f30Var.t3();
        String Z = t33 != null ? t33.Z() : null;
        if (Z == null || kotlin.text.z.j(Z)) {
            return true;
        }
        xj2.c cVar = legoPinGridCellImpl.T0;
        if (cVar != null) {
            cVar.dispose();
        }
        legoPinGridCellImpl.T0 = a11.e.c(legoPinGridCellImpl.W2, Z, f30Var, false, 0, 0, legoPinGridCellImpl.t(legoPinGridCellImpl.getPinUid()), false, false, legoPinGridCellImpl.t2(), legoPinGridCellImpl.I0(), null, false, false, null, false, true, false, 80988);
        return true;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return this.f121491k.f125431m.contains(i13, i14);
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121491k;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121497h;
        int i18 = this.f121498i;
        va2.o oVar = this.f121491k;
        oVar.o(i13, i17, i15, i18);
        oVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.o oVar = this.f121491k;
        oVar.l(i13);
        oVar.i();
        return new z0(i13, oVar.f128842e);
    }
}
