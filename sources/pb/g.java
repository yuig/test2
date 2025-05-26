package pb;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import tb.s;

/* loaded from: classes.dex */
public final class g implements qb.e {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f99414a;

    /* renamed from: b, reason: collision with root package name */
    public final long f99415b;

    public g(ConnectivityManager connManager) {
        long j13 = m.f99428b;
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.f99414a = connManager;
        this.f99415b = j13;
    }

    @Override // qb.e
    public final boolean a(s workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f117025j.d() != null;
    }

    @Override // qb.e
    public final do2.c b(kb.g constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return l0.D(new f(constraints, this, null));
    }

    @Override // qb.e
    public final boolean c(s workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (a(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
