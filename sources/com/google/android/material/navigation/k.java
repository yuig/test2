package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class k implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new NavigationBarView$SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new NavigationBarView$SavedState[i13];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new NavigationBarView$SavedState(parcel, null);
    }
}
