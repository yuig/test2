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
public class MusicVideoEntity extends ResumableAudioEntity {

    @NonNull
    public static final Parcelable.Creator<MusicVideoEntity> CREATOR = new f(6);

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30204k;

    /* renamed from: l, reason: collision with root package name */
    public final long f30205l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f30206m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30207n;

    /* renamed from: o, reason: collision with root package name */
    public final List f30208o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30209p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f30210q;

    public MusicVideoEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Integer num, int i14, Uri uri, long j13, Uri uri2, String str3, ArrayList arrayList2, ArrayList arrayList3, boolean z13) {
        super(i13, arrayList, str, l13, str2, num, i14);
        b.j("PlayBack Uri cannot be empty", uri != null);
        this.f30204k = uri;
        b.j("Duration is not valid", j13 > 0);
        this.f30205l = j13;
        this.f30206m = uri2;
        this.f30207n = str3;
        this.f30208o = arrayList2;
        this.f30209p = arrayList3;
        this.f30210q = z13;
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
        c.F2(parcel, 6, this.f30236i);
        c.O2(parcel, 7, 4);
        parcel.writeInt(this.f30237j);
        c.H2(parcel, 8, this.f30204k, i13, false);
        c.O2(parcel, 9, 8);
        parcel.writeLong(this.f30205l);
        c.H2(parcel, 10, this.f30206m, i13, false);
        c.I2(parcel, 11, this.f30207n, false);
        c.J2(parcel, 12, this.f30208o);
        c.J2(parcel, 13, this.f30209p);
        c.O2(parcel, 14, 4);
        parcel.writeInt(this.f30210q ? 1 : 0);
        c.N2(parcel, M2);
    }
}
