package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132003a;

    public b3(List list) {
        this.f132003a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3) && Intrinsics.d(this.f132003a, ((b3) obj).f132003a);
    }

    public final int hashCode() {
        List list = this.f132003a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Connection(edges="), this.f132003a, ")");
    }
}
