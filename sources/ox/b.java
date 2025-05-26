package ox;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import vy.m;

/* loaded from: classes.dex */
public interface b {
    default void a(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((m) this).k(event, new HashMap());
    }
}
