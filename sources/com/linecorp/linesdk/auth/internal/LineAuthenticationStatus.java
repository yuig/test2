package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.internal.pkce.PKCECode;

/* loaded from: classes3.dex */
class LineAuthenticationStatus implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationStatus> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public PKCECode f34086a;

    /* renamed from: b, reason: collision with root package name */
    public String f34087b;

    /* renamed from: c, reason: collision with root package name */
    public String f34088c;

    /* renamed from: d, reason: collision with root package name */
    public String f34089d;

    /* renamed from: e, reason: collision with root package name */
    public h f34090e = h.INIT;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f34086a, i13);
        parcel.writeString(this.f34087b);
        parcel.writeByte((byte) this.f34090e.ordinal());
        parcel.writeString(this.f34088c);
        parcel.writeString(this.f34089d);
    }
}
