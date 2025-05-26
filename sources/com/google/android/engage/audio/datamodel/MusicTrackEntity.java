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
public class MusicTrackEntity extends ResumableAudioEntity {

    @NonNull
    public static final Parcelable.Creator<MusicTrackEntity> CREATOR = new f(5);

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30197k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f30198l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f30199m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30200n;

    /* renamed from: o, reason: collision with root package name */
    public final List f30201o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30202p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f30203q;

    public MusicTrackEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Integer num, int i14, Uri uri, Long l14, Uri uri2, String str3, ArrayList arrayList2, ArrayList arrayList3, boolean z13) {
        super(i13, arrayList, str, l13, str2, num, i14);
        b.j("PlayBack Uri cannot be empty", uri != null);
        this.f30197k = uri;
        b.j("List of Artists cannot be empty", true ^ arrayList2.isEmpty());
        this.f30201o = arrayList2;
        this.f30198l = l14;
        this.f30199m = uri2;
        this.f30202p = arrayList3;
        this.f30200n = str3;
        this.f30203q = z13;
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
        c.H2(parcel, 8, this.f30197k, i13, false);
        c.G2(parcel, 9, this.f30198l);
        c.H2(parcel, 10, this.f30199m, i13, false);
        c.I2(parcel, 11, this.f30200n, false);
        c.J2(parcel, 12, this.f30201o);
        c.J2(parcel, 13, this.f30202p);
        c.O2(parcel, 14, 4);
        parcel.writeInt(this.f30203q ? 1 : 0);
        c.N2(parcel, M2);
    }
}
