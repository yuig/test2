package vq0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yq0.a0;

/* loaded from: classes5.dex */
public interface f extends a0 {
    default void J1() {
        clear();
    }

    Set X1();

    default void c(int[] ids, h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        for (int i13 : ids) {
            o(i13, viewBinderInstance);
        }
    }

    default void clear() {
    }

    void i2();

    void j1();

    void o(int i13, h hVar);

    boolean t0();
}
