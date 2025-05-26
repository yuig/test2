package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new vg.a(29);

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f30650f;

    public SaveAccountLinkingTokenResult(PendingIntent pendingIntent) {
        this.f30650f = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SaveAccountLinkingTokenResult) {
            return com.bumptech.glide.c.x(this.f30650f, ((SaveAccountLinkingTokenResult) obj).f30650f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30650f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f30650f, i13, false);
        bs1.c.N2(parcel, M2);
    }
}
