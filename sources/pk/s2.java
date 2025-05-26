package pk;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s2 extends t2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final s2 f100480a = new s2();

    private Object readResolve() {
        return f100480a;
    }

    @Override // pk.t2
    public final t2 a() {
        return d3.f100381a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
