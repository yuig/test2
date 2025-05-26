package com.google.android.engage.service;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.b;
import com.google.android.gms.common.annotation.KeepName;
import pk.v2;
import vg.a;

@KeepName
/* loaded from: classes3.dex */
public class ClusterMetadata implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ClusterMetadata> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final v2 f30296a;

    public ClusterMetadata(xg.a aVar) {
        this.f30296a = aVar.f134906a.i();
        b.j("Cluster Type list cannot be empty", !r2.isEmpty());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        v2 v2Var = this.f30296a;
        if (v2Var.isEmpty()) {
            parcel.writeInt(0);
            return;
        }
        int i14 = v2Var.f100504d;
        parcel.writeInt(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            parcel.writeInt(((Integer) v2Var.get(i15)).intValue());
        }
    }
}
