package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19300b = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19302d = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19301c = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i13];
    }
}
