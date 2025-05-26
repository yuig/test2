package t3;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class k0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f116049a = new k0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a3.d g13 = ((z3.q) obj).g();
        a3.d g14 = ((z3.q) obj2).g();
        int compare = Float.compare(g13.f484a, g14.f484a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(g13.f485b, g14.f485b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(g13.f487d, g14.f487d);
        return compare3 != 0 ? compare3 : Float.compare(g13.f486c, g14.f486c);
    }
}
