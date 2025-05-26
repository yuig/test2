package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final String f98162g;

    /* renamed from: h, reason: collision with root package name */
    public final s92.o f98163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(s92.o pwtResult, String uniqueIdentifier) {
        super(uniqueIdentifier, 4, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98162g = uniqueIdentifier;
        this.f98163h = pwtResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return Intrinsics.d(this.f98162g, o2Var.f98162g) && this.f98163h == o2Var.f98163h;
    }

    public final int hashCode() {
        return this.f98163h.hashCode() + (this.f98162g.hashCode() * 31);
    }

    public final String toString() {
        return "VideoPublishEndEvent(uniqueIdentifier=" + this.f98162g + ", pwtResult=" + this.f98163h + ")";
    }
}
