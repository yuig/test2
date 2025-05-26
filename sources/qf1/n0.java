package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f103758a;

    public n0(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f103758a = sourceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f103758a, ((n0) obj).f103758a);
    }

    public final int hashCode() {
        return this.f103758a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ViewSimilarIdeasEvent(sourceId="), this.f103758a, ")");
    }
}
