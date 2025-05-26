package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class kt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new InterestsFeed(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new InterestsFeed[i13];
    }
}
