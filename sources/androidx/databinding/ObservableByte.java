package androidx.databinding;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import z5.a;

/* loaded from: classes3.dex */
public class ObservableByte extends a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new d(20);

    /* renamed from: a, reason: collision with root package name */
    public byte f18023a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f18023a);
    }
}
