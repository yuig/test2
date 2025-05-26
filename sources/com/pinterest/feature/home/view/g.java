package com.pinterest.feature.home.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;

/* loaded from: classes5.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InitialLoadSwipeRefreshLayout.InitialLoadSwipeRefreshSavedState initialLoadSwipeRefreshSavedState = new InitialLoadSwipeRefreshLayout.InitialLoadSwipeRefreshSavedState(parcel);
        initialLoadSwipeRefreshSavedState.f45839a = parcel.readInt();
        return initialLoadSwipeRefreshSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new InitialLoadSwipeRefreshLayout.InitialLoadSwipeRefreshSavedState[i13];
    }
}
