package com.google.android.engage.social.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ok.v;

@Keep
/* loaded from: classes3.dex */
public class Profile extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Profile> CREATOR = new vg.a(11);
    private final Image additionalImage;
    private final String additionalText;
    private final Image avatar;
    private final String name;

    @Keep
    public static final class Builder {
        private Image additionalImage;
        private String additionalText;
        private Image avatar;
        private String name;

        @NonNull
        public Profile build() {
            return new Profile(this.name, this.additionalText, this.avatar, this.additionalImage);
        }

        @NonNull
        public Builder setAdditionalImage(@NonNull Image image) {
            this.additionalImage = image;
            return this;
        }

        @NonNull
        public Builder setAdditionalText(@NonNull String str) {
            this.additionalText = str;
            return this;
        }

        @NonNull
        public Builder setAvatar(@NonNull Image image) {
            this.avatar = image;
            return this;
        }

        @NonNull
        public Builder setName(@NonNull String str) {
            this.name = str;
            return this;
        }
    }

    public Profile(@NonNull String str, String str2, @NonNull Image image, Image image2) {
        bf.b.j("Name must be present.", !TextUtils.isEmpty(str));
        this.name = str;
        this.additionalText = str2;
        bf.b.j("Avatar image must be present.", image != null);
        this.avatar = image;
        this.additionalImage = image2;
    }

    @NonNull
    public v getAdditionalImage() {
        return v.a(this.additionalImage);
    }

    public Image getAdditionalImageInternal() {
        return this.additionalImage;
    }

    @NonNull
    public v getAdditionalText() {
        return !TextUtils.isEmpty(this.additionalText) ? v.d(this.additionalText) : ok.a.f95409a;
    }

    public String getAdditionalTextInternal() {
        return this.additionalText;
    }

    @NonNull
    public Image getAvatar() {
        return this.avatar;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, getName(), false);
        c.I2(parcel, 2, getAdditionalTextInternal(), false);
        c.H2(parcel, 3, getAvatar(), i13, false);
        c.H2(parcel, 4, getAdditionalImageInternal(), i13, false);
        c.N2(parcel, M2);
    }
}
