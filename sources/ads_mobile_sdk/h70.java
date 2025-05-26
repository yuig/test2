package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class h70 extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<h70> CREATOR = new a.d(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f5870a;

    public h70(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f5870a = packageName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h70) && Intrinsics.d(this.f5870a, ((h70) obj).f5870a);
    }

    public final int hashCode() {
        return this.f5870a.hashCode();
    }

    public final String toString() {
        return a.a.k("DecagonRequestParcel(packageName=", this.f5870a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int M2 = bs1.c.M2(dest, 20293);
        bs1.c.I2(dest, 1, this.f5870a, false);
        bs1.c.N2(dest, M2);
    }
}
