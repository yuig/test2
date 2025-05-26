package gi;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class i0 extends j0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f65074a = new i0();

    @Override // gi.j0
    public final j0 a() {
        return n0.f65099a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
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
