package o90;

import kotlin.jvm.internal.Intrinsics;
import m90.e0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f93811a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93812b;

    public k(e0 mode, boolean z13) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f93811a = mode;
        this.f93812b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f93811a, kVar.f93811a) && this.f93812b == kVar.f93812b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93812b) + (this.f93811a.hashCode() * 31);
    }

    public final String toString() {
        return "CollageContentRequestArgs(mode=" + this.f93811a + ", allowCarousel=" + this.f93812b + ")";
    }
}
