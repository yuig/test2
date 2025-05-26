package com.pinterest.collagesCoreLibrary.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        return new CutoutPickerPage.BoardPage(readString, readString2 != null ? readString2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new CutoutPickerPage.BoardPage[i13];
    }
}
