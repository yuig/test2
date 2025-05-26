package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f104295a;

    public k1(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104295a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.d(this.f104295a, ((k1) obj).f104295a);
    }

    public final int hashCode() {
        return this.f104295a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationRequest(request="), this.f104295a, ")");
    }
}
