package p91;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.z3;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;
import m60.x0;
import q91.g1;
import v.f1;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f99255j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f99256k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f99257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f99258m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, String str, String str2, String str3, int i13) {
        super(1);
        this.f99254i = i13;
        this.f99255j = c0Var;
        this.f99256k = str;
        this.f99257l = str2;
        this.f99258m = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var;
        qz.d M;
        int i13 = this.f99254i;
        c0 c0Var = this.f99255j;
        switch (i13) {
            case 0:
                String typedPasscode = (String) obj;
                Intrinsics.checkNotNullParameter(typedPasscode, "typedPasscode");
                c0Var.q3(this.f99256k, this.f99257l, this.f99258m, typedPasscode);
                return Unit.f80348a;
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                if (c0Var.isBound()) {
                    l91.j jVar = (l91.j) c0Var.getView();
                    NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                    String e13 = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.e();
                    g1 g1Var = (g1) jVar;
                    i92.k kVar = g1Var.f103110l0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    if (e13 == null) {
                        e13 = g1Var.getString(x0.generic_error);
                        Intrinsics.checkNotNullExpressionValue(e13, "getString(...)");
                    }
                    kVar.i(e13);
                }
                if (r91.b.c(th3) && c0Var.isBound()) {
                    l91.j jVar2 = (l91.j) c0Var.getView();
                    b0 passcodeVerified = new b0(this.f99255j, this.f99256k, this.f99257l, this.f99258m, 0);
                    g1 g1Var2 = (g1) jVar2;
                    g1Var2.getClass();
                    Intrinsics.checkNotNullParameter(passcodeVerified, "passcodeVerified");
                    m3 m3Var = g1Var2.f103111m0;
                    if (m3Var == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    g1Var2.M1(Navigation.w1(m3Var.c() ? z3.b() : z3.a()));
                    g1Var2.f103124z0 = passcodeVerified;
                }
                return Unit.f80348a;
        }
    }
}
