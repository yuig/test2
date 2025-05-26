package androidx.media3.common;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;
import d7.n0;

/* loaded from: classes3.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new d(28);

    /* renamed from: a */
    public final int f18747a;

    /* renamed from: b */
    public final int f18748b;

    /* renamed from: c */
    public final int f18749c;

    static {
        n0.Q(0);
        n0.Q(1);
        n0.Q(2);
    }

    public StreamKey(int i13, int i14, int i15) {
        this.f18747a = i13;
        this.f18748b = i14;
        this.f18749c = i15;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i13 = this.f18747a - streamKey2.f18747a;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f18748b - streamKey2.f18748b;
        return i14 == 0 ? this.f18749c - streamKey2.f18749c : i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f18747a == streamKey.f18747a && this.f18748b == streamKey.f18748b && this.f18749c == streamKey.f18749c;
    }

    public final int hashCode() {
        return (((this.f18747a * 31) + this.f18748b) * 31) + this.f18749c;
    }

    public final String toString() {
        return this.f18747a + "." + this.f18748b + "." + this.f18749c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f18747a);
        parcel.writeInt(this.f18748b);
        parcel.writeInt(this.f18749c);
    }

    public StreamKey(Parcel parcel) {
        this.f18747a = parcel.readInt();
        this.f18748b = parcel.readInt();
        this.f18749c = parcel.readInt();
    }
}
