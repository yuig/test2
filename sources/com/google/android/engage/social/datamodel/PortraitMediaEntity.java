package com.google.android.engage.social.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.annotation.KeepName;
import java.util.List;

@KeepName
/* loaded from: classes3.dex */
public class PortraitMediaEntity extends SocialEntity {

    @NonNull
    public static final Parcelable.Creator<PortraitMediaEntity> CREATOR = new vg.a(9);

    /* renamed from: h, reason: collision with root package name */
    public final PortraitMediaPost f30307h;

    /* renamed from: i, reason: collision with root package name */
    public final Profile f30308i;

    /* renamed from: j, reason: collision with root package name */
    public final Interaction f30309j;

    public PortraitMediaEntity(int i13, List list, Uri uri, List list2, PortraitMediaPost portraitMediaPost, Profile profile, Interaction interaction) {
        super(i13, list, uri, list2);
        bf.b.j("Portrait Media Post is a required field.", portraitMediaPost != null);
        this.f30307h = portraitMediaPost;
        this.f30308i = profile;
        this.f30309j = interaction;
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
        c.H2(parcel, 5, this.f30307h, i13, false);
        c.H2(parcel, 6, this.f30308i, i13, false);
        c.H2(parcel, 7, this.f30309j, i13, false);
        c.N2(parcel, M2);
    }
}
