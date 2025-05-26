package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import xj.c;

/* loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends c {

    /* renamed from: h, reason: collision with root package name */
    public final int f32923h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32924i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32925j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32926k;

    public LinearProgressIndicatorSpec(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.linearProgressIndicatorStyle);
    }

    @Override // xj.c
    public final void a() {
        super.a();
        if (this.f32926k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f32923h == 0) {
            if (this.f135075b > 0 && this.f135080g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f135076c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LinearProgressIndicatorSpec(@androidx.annotation.NonNull android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = com.google.android.material.progressindicator.LinearProgressIndicator.f32922n
            r9.<init>(r10, r11, r12, r6)
            int[] r12 = fj.m.LinearProgressIndicator
            int r7 = fj.c.linearProgressIndicatorStyle
            r8 = 0
            int[] r5 = new int[r8]
            com.google.android.material.internal.d0.a(r10, r11, r7, r6)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r7
            r4 = r6
            com.google.android.material.internal.d0.c(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r12, r7, r6)
            int r11 = fj.m.LinearProgressIndicator_indeterminateAnimationType
            r12 = 1
            int r11 = r10.getInt(r11, r12)
            r9.f32923h = r11
            int r11 = fj.m.LinearProgressIndicator_indicatorDirectionLinear
            int r11 = r10.getInt(r11, r8)
            r9.f32924i = r11
            int r0 = fj.m.LinearProgressIndicator_trackStopIndicatorSize
            int r0 = r10.getDimensionPixelSize(r0, r8)
            int r1 = r9.f135074a
            int r0 = java.lang.Math.min(r0, r1)
            r9.f32926k = r0
            r10.recycle()
            r9.a()
            if (r11 != r12) goto L43
            r8 = r12
        L43:
            r9.f32925j = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.LinearProgressIndicatorSpec.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
