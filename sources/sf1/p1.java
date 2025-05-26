package sf1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f112677a = o1.f112670a;

    default boolean a() {
        return false;
    }

    default void b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    default void c(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    default void d() {
    }
}
