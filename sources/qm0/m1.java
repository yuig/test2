package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f104306a;

    public m1(k92.o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104306a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && Intrinsics.d(this.f104306a, ((m1) obj).f104306a);
    }

    public final int hashCode() {
        return this.f104306a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastRequest(request="), this.f104306a, ")");
    }
}
