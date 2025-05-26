package oi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class v3 extends ai.a implements t3 {
    public v3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // oi.t3
    public final void A(zznc zzncVar, zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzncVar);
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 2);
    }

    @Override // oi.t3
    public final List a(Bundle bundle, zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        com.google.android.gms.internal.measurement.h0.c(j13, bundle);
        Parcel G = G(j13, 24);
        ArrayList createTypedArrayList = G.createTypedArrayList(zzmh.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    @Override // oi.t3
    public final List b(String str, String str2, zzo zzoVar) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        Parcel G = G(j13, 16);
        ArrayList createTypedArrayList = G.createTypedArrayList(zzad.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    @Override // oi.t3
    public final List d(String str, String str2, String str3, boolean z13) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        j13.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.h0.f31413a;
        j13.writeInt(z13 ? 1 : 0);
        Parcel G = G(j13, 15);
        ArrayList createTypedArrayList = G.createTypedArrayList(zznc.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    @Override // oi.t3
    public final void g(long j13, String str, String str2, String str3) {
        Parcel j14 = j();
        j14.writeLong(j13);
        j14.writeString(str);
        j14.writeString(str2);
        j14.writeString(str3);
        H(j14, 10);
    }

    @Override // oi.t3
    public final List h(String str, String str2, String str3) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        j13.writeString(str3);
        Parcel G = G(j13, 17);
        ArrayList createTypedArrayList = G.createTypedArrayList(zzad.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    @Override // oi.t3
    public final zzam i(zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        Parcel G = G(j13, 21);
        zzam zzamVar = (zzam) com.google.android.gms.internal.measurement.h0.a(G, zzam.CREATOR);
        G.recycle();
        return zzamVar;
    }

    @Override // oi.t3
    public final void n(zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 18);
    }

    @Override // oi.t3
    public final void o(zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 20);
    }

    @Override // oi.t3
    public final void p(zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 6);
    }

    @Override // oi.t3
    public final String q(zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        Parcel G = G(j13, 11);
        String readString = G.readString();
        G.recycle();
        return readString;
    }

    @Override // oi.t3
    public final void r(zzbg zzbgVar, zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzbgVar);
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 1);
    }

    @Override // oi.t3
    public final byte[] s(zzbg zzbgVar, String str) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzbgVar);
        j13.writeString(str);
        Parcel G = G(j13, 9);
        byte[] createByteArray = G.createByteArray();
        G.recycle();
        return createByteArray;
    }

    @Override // oi.t3
    public final void t(zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 4);
    }

    @Override // oi.t3
    public final List w(String str, String str2, boolean z13, zzo zzoVar) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.h0.f31413a;
        j13.writeInt(z13 ? 1 : 0);
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        Parcel G = G(j13, 14);
        ArrayList createTypedArrayList = G.createTypedArrayList(zznc.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    @Override // oi.t3
    public final void z(zzad zzadVar, zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, zzadVar);
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 12);
    }

    @Override // oi.t3
    /* renamed from: a */
    public final void mo198a(Bundle bundle, zzo zzoVar) {
        Parcel j13 = j();
        com.google.android.gms.internal.measurement.h0.c(j13, bundle);
        com.google.android.gms.internal.measurement.h0.c(j13, zzoVar);
        H(j13, 19);
    }
}
