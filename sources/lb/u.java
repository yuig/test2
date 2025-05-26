package lb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface u {
    boolean a(tb.j jVar);

    t b(tb.j jVar);

    default t c(tb.s spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return b(b7.c.q(spec));
    }

    t d(tb.j jVar);

    List remove(String str);
}
