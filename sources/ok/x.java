package ok;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class x implements w, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f95445a;

    public x(List list) {
        this.f95445a = list;
    }

    @Override // ok.w
    public final boolean apply(Object obj) {
        int i13 = 0;
        while (true) {
            List list = this.f95445a;
            if (i13 >= list.size()) {
                return true;
            }
            if (!((w) list.get(i13)).apply(obj)) {
                return false;
            }
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f95445a.equals(((x) obj).f95445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f95445a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Predicates.and(");
        boolean z13 = true;
        for (Object obj : this.f95445a) {
            if (!z13) {
                sb3.append(',');
            }
            sb3.append(obj);
            z13 = false;
        }
        sb3.append(')');
        return sb3.toString();
    }
}
