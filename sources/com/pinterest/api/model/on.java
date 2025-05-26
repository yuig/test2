package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class on implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new Hero(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new Hero[i13];
    }
}
