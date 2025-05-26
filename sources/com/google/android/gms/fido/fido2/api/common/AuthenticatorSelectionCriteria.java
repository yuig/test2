package com.google.android.gms.fido.fido2.api.common;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new vh.f(15);

    /* renamed from: f, reason: collision with root package name */
    public final Attachment f31104f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f31105g;

    /* renamed from: h, reason: collision with root package name */
    public final UserVerificationRequirement f31106h;

    /* renamed from: i, reason: collision with root package name */
    public final ResidentKeyRequirement f31107i;

    public AuthenticatorSelectionCriteria(String str, String str2, String str3, Boolean bool) {
        Attachment fromString;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e13) {
                throw new IllegalArgumentException(e13);
            }
        }
        this.f31104f = fromString;
        this.f31105g = bool;
        this.f31106h = str2 == null ? null : UserVerificationRequirement.fromString(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.fromString(str3);
        }
        this.f31107i = residentKeyRequirement;
    }

    public final ResidentKeyRequirement e() {
        ResidentKeyRequirement residentKeyRequirement = this.f31107i;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f31105g;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return com.bumptech.glide.c.x(this.f31104f, authenticatorSelectionCriteria.f31104f) && com.bumptech.glide.c.x(this.f31105g, authenticatorSelectionCriteria.f31105g) && com.bumptech.glide.c.x(this.f31106h, authenticatorSelectionCriteria.f31106h) && com.bumptech.glide.c.x(e(), authenticatorSelectionCriteria.e());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31104f, this.f31105g, this.f31106h, e()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31104f);
        String valueOf2 = String.valueOf(this.f31106h);
        String valueOf3 = String.valueOf(this.f31107i);
        StringBuilder o13 = cb.o("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        o13.append(this.f31105g);
        o13.append(", \n requireUserVerification=");
        o13.append(valueOf2);
        o13.append(", \n residentKeyRequirement=");
        return a.a.p(o13, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        Attachment attachment = this.f31104f;
        bs1.c.I2(parcel, 2, attachment == null ? null : attachment.toString(), false);
        Boolean bool = this.f31105g;
        if (bool != null) {
            bs1.c.O2(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.f31106h;
        bs1.c.I2(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        ResidentKeyRequirement e13 = e();
        bs1.c.I2(parcel, 5, e13 != null ? e13.toString() : null, false);
        bs1.c.N2(parcel, M2);
    }
}
