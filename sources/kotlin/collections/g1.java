package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class g1 {
    public static yk2.o a(yk2.o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        yk2.g gVar = builder.f139270a;
        gVar.c();
        return gVar.f139256i > 0 ? builder : yk2.o.f139269b;
    }

    public static Set b(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }
}
