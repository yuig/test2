package jr1;

import a.k1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.concurrent.Executors;
import kk2.m;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import m.h;
import or1.i;
import rn.j;
import so.oa;
import uj2.b0;
import xm1.k;
import yq1.u1;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77549i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f77550j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f77549i = i13;
        this.f77550j = fVar;
    }

    public final b0 b(b lineLoginResult) {
        int i13 = this.f77549i;
        f fVar = this.f77550j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(lineLoginResult, "lineLoginResult");
                fVar.getClass();
                String str = lineLoginResult.f77548b;
                oa oaVar = fVar.f77554i.f113552a.f113568a;
                pr1.c cVar = new pr1.c(str, lineLoginResult.f77547a);
                cVar.f101190d = (cr1.b) oaVar.Z5.get();
                cVar.f101191e = (ox.b) oaVar.M1.get();
                cVar.f101192f = (i) oaVar.f114015y5.get();
                return new m(cVar.b(), new a(4, new k(25, fVar, lineLoginResult)), 2);
            default:
                Intrinsics.checkNotNullParameter(lineLoginResult, "lineLoginResult");
                fVar.getClass();
                String str2 = lineLoginResult.f77548b;
                oa oaVar2 = fVar.f77556k.f114058a.f113568a;
                gr1.i iVar = new gr1.i(str2, lineLoginResult.f77547a);
                iVar.f65999d = (cr1.a) oaVar2.A2.get();
                iVar.f66000e = (i) oaVar2.f114015y5.get();
                return iVar.e();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f77549i;
        f fVar = this.f77550j;
        switch (i13) {
            case 0:
                return b((b) obj);
            case 1:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                f30.b apiUtils = fVar.f77557l;
                Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
                String str = apiUtils.f60983c;
                String d2 = apiUtils.f60981a.d("PREF_DEV_BASE_API_HOST", null);
                if (d2 == null) {
                    d2 = str;
                }
                if (!StringsKt.E(d2, "http", false)) {
                    str = d2;
                }
                if (StringsKt.E(str, "pinterdev.com", false)) {
                    ((m60.d) apiUtils.f60982b).g();
                }
                h hVar = new h(23, 0);
                hVar.f85197b = f0.j(j.f108817c, j.f108818d, j.f108819e);
                LineAuthenticationParams lineAuthenticationParams = new LineAuthenticationParams(hVar);
                LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new un.a(activity, "1655662257"));
                if (!wn.c.f130434b) {
                    wn.c.f130434b = true;
                    Executors.newSingleThreadExecutor().execute(new wn.b(activity.getApplicationContext(), 0));
                }
                int i14 = LineAuthenticationActivity.f34082d;
                Intent intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
                intent.putExtra("authentication_config", lineAuthenticationConfig);
                intent.putExtra("authentication_params", lineAuthenticationParams);
                Intrinsics.checkNotNullExpressionValue(intent, "getLoginIntent(...)");
                Bundle bundle = Bundle.EMPTY;
                int i15 = c5.c.f25774b;
                activity.startActivityForResult(intent, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, bundle);
                fk2.m mVar = fk2.m.f62459a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 2:
                qr1.b activityResult = (qr1.b) obj;
                Intrinsics.checkNotNullParameter(activityResult, "activityResult");
                fVar.getClass();
                m k13 = new kk2.k(new k1(activityResult, 22), 1).k(new a(2, new u1(activityResult, 4))).k(new a(3, e.f77552i));
                Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                return k13;
            default:
                return b((b) obj);
        }
    }
}
