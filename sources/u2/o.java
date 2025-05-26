package u2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface o extends q {
    @Override // u2.q
    default Object b(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // u2.q
    default boolean c(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
