package com.pinterest.feature.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.view.ViewPagerLoadingFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new ViewPagerLoadingFragment.ViewPagerLoadingLocation();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ViewPagerLoadingFragment.ViewPagerLoadingLocation[i13];
    }
}
