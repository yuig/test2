package al2;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f15503a = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a13 = (Comparable) obj;
        Comparable b13 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        return a13.compareTo(b13);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return d.f15504a;
    }
}
