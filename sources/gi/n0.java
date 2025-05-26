package gi;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class n0 extends j0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f65099a = new n0();

    @Override // gi.j0
    public final j0 a() {
        return i0.f65074a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
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
