package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16357a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16358b;

    /* renamed from: c, reason: collision with root package name */
    public int f16359c;

    /* renamed from: d, reason: collision with root package name */
    public int f16360d;

    /* renamed from: e, reason: collision with root package name */
    public int f16361e;

    /* renamed from: f, reason: collision with root package name */
    public int f16362f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16363g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16364h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f16365i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f16366j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f16367k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16368l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16369m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16370n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16371o;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void f(Canvas canvas) {
        int right;
        int left;
        int i13;
        int childCount = getChildCount();
        boolean z13 = l3.f16639a;
        boolean z14 = getLayoutDirection() == 1;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8 && n(i14)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                j(canvas, z14 ? childAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f16368l);
            }
        }
        if (n(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (z14) {
                    left = childAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i13 = this.f16368l;
                    right = left - i13;
                } else {
                    right = childAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (z14) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i13 = this.f16368l;
                right = left - i13;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i13;
        int i14 = this.f16358b;
        if (i14 < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= i14) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i14);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (i14 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i15 = this.f16359c;
        if (this.f16360d == 1 && (i13 = this.f16361e & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) != 48) {
            if (i13 == 16) {
                i15 = a.a.b(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f16362f, 2, i15);
            } else if (i13 == 80) {
                i15 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f16362f;
            }
        }
        return i15 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public final void h(Canvas canvas) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8 && n(i13)) {
                i(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.f16369m);
            }
        }
        if (n(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            i(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f16369m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin);
        }
    }

    public final void i(Canvas canvas, int i13) {
        Drawable drawable = this.f16367k;
        int paddingLeft = getPaddingLeft();
        int i14 = this.f16371o;
        drawable.setBounds(paddingLeft + i14, i13, (getWidth() - getPaddingRight()) - i14, this.f16369m + i13);
        this.f16367k.draw(canvas);
    }

    public final void j(Canvas canvas, int i13) {
        Drawable drawable = this.f16367k;
        int paddingTop = getPaddingTop();
        int i14 = this.f16371o;
        drawable.setBounds(i13, paddingTop + i14, this.f16368l + i13, (getHeight() - getPaddingBottom()) - i14);
        this.f16367k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i13 = this.f16360d;
        if (i13 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i13 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final boolean n(int i13) {
        int i14 = this.f16370n;
        if (i13 == 0) {
            return (i14 & 1) != 0;
        }
        if (i13 == getChildCount()) {
            return (i14 & 4) != 0;
        }
        if ((i14 & 2) == 0) {
            return false;
        }
        for (int i15 = i13 - 1; i15 >= 0; i15--) {
            if (getChildAt(i15).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.o(int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f16367k == null) {
            return;
        }
        if (this.f16360d == 1) {
            h(canvas);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.f16360d
            r0 = 1
            if (r11 != r0) goto La8
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r1 = r10.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r10.getChildCount()
            int r2 = r10.f16361e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            r5 = 2
            if (r3 == r4) goto L3b
            r4 = 80
            if (r3 == r4) goto L30
            int r13 = r10.getPaddingTop()
            goto L46
        L30:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r10.f16362f
            int r13 = r3 - r13
            goto L46
        L3b:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r10.f16362f
            int r13 = a.a.b(r15, r13, r5, r3)
        L46:
            r15 = 0
        L47:
            if (r15 >= r1) goto Lab
            android.view.View r3 = r10.getChildAt(r15)
            if (r3 != 0) goto L50
            goto La5
        L50:
            int r4 = r3.getVisibility()
            r6 = 8
            if (r4 == r6) goto La5
            int r4 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L6b
            r8 = r2
        L6b:
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r0) goto L84
            r9 = 5
            if (r8 == r9) goto L7e
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L8e
        L7e:
            int r8 = r12 - r4
            int r9 = r7.rightMargin
        L82:
            int r8 = r8 - r9
            goto L8e
        L84:
            int r8 = a.a.b(r14, r4, r5, r11)
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L82
        L8e:
            boolean r9 = r10.n(r15)
            if (r9 == 0) goto L97
            int r9 = r10.f16369m
            int r13 = r13 + r9
        L97:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r4 = r4 + r8
            int r9 = r13 + r6
            r3.layout(r8, r13, r4, r9)
            int r3 = r7.bottomMargin
            int r6 = r6 + r3
            int r6 = r6 + r13
            r13 = r6
        La5:
            int r15 = r15 + 1
            goto L47
        La8:
            r10.o(r12, r13, r14, r15)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x02b4, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r1).width == (-1)) goto L148;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0515 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.p(int, int):void");
    }

    public final void q(boolean z13) {
        this.f16357a = z13;
    }

    public final void r(int i13) {
        if (this.f16361e != i13) {
            if ((8388615 & i13) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
                i13 |= 48;
            }
            this.f16361e = i13;
            requestLayout();
        }
    }

    public final void s(int i13) {
        if (this.f16360d != i13) {
            this.f16360d = i13;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f16357a = true;
        this.f16358b = -1;
        this.f16359c = 0;
        this.f16361e = 8388659;
        x92.b N = x92.b.N(context, attributeSet, i.j.LinearLayoutCompat, i13, 0);
        q5.v0.n(this, context, i.j.LinearLayoutCompat, attributeSet, (TypedArray) N.f134366c, i13, 0);
        int B = N.B(i.j.LinearLayoutCompat_android_orientation, -1);
        if (B >= 0) {
            s(B);
        }
        int B2 = N.B(i.j.LinearLayoutCompat_android_gravity, -1);
        if (B2 >= 0) {
            r(B2);
        }
        boolean t13 = N.t(i.j.LinearLayoutCompat_android_baselineAligned, true);
        if (!t13) {
            q(t13);
        }
        this.f16363g = ((TypedArray) N.f134366c).getFloat(i.j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f16358b = N.B(i.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f16364h = N.t(i.j.LinearLayoutCompat_measureWithLargestChild, false);
        Drawable x13 = N.x(i.j.LinearLayoutCompat_divider);
        if (x13 != this.f16367k) {
            this.f16367k = x13;
            if (x13 != null) {
                this.f16368l = x13.getIntrinsicWidth();
                this.f16369m = x13.getIntrinsicHeight();
            } else {
                this.f16368l = 0;
                this.f16369m = 0;
            }
            setWillNotDraw(x13 == null);
            requestLayout();
        }
        this.f16370n = N.B(i.j.LinearLayoutCompat_showDividers, 0);
        this.f16371o = N.w(i.j.LinearLayoutCompat_dividerPadding, 0);
        N.O();
    }
}
