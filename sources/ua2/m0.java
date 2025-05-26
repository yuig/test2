package ua2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final int f121563j;

    /* renamed from: k, reason: collision with root package name */
    public final wa2.y f121564k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(LegoPinGridCellImpl legoGridCell, Context context, int i13, vn1.c defaultTextColor) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTextColor, "defaultTextColor");
        this.f121563j = i13;
        this.f121564k = new wa2.y(legoGridCell, context, defaultTextColor, i13);
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    public final void E(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wa2.y yVar = this.f121564k;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (Intrinsics.d(yVar.f128962t, pin.getUid())) {
            return;
        }
        yVar.f128962t = pin.getUid();
        yVar.h(b40.e0(pin), b40.O(pin), b40.P(pin));
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121564k;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121563j;
        int i18 = i13 + i17;
        int i19 = this.f121497h;
        int i23 = i15 - i17;
        int i24 = this.f121498i;
        wa2.y yVar = this.f121564k;
        yVar.setBounds(i18, i19, i23, i24);
        yVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        wa2.y yVar = this.f121564k;
        yVar.g(i14);
        yVar.f(i13);
        yVar.e(yVar.f128957o.f128945c);
        String str = yVar.f128959q;
        yVar.f128958p.getTextBounds(str, 0, str.length(), yVar.f128961s);
        return new z0(i13, yVar.f128842e);
    }
}
