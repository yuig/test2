package com.google.android.engage.video.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public final class LiveStreamingVideoEntity extends VideoEntity {

    @NonNull
    public static final Parcelable.Creator<LiveStreamingVideoEntity> CREATOR = new a(13);

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30320j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f30321k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f30322l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30323m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30324n;

    public LiveStreamingVideoEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13, Uri uri, Long l14, Long l15, String str2, String str3) {
        super(i13, arrayList, str, l13, i14, j13);
        b.j("Play back uri is not valid", uri != null);
        this.f30320j = uri;
        this.f30321k = l14;
        this.f30322l = l15;
        b.j("Broadcaster is not valid", true ^ TextUtils.isEmpty(str2));
        this.f30323m = str2;
        this.f30324n = str3;
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
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f30372h);
        c.O2(parcel, 6, 8);
        parcel.writeLong(this.f30373i);
        c.H2(parcel, 7, this.f30320j, i13, false);
        c.G2(parcel, 8, this.f30321k);
        c.G2(parcel, 9, this.f30322l);
        c.I2(parcel, 10, this.f30323m, false);
        c.I2(parcel, 11, this.f30324n, false);
        c.N2(parcel, M2);
    }
}
