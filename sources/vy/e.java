package vy;

import ey.b0;
import ey.t4;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes.dex */
public final class e {
    public static final ArrayList a() {
        v vVar = m.f126870h;
        return (ArrayList) m.f126876n.getValue();
    }

    public static final ArrayList b() {
        v vVar = m.f126870h;
        return (ArrayList) m.f126875m.getValue();
    }

    public static void c(Runnable task, boolean z13) {
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList arrayList = m.f126872j;
        synchronized (arrayList) {
            try {
                if (m.f126873k) {
                    task.run();
                } else {
                    arrayList.add(task);
                    if (!m.f126874l) {
                        new t4(4000L, b0.TAG_TRACKING_REQUESTS, new com.appsflyer.internal.p(10), z13, true, false).c();
                        m.f126874l = true;
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
