package ua2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.s30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public wa2.l f121584h;

    /* renamed from: i, reason: collision with root package name */
    public final va2.f f121585i;

    /* renamed from: j, reason: collision with root package name */
    public final int f121586j;

    /* renamed from: k, reason: collision with root package name */
    public final int f121587k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LegoPinGridCellImpl legoGridCell, wa2.s pinMediaDrawable) {
        super(legoGridCell, b1.FIXED);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(pinMediaDrawable, "pinMediaDrawable");
        this.f121584h = pinMediaDrawable;
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f121585i = new va2.f(context);
        int dimensionPixelSize = legoGridCell.getContext().getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_analytics_height);
        int dimensionPixelSize2 = legoGridCell.getContext().getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_analytics_padding);
        this.f121586j = dimensionPixelSize2;
        this.f121587k = (dimensionPixelSize2 * 2) + dimensionPixelSize;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    public final void E(wa2.s pinDrawable) {
        Intrinsics.checkNotNullParameter(pinDrawable, "pinDrawable");
        this.f121584h = pinDrawable;
    }

    public final void F(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        f3 z33 = pin.z3();
        Map G = z33 != null ? z33.G() : null;
        Map y13 = G != null ? kh2.n.y(G) : null;
        boolean z13 = y13 != null;
        Map V3 = pin.V3();
        Map y14 = V3 != null ? kh2.n.y(V3) : null;
        if (!z13) {
            y13 = y14;
        }
        s30 s30Var = y13 != null ? (s30) y13.get("all_time_realtime") : null;
        if (s30Var == null) {
            s30Var = y13 != null ? (s30) y13.get("30d_realtime") : null;
        }
        if (s30Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (cr0.f fVar : z.f121638b) {
            String b13 = fVar instanceof cr0.e ? qb0.j.b(s30Var.getImpressionCount()) : fVar instanceof cr0.c ? qb0.j.b(s30Var.getCloseupCount()) : fVar instanceof cr0.d ? qb0.j.b(s30Var.getSaveCount()) : null;
            Boolean T5 = pin.T5();
            Intrinsics.checkNotNullExpressionValue(T5, "getPromotedIsRemovable(...)");
            if (!T5.booleanValue() || (!(fVar instanceof cr0.o) && !(fVar instanceof cr0.d))) {
                arrayList.add(new b(fVar.f53093b, b13));
            }
        }
        this.f121585i.i(arrayList);
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121585i;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int b13 = this.f121584h.b();
        if (b13 > 0) {
            float f13 = b13 - this.f121587k;
            va2.f fVar = this.f121585i;
            fVar.f125346r = f13;
            fVar.draw(canvas);
            u(canvas);
        }
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int i15 = this.f121584h.f128841d;
        va2.f fVar = this.f121585i;
        fVar.f(i15);
        fVar.e(this.f121587k);
        fVar.f125341m = this.f121586j;
        fVar.h();
        return new z0(fVar.f128841d, fVar.f128842e);
    }
}
