package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends b0 {
    public final int A;
    public final Rect B;

    /* renamed from: y, reason: collision with root package name */
    public final int f121504y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f121505z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LegoPinGridCellImpl legoGridCell, nx.d0 pinalytics, es.a adFormats, i92.k toastUtils) {
        super(legoGridCell, bs1.c.W(legoGridCell, eo1.c.margin_half), a0.END, null, 0, rm1.c.LIGHT, 0, 0, false, false, null, 4056);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        g gVar = g.UNINITIALIZED;
        this.f121504y = bs1.c.W(legoGridCell, wy1.b.grid_cell_expand_tappable_size);
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean T1 = dl2.b.T1(context);
        this.f121505z = T1;
        this.A = bs1.c.W(legoGridCell, T1 ? wy1.b.grid_cell_indicator_shadow_vr_size : wy1.b.grid_cell_indicator_shadow_size) / 2;
        this.B = new Rect();
        xk2.n nVar = xk2.n.NONE;
        xk2.m.a(nVar, new h(legoGridCell, this, 0));
        xk2.m.a(nVar, new h(legoGridCell, this, 1));
        this.f121424k = eo1.b.color_themed_transparent;
    }

    @Override // ua2.h0
    public final boolean A() {
        return false;
    }

    @Override // ua2.h0
    public final boolean B() {
        return false;
    }

    @Override // ua2.b0, ua2.h0
    public final boolean C(int i13, int i14) {
        return !E().f128846i && this.B.contains(i13, i14);
    }

    @Override // ua2.b0, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121437x;
        boolean z13 = this.f121494c;
        int i18 = this.f121504y;
        a0 a0Var = this.f121422i;
        int i19 = (!(z13 && a0Var == a0.START) && (z13 || a0Var != a0.END)) ? i13 : i15 - i18;
        int i23 = (!(z13 && a0Var == a0.START) && (z13 || a0Var != a0.END)) ? i13 + i18 : i15;
        Rect rect = this.B;
        rect.set(i19, i17, i23, i18 + i17);
        Rect rect2 = E().E;
        int centerX = rect.centerX();
        int i24 = this.A;
        rect2.set(centerX - i24, rect.centerY() - i24, rect.centerX() + i24, rect.centerY() + i24);
        super.r(canvas, i13, 0, i15, i16);
        u(canvas);
    }
}
