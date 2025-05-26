package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new b(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f30679f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f30680g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30681h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f30682i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30683j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f30684k;

    public ProxyResponse(int i13, int i14, PendingIntent pendingIntent, int i15, Bundle bundle, byte[] bArr) {
        this.f30683j = i13;
        this.f30679f = i14;
        this.f30681h = i15;
        this.f30684k = bundle;
        this.f30682i = bArr;
        this.f30680g = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30679f);
        c.H2(parcel, 2, this.f30680g, i13, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30681h);
        c.A2(parcel, 4, this.f30684k);
        c.B2(parcel, 5, this.f30682i, false);
        c.O2(parcel, 1000, 4);
        parcel.writeInt(this.f30683j);
        c.N2(parcel, M2);
    }
}
