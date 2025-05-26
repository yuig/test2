package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f59699a;

    public u(rm1.q iconStandard) {
        Intrinsics.checkNotNullParameter(iconStandard, "iconStandard");
        this.f59699a = iconStandard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f59699a == ((u) obj).f59699a;
    }

    public final int hashCode() {
        return this.f59699a.hashCode();
    }

    public final String toString() {
        return "Icon(iconStandard=" + this.f59699a + ")";
    }
}
