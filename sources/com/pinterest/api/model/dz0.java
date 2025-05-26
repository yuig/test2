package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class dz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new UserDidItDataFeed(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new UserDidItDataFeed[i13];
    }
}
