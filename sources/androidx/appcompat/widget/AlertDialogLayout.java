package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int t(View view) {
        WeakHashMap weakHashMap = q5.v0.f102521a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return t(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getMeasuredHeight()
            int r1 = r10.getChildCount()
            int r2 = r10.f16361e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            r5 = 2
            if (r3 == r4) goto L38
            r4 = 80
            if (r3 == r4) goto L2f
            int r13 = r10.getPaddingTop()
            goto L41
        L2f:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r3 - r0
            goto L41
        L38:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r0
            int r15 = r15 / r5
            int r13 = r15 + r3
        L41:
            android.graphics.drawable.Drawable r15 = r10.f16367k
            r0 = 0
            if (r15 != 0) goto L48
            r15 = r0
            goto L4c
        L48:
            int r15 = r15.getIntrinsicHeight()
        L4c:
            if (r0 >= r1) goto Lab
            android.view.View r3 = r10.getChildAt(r0)
            if (r3 == 0) goto La8
            int r4 = r3.getVisibility()
            r6 = 8
            if (r4 == r6) goto La8
            int r4 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L6f
            r8 = r2
        L6f:
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            r9 = 1
            if (r8 == r9) goto L89
            r9 = 5
            if (r8 == r9) goto L83
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L93
        L83:
            int r8 = r12 - r4
            int r9 = r7.rightMargin
        L87:
            int r8 = r8 - r9
            goto L93
        L89:
            int r8 = a.a.b(r14, r4, r5, r11)
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L87
        L93:
            boolean r9 = r10.n(r0)
            if (r9 == 0) goto L9a
            int r13 = r13 + r15
        L9a:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r4 = r4 + r8
            int r9 = r13 + r6
            r3.layout(r8, r13, r4, r9)
            int r3 = r7.bottomMargin
            int r6 = r6 + r3
            int r6 = r6 + r13
            r13 = r6
        La8:
            int r0 = r0 + 1
            goto L4c
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                int id3 = childAt.getId();
                if (id3 == i.f.topPanel) {
                    view = childAt;
                } else if (id3 == i.f.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id3 != i.f.contentPanel && id3 != i.f.customPanel) || view3 != null) {
                        super.onMeasure(i13, i14);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i13);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i13, 0);
            paddingBottom += view.getMeasuredHeight();
            i15 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i15 = 0;
        }
        if (view2 != null) {
            view2.measure(i13, 0);
            i16 = t(view2);
            i17 = view2.getMeasuredHeight() - i16;
            paddingBottom += i16;
            i15 = View.combineMeasuredStates(i15, view2.getMeasuredState());
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (view3 != null) {
            view3.measure(i13, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i18 = view3.getMeasuredHeight();
            paddingBottom += i18;
            i15 = View.combineMeasuredStates(i15, view3.getMeasuredState());
        } else {
            i18 = 0;
        }
        int i23 = size - paddingBottom;
        if (view2 != null) {
            int i24 = paddingBottom - i16;
            int min = Math.min(i23, i17);
            if (min > 0) {
                i23 -= min;
                i16 += min;
            }
            view2.measure(i13, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
            paddingBottom = i24 + view2.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i15, view2.getMeasuredState());
        }
        if (view3 != null && i23 > 0) {
            view3.measure(i13, View.MeasureSpec.makeMeasureSpec(i18 + i23, mode));
            paddingBottom = (paddingBottom - i18) + view3.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i15, view3.getMeasuredState());
        }
        int i25 = 0;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt2 = getChildAt(i26);
            if (childAt2.getVisibility() != 8) {
                i25 = Math.max(i25, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i25, i13, i15), View.resolveSizeAndState(paddingBottom, i14, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt3 = getChildAt(i27);
                if (childAt3.getVisibility() != 8) {
                    LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                        int i28 = ((LinearLayout.LayoutParams) layoutParams).height;
                        ((LinearLayout.LayoutParams) layoutParams).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i14, 0);
                        ((LinearLayout.LayoutParams) layoutParams).height = i28;
                    }
                }
            }
        }
    }
}
