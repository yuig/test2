package u2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface q {

    /* renamed from: a */
    public static final /* synthetic */ int f120055a = 0;

    Object b(Object obj, Function2 function2);

    boolean c(Function1 function1);

    default q j(q qVar) {
        return qVar == n.f120041b ? this : new k(this, qVar);
    }
}
