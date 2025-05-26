package com.google.android.gms.auth.api.proxy;

import a.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new b(4);

    /* renamed from: f, reason: collision with root package name */
    public final String f30673f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30674g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30675h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f30676i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30677j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f30678k;

    public ProxyRequest(int i13, String str, int i14, long j13, byte[] bArr, Bundle bundle) {
        this.f30677j = i13;
        this.f30673f = str;
        this.f30674g = i14;
        this.f30675h = j13;
        this.f30676i = bArr;
        this.f30678k = bundle;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProxyRequest[ url: ");
        sb3.append(this.f30673f);
        sb3.append(", method: ");
        return a.n(sb3, this.f30674g, " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f30673f, false);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30674g);
        c.O2(parcel, 3, 8);
        parcel.writeLong(this.f30675h);
        c.B2(parcel, 4, this.f30676i, false);
        c.A2(parcel, 5, this.f30678k);
        c.O2(parcel, 1000, 4);
        parcel.writeInt(this.f30677j);
        c.N2(parcel, M2);
    }
}
