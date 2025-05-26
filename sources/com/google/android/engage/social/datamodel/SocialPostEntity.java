package com.google.android.engage.social.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;

@KeepName
/* loaded from: classes3.dex */
public class SocialPostEntity extends SocialEntity {

    @NonNull
    public static final Parcelable.Creator<SocialPostEntity> CREATOR = new vg.a(12);

    /* renamed from: h, reason: collision with root package name */
    public final GenericPost f30314h;

    /* renamed from: i, reason: collision with root package name */
    public final Profile f30315i;

    /* renamed from: j, reason: collision with root package name */
    public final List f30316j;

    public SocialPostEntity(int i13, ArrayList arrayList, Uri uri, ArrayList arrayList2, GenericPost genericPost, Profile profile, ArrayList arrayList3) {
        super(i13, arrayList, uri, arrayList2);
        bf.b.j("Generic Post is a required field.", genericPost != null);
        this.f30314h = genericPost;
        this.f30315i = profile;
        this.f30316j = arrayList3;
    }

    @Override // com.google.android.engage.common.datamodel.Entity
    public final void validatePosterImages(List list) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int entityType = getEntityType();
        c.O2(parcel, 1, 4);
        parcel.writeInt(entityType);
        c.L2(parcel, 2, getPosterImages(), false);
        c.H2(parcel, 3, this.f30312f, i13, false);
        c.L2(parcel, 4, this.f30313g, false);
        c.H2(parcel, 5, this.f30314h, i13, false);
        c.H2(parcel, 6, this.f30315i, i13, false);
        c.L2(parcel, 7, this.f30316j, false);
        c.N2(parcel, M2);
    }
}
