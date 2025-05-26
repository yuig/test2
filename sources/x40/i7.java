package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132543a;

    public i7(List list) {
        this.f132543a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7) && Intrinsics.d(this.f132543a, ((i7) obj).f132543a);
    }

    public final int hashCode() {
        List list = this.f132543a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Connection(edges="), this.f132543a, ")");
    }
}
