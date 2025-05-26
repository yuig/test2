package eb;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final List f58210a;

    public p(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f58210a = displayFeatures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(p.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.f58210a, ((p) obj).f58210a);
    }

    public final int hashCode() {
        return this.f58210a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.Z(this.f58210a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56);
    }
}
