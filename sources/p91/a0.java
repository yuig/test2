package p91;

import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d0;
import q91.g1;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99251i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f99252j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, int i13) {
        super(1);
        this.f99251i = i13;
        this.f99252j = c0Var;
    }

    public final void b(qr1.d dVar) {
        int i13 = this.f99251i;
        c0 c0Var = this.f99252j;
        switch (i13) {
            case 1:
                d0.v(c0Var.getPinalytics(), f1.USER_PASSWORD_RESET_COMPLETED, null, false, 12);
                return;
            default:
                Intrinsics.f(dVar);
                i92.k kVar = ((g1) ((l91.j) c0Var.getView())).f103110l0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.k(b52.c.edit_password_success);
                String uid = com.bumptech.glide.d.Q(c0Var.f99263c).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                if (!kotlin.text.z.j(uid)) {
                    String v3AccessToken = dVar.getV3AccessToken();
                    if (v3AccessToken == null) {
                        throw new IllegalStateException("Missing access token");
                    }
                    c60.a aVar = new c60.a(v3AccessToken, dVar.getV5AccessToken(), dVar.getV5RefreshToken());
                    c0Var.f99266f.getClass();
                    c60.d.d(aVar);
                    c0Var.f99267g.c(uid, aVar);
                    ((g1) ((l91.j) c0Var.getView())).D5();
                    c0Var.f99264d.f(new l91.g());
                    return;
                }
                yk1.n view = c0Var.getView();
                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                g1 g1Var = (g1) ((l91.j) view);
                i92.k kVar2 = g1Var.f103110l0;
                if (kVar2 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                String string = g1Var.getString(x0.generic_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                kVar2.i(string);
                ((g1) ((l91.j) c0Var.getView())).D5();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f99251i) {
            case 0:
                c0 c0Var = this.f99252j;
                c0Var.getPinalytics().F(g0.MODAL_DIALOG, u0.SAVE_USER_SETTINGS_BUTTON);
                ((g1) ((l91.j) c0Var.getView())).f8(true);
                ((g1) ((l91.j) c0Var.getView())).e8(false);
                break;
            case 1:
                b((qr1.d) obj);
                break;
            default:
                b((qr1.d) obj);
                break;
        }
        return Unit.f80348a;
    }
}
