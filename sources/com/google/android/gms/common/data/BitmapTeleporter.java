package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dh.b;

/* loaded from: classes3.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new b(18);

    /* renamed from: f, reason: collision with root package name */
    public final int f30916f;

    /* renamed from: g, reason: collision with root package name */
    public ParcelFileDescriptor f30917g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30918h;

    public BitmapTeleporter(int i13, ParcelFileDescriptor parcelFileDescriptor, int i14) {
        this.f30916f = i13;
        this.f30917g = parcelFileDescriptor;
        this.f30918h = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        if (this.f30917g == null) {
            d.t(null);
            throw null;
        }
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30916f);
        c.H2(parcel, 2, this.f30917g, i13 | 1, false);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30918h);
        c.N2(parcel, M2);
        this.f30917g = null;
    }
}
