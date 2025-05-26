package com.pinterest.feature.home.viewpager;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.home.viewpager.ViewPagerLoadingFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
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
