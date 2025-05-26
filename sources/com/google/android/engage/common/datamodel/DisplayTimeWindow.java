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
public class DisplayTimeWindow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DisplayTimeWindow> CREATOR = new f(15);
    private final Long endTimestampMillis;
    private final Long startTimestampMillis;

    @Keep
    public static final class Builder {
        private Long endTimestampMillis;
        private Long startTimestampMillis;

        @NonNull
        public DisplayTimeWindow build() {
            return new DisplayTimeWindow(this.startTimestampMillis, this.endTimestampMillis);
        }

        @NonNull
        public Builder setEndTimestampMillis(long j13) {
            this.endTimestampMillis = Long.valueOf(j13);
            return this;
        }

        @NonNull
        public Builder setStartTimestampMillis(long j13) {
            this.startTimestampMillis = Long.valueOf(j13);
            return this;
        }
    }

    public DisplayTimeWindow(Long l13, Long l14) {
        this.startTimestampMillis = l13;
        this.endTimestampMillis = l14;
        boolean z13 = true;
        if (l13 == null && l14 == null) {
            z13 = false;
        }
        bf.b.j("Either start timestamp or end timestamp must be present.", z13);
    }

    @NonNull
    public v getEndTimestampMillis() {
        return v.a(this.endTimestampMillis);
    }

    public Long getEndTimestampMillisInternal() {
        return this.endTimestampMillis;
    }

    @NonNull
    public v getStartTimestampMillis() {
        return v.a(this.startTimestampMillis);
    }

    public Long getStartTimestampMillisInternal() {
        return this.startTimestampMillis;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.G2(parcel, 1, getStartTimestampMillisInternal());
        bs1.c.G2(parcel, 2, getEndTimestampMillisInternal());
        bs1.c.N2(parcel, M2);
    }
}
