package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.e0;
import java.util.ArrayList;
import java.util.Collections;
import n.o;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0, reason: collision with root package name */
    public static final int f32176c0 = fj.l.Widget_MaterialComponents_Toolbar;

    /* renamed from: d0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f32177d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public final Integer U;
    public final boolean V;
    public final boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public final ImageView.ScaleType f32178a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Boolean f32179b0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.toolbarStyle);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void A(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.U.intValue());
        }
        super.A(drawable);
    }

    public final void H(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i13 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i14 = measuredWidth2 + i13;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i13, 0), Math.max(i14 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i13 += max;
            i14 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i14 - i13, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i13, textView.getTop(), i14, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.x0(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z13, i13, i14, i15, i16);
        boolean z14 = this.W;
        boolean z15 = this.V;
        int i17 = 0;
        ImageView imageView2 = null;
        if (z15 || z14) {
            ArrayList c13 = e0.c(this, this.f16492x);
            boolean isEmpty = c13.isEmpty();
            b4.f fVar = e0.f32757a;
            TextView textView = isEmpty ? null : (TextView) Collections.min(c13, fVar);
            ArrayList c14 = e0.c(this, this.f16493y);
            TextView textView2 = c14.isEmpty() ? null : (TextView) Collections.max(c14, fVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i18 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i19 = 0; i19 < getChildCount(); i19++) {
                    View childAt = getChildAt(i19);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i18 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i18 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (z15 && textView != null) {
                    H(textView, pair);
                }
                if (z14 && textView2 != null) {
                    H(textView2, pair);
                }
            }
        }
        AppCompatImageView appCompatImageView = this.f16473e;
        Drawable drawable2 = appCompatImageView != null ? appCompatImageView.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i17 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i17++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f32179b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f32178a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void q(int i13) {
        o n13 = n();
        boolean z13 = n13 instanceof o;
        if (z13) {
            n13.B();
        }
        super.q(i13);
        if (z13) {
            n13.A();
        }
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        d7.b.v0(this, f13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f32176c0
            android.content.Context r8 = fk.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = fj.m.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.d0.f(r0, r1, r2, r3, r4, r5)
            int r10 = fj.m.MaterialToolbar_navigationIconTint
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L37
            int r10 = fj.m.MaterialToolbar_navigationIconTint
            int r10 = r9.getColor(r10, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.U = r10
            android.graphics.drawable.Drawable r10 = r7.o()
            if (r10 == 0) goto L37
            r7.A(r10)
        L37:
            int r10 = fj.m.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.V = r10
            int r10 = fj.m.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.W = r10
            int r10 = fj.m.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L58
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f32177d0
            int r1 = r0.length
            if (r10 >= r1) goto L58
            r10 = r0[r10]
            r7.f32178a0 = r10
        L58:
            int r10 = fj.m.MaterialToolbar_logoAdjustViewBounds
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L6c
            int r10 = fj.m.MaterialToolbar_logoAdjustViewBounds
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f32179b0 = r10
        L6c:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 != 0) goto L7a
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            goto L7e
        L7a:
            android.content.res.ColorStateList r9 = d7.b.P(r9)
        L7e:
            if (r9 == 0) goto L97
            bk.i r10 = new bk.i
            r10.<init>()
            r10.t(r9)
            r10.o(r8)
            java.util.WeakHashMap r8 = q5.v0.f102521a
            float r8 = q5.m0.e(r7)
            r10.s(r8)
            r7.setBackground(r10)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
