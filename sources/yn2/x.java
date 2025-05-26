package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import q5.w0;

/* loaded from: classes2.dex */
public class x extends r {
    public static Sequence c(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return d(new w0(it, 3));
    }

    public static Sequence d(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof a ? sequence : new a(sequence);
    }

    public static Sequence e(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? g.f139557a : new m(new w(obj), nextFunction);
    }

    public static Sequence f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? g.f139557a : kotlin.collections.c0.v(elements);
    }
}
