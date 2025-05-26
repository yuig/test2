package zq1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.LinkedHashMap;
import java.util.Map;
import jk2.a1;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142710i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f142711j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Map f142712k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Map map, o oVar, int i13) {
        super(1);
        this.f142710i = i13;
        this.f142712k = map;
        this.f142711j = oVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f142710i;
        o oVar = this.f142711j;
        Map map = this.f142712k;
        switch (i13) {
            case 1:
                Intrinsics.f(th3);
                o.p3(oVar, th3, map);
                break;
            default:
                LinkedHashMap r13 = z0.r(map);
                r13.put("google_id_token", "");
                Intrinsics.f(th3);
                o.p3(oVar, th3, r13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142710i;
        o oVar = this.f142711j;
        Map map = this.f142712k;
        switch (i13) {
            case 0:
                qr1.c authUser = (qr1.c) obj;
                Intrinsics.checkNotNullParameter(authUser, "authUser");
                String str = (String) map.get("new");
                oVar.getClass();
                qr1.m mVar = authUser.f104980c;
                String N2 = authUser.f104978a.N2();
                if (N2 == null) {
                    N2 = "";
                }
                nr1.a aVar = new nr1.a(mVar, N2, str);
                uk2.f fVar = oVar.f142726n;
                fVar.getClass();
                a1 a1Var = new a1(fVar);
                Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
                fk2.f0 q13 = new fk2.c(1, oVar.f142720h.E(aVar, oVar.f142721i, a1Var), ck2.i.f27926f).q(authUser);
                Intrinsics.checkNotNullExpressionValue(q13, "toSingleDefault(...)");
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                String recaptchaToken = (String) obj;
                Intrinsics.checkNotNullParameter(recaptchaToken, "recaptchaToken");
                break;
            case 3:
                LinkedHashMap destination = new LinkedHashMap();
                destination.put("google_id_token", ((mr1.g) obj).f88087a);
                Intrinsics.checkNotNullParameter(map, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                destination.putAll(map);
                Map B = Util.B(destination);
                oVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.UNAUTH_ACCOUNT_RECOVERY_SUCCESS, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : h32.g0.FB_RECOVER_LOGIN_FORM, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                oVar.s3(B);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Map map, int i13) {
        super(1);
        this.f142710i = i13;
        this.f142711j = oVar;
        this.f142712k = map;
    }
}
