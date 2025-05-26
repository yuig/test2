package com.google.android.engage.common.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ok.v;
import tf.f;

@Keep
/* loaded from: classes3.dex */
public class LinkPreview extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LinkPreview> CREATOR = new f(20);
    private final String hostname;
    private final Image image;
    private final String title;

    @Keep
    public static final class Builder {
        private String hostname;
        private Image image;
        private String title;

        @NonNull
        public LinkPreview build() {
            return new LinkPreview(this.title, this.hostname, this.image);
        }

        @NonNull
        public Builder setHostname(@NonNull String str) {
            this.hostname = str;
            return this;
        }

        @NonNull
        public Builder setImage(@NonNull Image image) {
            this.image = image;
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.title = str;
            return this;
        }
    }

    public LinkPreview(String str, String str2, Image image) {
        bf.b.j("Title is a required field.", str != null);
        this.title = str;
        bf.b.j("Hostname is a required field.", str2 != null);
        this.hostname = str2;
        this.image = image;
    }

    @NonNull
    public String getHostname() {
        return this.hostname;
    }

    @NonNull
    public v getImage() {
        return v.a(this.image);
    }

    public Image getImageInternal() {
        return this.image;
    }

    @NonNull
    public String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, getTitle(), false);
        bs1.c.I2(parcel, 2, getHostname(), false);
        bs1.c.H2(parcel, 3, getImageInternal(), i13, false);
        bs1.c.N2(parcel, M2);
    }
}
