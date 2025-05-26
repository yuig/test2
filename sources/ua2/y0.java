package ua2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.api.model.o01;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final wa2.b0 f121635h;

    /* renamed from: i, reason: collision with root package name */
    public int f121636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(LegoPinGridCellImpl legoGridCell) {
        super(legoGridCell, b1.FIXED);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f121635h = new wa2.b0(context);
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    public final void E(int i13) {
        u50.b0 cornerRadius = new u50.b0(i13);
        wa2.b0 b0Var = this.f121635h;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        b0Var.f128678w = cornerRadius.a(b0Var.f128667l).intValue();
    }

    public final void F(o01 o01Var) {
        if (o01Var != null) {
            String d2 = o01Var.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getTitle(...)");
            wa2.b0 b0Var = this.f121635h;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(d2, "<set-?>");
            b0Var.f128669n = d2;
            String c13 = o01Var.c();
            Intrinsics.checkNotNullExpressionValue(c13, "getSubtitle(...)");
            Intrinsics.checkNotNullParameter(c13, "<set-?>");
            b0Var.f128670o = c13;
        }
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121635h;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f121635h.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        wa2.b0 b0Var = this.f121635h;
        b0Var.g(0);
        b0Var.f(i13);
        b0Var.e(this.f121636i);
        b0Var.h();
        return new z0(b0Var.f128841d, b0Var.f128842e);
    }
}
