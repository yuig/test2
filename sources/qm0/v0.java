package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f104348a;

    public v0(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104348a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f104348a, ((v0) obj).f104348a);
    }

    public final int hashCode() {
        return this.f104348a.hashCode();
    }

    public final String toString() {
        return "AlertRequest(request=" + this.f104348a + ")";
    }
}
