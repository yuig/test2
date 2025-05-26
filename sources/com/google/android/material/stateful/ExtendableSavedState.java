package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.customview.view.a;
import g1.o0;

/* loaded from: classes3.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a(2);

    /* renamed from: c, reason: collision with root package name */
    public final o0 f33118c;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f33118c = new o0(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f33118c + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        o0 o0Var = this.f33118c;
        int i14 = o0Var.f63294c;
        parcel.writeInt(i14);
        String[] strArr = new String[i14];
        Bundle[] bundleArr = new Bundle[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            strArr[i15] = (String) o0Var.f(i15);
            bundleArr[i15] = (Bundle) o0Var.j(i15);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f33118c = new o0(readInt);
        for (int i13 = 0; i13 < readInt; i13++) {
            this.f33118c.put(strArr[i13], bundleArr[i13]);
        }
    }
}
