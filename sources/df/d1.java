package df;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1 {
    public static EnumSet a(long j13) {
        EnumSet enumSet;
        EnumSet result = EnumSet.noneOf(e1.class);
        enumSet = e1.ALL;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if ((e1Var.getValue() & j13) != 0) {
                result.add(e1Var);
            }
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
