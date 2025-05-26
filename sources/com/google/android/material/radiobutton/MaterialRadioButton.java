package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRadioButton;
import fj.c;
import fj.l;

/* loaded from: classes3.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g, reason: collision with root package name */
    public static final int f32940g = l.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f32941h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f32942e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32943f;

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.radioButtonStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32943f && getButtonTintList() == null) {
            this.f32943f = true;
            if (this.f32942e == null) {
                int u13 = b7.c.u(this, c.colorControlActivated);
                int u14 = b7.c.u(this, c.colorOnSurface);
                int u15 = b7.c.u(this, c.colorSurface);
                this.f32942e = new ColorStateList(f32941h, new int[]{b7.c.F(u15, 1.0f, u13), b7.c.F(u15, 0.54f, u14), b7.c.F(u15, 0.38f, u14), b7.c.F(u15, 0.38f, u14)});
            }
            setButtonTintList(this.f32942e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f32940g
            android.content.Context r8 = fk.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = fj.m.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.d0.f(r0, r1, r2, r3, r4, r5)
            int r10 = fj.m.MaterialRadioButton_buttonTint
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L2a
            int r10 = fj.m.MaterialRadioButton_buttonTint
            android.content.res.ColorStateList r8 = com.bumptech.glide.d.H(r8, r9, r10)
            r7.setButtonTintList(r8)
        L2a:
            int r8 = fj.m.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f32943f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
