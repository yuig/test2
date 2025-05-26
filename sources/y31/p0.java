package y31;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import y01.p1;

/* loaded from: classes5.dex */
public final class p0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f136833c;

    /* renamed from: d, reason: collision with root package name */
    public final z31.e f136834d;

    /* renamed from: e, reason: collision with root package name */
    public final z31.f f136835e;

    /* renamed from: f, reason: collision with root package name */
    public final z31.b f136836f;

    /* renamed from: g, reason: collision with root package name */
    public final z31.g f136837g;

    /* renamed from: h, reason: collision with root package name */
    public final w60.d f136838h;

    /* renamed from: i, reason: collision with root package name */
    public final z31.d f136839i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.d0 f136840j;

    /* renamed from: k, reason: collision with root package name */
    public final l82.y f136841k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Application application, ao2.j0 scope, b60.b activeUserManager, z31.e showPincodeModalSEP, z31.f showUserImageDialogSEP, z31.b loadVerifiedMerchantSEP, z31.g showVerifiedMerchantSEP, w60.d screenNavigatorSEP, z31.d openLinkSEP, zy.d0 pinalyticsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(showPincodeModalSEP, "showPincodeModalSEP");
        Intrinsics.checkNotNullParameter(showUserImageDialogSEP, "showUserImageDialogSEP");
        Intrinsics.checkNotNullParameter(loadVerifiedMerchantSEP, "loadVerifiedMerchantSEP");
        Intrinsics.checkNotNullParameter(showVerifiedMerchantSEP, "showVerifiedMerchantSEP");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(openLinkSEP, "openLinkSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f136833c = activeUserManager;
        this.f136834d = showPincodeModalSEP;
        this.f136835e = showUserImageDialogSEP;
        this.f136836f = loadVerifiedMerchantSEP;
        this.f136837g = showVerifiedMerchantSEP;
        this.f136838h = screenNavigatorSEP;
        this.f136839i = openLinkSEP;
        this.f136840j = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        n0 stateTransformer = new n0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f136841k = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f136841k.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f136841k.e();
    }

    public final void h(String userId, boolean z13, r41.e profileDisplay) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(profileDisplay, "profileDisplay");
        l82.y.i(this.f136841k, new o0(profileDisplay, userId, null, ((b60.d) this.f136833c).f(), z13, new zy.l0((h32.i0) null, 3)), false, new p1(this, 24), 2);
    }
}
