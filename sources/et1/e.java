package et1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface e {
    String d(Object obj);

    void h(Function2 function2);

    default void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        h(new jq1.b(callback, 1));
    }
}
