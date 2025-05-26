package zb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final a f141566a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f141567b;

    public j(a alertConfig, Integer num) {
        Intrinsics.checkNotNullParameter(alertConfig, "alertConfig");
        this.f141566a = alertConfig;
        this.f141567b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f141566a, jVar.f141566a) && Intrinsics.d(this.f141567b, jVar.f141567b);
    }

    public final int hashCode() {
        int hashCode = this.f141566a.hashCode() * 31;
        Integer num = this.f141567b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSimpleAlertRequest(alertConfig=" + this.f141566a + ", alertId=" + this.f141567b + ")";
    }
}
