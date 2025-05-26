package com.google.android.engage.common.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class EngagementCluster extends Cluster {

    @NonNull
    public static final Parcelable.Creator<EngagementCluster> CREATOR = new f(16);

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
