package v91;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f125010a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125011b;

    public u(String socialAccountType, boolean z13) {
        Intrinsics.checkNotNullParameter(socialAccountType, "socialAccountType");
        this.f125010a = socialAccountType;
        this.f125011b = z13;
    }

    public static u b(u uVar, boolean z13) {
        String socialAccountType = uVar.f125010a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(socialAccountType, "socialAccountType");
        return new u(socialAccountType, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f125010a, uVar.f125010a) && this.f125011b == uVar.f125011b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125011b) + (this.f125010a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoOrgOptInVMState(socialAccountType=" + this.f125010a + ", isOptedIn=" + this.f125011b + ")";
    }
}
