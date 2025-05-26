package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c9 implements z40.k {

    /* renamed from: a, reason: collision with root package name */
    public final List f132104a;

    public c9(List list) {
        this.f132104a = list;
    }

    @Override // z40.k
    public final List a() {
        return this.f132104a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9) && Intrinsics.d(this.f132104a, ((c9) obj).f132104a);
    }

    public final int hashCode() {
        List list = this.f132104a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Connection(edges="), this.f132104a, ")");
    }
}
