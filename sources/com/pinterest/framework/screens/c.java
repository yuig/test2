package com.pinterest.framework.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new BlankScreen$BlankLocation();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new BlankScreen$BlankLocation[i13];
    }
}
