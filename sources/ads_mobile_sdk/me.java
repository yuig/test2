package ads_mobile_sdk;

import a.j9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class me implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f8186a;

    public me(List grantedPermissionsList) {
        Intrinsics.checkNotNullParameter(grantedPermissionsList, "grantedPermissionsList");
        this.f8186a = grantedPermissionsList;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.grantedPermissions.addAll(this.f8186a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me) && Intrinsics.d(this.f8186a, ((me) obj).f8186a);
    }

    public final int hashCode() {
        return this.f8186a.hashCode();
    }

    public final String toString() {
        return "AppPermissionsSignal(grantedPermissionsList=" + this.f8186a + ")";
    }
}
