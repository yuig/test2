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
public class MusicAlbumEntity extends ResumableAudioEntity {

    @NonNull
    public static final Parcelable.Creator<MusicAlbumEntity> CREATOR = new f(3);

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30184k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f30185l;

    /* renamed from: m, reason: collision with root package name */
    public final List f30186m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f30187n;

    /* renamed from: o, reason: collision with root package name */
    public final List f30188o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30189p;

    /* renamed from: q, reason: collision with root package name */
    public final List f30190q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f30191r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f30192s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f30193t;

    /* renamed from: u, reason: collision with root package name */
    public final int f30194u;

    public MusicAlbumEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Integer num, int i14, Uri uri, Uri uri2, ArrayList arrayList2, Integer num2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, Long l14, Long l15, boolean z13, int i15) {
        super(i13, arrayList, str, l13, str2, num, i14);
        b.j("InfoPage Uri cannot be empty", uri != null);
        this.f30184k = uri;
        this.f30185l = uri2;
        this.f30187n = num2;
        this.f30186m = arrayList2;
        b.j("Artist list cannot be empty", !arrayList2.isEmpty());
        this.f30188o = arrayList3;
        this.f30189p = arrayList4;
        this.f30190q = arrayList5;
        this.f30191r = l14;
        this.f30192s = l15;
        this.f30193t = z13;
        this.f30194u = i15;
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
        c.H2(parcel, 8, this.f30184k, i13, false);
        c.H2(parcel, 9, this.f30185l, i13, false);
        c.J2(parcel, 10, this.f30186m);
        c.F2(parcel, 11, this.f30187n);
        c.J2(parcel, 12, this.f30188o);
        c.J2(parcel, 13, this.f30189p);
        c.J2(parcel, 14, this.f30190q);
        c.G2(parcel, 15, this.f30191r);
        c.G2(parcel, 16, this.f30192s);
        c.O2(parcel, 17, 4);
        parcel.writeInt(this.f30193t ? 1 : 0);
        c.O2(parcel, 18, 4);
        parcel.writeInt(this.f30194u);
        c.N2(parcel, M2);
    }
}
