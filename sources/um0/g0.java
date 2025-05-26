package um0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f122710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122711b;

    public g0(List sections, int i13) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f122710a = sections;
        this.f122711b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f122710a, g0Var.f122710a) && this.f122711b == g0Var.f122711b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122711b) + (this.f122710a.hashCode() * 31);
    }

    public final String toString() {
        return "PersistSectionReorder(sections=" + this.f122710a + ", position=" + this.f122711b + ")";
    }
}
