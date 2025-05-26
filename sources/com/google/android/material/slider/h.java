package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        BaseSlider.SliderState sliderState = new BaseSlider.SliderState(parcel);
        sliderState.f33094a = parcel.readFloat();
        sliderState.f33095b = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        sliderState.f33096c = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        sliderState.f33097d = parcel.readFloat();
        sliderState.f33098e = parcel.createBooleanArray()[0];
        return sliderState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new BaseSlider.SliderState[i13];
    }
}
