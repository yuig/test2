package sr1;

import a.g0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f115115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i13) {
        super(1);
        this.f115114i = i13;
        this.f115115j = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f115114i;
        l lVar = this.f115115j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                lVar.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                kk2.k kVar = new kk2.k(new g0(19, throwable, lVar), 0);
                Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                return kVar;
            case 1:
                lVar.e(or1.e.ATTEMPT, null);
                return Unit.f80348a;
            case 2:
                lVar.e(or1.e.SUCCESS, null);
                return Unit.f80348a;
            case 3:
                lVar.e(or1.e.FAILURE, (Throwable) obj);
                return Unit.f80348a;
            default:
                String recaptchaToken = (String) obj;
                Intrinsics.checkNotNullParameter(recaptchaToken, "recaptchaToken");
                cr1.b bVar = lVar.f115120e;
                if (bVar == null) {
                    Intrinsics.r("authenticationService");
                    throw null;
                }
                LinkedHashMap r13 = z0.r(lVar.c());
                LinkedHashMap linkedHashMap = Intrinsics.d(recaptchaToken, "NOT_NEEDED") ^ true ? r13 : null;
                if (linkedHashMap != null) {
                }
                Unit unit = Unit.f80348a;
                return bVar.e(lVar.f115117b, z0.n(r13)).r(tk2.e.f118017c).k(new jr1.a(12, new k(lVar)));
        }
    }
}
