package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new b(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f30717f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30718g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f30719h;

    public GoogleSignInOptionsExtensionParcelable(int i13, int i14, Bundle bundle) {
        this.f30717f = i13;
        this.f30718g = i14;
        this.f30719h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30717f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30718g);
        c.A2(parcel, 3, this.f30719h);
        c.N2(parcel, M2);
    }
}
