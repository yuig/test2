package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.LineIdToken;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new LineIdToken.Address(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new LineIdToken.Address[i13];
    }
}
