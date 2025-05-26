package com.pinterest.recylerview.pinleveling;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.r1;
import com.pinterest.recylerview.pinleveling.PinLevelerSavedState;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        PinLevelerSavedState.UidsToSizeParcelable uidsToSizeParcelable = new PinLevelerSavedState.UidsToSizeParcelable();
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap();
        int i13 = 1;
        if (1 <= readInt) {
            while (true) {
                hashMap.put(parcel.readString(), (PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec) parcel.readParcelable(r1.class.getClassLoader()));
                if (i13 == readInt) {
                    break;
                }
                i13++;
            }
        }
        uidsToSizeParcelable.f50380a = hashMap;
        return uidsToSizeParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PinLevelerSavedState.UidsToSizeParcelable[i13];
    }
}
