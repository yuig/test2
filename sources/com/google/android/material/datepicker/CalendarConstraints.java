package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Month f32471a;

    /* renamed from: b, reason: collision with root package name */
    public final Month f32472b;

    /* renamed from: c, reason: collision with root package name */
    public final DateValidator f32473c;

    /* renamed from: d, reason: collision with root package name */
    public Month f32474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32475e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32476f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32477g;

    public interface DateValidator extends Parcelable {
        boolean u0(long j13);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i13) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f32471a = month;
        this.f32472b = month2;
        this.f32474d = month3;
        this.f32475e = i13;
        this.f32473c = dateValidator;
        if (month3 != null && month.f32486a.compareTo(month3.f32486a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f32486a.compareTo(month2.f32486a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i13 < 0 || i13 > i0.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f32477g = month.f(month2) + 1;
        this.f32476f = (month2.f32488c - month.f32488c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f32471a.equals(calendarConstraints.f32471a) && this.f32472b.equals(calendarConstraints.f32472b) && Objects.equals(this.f32474d, calendarConstraints.f32474d) && this.f32475e == calendarConstraints.f32475e && this.f32473c.equals(calendarConstraints.f32473c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32471a, this.f32472b, this.f32474d, Integer.valueOf(this.f32475e), this.f32473c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f32471a, 0);
        parcel.writeParcelable(this.f32472b, 0);
        parcel.writeParcelable(this.f32474d, 0);
        parcel.writeParcelable(this.f32473c, 0);
        parcel.writeInt(this.f32475e);
    }
}
