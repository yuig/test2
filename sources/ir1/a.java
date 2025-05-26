package ir1;

import com.pinterest.identity.core.error.UnauthException;
import kk2.k;
import kk2.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import so.g9;
import so.i9;
import so.oa;
import uj2.b0;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73503i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f73504j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ej.c f73505k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, ej.c cVar, int i13) {
        super(1);
        this.f73503i = i13;
        this.f73504j = eVar;
        this.f73505k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73503i;
        ej.c cVar = this.f73505k;
        e eVar = this.f73504j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                eVar.getClass();
                if (!(throwable instanceof UnauthException.AuthenticationError.UserNotFoundError)) {
                    k g13 = b0.g(throwable);
                    Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
                    return g13;
                }
                i9 i9Var = eVar.f73518j;
                if (i9Var == null) {
                    Intrinsics.r("googleSignupFactory");
                    throw null;
                }
                String str = cVar.f59074f;
                oa oaVar = i9Var.f113465a.f113568a;
                sr1.c cVar2 = new sr1.c(str, cVar.f59073e);
                cVar2.f115120e = (cr1.b) oaVar.Z5.get();
                cVar2.f115121f = (or1.i) oaVar.f114015y5.get();
                cVar2.f115122g = (b60.b) oaVar.f113850p0.get();
                cVar2.f115123h = (tr1.a) oaVar.f113734i6.get();
                cVar2.f115124i = (fr1.c) oaVar.f113821n6.get();
                return b0.g(new UnauthException.AuthenticationError.AgeRequiredForCountryError(cVar2.d(), null));
            default:
                ej.c it = (ej.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                g9 g9Var = eVar.f73516h;
                if (g9Var == null) {
                    Intrinsics.r("googleLoginFactory");
                    throw null;
                }
                String str2 = cVar.f59073e;
                oa oaVar2 = g9Var.f113434a.f113568a;
                pr1.b bVar = new pr1.b(str2);
                bVar.f101190d = (cr1.b) oaVar2.Z5.get();
                bVar.f101191e = (ox.b) oaVar2.M1.get();
                bVar.f101192f = (or1.i) oaVar2.f114015y5.get();
                return new m(bVar.b(), new oo1.d(21, new a(eVar, cVar, 0)), 2);
        }
    }
}
