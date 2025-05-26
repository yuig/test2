package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import d7.b;
import fj.c;
import fj.l;

/* loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: g0, reason: collision with root package name */
    public static final int f32816g0 = l.Widget_Material3_CompoundButton_MaterialSwitch;

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f32817h0 = {c.state_with_icon};
    public final Drawable T;
    public final Drawable U;
    public final Drawable V;
    public final Drawable W;

    /* renamed from: a0, reason: collision with root package name */
    public final ColorStateList f32818a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ColorStateList f32819b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ColorStateList f32820c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ColorStateList f32821d0;

    /* renamed from: e0, reason: collision with root package name */
    public int[] f32822e0;

    /* renamed from: f0, reason: collision with root package name */
    public int[] f32823f0;

    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.materialSwitchStyle);
    }

    public static void j(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f13) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(f5.c.c(colorStateList.getColorForState(iArr, 0), f13, colorStateList.getColorForState(iArr2, 0)));
    }

    @Override // android.view.View
    public final void invalidate() {
        k();
        super.invalidate();
    }

    public final void k() {
        ColorStateList colorStateList = this.f32821d0;
        ColorStateList colorStateList2 = this.f32820c0;
        ColorStateList colorStateList3 = this.f32819b0;
        ColorStateList colorStateList4 = this.f32818a0;
        if (colorStateList4 == null && colorStateList3 == null && colorStateList2 == null && colorStateList == null) {
            return;
        }
        float f13 = this.f16467z;
        if (colorStateList4 != null) {
            j(this.T, colorStateList4, this.f32822e0, this.f32823f0, f13);
        }
        if (colorStateList3 != null) {
            j(this.U, colorStateList3, this.f32822e0, this.f32823f0, f13);
        }
        if (colorStateList2 != null) {
            j(this.V, colorStateList2, this.f32822e0, this.f32823f0, f13);
        }
        if (colorStateList != null) {
            j(this.W, colorStateList, this.f32822e0, this.f32823f0, f13);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        if (this.U != null) {
            View.mergeDrawableStates(onCreateDrawableState, f32817h0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i14 = 0;
        for (int i15 : onCreateDrawableState) {
            if (i15 != 16842912) {
                iArr[i14] = i15;
                i14++;
            }
        }
        this.f32822e0 = iArr;
        this.f32823f0 = b.N(onCreateDrawableState);
        return onCreateDrawableState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
