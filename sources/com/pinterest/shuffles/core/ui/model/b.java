package com.pinterest.shuffles.core.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.shuffles.core.ui.model.CutoutArgs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new CutoutArgs.SearchedPin(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new CutoutArgs.SearchedPin[i13];
    }
}
