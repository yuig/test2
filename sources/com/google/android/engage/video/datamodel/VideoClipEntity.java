package com.google.android.engage.video.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public final class VideoClipEntity extends VideoEntity {

    @NonNull
    public static final Parcelable.Creator<VideoClipEntity> CREATOR = new a(18);

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30365j;

    /* renamed from: k, reason: collision with root package name */
    public final long f30366k;

    /* renamed from: l, reason: collision with root package name */
    public final long f30367l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30368m;

    /* renamed from: n, reason: collision with root package name */
    public final String f30369n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f30370o;

    /* renamed from: p, reason: collision with root package name */
    public final Image f30371p;

    public VideoClipEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13, Uri uri, long j14, long j15, String str2, String str3, boolean z13, Image image) {
        super(i13, arrayList, str, l13, i14, j13);
        b.j("Play back uri is not valid", uri != null);
        this.f30365j = uri;
        b.j("Created time is not valid", j14 > Long.MIN_VALUE);
        this.f30366k = j14;
        b.j("Duration is not valid", j15 > 0);
        this.f30367l = j15;
        b.j("Broadcaster is not valid", !TextUtils.isEmpty(str2));
        this.f30368m = str2;
        this.f30369n = str3;
        this.f30370o = z13;
        this.f30371p = image;
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
        c.H2(parcel, 7, this.f30365j, i13, false);
        c.O2(parcel, 8, 8);
        parcel.writeLong(this.f30366k);
        c.O2(parcel, 9, 8);
        parcel.writeLong(this.f30367l);
        c.I2(parcel, 10, this.f30368m, false);
        c.I2(parcel, 11, this.f30369n, false);
        c.O2(parcel, 12, 4);
        parcel.writeInt(this.f30370o ? 1 : 0);
        c.H2(parcel, 13, this.f30371p, i13, false);
        c.N2(parcel, M2);
    }
}
