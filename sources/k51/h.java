package k51;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f78322a;

    /* renamed from: b, reason: collision with root package name */
    public final k41.f f78323b;

    public h(i0 context, k41.f viewOption) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewOption, "viewOption");
        this.f78322a = context;
        this.f78323b = viewOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f78322a, hVar.f78322a) && this.f78323b == hVar.f78323b;
    }

    public final int hashCode() {
        return this.f78323b.hashCode() + (this.f78322a.hashCode() * 31);
    }

    public final String toString() {
        return "LogNewViewOptionSelected(context=" + this.f78322a + ", viewOption=" + this.f78323b + ")";
    }
}
