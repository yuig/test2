package com.google.android.engage.audio.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class MusicArtistEntity extends AudioEntity {

    @NonNull
    public static final Parcelable.Creator<MusicArtistEntity> CREATOR = new f(4);

    /* renamed from: i, reason: collision with root package name */
    public final Uri f30195i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f30196j;

    public MusicArtistEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Uri uri, Uri uri2) {
        super(i13, arrayList, str, l13, str2);
        b.j("InfoPage Uri cannot be empty", uri != null);
        this.f30195i = uri;
        this.f30196j = uri2;
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
        c.H2(parcel, 6, this.f30195i, i13, false);
        c.H2(parcel, 7, this.f30196j, i13, false);
        c.N2(parcel, M2);
    }
}
