package com.google.android.engage.service;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bf.b;
import com.google.android.engage.common.datamodel.BaseCluster;
import pk.c1;
import vg.a;
import xg.f;

@Keep
/* loaded from: classes3.dex */
public class ClusterList implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ClusterList> CREATOR = new a(1);
    private final c1 clusters;

    public ClusterList(f fVar) {
        this.clusters = fVar.f134918a.i();
        b.j("Cluster list cannot be empty", !r2.isEmpty());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public c1 getClusters() {
        return this.clusters;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        if (this.clusters.isEmpty()) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(this.clusters.size());
        c1 c1Var = this.clusters;
        int size = c1Var.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((BaseCluster) c1Var.get(i14)).writeToParcel(parcel, i13);
        }
    }
}
