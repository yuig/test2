package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final tk0.f0 f122703a;

    public e0(tk0.f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f122703a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f122703a, ((e0) obj).f122703a);
    }

    public final int hashCode() {
        return this.f122703a.hashCode();
    }

    public final String toString() {
        return "OrganizeToolsRequest(request=" + this.f122703a + ")";
    }
}
