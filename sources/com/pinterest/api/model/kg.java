package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kg implements Parcelable.Creator {
    private kg() {
    }

    public /* synthetic */ kg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new CreatorRecommendationItemFeed(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new CreatorRecommendationItemFeed[i13];
    }
}
