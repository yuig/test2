package com.google.android.engage.common.datamodel;

import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import tf.f;

@Keep
/* loaded from: classes3.dex */
public abstract class BaseCluster extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BaseCluster> CREATOR = new f(13);
    protected final int clusterType;

    @Keep
    public static abstract class Builder {
        @NonNull
        public abstract BaseCluster build();
    }

    public BaseCluster(int i13) {
        this.clusterType = i13;
    }

    public int getClusterType() {
        return this.clusterType;
    }
}
