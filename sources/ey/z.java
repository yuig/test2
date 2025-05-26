package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends my.b {

    /* renamed from: e, reason: collision with root package name */
    public final q1 f60633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q1 pwtSearchType) {
        super(pwtSearchType);
        Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
        this.f60633e = pwtSearchType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f60633e == ((z) obj).f60633e;
    }

    public final int hashCode() {
        return this.f60633e.hashCode();
    }

    public final String toString() {
        return "SearchOneBarCompleteEvent(pwtSearchType=" + this.f60633e + ")";
    }
}
