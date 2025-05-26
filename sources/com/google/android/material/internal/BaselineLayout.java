package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f32661a;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f32661a = -1;
    }

    @Override // android.view.View
    public final int getBaseline() {
        return this.f32661a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i15 - i13) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int b13 = a.a.b(paddingRight, measuredWidth, 2, paddingLeft);
                int baseline = (this.f32661a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f32661a + paddingTop) - childAt.getBaseline();
                childAt.layout(b13, baseline, measuredWidth + b13, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int childCount = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        int i19 = -1;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i13, i14);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i18 = Math.max(i18, baseline);
                    i19 = Math.max(i19, childAt.getMeasuredHeight() - baseline);
                }
                i16 = Math.max(i16, childAt.getMeasuredWidth());
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                i17 = View.combineMeasuredStates(i17, childAt.getMeasuredState());
            }
        }
        if (i18 != -1) {
            i15 = Math.max(i15, Math.max(i19, getPaddingBottom()) + i18);
            this.f32661a = i18;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i16, getSuggestedMinimumWidth()), i13, i17), View.resolveSizeAndState(Math.max(i15, getSuggestedMinimumHeight()), i14, i17 << 16));
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32661a = -1;
    }
}
