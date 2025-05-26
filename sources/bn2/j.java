package bn2;

import am2.b1;
import am2.r0;
import am2.x;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final j f23581a = new j();

    public static int a(am2.m mVar) {
        if (e.o(mVar)) {
            return 8;
        }
        if (mVar instanceof am2.l) {
            return 7;
        }
        if (mVar instanceof r0) {
            return ((r0) mVar).D() == null ? 6 : 5;
        }
        if (mVar instanceof x) {
            return ((x) mVar).D() == null ? 4 : 3;
        }
        if (mVar instanceof am2.g) {
            return 2;
        }
        return mVar instanceof b1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        am2.m mVar = (am2.m) obj;
        am2.m mVar2 = (am2.m) obj2;
        int a13 = a(mVar2) - a(mVar);
        if (a13 != 0) {
            valueOf = Integer.valueOf(a13);
        } else if (e.o(mVar) && e.o(mVar2)) {
            valueOf = 0;
        } else {
            int compareTo = mVar.getName().f139478a.compareTo(mVar2.getName().f139478a);
            valueOf = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
