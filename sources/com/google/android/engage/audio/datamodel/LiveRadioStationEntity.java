package com.google.android.engage.audio.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class LiveRadioStationEntity extends AudioEntity {

    @NonNull
    public static final Parcelable.Creator<LiveRadioStationEntity> CREATOR = new f(2);

    /* renamed from: i, reason: collision with root package name */
    public final Uri f30179i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30180j;

    /* renamed from: k, reason: collision with root package name */
    public final List f30181k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30182l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30183m;

    public LiveRadioStationEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Uri uri, Uri uri2, ArrayList arrayList2, String str3, String str4) {
        super(i13, arrayList, str, l13, str2);
        this.f30181k = arrayList2;
        b.j("PlayBack Uri cannot be empty", uri != null);
        this.f30179i = uri;
        this.f30180j = uri2;
        this.f30183m = str4;
        this.f30182l = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int entityType = getEntityType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(entityType);
        c.L2(parcel, 2, getPosterImages(), false);
        c.I2(parcel, 3, this.f30270f, false);
        c.G2(parcel, 4, this.f30265g);
        c.I2(parcel, 5, this.f30178h, false);
        c.H2(parcel, 6, this.f30179i, i13, false);
        c.H2(parcel, 7, this.f30180j, i13, false);
        c.J2(parcel, 8, this.f30181k);
        c.I2(parcel, 9, this.f30182l, false);
        c.I2(parcel, 10, this.f30183m, false);
        c.N2(parcel, M2);
    }
}
