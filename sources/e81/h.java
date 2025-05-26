package e81;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface h {
    boolean G0();

    default void X() {
    }

    default void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
    }

    void i(MotionEvent motionEvent);

    void l(MotionEvent motionEvent);

    boolean n(MotionEvent motionEvent);

    default void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
    }

    void q(MotionEvent motionEvent);

    boolean t();
}
