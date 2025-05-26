package ir1;

import ao2.v0;
import com.pinterest.identity.core.error.UnauthException;
import dl1.b0;
import kk2.k;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import kp.n;
import n7.o;
import so.g9;
import so.h9;
import so.i9;
import u5.d0;
import u5.l;
import u5.w;
import u5.y;
import uj2.q;

/* loaded from: classes2.dex */
public abstract class e extends lr1.g {

    /* renamed from: h, reason: collision with root package name */
    public g9 f73516h;

    /* renamed from: i, reason: collision with root package name */
    public h9 f73517i;

    /* renamed from: j, reason: collision with root package name */
    public i9 f73518j;

    /* renamed from: k, reason: collision with root package name */
    public final ho2.c f73519k;

    /* renamed from: l, reason: collision with root package name */
    public final String f73520l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mr1.c activityProvider, q resultsFeed) {
        super(qr1.g.f105000b, activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        ko2.f fVar = v0.f20219a;
        this.f73519k = dl2.b.b(ko2.e.f80326c);
        this.f73520l = "694505692171-31closf3bcmlt59aeulg2j81ej68j6hk.apps.googleusercontent.com";
    }

    public final m g(boolean z13) {
        fk2.g gVar = new fk2.g(new n7.d(this, z13, 2), 0);
        Intrinsics.checkNotNullExpressionValue(gVar, "create(...)");
        m k13 = gVar.c(this.f84602b.I5()).k(new b0(17, b.f73506i));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final uj2.b0 h(u5.i credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        if (credential instanceof d0) {
            h9 h9Var = this.f73517i;
            if (h9Var != null) {
                d0 d0Var = (d0) credential;
                return h9Var.a(d0Var.c(), d0Var.d()).b();
            }
            Intrinsics.r("pinterestLoginFactory");
            throw null;
        }
        if (!(credential instanceof w) || !Intrinsics.d(credential.b(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            k g13 = uj2.b0.g(new UnauthException.ThirdParty.GoogleOneTap.UnsupportedAccountTypeError());
            Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
            return g13;
        }
        try {
            ej.c c03 = n.c0(credential.a());
            m mVar = new m(uj2.b0.j(c03), new oo1.d(20, new a(this, c03, 1)), 0);
            Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
            return mVar;
        } catch (Exception e13) {
            return uj2.b0.g(new UnauthException.ThirdParty.GoogleOneTap.GoogleIdCredentialRetrievalError(e13));
        }
    }

    public final kk2.b i(l credentialManager, y request) {
        Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
        Intrinsics.checkNotNullParameter(request, "request");
        kk2.b bVar = new kk2.b(new o(this, credentialManager, request, 7), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }
}
