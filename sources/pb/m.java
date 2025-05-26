package pb;

import ao2.f0;
import ao2.m0;
import ao2.p1;
import i2.a2;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;
import tb.s;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f99427a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f99428b;

    static {
        String h10 = b0.h("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f99427a = h10;
        f99428b = 1000L;
    }

    public static final p1 a(a2 a2Var, s spec, f0 dispatcher, i listener) {
        Intrinsics.checkNotNullParameter(a2Var, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        p1 b13 = m0.b();
        kotlin.jvm.internal.j.z(dl2.b.b(dispatcher.plus(b13)), null, null, new l(a2Var, spec, listener, null), 3);
        return b13;
    }
}
