package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

/* loaded from: classes3.dex */
public final class a implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18021a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f18021a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f18019b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new ParcelableSparseArray(parcel, classLoader);
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f18021a) {
            case 0:
                return new AbsSavedState[i13];
            case 1:
                return new ParcelableSparseArray[i13];
            default:
                return new ExtendableSavedState[i13];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18021a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f18019b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new ParcelableSparseArray(parcel, null);
            default:
                return new ExtendableSavedState(parcel, null);
        }
    }
}
