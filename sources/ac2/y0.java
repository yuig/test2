package ac2;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public interface y0 {
    default int a() {
        if (this instanceof t0) {
            return 0;
        }
        if (this instanceof x0) {
            return 1;
        }
        if (this instanceof w0) {
            return 2;
        }
        if (this instanceof u0) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    default boolean b() {
        return (this instanceof w0) || (this instanceof u0);
    }

    default boolean c() {
        return this instanceof x0;
    }
}
