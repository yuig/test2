package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p2 extends a0 implements ey.b2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f98170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(String uniqueIdentifier) {
        super(uniqueIdentifier, 4, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f98170g = uniqueIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && Intrinsics.d(this.f98170g, ((p2) obj).f98170g);
    }

    public final int hashCode() {
        return this.f98170g.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("VideoPublishStartEvent(uniqueIdentifier="), this.f98170g, ")");
    }
}
