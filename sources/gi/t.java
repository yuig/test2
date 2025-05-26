package gi;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class t extends j0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f65116a;

    public t(Comparator comparator) {
        comparator.getClass();
        this.f65116a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f65116a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f65116a.equals(((t) obj).f65116a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65116a.hashCode();
    }

    public final String toString() {
        return this.f65116a.toString();
    }
}
