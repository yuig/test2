package zz1;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.identity.core.error.UnauthException;
import h32.g0;
import java.util.HashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.f0;
import v.f1;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143166i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f143167j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(d0 d0Var, int i13) {
        super(1);
        this.f143166i = i13;
        this.f143167j = d0Var;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f143166i;
        d0 d0Var = this.f143167j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string = d0Var.getText(yz1.c.gbl_recover_account_fb_deprecated_header);
                Intrinsics.checkNotNullExpressionValue(string, "getText(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string2 = d0Var.getText(d0Var.f143180j0 ? yz1.c.gbl_link_google_fb_deprecated_description : yz1.c.gbl_create_password_fb_deprecated_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getText(...)");
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new f0(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], d0Var.f143180j0 ? yz1.c.gbl_urgent_copy_subheader : yz1.c.gbl_urgent_copy_password_subheader), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnauthException.AuthenticationError.AccountAlreadyLinkedError accountAlreadyLinkedError;
        qr1.a aVar;
        f1 f1Var;
        qz.d M;
        int i13 = this.f143166i;
        d0 d0Var = this.f143167j;
        switch (i13) {
            case 0:
                qr1.p pVar = (qr1.p) obj;
                i92.k kVar = d0Var.f143182l0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.m(d0Var.getString(yz1.c.gbl_success_google_connected));
                Function1 function1 = d0Var.f143179i0;
                if (function1 != null) {
                    String str = pVar.f105026b;
                    function1.invoke(new b02.f(str != null ? str : ""));
                }
                return Unit.f80348a;
            case 1:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                int i14 = d0.f143172o0;
                d0Var.getClass();
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                String e13 = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.e();
                String str2 = e13 != null ? e13 : "";
                nx.d0 s73 = d0Var.s7();
                h32.f1 f1Var2 = h32.f1.AUTH_COLLECTION_FAIL;
                g0 g0Var = g0.LINK_GOOGLE_MODAL;
                HashMap o13 = ep.b.o("fail_reason", str2);
                Unit unit = Unit.f80348a;
                nx.d0.B(s73, f1Var2, g0Var, null, o13, 20);
                if (!(th3 instanceof UnauthException.AuthenticationError.AccountAlreadyLinkedError) || (aVar = (accountAlreadyLinkedError = (UnauthException.AuthenticationError.AccountAlreadyLinkedError) th3).f49831a) == null) {
                    i92.k kVar2 = d0Var.f143182l0;
                    if (kVar2 == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    if (str2.length() == 0) {
                        str2 = d0Var.getString(x0.generic_error);
                        Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                    }
                    kVar2.i(str2);
                } else {
                    Function1 function12 = d0Var.f143179i0;
                    if (function12 != null) {
                        function12.invoke(new b02.k(aVar.getForceRecommended(), aVar, accountAlreadyLinkedError.f49832b));
                    }
                }
                return Unit.f80348a;
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            default:
                return b((rn1.a) obj);
        }
    }
}
