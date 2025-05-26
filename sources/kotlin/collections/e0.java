package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class e0 {
    public static yk2.b a(yk2.b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (builder.f139241e != null) {
            throw new IllegalStateException();
        }
        builder.j();
        builder.f139240d = true;
        return builder.f139239c > 0 ? builder : yk2.b.f139236g;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List c(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        List J2 = CollectionsKt___CollectionsKt.J(arrayList);
        Collections.shuffle(J2);
        return J2;
    }
}
