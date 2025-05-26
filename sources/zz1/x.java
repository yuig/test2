package zz1;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.identity.core.error.UnauthException;
import h32.g0;
import kh2.k3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import v.f1;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143253i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f143254j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, int i13) {
        super(1);
        this.f143253i = i13;
        this.f143254j = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NetworkResponseError networkResponseError;
        f1 f1Var;
        int i13 = this.f143253i;
        z zVar = this.f143254j;
        switch (i13) {
            case 0:
                nx.d0.B(zVar.s7(), h32.f1.MOVE_GOOGLE_LINK_SUCCESS, g0.MOVE_GOOGLE_LOGIN, null, null, 28);
                i92.k kVar = zVar.f143258c0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.k(yz1.c.gbl_move_google_link_success);
                Function1 function1 = zVar.f143262g0;
                if (function1 != null) {
                    function1.invoke(b02.a.f20770a);
                }
                return Unit.f80348a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof UnauthException) {
                    Throwable cause = th3.getCause();
                    if (cause instanceof NetworkResponseError) {
                        networkResponseError = (NetworkResponseError) cause;
                    }
                    networkResponseError = null;
                } else {
                    if (th3 instanceof NetworkResponseError) {
                        networkResponseError = (NetworkResponseError) th3;
                    }
                    networkResponseError = null;
                }
                qz.d M = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null) ? null : k3.M(f1Var);
                nx.d0 s73 = zVar.s7();
                h32.f1 f1Var2 = h32.f1.MOVE_GOOGLE_LINK_FAILURE;
                g0 g0Var = g0.MOVE_GOOGLE_LOGIN;
                Pair[] pairArr = new Pair[1];
                pairArr[0] = new Pair("api_error_code", String.valueOf(M != null ? M.f105387g : -1));
                nx.d0.B(s73, f1Var2, g0Var, null, bs1.c.o(pairArr), 20);
                String e13 = M != null ? M.e() : null;
                if (e13 == null) {
                    e13 = "";
                }
                i92.k kVar2 = zVar.f143258c0;
                if (kVar2 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                if (e13.length() == 0) {
                    e13 = zVar.getString(x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(e13, "getString(...)");
                }
                kVar2.i(e13);
                return Unit.f80348a;
        }
    }
}
