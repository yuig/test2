package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f32669a;

    /* renamed from: b, reason: collision with root package name */
    public int f32670b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32671c;

    /* renamed from: d, reason: collision with root package name */
    public int f32672d;

    public FlowLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        return this.f32671c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        if (getChildCount() == 0) {
            this.f32672d = 0;
            return;
        }
        this.f32672d = 1;
        WeakHashMap weakHashMap = v0.f102521a;
        boolean z14 = getLayoutDirection() == 1;
        int paddingRight = z14 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z14 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i19 = (i15 - i13) - paddingLeft;
        int i23 = paddingRight;
        int i24 = paddingTop;
        for (int i25 = 0; i25 < getChildCount(); i25++) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(fj.g.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i18 = marginLayoutParams.getMarginStart();
                    i17 = marginLayoutParams.getMarginEnd();
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i23 + i18;
                if (!this.f32671c && measuredWidth > i19) {
                    i24 = this.f32669a + paddingTop;
                    this.f32672d++;
                    i23 = paddingRight;
                }
                childAt.setTag(fj.g.row_index_key, Integer.valueOf(this.f32672d - 1));
                int i26 = i23 + i18;
                int measuredWidth2 = childAt.getMeasuredWidth() + i26;
                int measuredHeight = childAt.getMeasuredHeight() + i24;
                if (z14) {
                    childAt.layout(i19 - measuredWidth2, i24, (i19 - i23) - i18, measuredHeight);
                } else {
                    childAt.layout(i26, i24, measuredWidth2, measuredHeight);
                }
                i23 += childAt.getMeasuredWidth() + i18 + i17 + this.f32670b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int size = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i14);
        int i19 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i19 - getPaddingRight();
        int i23 = paddingTop;
        int i24 = 0;
        for (int i25 = 0; i25 < getChildCount(); i25++) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i13, i14);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i17 = marginLayoutParams.leftMargin;
                    i16 = marginLayoutParams.rightMargin;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i26 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i17 <= paddingRight || a()) {
                    i18 = i26;
                } else {
                    i18 = getPaddingLeft();
                    i23 = this.f32669a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i18 + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i23;
                if (measuredWidth > i24) {
                    i24 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i17 + i16 + this.f32670b + i18;
                if (i25 == getChildCount() - 1) {
                    i24 += i16;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i24;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i15 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i15 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i15) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32671c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fj.m.FlowLayout, 0, 0);
        this.f32669a = obtainStyledAttributes.getDimensionPixelSize(fj.m.FlowLayout_lineSpacing, 0);
        this.f32670b = obtainStyledAttributes.getDimensionPixelSize(fj.m.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }
}
