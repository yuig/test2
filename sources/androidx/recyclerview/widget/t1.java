package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import com.pinterest.recylerview.pinleveling.PinLevelerSavedState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in3) {
        Intrinsics.checkNotNullParameter(in3, "in");
        Intrinsics.checkNotNullParameter(in3, "in");
        PinterestStaggeredGridLayoutManagerImpl.SavedState savedState = new PinterestStaggeredGridLayoutManagerImpl.SavedState();
        savedState.f19214k = new PinLevelerSavedState();
        savedState.f19204a = in3.readInt();
        savedState.f19205b = in3.readInt();
        int readInt = in3.readInt();
        savedState.f19206c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            savedState.f19207d = iArr;
            in3.readIntArray(iArr);
        }
        int readInt2 = in3.readInt();
        savedState.f19208e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            savedState.f19209f = iArr2;
            in3.readIntArray(iArr2);
        }
        savedState.f19211h = in3.readInt() == 1;
        savedState.f19212i = in3.readInt() == 1;
        savedState.f19213j = in3.readInt() == 1;
        savedState.f19210g = dl2.b.t(in3.readArrayList(PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.class.getClassLoader()));
        Parcelable readParcelable = in3.readParcelable(PinLevelerSavedState.class.getClassLoader());
        Intrinsics.g(readParcelable, "null cannot be cast to non-null type com.pinterest.recylerview.pinleveling.PinLevelerSavedState");
        savedState.f19214k = (PinLevelerSavedState) readParcelable;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PinterestStaggeredGridLayoutManagerImpl.SavedState[i13];
    }
}
