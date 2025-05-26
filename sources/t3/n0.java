package t3;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class n0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f116097a = new n0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        int compare = Float.compare(((a3.d) pair.f80346a).f485b, ((a3.d) pair2.f80346a).f485b);
        return compare != 0 ? compare : Float.compare(((a3.d) pair.f80346a).f487d, ((a3.d) pair2.f80346a).f487d);
    }
}
