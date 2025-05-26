package zq1;

import android.os.Bundle;
import androidx.fragment.app.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import yq1.o2;
import yq1.s2;
import yq1.y1;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142681i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f142682j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f142683k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, String str, int i13) {
        super(1);
        this.f142681i = i13;
        this.f142682j = jVar;
        this.f142683k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142681i;
        byte b13 = 0;
        String email = this.f142683k;
        j jVar = this.f142682j;
        switch (i13) {
            case 0:
                vd0.c m13 = ((vd0.c) obj).m("data");
                boolean d2 = m13 != null ? Intrinsics.d(m13.h("is_valid", Boolean.FALSE), Boolean.TRUE) : false;
                if (d2) {
                    yq1.k kVar = (yq1.k) ((b) jVar.getView());
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(email, "email");
                    kVar.getAnalyticsApi().a("signup_wall_step_completed");
                    wk2.a aVar = kVar.f139885s0;
                    if (aVar == null) {
                        Intrinsics.r("emailHostFragmentProvider");
                        throw null;
                    }
                    y1 y1Var = (y1) aVar.get();
                    Bundle bundle = new Bundle();
                    bundle.putString("com.pinterest.EXTRA_EMAIL", email);
                    y1Var.setArguments(bundle);
                    w0 supportFragmentManager = kVar.requireActivity().getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    mo1.c.c(supportFragmentManager, vq1.b.fragment_wrapper, y1Var, true, mo1.a.FADE, 32);
                } else {
                    yq1.k kVar2 = (yq1.k) ((b) jVar.getView());
                    String string = d2 ? kVar2.getString(vq1.d.signup_email_empty) : kVar2.getString(x0.signup_email_invalid);
                    Intrinsics.f(string);
                    kVar2.l8(string);
                }
                return Unit.f80348a;
            case 1:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    yq1.k kVar3 = (yq1.k) ((b) jVar.getView());
                    kVar3.getClass();
                    Intrinsics.checkNotNullParameter(email, "email");
                    kVar3.getAnalyticsApi().a("signup_wall_step_completed");
                    Intrinsics.checkNotNullParameter(kVar3, "<this>");
                    Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_PIN_ID", "key");
                    String X = com.bumptech.glide.d.X(kVar3, "com.pinterest.EXTRA_PIN_ID");
                    if (X.length() == 0) {
                        X = null;
                    }
                    w0 supportFragmentManager2 = kVar3.requireActivity().getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    int i14 = vq1.b.fragment_wrapper;
                    wk2.a aVar2 = kVar3.f139883q0;
                    if (aVar2 == null) {
                        Intrinsics.r("unauthLoginFragmentProvider");
                        throw null;
                    }
                    Object obj2 = aVar2.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    s2 s2Var = (s2) obj2;
                    kh2.d.h(s2Var, email, X);
                    mo1.c.c(supportFragmentManager2, i14, s2Var, true, mo1.a.FADE, 32);
                } else {
                    xj2.c o13 = jVar.f142689e.b(email).r(tk2.e.f118017c).l(wj2.c.a()).o(new o2(10, new i(jVar, email, b13 == true ? 1 : 0)), new o2(11, new f(jVar, 9)));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    jVar.addDisposable(o13);
                }
                return Unit.f80348a;
            case 2:
                qr1.d0 d0Var = (qr1.d0) obj;
                Intrinsics.f(d0Var);
                jVar.getClass();
                if (d0Var.getIsSSO()) {
                    qr1.y ssoInfo = new qr1.y(d0Var, email);
                    Intrinsics.checkNotNullParameter(ssoInfo, "ssoInfo");
                    jVar.q3(lr1.h.SSOAuthenticationMethod, ssoInfo);
                } else {
                    jVar.v3(email);
                }
                return Unit.f80348a;
            default:
                jVar.v3(email);
                return Unit.f80348a;
        }
    }
}
