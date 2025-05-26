package tu1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.o f119464a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f119465b;

    public x(lb0.o preferences) {
        Object obj;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f119464a = preferences;
        int f13 = ((lb0.b) preferences).f("CRONET_LIBRARY_STATE", n0.UNAVAILABLE.getValue());
        Iterator<E> it = n0.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n0) obj).getValue() == f13) {
                    break;
                }
            }
        }
        n0 n0Var = (n0) obj;
        this.f119465b = new AtomicReference(n0Var == null ? n0.UNAVAILABLE : n0Var);
    }
}
