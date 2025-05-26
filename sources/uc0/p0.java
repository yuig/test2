package uc0;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;

/* loaded from: classes5.dex */
public final class p0 extends m {

    /* renamed from: g, reason: collision with root package name */
    public final vy.o f121845g;

    /* renamed from: h, reason: collision with root package name */
    public final xj2.b f121846h;

    /* renamed from: i, reason: collision with root package name */
    public final do2.f2 f121847i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(vy.o authAnalyticsLoggingService, oc0.h eventManager, l0 state, l82.a scope) {
        super(eventManager, state, scope);
        Intrinsics.checkNotNullParameter(authAnalyticsLoggingService, "authAnalyticsLoggingService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f121845g = authAnalyticsLoggingService;
        this.f121846h = new xj2.b();
        this.f121847i = do2.g2.b(0, 0, null, 7);
        kotlin.jvm.internal.j.z(scope, null, null, new h0(this, null), 3);
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        super.g();
        this.f121846h.dispose();
    }

    @Override // uc0.m
    public final Object h(k kVar, bl2.c cVar) {
        if (((n0) kVar) instanceof m0) {
            do2.t2 t2Var = this.f121825e;
            String str = (String) ((l0) t2Var.getValue()).f121816c.f121801d.f55726a.getValue();
            String str2 = (String) ((l0) t2Var.getValue()).f121817d.f121804c.f55726a.getValue();
            String str3 = (String) ((l0) t2Var.getValue()).f121818e.f121793a.f121804c.f55726a.getValue();
            String str4 = (String) ((l0) t2Var.getValue()).f121818e.f121794b.f121804c.f55726a.getValue();
            String j13 = a.a.j("Component Browser feedback: ", str);
            StringBuilder w13 = a.a.w("Name: ", str3, "\nEmail: ", str4, "\n");
            w13.append(str);
            w13.append(": ");
            w13.append(str2);
            String sb3 = w13.toString();
            RequestBody$Companion$toRequestBody$2 c13 = RequestBody.Companion.c(RequestBody.f95711a, j13);
            RequestBody$Companion$toRequestBody$2 a13 = RequestBody.Companion.a(sb3, null);
            RequestBody$Companion$toRequestBody$2 a14 = RequestBody.Companion.a("android", null);
            RequestBody$Companion$toRequestBody$2 a15 = RequestBody.Companion.a("branch", null);
            RequestBody$Companion$toRequestBody$2 a16 = RequestBody.Companion.a("debug", null);
            String USER = Build.USER;
            Intrinsics.checkNotNullExpressionValue(USER, "USER");
            RequestBody$Companion$toRequestBody$2 a17 = RequestBody.Companion.a(USER, null);
            ((m60.d) m60.d.a()).b();
            RequestBody$Companion$toRequestBody$2 a18 = RequestBody.Companion.a(String.valueOf(13198010), null);
            RequestBody$Companion$toRequestBody$2 a19 = RequestBody.Companion.a("", null);
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            RequestBody$Companion$toRequestBody$2 a23 = RequestBody.Companion.a(MODEL, null);
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            ek2.f i13 = new fk2.x(this.f121845g.e(c13, a13, a14, a15, a16, a17, a18, a19, a23, RequestBody.Companion.a(RELEASE, null), RequestBody.Companion.a("", null), null, RequestBody.Companion.a("TODO", null), null, null, RequestBody.Companion.a("ANDX", null), RequestBody.Companion.a("true", null), null, null).l(tk2.e.f118017c).h(wj2.c.a()), new k90.i(8, new o0(this, 0)), ck2.i.f27924d, ck2.i.f27923c).i(new cp.b0(this, 5), new k90.i(9, new o0(this, 1)));
            Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
            this.f121846h.a(i13);
        }
        return Unit.f80348a;
    }
}
