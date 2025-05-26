package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import vg.a;

/* loaded from: classes3.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new a(23);

    /* renamed from: f, reason: collision with root package name */
    public final int f30568f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30569g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30570h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30571i;

    public DeviceMetaData(int i13, boolean z13, long j13, boolean z14) {
        this.f30568f = i13;
        this.f30569g = z13;
        this.f30570h = j13;
        this.f30571i = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30568f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f30569g ? 1 : 0);
        c.O2(parcel, 3, 8);
        parcel.writeLong(this.f30570h);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f30571i ? 1 : 0);
        c.N2(parcel, M2);
    }
}
