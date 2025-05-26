package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111799a;

    public t1(String cutoutId) {
        Intrinsics.checkNotNullParameter(cutoutId, "cutoutId");
        this.f111799a = cutoutId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && Intrinsics.d(this.f111799a, ((t1) obj).f111799a);
    }

    public final int hashCode() {
        return this.f111799a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ReplaceCutoutSelected(cutoutId="), this.f111799a, ")");
    }
}
