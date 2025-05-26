package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final pm0.k f104371a;

    public z0(pm0.k request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104371a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.d(this.f104371a, ((z0) obj).f104371a);
    }

    public final int hashCode() {
        return this.f104371a.hashCode();
    }

    public final String toString() {
        return "BoardCollaboratorRequest(request=" + this.f104371a + ")";
    }
}
