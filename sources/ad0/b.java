package ad0;

import androidx.lifecycle.e;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import do2.t2;
import do2.u2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f2083a;

    public b(z processLifecycle) {
        Intrinsics.checkNotNullParameter(processLifecycle, "processLifecycle");
        this.f2083a = u2.a(q.ON_CREATE);
        processLifecycle.getLifecycle().a(new e(this, 4));
    }
}
