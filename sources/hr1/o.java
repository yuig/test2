package hr1;

import android.app.Activity;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.login.u;
import com.facebook.login.x;
import java.util.List;
import jk2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import zq1.c0;

/* loaded from: classes4.dex */
public final class o extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70010i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f70011j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x f70012k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, q qVar) {
        super(1);
        this.f70012k = xVar;
        this.f70011j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70010i;
        q qVar = this.f70011j;
        switch (i13) {
            case 0:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                List<String> list = qVar.f69989h;
                x xVar = this.f70012k;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (list != null) {
                    for (String str : list) {
                        wc.j jVar = x.f30074j;
                        if (wc.j.A(str)) {
                            throw new FacebookException(a.a.k("Cannot pass a publish or manage permission (", str, ") to a request for read authorization"));
                        }
                    }
                }
                com.facebook.login.n loginConfig = new com.facebook.login.n(list);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
                if (activity instanceof g.h) {
                    Log.w(x.f30076l, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
                }
                xVar.g(new u(activity), xVar.a(loginConfig));
                return Unit.f80348a;
            default:
                le.m callbackManager = (le.m) obj;
                Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
                l lVar = new l();
                g0 s13 = qVar.f84603c.s();
                Intrinsics.checkNotNullExpressionValue(s13, "firstOrError(...)");
                return new kk2.g(new kk2.m(s13, new oo1.d(19, new xm1.k(24, lVar, callbackManager)), 0), new c0(8, new aw0.j(this.f70012k, callbackManager, lVar, this.f70011j, 28)), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, x xVar) {
        super(1);
        this.f70011j = qVar;
        this.f70012k = xVar;
    }
}
