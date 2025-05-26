package ua2;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends n0 {

    /* renamed from: l, reason: collision with root package name */
    public final int f121508l;

    /* renamed from: m, reason: collision with root package name */
    public final va2.e f121509m;

    /* renamed from: n, reason: collision with root package name */
    public final int f121510n;

    /* renamed from: o, reason: collision with root package name */
    public final int f121511o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(LegoPinGridCellImpl legoGridCell, int i13) {
        super(legoGridCell, i13);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        this.f121508l = i13;
        this.f121509m = new va2.e(legoGridCell);
        this.f121510n = bs1.c.W(legoGridCell, eo1.c.structured_feed_footer_top_padding);
        this.f121511o = bs1.c.W(legoGridCell, eo1.c.lego_bricks_one_and_three_quarters);
    }

    @Override // ua2.n0, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        wy0 wy0Var;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.r(canvas, i13, 0, i15, i16);
        Rect j13 = this.f121583k.j();
        boolean z13 = this.f121494c;
        int i17 = this.f121510n;
        int i18 = z13 ? i15 - ((this.f121508l * 2) + (j13.right + i17)) : j13.right + i17;
        int i19 = this.f121511o + i18;
        va2.e eVar = this.f121509m;
        c1 c1Var = eVar.f125338m;
        if (c1Var != null && (wy0Var = c1Var.f121469r) != null) {
            kh2.m0.V0((GestaltAvatar) eVar.f125339n.getValue(), wy0Var);
        }
        eVar.setBounds(i18, this.f121497h, i19, this.f121498i);
        eVar.draw(canvas);
    }
}
