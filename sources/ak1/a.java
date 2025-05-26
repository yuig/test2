package ak1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import ua2.d1;
import ua2.z0;
import wa2.l;

/* loaded from: classes2.dex */
public final class a extends d1 {

    /* renamed from: h, reason: collision with root package name */
    public int f15464h;

    @Override // ua2.f1
    public final l k() {
        return null;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        boolean isShowingLayoutBounds;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 30) {
            isShowingLayoutBounds = this.f121492a.isShowingLayoutBounds();
            if (isShowingLayoutBounds) {
                canvas.drawRect(3.0f, this.f121483f, 7.0f, this.f121484g, (Paint) this.f121496e.getValue());
            }
        }
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        return new z0(0, this.f15464h);
    }
}
