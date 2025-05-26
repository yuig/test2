package ua2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final va2.g f121597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LegoPinGridCellImpl legoGridCell, Context context) {
        super(legoGridCell, b1.FIXED);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f121597h = new va2.g(context, eo1.c.lego_corner_radius_medium);
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121597h;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f121597h.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.g gVar = this.f121597h;
        gVar.f(i13);
        gVar.e(i14);
        gVar.h();
        return new z0(i13, i14);
    }
}
