package com.google.android.engage.common.datamodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import tf.f;

@Keep
/* loaded from: classes3.dex */
public final class Image extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Image> CREATOR = new f(19);
    private final int imageHeightInPixel;
    private final Uri imageUri;
    private final int imageWidthInPixel;

    @Keep
    public static final class Builder {
        private Uri imageUri;
        private int imageHeightInPixel = -1;
        private int imageWidthInPixel = -1;

        @NonNull
        public Image build() {
            return new Image(this.imageUri, this.imageHeightInPixel, this.imageWidthInPixel);
        }

        @NonNull
        public Builder setImageHeightInPixel(int i13) {
            this.imageHeightInPixel = i13;
            return this;
        }

        @NonNull
        public Builder setImageUri(@NonNull Uri uri) {
            this.imageUri = uri;
            return this;
        }

        @NonNull
        public Builder setImageWidthInPixel(int i13) {
            this.imageWidthInPixel = i13;
            return this;
        }
    }

    public Image(Uri uri, int i13, int i14) {
        bf.b.j("Poster image uri cannot be null", uri != null);
        bf.b.j("Poster image height in pixel is not valid", i13 > 0);
        bf.b.j("Poster image Width in pixel is not valid", i14 > 0);
        this.imageUri = uri;
        this.imageHeightInPixel = i13;
        this.imageWidthInPixel = i14;
    }

    public int getImageHeightInPixel() {
        return this.imageHeightInPixel;
    }

    @NonNull
    public Uri getImageUri() {
        return this.imageUri;
    }

    public int getImageWidthInPixel() {
        return this.imageWidthInPixel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.H2(parcel, 1, getImageUri(), i13, false);
        int imageHeightInPixel = getImageHeightInPixel();
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(imageHeightInPixel);
        int imageWidthInPixel = getImageWidthInPixel();
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(imageWidthInPixel);
        bs1.c.N2(parcel, M2);
    }
}
