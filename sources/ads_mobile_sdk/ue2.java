package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ue2 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f12050a;

    public ue2(wi.k baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.f12050a = baseRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue2) && Intrinsics.d(this.f12050a, ((ue2) obj).f12050a);
    }

    public final int hashCode() {
        return this.f12050a.hashCode();
    }

    public final String toString() {
        return "ServerRequest(baseRequest=" + this.f12050a + ")";
    }
}
