package android.support.v4.media;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new d(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f15835a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15836b;

    public RatingCompat(int i13, float f13) {
        this.f15835a = i13;
        this.f15836b = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f15835a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Rating:style=");
        sb3.append(this.f15835a);
        sb3.append(" rating=");
        float f13 = this.f15836b;
        sb3.append(f13 < 0.0f ? "unrated" : String.valueOf(f13));
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f15835a);
        parcel.writeFloat(this.f15836b);
    }
}
