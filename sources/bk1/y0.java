package bk1;

import a.cb;
import h32.a4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23377b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23378c;

    /* renamed from: d, reason: collision with root package name */
    public final a4 f23379d;

    public y0(String pinUid, String closeupTrafficSource, boolean z13, a4 a4Var) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(closeupTrafficSource, "closeupTrafficSource");
        this.f23376a = pinUid;
        this.f23377b = closeupTrafficSource;
        this.f23378c = z13;
        this.f23379d = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f23376a, y0Var.f23376a) && Intrinsics.d(this.f23377b, y0Var.f23377b) && this.f23378c == y0Var.f23378c && this.f23379d == y0Var.f23379d;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f23378c, cb.d(this.f23377b, this.f23376a.hashCode() * 31, 31), 31);
        a4 a4Var = this.f23379d;
        return e13 + (a4Var == null ? 0 : a4Var.hashCode());
    }

    public final String toString() {
        return "NavigateToPinLocation(pinUid=" + this.f23376a + ", closeupTrafficSource=" + this.f23377b + ", isHideSupported=" + this.f23378c + ", viewParameterType=" + this.f23379d + ")";
    }
}
