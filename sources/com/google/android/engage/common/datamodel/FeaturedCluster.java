package com.google.android.engage.common.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class FeaturedCluster extends Cluster {

    @NonNull
    public static final Parcelable.Creator<FeaturedCluster> CREATOR = new f(18);

    public FeaturedCluster(int i13, ArrayList arrayList) {
        super(i13, arrayList);
        bf.b.j("Entity list cannot be empty", !arrayList.isEmpty());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int clusterType = getClusterType();
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(clusterType);
        bs1.c.L2(parcel, 2, getEntities(), false);
        bs1.c.N2(parcel, M2);
    }
}
