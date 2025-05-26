package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y4 implements z40.k {

    /* renamed from: a, reason: collision with root package name */
    public final List f133724a;

    public y4(List list) {
        this.f133724a = list;
    }

    @Override // z40.k
    public final List a() {
        return this.f133724a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4) && Intrinsics.d(this.f133724a, ((y4) obj).f133724a);
    }

    public final int hashCode() {
        List list = this.f133724a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Connection(edges="), this.f133724a, ")");
    }
}
