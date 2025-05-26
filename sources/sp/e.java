package sp;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import kz0.m;
import nx.d0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f114854b;

    public /* synthetic */ e(d0 d0Var, int i13) {
        this.f114853a = i13;
        this.f114854b = d0Var;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        int i13 = this.f114853a;
        d0 pinalytics = this.f114854b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                break;
            case 2:
                int i14 = m.f81171j;
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                break;
            default:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                break;
        }
        return pinalytics.p();
    }
}
