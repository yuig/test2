package re2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.i f107719b = new vb0.i(17);

    /* renamed from: a, reason: collision with root package name */
    public final List f107720a;

    public k(List list) {
        this.f107720a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f107720a, ((k) obj).f107720a);
    }

    public final int hashCode() {
        List list = this.f107720a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Spans(spans="), this.f107720a, ")");
    }
}
