package jw1;

import android.content.res.Resources;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface b {
    default boolean a() {
        return false;
    }

    List b();

    default boolean c() {
        return false;
    }

    default String d(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return null;
    }

    String e(Resources resources);

    String f(Resources resources);

    default void g() {
    }

    String h(Resources resources);
}
