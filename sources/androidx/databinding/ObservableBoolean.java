package androidx.databinding;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import z5.a;

/* loaded from: classes3.dex */
public class ObservableBoolean extends a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new d(19);

    /* renamed from: a, reason: collision with root package name */
    public boolean f18022a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f18022a ? 1 : 0);
    }
}
