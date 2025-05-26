package com.google.android.engage.audio.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class PodcastEpisodeEntity extends ResumableAudioEntity {

    @NonNull
    public static final Parcelable.Creator<PodcastEpisodeEntity> CREATOR = new f(8);

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30217k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f30218l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30219m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30220n;

    /* renamed from: o, reason: collision with root package name */
    public final long f30221o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f30222p;

    /* renamed from: q, reason: collision with root package name */
    public final List f30223q;

    /* renamed from: r, reason: collision with root package name */
    public final List f30224r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30225s;

    /* renamed from: t, reason: collision with root package name */
    public final List f30226t;

    /* renamed from: u, reason: collision with root package name */
    public final long f30227u;

    public PodcastEpisodeEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Integer num, int i14, Uri uri, Uri uri2, String str3, String str4, long j13, Integer num2, ArrayList arrayList2, ArrayList arrayList3, boolean z13, ArrayList arrayList4, long j14) {
        super(i13, arrayList, str, l13, str2, num, i14);
        b.j("PlayBack Uri cannot be empty", uri != null);
        this.f30217k = uri;
        this.f30218l = uri2;
        b.j("Podcast series name cannot be empty.", !TextUtils.isEmpty(str3));
        this.f30219m = str3;
        b.j("Production name cannot be empty.", !TextUtils.isEmpty(str4));
        this.f30220n = str4;
        b.j("Duration is not valid", j13 > 0);
        this.f30221o = j13;
        if (num2 != null) {
            b.j("Episode index should be a positive value", num2.intValue() > 0);
        }
        this.f30222p = num2;
        this.f30223q = arrayList2;
        this.f30224r = arrayList3;
        this.f30225s = z13;
        this.f30226t = arrayList4;
        b.j("Publish Date must be set", j14 > 0);
        this.f30227u = j14;
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
        c.H2(parcel, 8, this.f30217k, i13, false);
        c.H2(parcel, 9, this.f30218l, i13, false);
        c.I2(parcel, 10, this.f30219m, false);
        c.I2(parcel, 11, this.f30220n, false);
        c.O2(parcel, 12, 8);
        parcel.writeLong(this.f30221o);
        c.F2(parcel, 13, this.f30222p);
        c.J2(parcel, 14, this.f30223q);
        c.J2(parcel, 15, this.f30224r);
        c.O2(parcel, 16, 4);
        parcel.writeInt(this.f30225s ? 1 : 0);
        c.J2(parcel, 17, this.f30226t);
        c.O2(parcel, 18, 8);
        parcel.writeLong(this.f30227u);
        c.N2(parcel, M2);
    }
}
