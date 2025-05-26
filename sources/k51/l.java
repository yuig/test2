package k51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final b22.l f78327a;

    public l(b22.l pinsViewType) {
        Intrinsics.checkNotNullParameter(pinsViewType, "pinsViewType");
        this.f78327a = pinsViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f78327a == ((l) obj).f78327a;
    }

    public final int hashCode() {
        return this.f78327a.hashCode();
    }

    public final String toString() {
        return "PersistNewViewType(pinsViewType=" + this.f78327a + ")";
    }
}
