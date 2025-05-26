package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zb0 extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<zb0> CREATOR = new a.d(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f14693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14694b;

    public zb0(String str, int i13) {
        this.f14693a = str;
        this.f14694b = i13;
    }

    public final int a() {
        return this.f14694b;
    }

    public final String b() {
        return this.f14693a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        return Intrinsics.d(this.f14693a, zb0Var.f14693a) && this.f14694b == zb0Var.f14694b;
    }

    public final int hashCode() {
        String str = this.f14693a;
        return Integer.hashCode(this.f14694b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ExceptionParcel(message=" + this.f14693a + ", errorCode=" + this.f14694b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int M2 = bs1.c.M2(dest, 20293);
        bs1.c.I2(dest, 1, this.f14693a, false);
        int i14 = this.f14694b;
        bs1.c.O2(dest, 2, 4);
        dest.writeInt(i14);
        bs1.c.N2(dest, M2);
    }
}
