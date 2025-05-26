package al2;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f15504a = new d();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a13 = (Comparable) obj;
        Comparable b13 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        return b13.compareTo(a13);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return c.f15503a;
    }
}
