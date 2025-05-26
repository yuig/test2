package p001if;

import ff.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kh2.b0;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import le.o0;
import le.v;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public static final Set f72219a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static boolean f72220b;

    public static final void a(Object o13, Throwable th3) {
        Intrinsics.checkNotNullParameter(o13, "o");
        if (f72220b) {
            f72219a.add(o13);
            v vVar = v.f83104a;
            if (o0.b()) {
                b0.e0(th3);
                g0.g(th3, b.CrashShield).b();
            }
        }
    }

    public static final boolean b(Object o13) {
        Intrinsics.checkNotNullParameter(o13, "o");
        return f72219a.contains(o13);
    }
}
