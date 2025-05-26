package com.google.android.material.divider;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import bk.i;
import fj.c;
import fj.l;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int f32602f = l.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a, reason: collision with root package name */
    public final i f32603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32604b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32607e;

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.materialDividerStyle);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WeakHashMap weakHashMap = v0.f102521a;
        boolean z13 = getLayoutDirection() == 1;
        int i13 = this.f32606d;
        int i14 = this.f32607e;
        int i15 = z13 ? i14 : i13;
        int width = z13 ? getWidth() - i13 : getWidth() - i14;
        i iVar = this.f32603a;
        iVar.setBounds(i15, 0, width, getBottom() - getTop());
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i15 = this.f32604b;
            if (i15 > 0 && measuredHeight != i15) {
                measuredHeight = i15;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.divider.MaterialDivider.f32602f
            android.content.Context r9 = fk.a.a(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            android.content.Context r9 = r8.getContext()
            bk.i r6 = new bk.i
            r6.<init>()
            r8.f32603a = r6
            int[] r2 = fj.m.MaterialDivider
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.d0.f(r0, r1, r2, r3, r4, r5)
            int r11 = fj.m.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r8.getResources()
            int r1 = fj.e.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r11 = r10.getDimensionPixelSize(r11, r0)
            r8.f32604b = r11
            int r11 = fj.m.MaterialDivider_dividerInsetStart
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            r8.f32606d = r11
            int r11 = fj.m.MaterialDivider_dividerInsetEnd
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            r8.f32607e = r11
            int r11 = fj.m.MaterialDivider_dividerColor
            android.content.res.ColorStateList r9 = com.bumptech.glide.d.H(r9, r10, r11)
            int r9 = r9.getDefaultColor()
            int r11 = r8.f32605c
            if (r11 == r9) goto L5c
            r8.f32605c = r9
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r6.t(r9)
            r8.invalidate()
        L5c:
            r10.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
