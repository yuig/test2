package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kb implements z40.k {

    /* renamed from: a, reason: collision with root package name */
    public final List f132673a;

    public kb(List list) {
        this.f132673a = list;
    }

    @Override // z40.k
    public final List a() {
        return this.f132673a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb) && Intrinsics.d(this.f132673a, ((kb) obj).f132673a);
    }

    public final int hashCode() {
        List list = this.f132673a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Connection(edges="), this.f132673a, ")");
    }
}
