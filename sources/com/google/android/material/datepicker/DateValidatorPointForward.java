package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new y(2);

    /* renamed from: a, reason: collision with root package name */
    public final long f32483a;

    public DateValidatorPointForward(long j13) {
        this.f32483a = j13;
    }

    public static DateValidatorPointForward a() {
        return new DateValidatorPointForward(i0.f().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f32483a == ((DateValidatorPointForward) obj).f32483a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32483a)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean u0(long j13) {
        return j13 >= this.f32483a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f32483a);
    }
}
