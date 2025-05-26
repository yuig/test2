package com.pinterest.recylerview.pinleveling;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.recylerview.pinleveling.PinLevelerSavedState;
import java.util.HashSet;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        PinLevelerSavedState pinLevelerSavedState = new PinLevelerSavedState();
        pinLevelerSavedState.f50376a = parcel.readSparseArray(String.class.getClassLoader());
        if (parcel.readInt() > 0) {
            PinLevelerSavedState.UidsToSizeParcelable uidsToSizeParcelable = (PinLevelerSavedState.UidsToSizeParcelable) parcel.readParcelable(PinLevelerSavedState.UidsToSizeParcelable.class.getClassLoader());
            pinLevelerSavedState.f50377b = uidsToSizeParcelable != null ? uidsToSizeParcelable.f50380a : null;
        }
        pinLevelerSavedState.f50378c = parcel.readHashMap(Integer.TYPE.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            HashSet destination = new HashSet(y0.a(readInt));
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            for (int i13 = 0; i13 < readInt; i13++) {
                destination.add(Integer.valueOf(iArr[i13]));
            }
            pinLevelerSavedState.f50379d = destination;
        }
        return pinLevelerSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PinLevelerSavedState[i13];
    }
}
