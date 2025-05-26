package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.o f99174a;

    public b0(sa0.o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f99174a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f99174a, ((b0) obj).f99174a);
    }

    public final int hashCode() {
        return this.f99174a.hashCode();
    }

    public final String toString() {
        return "CloseupEditorSideEffectRequest(request=" + this.f99174a + ")";
    }
}
