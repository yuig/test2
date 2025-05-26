package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
        int readInt = parcel.readInt();
        f fVar = CompositeDateValidator.f32479d;
        if (readInt != 2 && readInt == 1) {
            fVar = CompositeDateValidator.f32478c;
        }
        readArrayList.getClass();
        return new CompositeDateValidator(readArrayList, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new CompositeDateValidator[i13];
    }
}
