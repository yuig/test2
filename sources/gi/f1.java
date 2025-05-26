package gi;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f65067a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(f1.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = e1.INSTANCE;
        }
        f65067a = comparator;
    }
}
