package k51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final b22.l f78326a;

    public k(b22.l pinsViewType) {
        Intrinsics.checkNotNullParameter(pinsViewType, "pinsViewType");
        this.f78326a = pinsViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f78326a == ((k) obj).f78326a;
    }

    public final int hashCode() {
        return this.f78326a.hashCode();
    }

    public final String toString() {
        return "OpenViewTypeOptionsModalSideEffectRequest(pinsViewType=" + this.f78326a + ")";
    }
}
