package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec itemSizeSpec = new PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        itemSizeSpec.f19183a = readString;
        itemSizeSpec.f19184b = parcel.readInt();
        itemSizeSpec.f19185c = parcel.readInt();
        itemSizeSpec.f19186d = parcel.readInt();
        itemSizeSpec.f19187e = parcel.readInt();
        itemSizeSpec.f19188f = parcel.readInt();
        itemSizeSpec.f19189g = parcel.readInt();
        itemSizeSpec.f19190h = parcel.readInt();
        return itemSizeSpec;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec[i13];
    }
}
