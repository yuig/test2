package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f33361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33362b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33363c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33364d;

    public TimeModel(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f33362b = readInt;
        this.f33363c = readInt2;
        this.f33364d = readInt3;
        this.f33361a = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f33362b == timeModel.f33362b && this.f33363c == timeModel.f33363c && this.f33361a == timeModel.f33361a && this.f33364d == timeModel.f33364d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f33361a), Integer.valueOf(this.f33362b), Integer.valueOf(this.f33363c), Integer.valueOf(this.f33364d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f33362b);
        parcel.writeInt(this.f33363c);
        parcel.writeInt(this.f33364d);
        parcel.writeInt(this.f33361a);
    }
}
