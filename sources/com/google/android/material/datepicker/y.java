package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class y implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32593a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f32593a) {
            case 0:
                return Month.b(parcel.readInt(), parcel.readInt());
            case 1:
                return new DateValidatorPointBackward(parcel.readLong());
            case 2:
                return new DateValidatorPointForward(parcel.readLong());
            case 3:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.f32494b = null;
                rangeDateSelector.f32495c = null;
                rangeDateSelector.f32496d = null;
                rangeDateSelector.f32497e = null;
                rangeDateSelector.f32494b = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.f32495c = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            default:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.f32498a = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f32593a) {
            case 0:
                return new Month[i13];
            case 1:
                return new DateValidatorPointBackward[i13];
            case 2:
                return new DateValidatorPointForward[i13];
            case 3:
                return new RangeDateSelector[i13];
            default:
                return new SingleDateSelector[i13];
        }
    }
}
