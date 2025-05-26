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
public class PodcastSeriesEntity extends AudioEntity {

    @NonNull
    public static final Parcelable.Creator<PodcastSeriesEntity> CREATOR = new f(9);

    /* renamed from: i, reason: collision with root package name */
    public final Uri f30228i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30229j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f30230k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30231l;

    /* renamed from: m, reason: collision with root package name */
    public final List f30232m;

    /* renamed from: n, reason: collision with root package name */
    public final List f30233n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f30234o;

    /* renamed from: p, reason: collision with root package name */
    public final List f30235p;

    public PodcastSeriesEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Uri uri, Uri uri2, Integer num, String str3, ArrayList arrayList2, ArrayList arrayList3, boolean z13, ArrayList arrayList4) {
        super(i13, arrayList, str, l13, str2);
        b.j("InfoPage Uri cannot be empty", uri != null);
        this.f30228i = uri;
        this.f30229j = uri2;
        if (num != null) {
            b.j("Episode count is not valid", num.intValue() > 0);
        }
        this.f30230k = num;
        this.f30231l = str3;
        this.f30232m = arrayList2;
        this.f30233n = arrayList3;
        this.f30234o = z13;
        this.f30235p = arrayList4;
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
        c.H2(parcel, 6, this.f30228i, i13, false);
        c.H2(parcel, 7, this.f30229j, i13, false);
        c.F2(parcel, 8, this.f30230k);
        c.I2(parcel, 9, this.f30231l, false);
        c.J2(parcel, 10, this.f30232m);
        c.J2(parcel, 11, this.f30233n);
        c.O2(parcel, 12, 4);
        parcel.writeInt(this.f30234o ? 1 : 0);
        c.J2(parcel, 13, this.f30235p);
        c.N2(parcel, M2);
    }
}
