package com.pinterest.feature.search;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (parcel == null) {
            return null;
        }
        try {
            String readString = parcel.readString();
            if (readString != null) {
                return VisualSearchLocation.valueOf(readString);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new VisualSearchLocation[i13];
    }
}
