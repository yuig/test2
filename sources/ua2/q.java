package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f121593j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f121594k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LegoPinGridCellImpl legoGridCell, int i13, rm1.q gestaltIcon, rm1.c gestaltIconColor, rm1.i gestaltIconSize, g92.d iconTheme, qa2.w navigateToCloseupComprehensive) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(gestaltIcon, "gestaltIcon");
        Intrinsics.checkNotNullParameter(gestaltIconColor, "gestaltIconColor");
        Intrinsics.checkNotNullParameter(gestaltIconSize, "gestaltIconSize");
        Intrinsics.checkNotNullParameter(iconTheme, "iconTheme");
        Intrinsics.checkNotNullParameter(navigateToCloseupComprehensive, "navigateToCloseupComprehensive");
        this.f121593j = navigateToCloseupComprehensive;
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f121594k = new c0(context, i13, bs1.c.W(legoGridCell, eo1.c.sema_space_100), gestaltIcon, gestaltIconColor, gestaltIconSize, iconTheme);
    }

    @Override // ua2.h0
    public final boolean B() {
        return ((Boolean) this.f121593j.invoke()).booleanValue();
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return this.f121594k.getBounds().contains(i13, i14);
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121594k;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121497h;
        int i18 = this.f121498i;
        c0 c0Var = this.f121594k;
        c0Var.setBounds(i13, i17, i15, i18);
        boolean z13 = c0Var.f128838a;
        BitmapDrawable bitmapDrawable = c0Var.f121450n;
        int i19 = c0Var.f121449m;
        int i23 = c0Var.f121448l;
        c0Var.f121451o.setBounds(z13 ? i13 + i23 : bitmapDrawable.getIntrinsicWidth() + i13 + i19 + i23, i17, c0Var.f128838a ? ((i15 - i23) - bitmapDrawable.getIntrinsicWidth()) - i19 : i15 - i23, i18);
        int intrinsicWidth = c0Var.f128838a ? (i15 - i23) - bitmapDrawable.getIntrinsicWidth() : i13 + i23;
        int i24 = (i17 + i18) / 2;
        bitmapDrawable.setBounds(intrinsicWidth, i24 - (bitmapDrawable.getIntrinsicHeight() / 2), bitmapDrawable.getIntrinsicWidth() + intrinsicWidth, (bitmapDrawable.getIntrinsicHeight() / 2) + i24);
        c0Var.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        c0 c0Var = this.f121594k;
        int intrinsicWidth = ((i13 - c0Var.f121450n.getIntrinsicWidth()) - (c0Var.f121448l * 2)) - c0Var.f121449m;
        va2.l lVar = c0Var.f121451o;
        lVar.f125407s = intrinsicWidth;
        lVar.l();
        c0Var.e(Math.max(lVar.f128842e, c0Var.f121450n.getIntrinsicHeight()));
        return new z0(i13, c0Var.f128842e);
    }
}
