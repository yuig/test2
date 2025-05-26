package androidx.lifecycle;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final w6.b f18658a = new w6.b();

    public final void d(e1 closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        w6.b bVar = this.f18658a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (bVar.f128108b) {
                w6.b.a(closeable);
                return;
            }
            synchronized (((bk.f) bVar.f128109c)) {
                autoCloseable = (AutoCloseable) bVar.f128107a.put("androidx.lifecycle.savedstate.vm.tag", closeable);
            }
            w6.b.a(autoCloseable);
        }
    }

    public final void f() {
        w6.b bVar = this.f18658a;
        if (bVar != null && !bVar.f128108b) {
            bVar.f128108b = true;
            synchronized (((bk.f) bVar.f128109c)) {
                try {
                    Iterator it = bVar.f128107a.values().iterator();
                    while (it.hasNext()) {
                        w6.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = ((Set) bVar.f128110d).iterator();
                    while (it2.hasNext()) {
                        w6.b.a((AutoCloseable) it2.next());
                    }
                    ((Set) bVar.f128110d).clear();
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        g();
    }

    public void g() {
    }
}
