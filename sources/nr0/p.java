package nr0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface p {
    default void F(a dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
    }

    boolean c();

    boolean e(int i13);

    boolean f(int i13);

    int getItemViewType(int i13);

    boolean h(int i13);

    default Integer j(int i13) {
        return null;
    }

    boolean m();

    boolean q(int i13);
}
