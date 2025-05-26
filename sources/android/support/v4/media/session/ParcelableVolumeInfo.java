package android.support.v4.media.session;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new d(13);

    /* renamed from: a, reason: collision with root package name */
    public int f15849a;

    /* renamed from: b, reason: collision with root package name */
    public int f15850b;

    /* renamed from: c, reason: collision with root package name */
    public int f15851c;

    /* renamed from: d, reason: collision with root package name */
    public int f15852d;

    /* renamed from: e, reason: collision with root package name */
    public int f15853e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f15849a);
        parcel.writeInt(this.f15851c);
        parcel.writeInt(this.f15852d);
        parcel.writeInt(this.f15853e);
        parcel.writeInt(this.f15850b);
    }
}
