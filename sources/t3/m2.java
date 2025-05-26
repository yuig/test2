package t3;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class m2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f116091a;

    public m2(Context context) {
        super(context);
        setClipChildren(false);
        setTag(u2.s.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(b3.u uVar, View view, long j13) {
        super.drawChild(b3.e.b(uVar), view, j13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            Intrinsics.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((g4) childAt).f116025h) {
                this.f116091a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f116091a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildCount() {
        if (this.f116091a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
