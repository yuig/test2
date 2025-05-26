package a82;

import android.graphics.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface d {
    default void m(boolean z13) {
    }

    default boolean p(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return true;
    }

    default void s(ke2.d item, g handler, Point clickPosition) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
    }
}
