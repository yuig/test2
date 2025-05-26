package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.u f104264a;

    public e1(sk0.u request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104264a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && Intrinsics.d(this.f104264a, ((e1) obj).f104264a);
    }

    public final int hashCode() {
        return this.f104264a.hashCode();
    }

    public final String toString() {
        return "BoardToolsRequest(request=" + this.f104264a + ")";
    }
}
