package k22;

import dl1.a0;
import dl1.s;
import dl1.u;
import gk2.d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes2.dex */
public final class l implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f78220a;

    /* renamed from: b, reason: collision with root package name */
    public final j f78221b;

    public l(m userService, j mode) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f78220a = userService;
        this.f78221b = mode;
    }

    @Override // dl1.a0
    public final uj2.b a(dl1.m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        fk2.h hVar = new fk2.h(new j12.i(22), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
        return hVar;
    }

    @Override // dl1.a0
    public final b0 b(dl1.m mVar) {
        String a13;
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        int[] iArr = k.f78219a;
        j jVar = this.f78221b;
        switch (iArr[jVar.ordinal()]) {
            case 1:
                a13 = n00.b.a(n00.c.USER_AVATAR_FIELDS);
                break;
            case 2:
                a13 = n00.b.a(n00.c.USER_AVATAR_FIELDS_PRODUCT_DETAIL_PAGE);
                break;
            case 3:
                a13 = n00.b.a(n00.c.USER_PROFILE);
                break;
            case 4:
                a13 = n00.b.a(n00.c.EDIT_PROFILE);
                break;
            case 5:
                a13 = n00.b.a(n00.c.ACCOUNT_SETTINGS);
                break;
            case 6:
                a13 = n00.b.a(n00.c.MESSAGE_SETTINGS);
                break;
            case 7:
                a13 = n00.b.a(n00.c.USER_ME);
                break;
            case 8:
                a13 = n00.b.a(n00.c.USER_ANALYTICS_GRAPH);
                break;
            case 9:
                a13 = n00.b.a(n00.c.USER_BUSINESSES);
                break;
            case 10:
                a13 = n00.b.a(n00.c.COMPLETE_PROFILE);
                break;
            case 11:
                a13 = n00.b.a(n00.c.USER_PROFILE_WITH_HAS_QUICK_CREATE_BOARD);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i13 = iArr[jVar.ordinal()];
        m mVar2 = this.f78220a;
        return i13 == 6 ? mVar2.D(a13) : mVar2.w(params.a(), a13);
    }

    @Override // dl1.a0
    public final uj2.l c(dl1.m mVar, s sVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z13 = params instanceof c;
        m mVar2 = this.f78220a;
        if (z13) {
            if (!((c) params).f78205e) {
                return mVar2.i(params.a(), ((c) params).f78206f).o();
            }
            c cVar = (c) params;
            return mVar2.v(params.a(), n00.b.a(n00.c.USER_FOLLOW_FIELDS), cVar.f78206f, cVar.f78207g).t();
        }
        if (params instanceof d) {
            return mVar2.J(params.a()).o();
        }
        if (params instanceof a) {
            if (!((a) params).f78199e) {
                return mVar2.x(params.a()).o();
            }
            String a13 = params.a();
            a aVar = (a) params;
            return mVar2.e(a13, aVar.f78200f, aVar.f78201g).o();
        }
        if (params instanceof e) {
            String str = ((e) params).f78210e;
            return mVar2.I(str, str, "spam", "unspecified_spam").o();
        }
        if (params instanceof b) {
            return mVar2.l(((b) params).f78203e).o();
        }
        if (params instanceof g) {
            g gVar = (g) params;
            return mVar2.f("p", y0.b(new Pair(gVar.f78214e, gVar.f78215f))).o();
        }
        if (params instanceof f) {
            return mVar2.f("p", ((f) params).f78212e).o();
        }
        vb0.j.f125466a.G("UserRetrofitRemoteDataSource not implemented for " + params, new Object[0]);
        return new d1(new Throwable("UserRetrofitRemoteDataSource not implemented for " + params), 1);
    }

    @Override // dl1.a0
    public final b0 e(dl1.m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        kk2.k kVar = new kk2.k(new j12.i(21), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }
}
