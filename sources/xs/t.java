package xs;

import com.pinterest.api.model.b1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f135758a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f135759b;

    public t(long j13, b1 b1Var) {
        this.f135758a = j13;
        this.f135759b = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f135758a == tVar.f135758a && Intrinsics.d(this.f135759b, tVar.f135759b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f135758a) * 31;
        b1 b1Var = this.f135759b;
        return hashCode + (b1Var == null ? 0 : b1Var.hashCode());
    }

    public final String toString() {
        return "LaunchRetailerSuccessScreen(timeStamp=" + this.f135758a + ", adsCartingData=" + this.f135759b + ")";
    }
}
