package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new dh.b(0);

    /* renamed from: f, reason: collision with root package name */
    public final SignInPassword f30651f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30652g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30653h;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i13) {
        com.bumptech.glide.d.t(signInPassword);
        this.f30651f = signInPassword;
        this.f30652g = str;
        this.f30653h = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return com.bumptech.glide.c.x(this.f30651f, savePasswordRequest.f30651f) && com.bumptech.glide.c.x(this.f30652g, savePasswordRequest.f30652g) && this.f30653h == savePasswordRequest.f30653h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30651f, this.f30652g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, this.f30651f, i13, false);
        bs1.c.I2(parcel, 2, this.f30652g, false);
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(this.f30653h);
        bs1.c.N2(parcel, M2);
    }
}
