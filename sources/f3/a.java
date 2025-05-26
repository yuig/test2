package f3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import b3.e;
import b3.u;
import e3.q;

/* loaded from: classes2.dex */
public final class a extends ViewGroup {
    public final void a(u uVar, q qVar, long j13) {
        drawChild(e.b(uVar), qVar, j13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final /* bridge */ /* synthetic */ void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final /* bridge */ /* synthetic */ void requestLayout() {
    }
}
