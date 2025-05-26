package zq1;

import com.pinterest.identity.core.error.UnauthException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f142679j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(1);
        this.f142678i = i13;
        this.f142679j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uj2.b0 g13;
        uj2.b0 b0Var;
        int i13 = this.f142678i;
        j jVar = this.f142679j;
        switch (i13) {
            case 0:
                String str = (String) obj;
                Intrinsics.f(str);
                if (!kotlin.text.z.j(str)) {
                    ((yq1.k) ((b) jVar.getView())).i8(str);
                }
                break;
            case 1:
                ((yq1.k) ((b) jVar.getView())).j8(true);
                break;
            case 2:
                qr1.c cVar = (qr1.c) obj;
                Intrinsics.f(cVar);
                j.p3(jVar, cVar);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                jVar.s3(((yq1.k) ((b) jVar.getView())).e8());
                lb2.q qVar = jVar.f142685a;
                qVar.getClass();
                mr1.c activityProvider = jVar.f142691g;
                Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
                tb.l lVar = qVar.f82801a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
                String b13 = hf0.b.b();
                int i14 = 0;
                if (b13 == null || kotlin.text.z.j(b13)) {
                    nr1.e eVar = (nr1.e) lVar.f116987c;
                    or1.i authLoggingUtils = (or1.i) lVar.f116986b;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
                    Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
                    qr1.l lVar2 = qr1.l.f105012b;
                    if (eVar.f91888a.o(lVar2)) {
                        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
                        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
                        g13 = uj2.b0.j("");
                        Intrinsics.checkNotNullExpressionValue(g13, "just(...)");
                    } else {
                        g13 = uj2.b0.g(new UnauthException.AuthServiceNotAvailableError(lVar2));
                    }
                    kk2.t l13 = g13.l(wj2.c.a());
                    Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
                    or1.f mode = or1.f.HINT;
                    or1.i authLoggingUtils2 = (or1.i) lVar.f116986b;
                    Intrinsics.checkNotNullParameter(l13, "<this>");
                    Intrinsics.checkNotNullParameter(mode, "mode");
                    Intrinsics.checkNotNullParameter(authLoggingUtils2, "authLoggingUtils");
                    kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(l13, new com.pinterest.feature.home.model.h(29, new or1.l(authLoggingUtils2, mode, 0)), 2), new or1.j(0, new or1.l(authLoggingUtils2, mode, 1)), 3), new or1.j(1, new or1.l(authLoggingUtils2, mode, 2)), 1);
                    Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
                    b0Var = gVar;
                } else {
                    b0Var = uj2.b0.j(b13);
                }
                xj2.c o13 = b0Var.o(new com.pinterest.feature.home.model.h(24, new g(jVar, i14)), new com.pinterest.feature.home.model.h(25, h.f142680i));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                jVar.addDisposable(o13);
                if ((!(th3 instanceof UnauthException.AutoLoginAuthenticationError) ? th3 : null) != null) {
                    Intrinsics.f(th3);
                    jVar.f142686b.a(false, th3);
                }
                break;
        }
        return Unit.f80348a;
    }
}
