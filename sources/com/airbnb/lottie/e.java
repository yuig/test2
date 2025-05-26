package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.f28373a = parcel.readString();
        savedState.f28375c = parcel.readFloat();
        savedState.f28376d = parcel.readInt() == 1;
        savedState.f28377e = parcel.readString();
        savedState.f28378f = parcel.readInt();
        savedState.f28379g = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new LottieAnimationView.SavedState[i13];
    }
}
