package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.o f112043a;

    public y(sa0.o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f112043a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f112043a, ((y) obj).f112043a);
    }

    public final int hashCode() {
        return this.f112043a.hashCode();
    }

    public final String toString() {
        return "CollageCutoutEditorSideEffectRequest(request=" + this.f112043a + ")";
    }
}
