package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Slider extends BaseSlider<Slider, Object, Object> {
    public Slider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.sliderStyle);
    }

    public final void c0(z62.a aVar) {
        this.f33073m.add(aVar);
    }

    public final void d0(z62.c cVar) {
        this.f33075n.add(cVar);
    }

    public final void e0(float f13) {
        Q(Float.valueOf(f13));
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final int k() {
        return this.E / 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final float l() {
        return this.Q;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final float m() {
        return this.R;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean w() {
        if (this.T != -1) {
            return true;
        }
        this.T = 0;
        return true;
    }

    public Slider(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (obtainStyledAttributes.hasValue(0)) {
            e0(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }
}
