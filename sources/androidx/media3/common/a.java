package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.DrmInitData;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new DrmInitData.SchemeData[i13];
    }
}
