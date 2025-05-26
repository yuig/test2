package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.y f82465a;

    public s0(zy.y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82465a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.d(this.f82465a, ((s0) obj).f82465a);
    }

    public final int hashCode() {
        return this.f82465a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionRequest(request=" + this.f82465a + ")";
    }
}
