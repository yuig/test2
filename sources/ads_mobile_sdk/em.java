package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import java.util.Map;
import kh2.g0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class em implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4885a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f4886b;

    public em(Context context, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f4885a = context;
        this.f4886b = traceLogger;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String a13;
        String a14;
        Object obj;
        String a15;
        String a16;
        String a17;
        String a18;
        String a19;
        String str = (String) map.get("data");
        if (str == null) {
            ft2.b("Missing data argument for canOpenIntents gmsg");
            Object a23 = ym0Var.a(new nm.u(), "openableIntents", cVar);
            return a23 == cl2.a.COROUTINE_SUSPENDED ? a23 : Unit.f80348a;
        }
        try {
            nm.q d2 = k41.d((nm.u) new nm.o().b(nm.u.class, str), "intents");
            if (d2 == null) {
                ft2.b("Missing intents parameter for canOpenIntents gmsg");
                Object a24 = ym0Var.a(new nm.u(), "openableIntents", cVar);
                return a24 == cl2.a.COROUTINE_SUSPENDED ? a24 : Unit.f80348a;
            }
            nm.u uVar = new nm.u();
            int size = d2.f91364a.size();
            for (int i13 = 0; i13 < size; i13++) {
                nm.u a25 = k41.a(d2, i13);
                if (a25 != null) {
                    a13 = k41.a(a25, "id", "");
                    a14 = k41.a(a25, "intent_url", "");
                    Intent intent = (Intent) g0.b(a14, new dm(this));
                    if (intent == null) {
                        intent = new Intent();
                        a15 = k41.a(a25, "u", "");
                        g0.b(a15, new yl(intent));
                        a16 = k41.a(a25, "i", "");
                        g0.b(a16, new zl(intent));
                        a17 = k41.a(a25, "m", "");
                        g0.b(a17, new am(intent));
                        a18 = k41.a(a25, "p", "");
                        g0.b(a18, new bm(intent));
                        a19 = k41.a(a25, "c", "");
                        g0.b(a19, new cm(intent));
                    }
                    try {
                        obj = this.f4885a.getPackageManager().resolveActivity(intent, 65536);
                    } catch (Exception e13) {
                        ((ks2) this.f4886b).a("Failed resolving intent: " + intent, e13);
                        obj = Unit.f80348a;
                    }
                    uVar.t(a13, Boolean.valueOf(obj != null));
                }
            }
            String str2 = (String) map.get("ad_mid");
            if (str2 != null && !z.j(str2)) {
                uVar.u("ad_mid", str2);
            }
            Object a26 = ym0Var.a(uVar, "openableIntents", cVar);
            return a26 == cl2.a.COROUTINE_SUSPENDED ? a26 : Unit.f80348a;
        } catch (Exception e14) {
            ft2.a("Invalid JSON data for canOpenIntents gmsg", e14);
            ((ks2) this.f4886b).a("Invalid JSON data for canOpenIntents gmsg", e14);
            Object a27 = ym0Var.a(new nm.u(), "openableIntents", cVar);
            return a27 == cl2.a.COROUTINE_SUSPENDED ? a27 : Unit.f80348a;
        }
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_CAN_OPEN_INTENTS;
    }
}
