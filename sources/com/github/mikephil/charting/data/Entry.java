package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import tf.b;
import tf.f;

/* loaded from: classes3.dex */
public class Entry extends b implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public float f30176c;

    public float b() {
        return this.f30176c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f30176c + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeFloat(this.f30176c);
        parcel.writeFloat(a());
        Object obj = this.f117502b;
        if (obj == null) {
            parcel.writeInt(0);
        } else {
            if (!(obj instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.f117502b, i13);
        }
    }
}
