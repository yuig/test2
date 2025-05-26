package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends bp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f103767a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.d f103768b;

    public s(String pinId, c0.d swipeToRelated) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(swipeToRelated, "swipeToRelated");
        this.f103767a = pinId;
        this.f103768b = swipeToRelated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f103767a, sVar.f103767a) && Intrinsics.d(this.f103768b, sVar.f103768b);
    }

    public final int hashCode() {
        return this.f103768b.hashCode() + (this.f103767a.hashCode() * 31);
    }

    public final String toString() {
        return "IdeaPinSwipeToRelatedUpdated(pinId=" + this.f103767a + ", swipeToRelated=" + this.f103768b + ")";
    }
}
