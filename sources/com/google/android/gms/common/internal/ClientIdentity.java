package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new b(21);

    /* renamed from: f, reason: collision with root package name */
    public final int f30934f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30935g;

    public ClientIdentity(int i13, String str) {
        this.f30934f = i13;
        this.f30935g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f30934f == this.f30934f && c.x(clientIdentity.f30935g, this.f30935g);
    }

    public final int hashCode() {
        return this.f30934f;
    }

    public final String toString() {
        return this.f30934f + ":" + this.f30935g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30934f);
        bs1.c.I2(parcel, 2, this.f30935g, false);
        bs1.c.N2(parcel, M2);
    }
}
