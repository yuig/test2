package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i2.u1;

@Deprecated
/* loaded from: classes.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new u1(9);

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f30636f;

    public BeginSignInResult(PendingIntent pendingIntent) {
        com.bumptech.glide.d.t(pendingIntent);
        this.f30636f = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f30636f, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
