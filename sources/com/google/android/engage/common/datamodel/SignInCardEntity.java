package com.google.android.engage.common.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import tf.f;

@KeepName
/* loaded from: classes3.dex */
public class SignInCardEntity extends EngagementEntity {

    @NonNull
    public static final Parcelable.Creator<SignInCardEntity> CREATOR = new f(24);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int entityType = getEntityType();
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(entityType);
        bs1.c.L2(parcel, 2, getPosterImages(), false);
        bs1.c.I2(parcel, 3, this.f30266f, false);
        bs1.c.H2(parcel, 4, this.f30267g, i13, false);
        bs1.c.I2(parcel, 5, this.f30268h, false);
        bs1.c.I2(parcel, 6, this.f30269i, false);
        bs1.c.N2(parcel, M2);
    }
}
