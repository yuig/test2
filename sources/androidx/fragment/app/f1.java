package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentTabHost;

/* loaded from: classes3.dex */
public final class f1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FragmentTabHost.SavedState savedState = new FragmentTabHost.SavedState(parcel);
        savedState.f18265a = parcel.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new FragmentTabHost.SavedState[i13];
    }
}
