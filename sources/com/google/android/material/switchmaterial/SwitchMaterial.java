package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import fj.c;
import fj.e;
import fj.l;
import java.util.WeakHashMap;
import q5.m0;
import q5.v0;
import rj.a;

/* loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: a0, reason: collision with root package name */
    public static final int f33119a0 = l.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: b0, reason: collision with root package name */
    public static final int[][] f33120b0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final a T;
    public ColorStateList U;
    public ColorStateList V;
    public final boolean W;

    public SwitchMaterial(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.switchStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int[][] iArr = f33120b0;
        boolean z13 = this.W;
        if (z13 && this.f16443b == null) {
            if (this.U == null) {
                int u13 = b7.c.u(this, c.colorSurface);
                int u14 = b7.c.u(this, c.colorControlActivated);
                float dimension = getResources().getDimension(e.mtrl_switch_thumb_elevation);
                a aVar = this.T;
                if (aVar.f108419a) {
                    float f13 = 0.0f;
                    for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                        WeakHashMap weakHashMap = v0.f102521a;
                        f13 += m0.e((View) parent);
                    }
                    dimension += f13;
                }
                int b13 = aVar.b(u13, dimension);
                this.U = new ColorStateList(iArr, new int[]{b7.c.F(u13, 1.0f, u14), b13, b7.c.F(u13, 0.38f, u14), b13});
            }
            this.f16443b = this.U;
            this.f16445d = true;
            a();
        }
        if (z13 && this.f16448g == null) {
            if (this.V == null) {
                int u15 = b7.c.u(this, c.colorSurface);
                int u16 = b7.c.u(this, c.colorControlActivated);
                int u17 = b7.c.u(this, c.colorOnSurface);
                this.V = new ColorStateList(iArr, new int[]{b7.c.F(u15, 0.54f, u16), b7.c.F(u15, 0.32f, u17), b7.c.F(u15, 0.12f, u16), b7.c.F(u15, 0.12f, u17)});
            }
            this.f16448g = this.V;
            this.f16450i = true;
            b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchMaterial(@androidx.annotation.NonNull android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = com.google.android.material.switchmaterial.SwitchMaterial.f33119a0
            android.content.Context r10 = fk.a.a(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            android.content.Context r10 = r9.getContext()
            rj.a r0 = new rj.a
            r0.<init>(r10)
            r9.T = r0
            int[] r7 = fj.m.SwitchMaterial
            r8 = 0
            int[] r5 = new int[r8]
            com.google.android.material.internal.d0.a(r10, r11, r12, r6)
            r0 = r10
            r1 = r11
            r2 = r7
            r3 = r12
            r4 = r6
            com.google.android.material.internal.d0.c(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r7, r12, r6)
            int r11 = fj.m.SwitchMaterial_useMaterialThemeColors
            boolean r11 = r10.getBoolean(r11, r8)
            r9.W = r11
            r10.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
