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
public class Rating extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Rating> CREATOR = new f(22);
    private final String count;
    private final double currentValue;
    private final double maxValue;

    @Keep
    public static final class Builder {
        private String count;
        private double maxValue = Double.MIN_VALUE;
        private double currentValue = Double.MIN_VALUE;

        @NonNull
        public Rating build() {
            return new Rating(this.maxValue, this.currentValue, this.count);
        }

        @NonNull
        public Builder setCount(@NonNull String str) {
            this.count = str;
            return this;
        }

        @NonNull
        public Builder setCurrentValue(double d2) {
            this.currentValue = d2;
            return this;
        }

        @NonNull
        public Builder setMaxValue(double d2) {
            this.maxValue = d2;
            return this;
        }
    }

    public Rating(double d2, double d13, String str) {
        bf.b.j("Max value of rating cannot be null", d2 != Double.MIN_VALUE);
        bf.b.j("Max value of rating should be a positive value", d2 > 0.0d);
        bf.b.j("Current value of rating cannot be null", d13 != Double.MIN_VALUE);
        bf.b.j("Current value of rating should be a positive value", d13 > 0.0d);
        bf.b.j("Current value of rating cannot be greater than max value", d2 >= d13);
        this.maxValue = d2;
        this.currentValue = d13;
        this.count = str;
    }

    @NonNull
    public v getCount() {
        return !TextUtils.isEmpty(this.count) ? v.d(this.count) : ok.a.f95409a;
    }

    public String getCountInternal() {
        return this.count;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        double maxValue = getMaxValue();
        bs1.c.O2(parcel, 1, 8);
        parcel.writeDouble(maxValue);
        double currentValue = getCurrentValue();
        bs1.c.O2(parcel, 2, 8);
        parcel.writeDouble(currentValue);
        bs1.c.I2(parcel, 3, getCountInternal(), false);
        bs1.c.N2(parcel, M2);
    }
}
