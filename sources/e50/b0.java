package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f57264a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57265b;

    public b0(Integer num, List list) {
        this.f57264a = list;
        this.f57265b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f57264a, b0Var.f57264a) && Intrinsics.d(this.f57265b, b0Var.f57265b);
    }

    public final int hashCode() {
        List list = this.f57264a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f57265b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ModeIcon(backgroundColorHex=" + this.f57264a + ", iconType=" + this.f57265b + ")";
    }
}
