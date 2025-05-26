package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MaterialCheckBox.SavedState savedState = new MaterialCheckBox.SavedState(parcel);
        savedState.f32438a = ((Integer) parcel.readValue(MaterialCheckBox.SavedState.class.getClassLoader())).intValue();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new MaterialCheckBox.SavedState[i13];
    }
}
