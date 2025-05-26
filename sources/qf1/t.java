package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends bp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f103769a;

    public t(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f103769a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f103769a, ((t) obj).f103769a);
    }

    public final int hashCode() {
        return this.f103769a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SimilarIdeasRequested(pinId="), this.f103769a, ")");
    }
}
