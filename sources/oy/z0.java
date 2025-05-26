package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final String f98250g;

    /* renamed from: h, reason: collision with root package name */
    public final s92.o f98251h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(s92.o pwtResult, String uniqueIdentifier) {
        super(uniqueIdentifier, 1, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98250g = uniqueIdentifier;
        this.f98251h = pwtResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f98250g, z0Var.f98250g) && this.f98251h == z0Var.f98251h;
    }

    public final int hashCode() {
        return this.f98251h.hashCode() + (this.f98250g.hashCode() * 31);
    }

    public final String toString() {
        return "ImagePublishEndEvent(uniqueIdentifier=" + this.f98250g + ", pwtResult=" + this.f98251h + ")";
    }
}
