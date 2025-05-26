package kr1;

import a.g0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kk2.k;
import kk2.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk2.f;
import pr1.i;
import so.oa;
import tk2.e;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80768i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f80769j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f80768i = i13;
        this.f80769j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 1;
        int i14 = this.f80768i;
        d dVar = this.f80769j;
        switch (i14) {
            case 0:
                a ssoAuthResult = (a) obj;
                Intrinsics.checkNotNullParameter(ssoAuthResult, "ssoAuthResult");
                if (!dVar.f80775m.getExistingUser()) {
                    cr1.b bVar = dVar.f84604d;
                    if (bVar != null) {
                        return new m(f.k(bVar.a(dVar.f80775m.getExchangeCodeToTokenInfoUrl(), ssoAuthResult.f80765a, ssoAuthResult.f80766b).r(e.f118017c), "observeOn(...)"), new jr1.a(7, new b(dVar)), 0);
                    }
                    Intrinsics.r("authenticationService");
                    throw null;
                }
                String str = dVar.f80770h.f105054b;
                String str2 = ssoAuthResult.f80765a;
                oa oaVar = dVar.f80773k.f114596a.f113568a;
                i iVar = new i(str, str2);
                iVar.f101190d = (cr1.b) oaVar.Z5.get();
                iVar.f101191e = (ox.b) oaVar.M1.get();
                iVar.f101192f = (or1.i) oaVar.f114015y5.get();
                return iVar.b();
            case 1:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intent b13 = dVar.f80772j.b(activity, lu1.a.SSO_ACTIVITY);
                b13.putExtra("com.pinterest.EXTRA_SSO_INFO", dVar.f80775m);
                Bundle bundle = Bundle.EMPTY;
                int i15 = c5.c.f25774b;
                activity.startActivityForResult(b13, 100, bundle);
                return Unit.f80348a;
            case 2:
                dVar.f84602b.H3(new c(dVar, i13));
                return Unit.f80348a;
            default:
                qr1.b activityResult = (qr1.b) obj;
                Intrinsics.checkNotNullParameter(activityResult, "activityResult");
                dVar.getClass();
                k kVar = new k(new g0(17, activityResult, dVar), 1);
                Intrinsics.checkNotNullExpressionValue(kVar, "fromCallable(...)");
                return kVar;
        }
    }
}
