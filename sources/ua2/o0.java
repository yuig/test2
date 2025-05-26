package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends n0 {

    /* renamed from: l, reason: collision with root package name */
    public final int f121588l;

    /* renamed from: m, reason: collision with root package name */
    public final int f121589m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f121590n;

    /* renamed from: o, reason: collision with root package name */
    public final BitmapDrawable f121591o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(LegoPinGridCellImpl legoGridCell, int i13, int i14, rm1.q gestaltIcon, rm1.c gestaltIconColor, rm1.i iVar, Integer num, g92.d dVar, int i15) {
        super(legoGridCell, i13);
        BitmapDrawable C;
        int W = (i15 & 4) != 0 ? bs1.c.W(legoGridCell, eo1.c.lego_spacing_horizontal_text_icon) : i14;
        rm1.i gestaltIconSize = (i15 & 32) != 0 ? GestaltIcon.f49403e : iVar;
        Integer num2 = (i15 & 64) != 0 ? null : num;
        g92.d dVar2 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? dVar : null;
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(gestaltIcon, "gestaltIcon");
        Intrinsics.checkNotNullParameter(gestaltIconColor, "gestaltIconColor");
        Intrinsics.checkNotNullParameter(gestaltIconSize, "gestaltIconSize");
        this.f121588l = i13;
        this.f121589m = W;
        this.f121590n = num2;
        if (dVar2 != null) {
            rm1.d dVar3 = new rm1.d(new rm1.f(gestaltIcon, gestaltIconSize), gestaltIconColor, null, 0, null, 28);
            Context context = legoGridCell.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C = com.bumptech.glide.d.D(dVar3, context, dVar2);
        } else {
            rm1.d dVar4 = new rm1.d(new rm1.f(gestaltIcon, gestaltIconSize), gestaltIconColor, null, 0, null, 28);
            Context context2 = legoGridCell.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C = com.bumptech.glide.d.C(dVar4, context2);
        }
        this.f121591o = C;
    }

    @Override // ua2.n0, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.r(canvas, i13, 0, i15, i16);
        va2.l lVar = this.f121583k;
        Rect j13 = lVar.j();
        int abs = Math.abs(lVar.h().width());
        boolean z13 = this.f121494c;
        int i17 = this.f121589m;
        int i18 = z13 ? i15 - ((this.f121588l * 2) + (j13.right + i17)) : abs + i17;
        BitmapDrawable bitmapDrawable = this.f121591o;
        Integer num = this.f121590n;
        int intValue = num != null ? num.intValue() : bitmapDrawable.getIntrinsicWidth();
        int intrinsicHeight = (bitmapDrawable.getIntrinsicHeight() * intValue) / bitmapDrawable.getIntrinsicWidth();
        int i19 = ((i18 + intValue) + i18) / 2;
        int i23 = (this.f121497h + this.f121498i) / 2;
        int i24 = intValue / 2;
        int i25 = intrinsicHeight / 2;
        bitmapDrawable.setBounds(i19 - i24, i23 - i25, i24 + i19, i25 + i23);
        canvas.save();
        if (this.f121494c) {
            canvas.scale(-1.0f, 1.0f, i19, i23);
        }
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }
}
