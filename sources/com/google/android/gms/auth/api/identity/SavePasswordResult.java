package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public class SavePasswordResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new dh.b(1);

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f30654f;

    public SavePasswordResult(PendingIntent pendingIntent) {
        com.bumptech.glide.d.t(pendingIntent);
        this.f30654f = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return com.bumptech.glide.c.x(this.f30654f, ((SavePasswordResult) obj).f30654f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30654f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f30654f, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
