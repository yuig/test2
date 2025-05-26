package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends bp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f103765a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.d f103766b;

    public r(String pinId, c0.d swipeToRelated) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(swipeToRelated, "swipeToRelated");
        this.f103765a = pinId;
        this.f103766b = swipeToRelated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f103765a, rVar.f103765a) && Intrinsics.d(this.f103766b, rVar.f103766b);
    }

    public final int hashCode() {
        return this.f103766b.hashCode() + (this.f103765a.hashCode() * 31);
    }

    public final String toString() {
        return "IdeaPinStarted(pinId=" + this.f103765a + ", swipeToRelated=" + this.f103766b + ")";
    }
}
