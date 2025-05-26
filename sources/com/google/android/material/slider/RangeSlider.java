package com.google.android.material.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.google.android.material.internal.d0;
import fj.m;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class RangeSlider extends BaseSlider<RangeSlider, Object, Object> {

    /* renamed from: y0, reason: collision with root package name */
    public float f33099y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f33100z0;

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new i();

        /* renamed from: a, reason: collision with root package name */
        public float f33101a;

        /* renamed from: b, reason: collision with root package name */
        public int f33102b;

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeFloat(this.f33101a);
            parcel.writeInt(this.f33102b);
        }

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f33101a = parcel.readFloat();
            this.f33102b = parcel.readInt();
        }
    }

    public RangeSlider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.sliderStyle);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final void Q(Float... fArr) {
        super.Q(fArr);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final float j() {
        return this.f33099y0;
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
    public final ArrayList n() {
        return super.n();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f33099y0 = rangeSliderState.f33101a;
        int i13 = rangeSliderState.f33102b;
        this.f33100z0 = i13;
        this.f33084r0 = i13;
        this.f33060f0 = true;
        postInvalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.f33101a = this.f33099y0;
        rangeSliderState.f33102b = this.f33100z0;
        return rangeSliderState;
    }

    public RangeSlider(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        TypedArray f13 = d0.f(context, attributeSet, m.RangeSlider, i13, BaseSlider.f33043t0, new int[0]);
        if (f13.hasValue(m.RangeSlider_values)) {
            TypedArray obtainTypedArray = f13.getResources().obtainTypedArray(f13.getResourceId(m.RangeSlider_values, 0));
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < obtainTypedArray.length(); i14++) {
                arrayList.add(Float.valueOf(obtainTypedArray.getFloat(i14, -1.0f)));
            }
            R(new ArrayList(arrayList));
        }
        this.f33099y0 = f13.getDimension(m.RangeSlider_minSeparation, 0.0f);
        f13.recycle();
    }
}
