package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes3.dex */
public final class j3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f19303a = parcel.readInt();
        savedState.f19304b = parcel.readInt();
        int readInt = parcel.readInt();
        savedState.f19305c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            savedState.f19306d = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        savedState.f19307e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            savedState.f19308f = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f19310h = parcel.readInt() == 1;
        savedState.f19311i = parcel.readInt() == 1;
        savedState.f19312j = parcel.readInt() == 1;
        savedState.f19309g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new StaggeredGridLayoutManager.SavedState[i13];
    }
}
