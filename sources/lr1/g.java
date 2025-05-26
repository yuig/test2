package lr1;

import com.pinterest.identity.core.error.UnauthException;
import fk2.n;
import kk2.k;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import lh0.x1;
import or1.p;
import qr1.m;
import uj2.b0;
import uj2.q;
import vb0.j;

/* loaded from: classes2.dex */
public abstract class g implements p {

    /* renamed from: a, reason: collision with root package name */
    public final m f84601a;

    /* renamed from: b, reason: collision with root package name */
    public final mr1.c f84602b;

    /* renamed from: c, reason: collision with root package name */
    public final q f84603c;

    /* renamed from: d, reason: collision with root package name */
    public cr1.b f84604d;

    /* renamed from: e, reason: collision with root package name */
    public b20.c f84605e;

    /* renamed from: f, reason: collision with root package name */
    public x1 f84606f;

    /* renamed from: g, reason: collision with root package name */
    public i f84607g;

    public g(m authority, mr1.c activityProvider, q resultsFeed) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        this.f84601a = authority;
        this.f84602b = activityProvider;
        this.f84603c = resultsFeed;
    }

    public final t b() {
        b20.c cVar = this.f84605e;
        if (cVar == null) {
            Intrinsics.r("unauthKillSwitch");
            throw null;
        }
        m mVar = this.f84601a;
        t l13 = (cVar.o(mVar) ? c() : b0.g(new UnauthException.AuthServiceNotAvailableError(mVar))).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return l13;
    }

    public abstract kk2.m c();

    public b0 d() {
        j.f125466a.G(this + " : Authentication is not supported for this method", new Object[0]);
        k g13 = b0.g(new UnauthException.UnsupportedAuthOperation());
        Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        return g13;
    }

    public uj2.b e() {
        j.f125466a.G(this + ": Session invalidation is not supported for this method", new Object[0]);
        n g13 = uj2.b.g(new UnauthException.UnsupportedAuthOperation());
        Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        return g13;
    }

    public b0 f() {
        j.f125466a.G(this + " : Social connect is not supported for this method", new Object[0]);
        k g13 = b0.g(new UnauthException.UnsupportedAuthOperation());
        Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        return g13;
    }
}
