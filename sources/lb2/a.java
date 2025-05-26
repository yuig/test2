package lb2;

import a.g0;
import com.pinterest.error.NetworkResponseError;
import h32.f1;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d0;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82742i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f82743j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(1);
        this.f82742i = i13;
        this.f82743j = dVar;
    }

    public final void b(xj2.c cVar) {
        int i13 = this.f82742i;
        d dVar = this.f82743j;
        switch (i13) {
            case 0:
                d0.v(dVar.f82749d, f1.USER_PASSWORD_RESET_REQUEST, null, false, 12);
                break;
            default:
                d0.v(dVar.f82749d, f1.USER_PASSWORD_RESET_REQUEST, null, false, 12);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        v.f1 f1Var;
        qz.d M;
        int i13 = this.f82742i;
        d dVar = this.f82743j;
        switch (i13) {
            case 0:
                b((xj2.c) obj);
                return Unit.f80348a;
            case 1:
                Throwable th3 = (Throwable) obj;
                i92.k kVar = dVar.f82753h;
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                if (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null || (string = M.f105384d) == null) {
                    string = ((yk1.a) dVar.f82752g).f139224a.getString(x0.generic_error);
                }
                kVar.i(string);
                return Unit.f80348a;
            case 2:
                b((xj2.c) obj);
                return Unit.f80348a;
            case 3:
                String str = (String) obj;
                m60.w wVar = dVar.f82750e;
                Intrinsics.f(str);
                wVar.d(new jc0.v(new ji0.b(str), false, 0L, 30));
                return Unit.f80348a;
            default:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                dVar.getClass();
                kk2.k kVar2 = new kk2.k(new g0(22, throwable, dVar), 0);
                Intrinsics.checkNotNullExpressionValue(kVar2, "error(...)");
                return kVar2;
        }
    }
}
