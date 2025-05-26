package t3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w1 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f116250a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f116251b;

    public w1(Context context) {
        super(context);
        setClipChildren(false);
        this.f116250a = new HashMap();
        this.f116251b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        for (p4.j jVar : this.f116250a.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        if (!(View.MeasureSpec.getMode(i13) == 1073741824)) {
            jk.r.x("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (!(View.MeasureSpec.getMode(i14) == 1073741824)) {
            jk.r.x("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
        for (p4.j jVar : this.f116250a.keySet()) {
            int i16 = jVar.f98811r;
            if (i16 != Integer.MIN_VALUE && (i15 = jVar.f98812s) != Integer.MIN_VALUE) {
                jVar.measure(i16, i15);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            s3.k0 k0Var = (s3.k0) this.f116250a.get(childAt);
            if (childAt.isLayoutRequested() && k0Var != null) {
                s3.k0.Y(k0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
