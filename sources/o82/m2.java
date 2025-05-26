package o82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class m2 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f93669a = new ArrayList();

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        d2 request = (d2) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof v1;
        if (z13 || (request instanceof c2)) {
            Object obj = z13 ? ((v1) request).f93733a : ((c2) request).f93550b;
            ArrayList arrayList = this.f93669a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ao2.o1) it.next()).cancel((CancellationException) null);
                }
                arrayList.clear();
            }
            arrayList.add(kotlin.jvm.internal.j.z(scope, null, null, new j2(this, obj, eventIntake, null), 3));
            arrayList.add(kotlin.jvm.internal.j.z(scope, null, null, new k2(this, obj, eventIntake, null), 3));
            arrayList.add(kotlin.jvm.internal.j.z(scope, null, null, new l2(this, obj, eventIntake, null), 3));
        }
    }

    public do2.i j(Object obj) {
        return do2.h.f55807a;
    }

    public do2.i k(Object obj) {
        return do2.h.f55807a;
    }

    public abstract do2.i l(Object obj);
}
