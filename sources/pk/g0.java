package pk;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class g0 extends t2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f100402a;

    public g0(Comparator comparator) {
        comparator.getClass();
        this.f100402a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f100402a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return this.f100402a.equals(((g0) obj).f100402a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100402a.hashCode();
    }

    public final String toString() {
        return this.f100402a.toString();
    }
}
