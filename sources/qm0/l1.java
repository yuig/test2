package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f104299a;

    public l1(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104299a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.f104299a, ((l1) obj).f104299a);
    }

    public final int hashCode() {
        return this.f104299a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("SectionRequest(request="), this.f104299a, ")");
    }
}
