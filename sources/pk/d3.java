package pk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class d3 extends t2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final d3 f100381a = new d3();

    private Object readResolve() {
        return f100381a;
    }

    @Override // pk.t2
    public final t2 a() {
        return s2.f100480a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
