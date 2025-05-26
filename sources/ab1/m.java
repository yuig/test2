package ab1;

import bb1.w;
import com.pinterest.error.NetworkResponseError;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import v.f1;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1729i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f1730j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i13) {
        super(1);
        this.f1729i = i13;
        this.f1730j = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var;
        qz.d M;
        int i13 = this.f1729i;
        n nVar = this.f1730j;
        switch (i13) {
            case 0:
                if (nVar.isBound()) {
                    ((w) ((ya1.e) nVar.getView())).c8(true);
                }
                return Unit.f80348a;
            default:
                Throwable th3 = (Throwable) obj;
                ya1.e eVar = (ya1.e) nVar.getView();
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                String str = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.f105384d;
                w wVar = (w) eVar;
                i92.k kVar = wVar.f22569l0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                if (str == null) {
                    str = wVar.getString(x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                kVar.i(str);
                return Unit.f80348a;
        }
    }
}
