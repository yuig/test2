package ab1;

import bb1.z;
import com.pinterest.api.model.dx;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.gestalt.text.GestaltText;
import jk2.l1;
import jk2.x;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import qr1.v;
import v.f1;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f1739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uk1.d presenterPinalytics, uj2.q networkStateStream, cr1.a accountService) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        this.f1739a = accountService;
    }

    public static final void p3(q qVar, v vVar) {
        qVar.getClass();
        dx dxVar = (dx) CollectionsKt.U(0, vVar.getMfaBackupCodes());
        if (dxVar != null) {
            ya1.f fVar = (ya1.f) qVar.getView();
            String newBackupCode = dxVar.getCode();
            boolean used = dxVar.getUsed();
            z zVar = (z) fVar;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(newBackupCode, "newBackupCode");
            if (used) {
                GestaltText gestaltText = zVar.f22585n0;
                if (gestaltText != null) {
                    gestaltText.i(new d91.l(newBackupCode, 8));
                    return;
                } else {
                    Intrinsics.r("backupCodeText");
                    throw null;
                }
            }
            GestaltText gestaltText2 = zVar.f22585n0;
            if (gestaltText2 != null) {
                a0.p(gestaltText2, newBackupCode);
            } else {
                Intrinsics.r("backupCodeText");
                throw null;
            }
        }
    }

    public static final void q3(q qVar, Throwable th3) {
        f1 f1Var;
        qz.d M;
        ya1.f fVar = (ya1.f) qVar.getView();
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        String str = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.f105384d;
        z zVar = (z) fVar;
        i92.k kVar = zVar.f22583l0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        if (str == null) {
            str = zVar.getString(x0.generic_error);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        kVar.i(str);
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((z) ((ya1.f) getView())).f22584m0 = null;
        super.onUnbind();
    }

    @Override // yk1.p
    public final void r3(ya1.f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((z) view).f22584m0 = this;
        l1 A = this.f1739a.d().H(tk2.e.f118017c).A(wj2.c.a());
        ta1.c cVar = new ta1.c(29, new q91.h(view, 29));
        ck2.c cVar2 = ck2.i.f27923c;
        int i13 = 1;
        xj2.c F = new x(new jk2.v(A, cVar, cVar2, i13), new fp.a(28, this, view), i13).F(new o(0, new p(this, 0)), new o(1, new p(this, i13)), cVar2, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void s3() {
        l1 A = this.f1739a.v().H(tk2.e.f118017c).A(wj2.c.a());
        o oVar = new o(2, new p(this, 2));
        ck2.c cVar = ck2.i.f27923c;
        int i13 = 1;
        xj2.c F = new x(new jk2.v(A, oVar, cVar, i13), new g51.h(this, 8), i13).F(new o(3, new p(this, 3)), new o(4, new p(this, 4)), cVar, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }
}
