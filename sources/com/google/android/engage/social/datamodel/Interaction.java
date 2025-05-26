package com.google.android.engage.social.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import ok.v;
import pk.c1;
import pk.x0;

@Keep
/* loaded from: classes3.dex */
public class Interaction extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Interaction> CREATOR = new vg.a(8);
    private final String count;
    private final String label;
    private final List<Image> visuals;

    @Keep
    public static final class Builder {
        private String count;
        private String label;
        private final x0 visualBuilder = c1.n();

        @NonNull
        public Builder addVisual(@NonNull Image image) {
            this.visualBuilder.e(image);
            return this;
        }

        @NonNull
        public Builder addVisuals(@NonNull List<Image> list) {
            this.visualBuilder.b(list);
            return this;
        }

        @NonNull
        public Interaction build() {
            return new Interaction(this.count, this.label, this.visualBuilder.i());
        }

        @NonNull
        public Builder setCount(@NonNull String str) {
            this.count = str;
            return this;
        }

        @NonNull
        public Builder setLabel(@NonNull String str) {
            this.label = str;
            return this;
        }
    }

    public Interaction(String str, String str2, List<Image> list) {
        bf.b.j("Count is a required field.", str != null);
        this.count = str;
        this.label = str2;
        this.visuals = list;
        bf.b.j("Either label or visuals must be set.", (str2 == null && list.isEmpty()) ? false : true);
    }

    @NonNull
    public String getCount() {
        return this.count;
    }

    @NonNull
    public v getLabel() {
        return !TextUtils.isEmpty(this.label) ? v.d(this.label) : ok.a.f95409a;
    }

    public String getLabelInternal() {
        return this.label;
    }

    @NonNull
    public List<Image> getVisuals() {
        return this.visuals;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.I2(parcel, 1, getCount(), false);
        c.I2(parcel, 2, getLabelInternal(), false);
        c.L2(parcel, 3, getVisuals(), false);
        c.N2(parcel, M2);
    }
}
