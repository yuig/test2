package ui2;

import java.util.List;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final List f122305a;

    public c(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f122305a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f122305a.equals(((c) ((a) obj)).f122305a);
    }

    public final int hashCode() {
        return this.f122305a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ArrayBasedTraceState{entries="), this.f122305a, "}");
    }
}
