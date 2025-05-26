package bw0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kb.s0;
import kb.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f23967i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        List it = (List) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = it;
        boolean z14 = list instanceof Collection;
        if (!z14 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((t0) it2.next()).f79032c.contains("publish")) {
                    if (!z14 || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            s0 s0Var = ((t0) it3.next()).f79031b;
                            if (s0Var == s0.RUNNING || s0Var == s0.ENQUEUED) {
                                z13 = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }
}
