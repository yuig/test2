package androidx.databinding;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import z5.a;

/* loaded from: classes3.dex */
public class ObservableFloat extends a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new d(23);

    /* renamed from: a, reason: collision with root package name */
    public float f18026a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeFloat(this.f18026a);
    }
}
