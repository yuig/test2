package com.pinterest.ui.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.ui.text.DescriptionEditView;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        DescriptionEditView.SavedState savedState = new DescriptionEditView.SavedState(parcel);
        savedState.f52651a = parcel.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new DescriptionEditView.SavedState[i13];
    }
}
