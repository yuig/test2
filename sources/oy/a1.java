package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1 extends a0 implements ey.b2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f97991g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(String uniqueIdentifier) {
        super(uniqueIdentifier, 1, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f97991g = uniqueIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.d(this.f97991g, ((a1) obj).f97991g);
    }

    public final int hashCode() {
        return this.f97991g.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ImagePublishStartEvent(uniqueIdentifier="), this.f97991g, ")");
    }
}
