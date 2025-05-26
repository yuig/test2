package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ih.m;
import ih.n;
import jh.n0;
import jh.o0;
import jh.x;
import lh.a;
import rh.b;

/* loaded from: classes3.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new a(16);

    /* renamed from: f */
    public final String f31069f;

    /* renamed from: g */
    public final m f31070g;

    /* renamed from: h */
    public final boolean f31071h;

    /* renamed from: i */
    public final boolean f31072i;

    public zzs(String str, m mVar, boolean z13, boolean z14) {
        this.f31069f = str;
        this.f31070g = mVar;
        this.f31071h = z13;
        this.f31072i = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, this.f31069f, false);
        m mVar = this.f31070g;
        if (mVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            mVar = null;
        }
        c.E2(parcel, 2, mVar);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31071h ? 1 : 0);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31072i ? 1 : 0);
        c.N2(parcel, M2);
    }

    public zzs(String str, IBinder iBinder, boolean z13, boolean z14) {
        this.f31069f = str;
        n nVar = null;
        if (iBinder != null) {
            try {
                int i13 = o0.f76187b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                rh.a zzd = (queryLocalInterface instanceof x ? (x) queryLocalInterface : new n0(iBinder)).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) b.E(zzd);
                if (bArr != null) {
                    nVar = new n(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e13) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e13);
            }
        }
        this.f31070g = nVar;
        this.f31071h = z13;
        this.f31072i = z14;
    }
}
