package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new y(0);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f32486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32487b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32488c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32489d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32490e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32491f;

    /* renamed from: g, reason: collision with root package name */
    public String f32492g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c13 = i0.c(calendar);
        this.f32486a = c13;
        this.f32487b = c13.get(2);
        this.f32488c = c13.get(1);
        this.f32489d = c13.getMaximum(7);
        this.f32490e = c13.getActualMaximum(5);
        this.f32491f = c13.getTimeInMillis();
    }

    public static Month b(int i13, int i14) {
        Calendar g13 = i0.g(null);
        g13.set(1, i13);
        g13.set(2, i14);
        return new Month(g13);
    }

    public static Month d(long j13) {
        Calendar g13 = i0.g(null);
        g13.setTimeInMillis(j13);
        return new Month(g13);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.f32486a.compareTo(month.f32486a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        if (this.f32492g == null) {
            this.f32492g = i0.b("yMMMM", Locale.getDefault()).format(new Date(this.f32486a.getTimeInMillis()));
        }
        return this.f32492g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f32487b == month.f32487b && this.f32488c == month.f32488c;
    }

    public final int f(Month month) {
        if (!(this.f32486a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f32487b - this.f32487b) + ((month.f32488c - this.f32488c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32487b), Integer.valueOf(this.f32488c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f32488c);
        parcel.writeInt(this.f32487b);
    }
}
