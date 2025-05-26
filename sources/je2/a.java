package je2;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import zn2.b;
import zn2.d;

/* loaded from: classes4.dex */
public abstract class a {
    static {
        zn2.a aVar = b.f142311b;
        d dVar = d.SECONDS;
        b.n(dl2.b.P2(2, dVar), dVar);
    }

    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.i0(lowerCase).toString();
    }
}
