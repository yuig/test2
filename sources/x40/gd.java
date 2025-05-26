package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gd {

    /* renamed from: a, reason: collision with root package name */
    public final List f132450a;

    public gd(List list) {
        this.f132450a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd) && Intrinsics.d(this.f132450a, ((gd) obj).f132450a);
    }

    public final int hashCode() {
        List list = this.f132450a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Connection(edges="), this.f132450a, ")");
    }
}
