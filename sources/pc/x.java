package pc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final List f99610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99611b;

    public x(List path, String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f99610a = path;
        this.f99611b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f99610a, xVar.f99610a) && Intrinsics.d(this.f99611b, xVar.f99611b);
    }

    public final int hashCode() {
        int hashCode = this.f99610a.hashCode() * 31;
        String str = this.f99611b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb3.append(this.f99610a);
        sb3.append(", label=");
        return ep.b.k(sb3, this.f99611b, ')');
    }
}
