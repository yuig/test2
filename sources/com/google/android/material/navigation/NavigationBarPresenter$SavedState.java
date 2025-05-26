package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes3.dex */
class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<NavigationBarPresenter$SavedState> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public int f32824a;

    /* renamed from: b, reason: collision with root package name */
    public ParcelableSparseArray f32825b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f32824a);
        parcel.writeParcelable(this.f32825b, 0);
    }
}
