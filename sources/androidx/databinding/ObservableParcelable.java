package androidx.databinding;

import a.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import z5.b;

/* loaded from: classes3.dex */
public class ObservableParcelable<T extends Parcelable> extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new d(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable((Parcelable) this.f140855a, 0);
    }
}
