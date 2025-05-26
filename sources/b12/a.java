package b12;

import a12.d;
import com.pinterest.api.model.UserFeed;
import dl1.m;
import dl1.s;
import fk2.h;
import j12.i;
import kk2.k;
import kk2.r;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import l7.w0;
import n00.c;
import uj2.a0;
import uj2.b0;
import uj2.l;
import uq0.b;
import vb0.j;
import x02.q2;
import x02.r2;
import x02.s2;
import x02.t2;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21096a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f21097b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f21098c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21099d;

    public a(d aggregatedCommentService, a0 subscribeScheduler, a0 observeScheduler) {
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(subscribeScheduler, "subscribeScheduler");
        Intrinsics.checkNotNullParameter(observeScheduler, "observeScheduler");
        this.f21099d = aggregatedCommentService;
        this.f21097b = subscribeScheduler;
        this.f21098c = observeScheduler;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        switch (this.f21096a) {
            case 0:
                x02.a params = (x02.a) mVar;
                Intrinsics.checkNotNullParameter(params, "params");
                h hVar = new h(new w0(23), 1);
                Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
                return hVar;
            default:
                t2 params2 = (t2) mVar;
                Intrinsics.checkNotNullParameter(params2, "params");
                h hVar2 = new h(new i(29), 1);
                Intrinsics.checkNotNullExpressionValue(hVar2, "error(...)");
                return hVar2;
        }
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        b0 b0Var = r.f79973a;
        int i13 = this.f21096a;
        a0 a0Var = this.f21098c;
        a0 a0Var2 = this.f21097b;
        Object obj = this.f21099d;
        switch (i13) {
            case 0:
                x02.a params = (x02.a) mVar;
                Intrinsics.checkNotNullParameter(params, "params");
                if (b.d(params)) {
                    b0Var = new kk2.m(new k(new w0(25), 1), new jr1.a(26, new gw1.i(18, params, this)), 0);
                    Intrinsics.checkNotNullExpressionValue(b0Var, "flatMap(...)");
                } else {
                    String str = params.f131493e;
                    if (str != null && str.length() != 0) {
                        Intrinsics.checkNotNullExpressionValue(str, "getNextUrl(...)");
                        b0Var = ((d) obj).a(str);
                    }
                }
                t l13 = b0Var.r(a0Var2).l(a0Var);
                Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
                return l13;
            default:
                t2 params2 = (t2) mVar;
                Intrinsics.checkNotNullParameter(params2, "params");
                if (!b.d(params2)) {
                    String str2 = params2.f131493e;
                    if (str2 != null) {
                        Intrinsics.checkNotNullExpressionValue(str2, "getNextUrl(...)");
                        b0<UserFeed> a13 = ((k22.m) obj).a(str2);
                        if (a13 != null) {
                            b0Var = a13;
                        }
                    }
                } else if (params2 instanceof r2) {
                    String str3 = ((r2) params2).f131478f;
                    Intrinsics.checkNotNullExpressionValue(str3, "getBoardId(...)");
                    b0Var = ((k22.m) obj).s(str3, n00.b.a(c.DEFAULT_USER_FEED));
                } else if (params2 instanceof q2) {
                    String str4 = ((q2) params2).f131470f;
                    Intrinsics.checkNotNullExpressionValue(str4, "getCommentId(...)");
                    b0Var = ((k22.m) obj).r(str4, n00.b.a(c.DEFAULT_USER_FEED));
                } else if (params2 instanceof s2) {
                    String str5 = ((s2) params2).f131485f;
                    Intrinsics.checkNotNullExpressionValue(str5, "getDidItId(...)");
                    b0Var = ((k22.m) obj).b(str5, n00.b.a(c.DEFAULT_USER_FEED));
                } else {
                    j.f125466a.G("UserFeedRemoteDataSource not implemented for " + params2, new Object[0]);
                    b0Var = b0.g(new Throwable("UserFeedRemoteDataSource not implemented for " + params2));
                }
                t l14 = b0Var.r(a0Var2).l(a0Var);
                Intrinsics.checkNotNullExpressionValue(l14, "observeOn(...)");
                return l14;
        }
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        switch (this.f21096a) {
            case 0:
                x02.a params = (x02.a) mVar;
                Intrinsics.checkNotNullParameter(params, "params");
                hk2.c cVar = new hk2.c(new w0(22), 1);
                Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
                return cVar;
            default:
                t2 params2 = (t2) mVar;
                Intrinsics.checkNotNullParameter(params2, "params");
                hk2.c cVar2 = new hk2.c(new i(28), 1);
                Intrinsics.checkNotNullExpressionValue(cVar2, "error(...)");
                return cVar2;
        }
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        switch (this.f21096a) {
            case 0:
                x02.a params = (x02.a) mVar;
                Intrinsics.checkNotNullParameter(params, "params");
                k kVar = new k(new w0(24), 0);
                Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                return kVar;
            default:
                t2 params2 = (t2) mVar;
                Intrinsics.checkNotNullParameter(params2, "params");
                k kVar2 = new k(new i(27), 0);
                Intrinsics.checkNotNullExpressionValue(kVar2, "error(...)");
                return kVar2;
        }
    }

    public a(k22.m userService, a0 subscribeScheduler, a0 observeScheduler) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(subscribeScheduler, "subscribeScheduler");
        Intrinsics.checkNotNullParameter(observeScheduler, "observeScheduler");
        this.f21099d = userService;
        this.f21097b = subscribeScheduler;
        this.f21098c = observeScheduler;
    }
}
