package pr1;

import a.g0;
import dl1.b0;
import java.util.LinkedHashMap;
import kk2.k;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101185i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f101186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(1);
        this.f101185i = i13;
        this.f101186j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101185i;
        f fVar = this.f101186j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                fVar.getClass();
                k kVar = new k(new g0(18, throwable, fVar), 0);
                Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                return kVar;
            case 1:
                fVar.f(or1.e.ATTEMPT, null);
                return Unit.f80348a;
            case 2:
                fVar.f(or1.e.SUCCESS, null);
                ox.b bVar = fVar.f101191e;
                if (bVar != null) {
                    bVar.a("login");
                    return Unit.f80348a;
                }
                Intrinsics.r("analyticsApi");
                throw null;
            case 3:
                fVar.f(or1.e.FAILURE, (Throwable) obj);
                return Unit.f80348a;
            default:
                String recaptchaToken = (String) obj;
                Intrinsics.checkNotNullParameter(recaptchaToken, "recaptchaToken");
                cr1.b bVar2 = fVar.f101190d;
                if (bVar2 == null) {
                    Intrinsics.r("authenticationService");
                    throw null;
                }
                LinkedHashMap r13 = z0.r(fVar.c());
                if (!Intrinsics.d(recaptchaToken, "recaptcha_not_needed")) {
                    r13.put("token", recaptchaToken);
                }
                Unit unit = Unit.f80348a;
                return bVar2.c(fVar.f101188b, z0.n(r13)).r(tk2.e.f118017c).k(new b0(26, new e(fVar)));
        }
    }
}
