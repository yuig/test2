package u52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final p52.a f120753a;

    public z0(p52.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f120753a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.d(this.f120753a, ((z0) obj).f120753a);
    }

    public final int hashCode() {
        return this.f120753a.f98903a.hashCode();
    }

    public final String toString() {
        return "WrapperLoadPinsSER(request=" + this.f120753a + ")";
    }
}
