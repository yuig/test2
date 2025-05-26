package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pf {

    /* renamed from: a, reason: collision with root package name */
    public final of f133043a;

    public pf(of ofVar) {
        this.f133043a = ofVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf) && Intrinsics.d(this.f133043a, ((pf) obj).f133043a);
    }

    public final int hashCode() {
        of ofVar = this.f133043a;
        if (ofVar == null) {
            return 0;
        }
        return ofVar.hashCode();
    }

    public final String toString() {
        return "LinkUserWebsite(officialUser=" + this.f133043a + ")";
    }
}
