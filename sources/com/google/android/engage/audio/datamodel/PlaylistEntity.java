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
public class PlaylistEntity extends ResumableAudioEntity {

    @NonNull
    public static final Parcelable.Creator<PlaylistEntity> CREATOR = new f(7);

    /* renamed from: k, reason: collision with root package name */
    public final Uri f30211k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f30212l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f30213m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f30214n;

    /* renamed from: o, reason: collision with root package name */
    public final List f30215o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f30216p;

    public PlaylistEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Integer num, int i14, Uri uri, Integer num2, Long l14, Uri uri2, ArrayList arrayList2, boolean z13) {
        super(i13, arrayList, str, l13, str2, num, i14);
        b.j("PlayBack Uri cannot be empty", uri != null);
        this.f30211k = uri;
        this.f30212l = num2;
        this.f30213m = l14;
        this.f30214n = uri2;
        this.f30215o = arrayList2;
        this.f30216p = z13;
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
        c.H2(parcel, 8, this.f30211k, i13, false);
        c.F2(parcel, 9, this.f30212l);
        c.G2(parcel, 10, this.f30213m);
        c.H2(parcel, 11, this.f30214n, i13, false);
        c.J2(parcel, 12, this.f30215o);
        c.O2(parcel, 13, 4);
        parcel.writeInt(this.f30216p ? 1 : 0);
        c.N2(parcel, M2);
    }
}
