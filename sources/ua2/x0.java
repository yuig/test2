package ua2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import com.pinterest.ui.grid.LegoPinGridCell;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public int f121632j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(LegoPinGridCell legoGridCell, int i13) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        this.f121632j = i13;
        ((Paint) this.f121496e.getValue()).setColor(-65536);
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return null;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        boolean isShowingLayoutBounds;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 30) {
            isShowingLayoutBounds = this.f121492a.isShowingLayoutBounds();
            if (isShowingLayoutBounds) {
                canvas.drawRect(3.0f, this.f121497h, 7.0f, this.f121498i, (Paint) this.f121496e.getValue());
            }
        }
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        return new z0(0, this.f121632j);
    }
}
