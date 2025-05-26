package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes3.dex */
public final class q implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, null);
        savedState.f19940a = parcel.readInt();
        savedState.f19941b = parcel.readInt();
        savedState.f19942c = parcel.readParcelable(null);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ViewPager2.SavedState[i13];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, classLoader);
        savedState.f19940a = parcel.readInt();
        savedState.f19941b = parcel.readInt();
        savedState.f19942c = parcel.readParcelable(classLoader);
        return savedState;
    }
}
