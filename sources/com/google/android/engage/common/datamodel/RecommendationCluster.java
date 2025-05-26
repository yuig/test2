package com.google.android.engage.common.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.util.List;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public final class RecommendationCluster extends Cluster {

    @NonNull
    public static final Parcelable.Creator<RecommendationCluster> CREATOR = new f(23);

    /* renamed from: f, reason: collision with root package name */
    public final String f30271f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30272g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30273h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f30274i;

    public RecommendationCluster(int i13, Uri uri, String str, String str2, String str3, List list) {
        super(i13, list);
        bf.b.j("Entity list cannot be empty", !list.isEmpty());
        bf.b.j("Title cannot be empty", !TextUtils.isEmpty(str));
        this.f30271f = str;
        this.f30272g = str2;
        this.f30273h = str3;
        this.f30274i = uri;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        bf.b.j("Action Uri cannot be empty when action text is passed", uri != null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int clusterType = getClusterType();
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(clusterType);
        bs1.c.L2(parcel, 2, getEntities(), false);
        bs1.c.I2(parcel, 3, this.f30271f, false);
        bs1.c.I2(parcel, 4, this.f30272g, false);
        bs1.c.I2(parcel, 5, this.f30273h, false);
        bs1.c.H2(parcel, 6, this.f30274i, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
