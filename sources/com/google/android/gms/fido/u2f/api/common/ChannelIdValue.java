package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new f(23);

    /* renamed from: f, reason: collision with root package name */
    public final ChannelIdValueType f31196f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31197g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31198h;

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();
        private final int zzb;

        ChannelIdValueType(int i13) {
            this.zzb = i13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i13) {
            parcel.writeInt(this.zzb);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue() {
        this.f31196f = ChannelIdValueType.ABSENT;
        this.f31198h = null;
        this.f31197g = null;
    }

    public static ChannelIdValueType e(int i13) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i13 == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(a.a.e("ChannelIdValueType ", i13, " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.f31196f;
        ChannelIdValueType channelIdValueType2 = this.f31196f;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int ordinal = channelIdValueType2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f31197g.equals(channelIdValue.f31197g);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f31198h.equals(channelIdValue.f31198h);
    }

    public final int hashCode() {
        int i13;
        int hashCode;
        ChannelIdValueType channelIdValueType = this.f31196f;
        int hashCode2 = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 1) {
            i13 = hashCode2 * 31;
            hashCode = this.f31197g.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i13 = hashCode2 * 31;
            hashCode = this.f31198h.hashCode();
        }
        return hashCode + i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        int i14 = this.f31196f.zzb;
        c.O2(parcel, 2, 4);
        parcel.writeInt(i14);
        c.I2(parcel, 3, this.f31197g, false);
        c.I2(parcel, 4, this.f31198h, false);
        c.N2(parcel, M2);
    }

    public ChannelIdValue(int i13, String str, String str2) {
        try {
            this.f31196f = e(i13);
            this.f31197g = str;
            this.f31198h = str2;
        } catch (UnsupportedChannelIdValueTypeException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public ChannelIdValue(String str) {
        this.f31197g = str;
        this.f31196f = ChannelIdValueType.STRING;
        this.f31198h = null;
    }
}
