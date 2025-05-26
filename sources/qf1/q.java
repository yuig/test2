package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends bp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f103763a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.d f103764b;

    public q(String pinId, c0.d swipeToRelated) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(swipeToRelated, "swipeToRelated");
        this.f103763a = pinId;
        this.f103764b = swipeToRelated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f103763a, qVar.f103763a) && Intrinsics.d(this.f103764b, qVar.f103764b);
    }

    public final int hashCode() {
        return this.f103764b.hashCode() + (this.f103763a.hashCode() * 31);
    }

    public final String toString() {
        return "IdeaPinEndReached(pinId=" + this.f103763a + ", swipeToRelated=" + this.f103764b + ")";
    }
}
