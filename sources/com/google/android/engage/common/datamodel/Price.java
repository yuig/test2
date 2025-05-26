package com.google.android.engage.common.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ok.v;
import tf.f;

@Keep
/* loaded from: classes3.dex */
public class Price extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Price> CREATOR = new f(21);
    private final String currentPrice;
    private final String strikeThroughPrice;

    @Keep
    public static final class Builder {
        private String currentPrice;
        private String strikethroughPrice;

        @NonNull
        public Price build() {
            return new Price(this.currentPrice, this.strikethroughPrice);
        }

        @NonNull
        public Builder setCurrentPrice(@NonNull String str) {
            this.currentPrice = str;
            return this;
        }

        @NonNull
        public Builder setStrikethroughPrice(@NonNull String str) {
            this.strikethroughPrice = str;
            return this;
        }
    }

    public Price(String str, String str2) {
        bf.b.j("Current Price cannot be null", str != null);
        this.currentPrice = str;
        this.strikeThroughPrice = str2;
    }

    @NonNull
    public String getCurrentPrice() {
        return this.currentPrice;
    }

    public String getStrikeThroughPriceInternal() {
        return this.strikeThroughPrice;
    }

    @NonNull
    public v getStrikethroughPrice() {
        return !TextUtils.isEmpty(this.strikeThroughPrice) ? v.d(this.strikeThroughPrice) : ok.a.f95409a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.I2(parcel, 1, getCurrentPrice(), false);
        bs1.c.I2(parcel, 2, getStrikeThroughPriceInternal(), false);
        bs1.c.N2(parcel, M2);
    }
}
