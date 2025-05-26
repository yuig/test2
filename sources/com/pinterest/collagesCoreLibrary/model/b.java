package com.pinterest.collagesCoreLibrary.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        CutoutPickerOrigin createFromParcel = CutoutPickerOrigin.CREATOR.createFromParcel(parcel);
        Intrinsics.checkNotNullExpressionValue(createFromParcel, "createFromParcel(...)");
        return new CutoutPickerPage.OriginPage(createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new CutoutPickerPage.OriginPage[i13];
    }
}
