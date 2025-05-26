package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.todaytab.a;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new a(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f97322a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97323b;

    public UnguessableToken(long j13, long j14) {
        this.f97322a = j13;
        this.f97323b = j14;
    }

    @CalledByNative
    public static UnguessableToken create(long j13, long j14) {
        return new UnguessableToken(j13, j14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnguessableToken unguessableToken = (UnguessableToken) obj;
        return unguessableToken.f97322a == this.f97322a && unguessableToken.f97323b == this.f97323b;
    }

    @CalledByNative
    public long getHighForSerialization() {
        return this.f97322a;
    }

    @CalledByNative
    public long getLowForSerialization() {
        return this.f97323b;
    }

    public final int hashCode() {
        long j13 = this.f97323b;
        long j14 = this.f97322a;
        return (((int) (j13 ^ (j13 >>> 32))) * 31) + ((int) ((j14 >>> 32) ^ j14));
    }

    @CalledByNative
    public final UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f97322a);
        parcel.writeLong(this.f97323b);
    }
}
