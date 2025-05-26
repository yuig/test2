package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f122689a;

    public b0(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f122689a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f122689a, ((b0) obj).f122689a);
    }

    public final int hashCode() {
        return this.f122689a.hashCode();
    }

    public final String toString() {
        return "OrganizeAlertRequest(request=" + this.f122689a + ")";
    }
}
