package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import dh.b;

@KeepName
/* loaded from: classes3.dex */
public final class BinderWrapper implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new b(28);

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f30933a;

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.f30933a = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStrongBinder(this.f30933a);
    }
}
