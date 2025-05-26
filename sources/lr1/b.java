package lr1;

import com.pinterest.identity.core.error.UnauthException;
import hr1.k;
import ir1.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qr1.y;
import so.e9;
import so.f9;
import so.g9;
import so.h9;
import so.i9;
import so.ia;
import so.j9;
import so.ja;
import so.ka;
import so.l9;
import so.ma;
import so.oa;
import so.q9;
import so.r9;
import uj2.q;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f84581a;

    /* renamed from: b, reason: collision with root package name */
    public final q f84582b;

    /* renamed from: c, reason: collision with root package name */
    public final ja f84583c;

    /* renamed from: d, reason: collision with root package name */
    public final ma f84584d;

    /* renamed from: e, reason: collision with root package name */
    public final e9 f84585e;

    /* renamed from: f, reason: collision with root package name */
    public final f9 f84586f;

    /* renamed from: g, reason: collision with root package name */
    public final j9 f84587g;

    /* renamed from: h, reason: collision with root package name */
    public final l9 f84588h;

    /* renamed from: i, reason: collision with root package name */
    public final q9 f84589i;

    /* renamed from: j, reason: collision with root package name */
    public final r9 f84590j;

    public b(mr1.c activityProvider, q resultsFeed, ja facebookLoginAuthControllerFactory, ma facebookAutologinAuthControllerFactory, e9 autoLoginAuthControllerFactory, f9 googleUnifiedAutologinAuthControllerFactory, j9 googleUnifiedAuthControllerFactory, l9 lineAuthControllerFactory, q9 facebookAuthenticationControllerFactory, r9 ssoAuthControllerFactory) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(facebookLoginAuthControllerFactory, "facebookLoginAuthControllerFactory");
        Intrinsics.checkNotNullParameter(facebookAutologinAuthControllerFactory, "facebookAutologinAuthControllerFactory");
        Intrinsics.checkNotNullParameter(autoLoginAuthControllerFactory, "autoLoginAuthControllerFactory");
        Intrinsics.checkNotNullParameter(googleUnifiedAutologinAuthControllerFactory, "googleUnifiedAutologinAuthControllerFactory");
        Intrinsics.checkNotNullParameter(googleUnifiedAuthControllerFactory, "googleUnifiedAuthControllerFactory");
        Intrinsics.checkNotNullParameter(lineAuthControllerFactory, "lineAuthControllerFactory");
        Intrinsics.checkNotNullParameter(facebookAuthenticationControllerFactory, "facebookAuthenticationControllerFactory");
        Intrinsics.checkNotNullParameter(ssoAuthControllerFactory, "ssoAuthControllerFactory");
        this.f84581a = activityProvider;
        this.f84582b = resultsFeed;
        this.f84583c = facebookLoginAuthControllerFactory;
        this.f84584d = facebookAutologinAuthControllerFactory;
        this.f84585e = autoLoginAuthControllerFactory;
        this.f84586f = googleUnifiedAutologinAuthControllerFactory;
        this.f84587g = googleUnifiedAuthControllerFactory;
        this.f84588h = lineAuthControllerFactory;
        this.f84589i = facebookAuthenticationControllerFactory;
        this.f84590j = ssoAuthControllerFactory;
    }

    public final g a(h method, y yVar) {
        g kVar;
        Intrinsics.checkNotNullParameter(method, "method");
        int i13 = a.f84580a[method.ordinal()];
        q qVar = this.f84582b;
        mr1.c cVar = this.f84581a;
        switch (i13) {
            case 1:
                return this.f84583c.a(cVar, qVar, method.name());
            case 2:
                String name = method.name();
                oa oaVar = this.f84584d.f113553a.f113568a;
                kVar = new k(cVar, qVar, name, (ka) oaVar.f113592a6.get());
                kVar.f84604d = (cr1.b) oaVar.Z5.get();
                kVar.f84605e = oaVar.g3();
                kVar.f84606f = oaVar.K2();
                kVar.f84607g = (i) oaVar.C5.get();
                break;
            case 3:
                String name2 = method.name();
                oa oaVar2 = this.f84585e.f113404a.f113568a;
                kVar = new f((ia) oaVar2.f113662e6.get(), cVar, qVar, name2);
                kVar.f84604d = (cr1.b) oaVar2.Z5.get();
                kVar.f84605e = oaVar2.g3();
                kVar.f84606f = oaVar2.K2();
                kVar.f84607g = (i) oaVar2.C5.get();
                break;
            case 4:
                String name3 = method.name();
                oa oaVar3 = this.f84586f.f113419a.f113568a;
                j jVar = new j(cVar, qVar, name3);
                jVar.f84604d = (cr1.b) oaVar3.Z5.get();
                jVar.f84605e = oaVar3.g3();
                jVar.f84606f = oaVar3.K2();
                jVar.f84607g = (i) oaVar3.C5.get();
                jVar.f73516h = (g9) oaVar3.f113698g6.get();
                jVar.f73517i = (h9) oaVar3.f113716h6.get();
                jVar.f73518j = (i9) oaVar3.f113839o6.get();
                return jVar;
            case 5:
                return this.f84587g.a(cVar, qVar, method.name());
            case 6:
                return this.f84588h.a(cVar, qVar, method.name());
            case 7:
                return this.f84589i.a(cVar, qVar, method.name());
            case 8:
                if (yVar == null) {
                    throw new UnauthException.ThirdParty.SSO.SSOAuthenticationError();
                }
                return this.f84590j.a(cVar, qVar, yVar, method.name());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return kVar;
    }
}
