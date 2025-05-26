package zz1;

import android.content.SharedPreferences;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.password.StrongPasswordTextField;
import df.j1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.w2;
import lh0.z3;
import m60.x0;
import v.f1;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143219i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f143220j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, int i13) {
        super(1);
        this.f143219i = i13;
        this.f143220j = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String userUid;
        f1 f1Var;
        qz.d M;
        f1 f1Var2;
        qz.d M2;
        int i13 = this.f143219i;
        p pVar = this.f143220j;
        switch (i13) {
            case 0:
                int i14 = p.f143223r0;
                pVar.b8(false);
                return Unit.f80348a;
            case 1:
                qr1.d dVar = (qr1.d) obj;
                Intrinsics.f(dVar);
                int i15 = p.f143223r0;
                wy0 f13 = ((b60.d) pVar.getActiveUserManager()).f();
                String uid = f13 != null ? f13.getUid() : null;
                userUid = uid != null ? uid : "";
                if (!kotlin.text.z.j(userUid)) {
                    c60.a authToken = new c60.a(dVar.getV3AccessToken(), dVar.getV5AccessToken(), dVar.getV5RefreshToken());
                    c60.d dVar2 = c60.d.f26513a;
                    c60.d.d(authToken);
                    Intrinsics.checkNotNullParameter(userUid, "userUid");
                    Intrinsics.checkNotNullParameter(authToken, "authToken");
                    SharedPreferences a13 = a60.a.a(null);
                    String string = a13.getString(userUid, null);
                    if (string != null) {
                        nm.u i16 = j1.p1(string).i();
                        i16.u("PREF_ACCESSTOKEN", authToken.f26507a);
                        i16.u("PREF_V5_ACCESS_TOKEN", authToken.f26508b);
                        i16.u("PREF_V5_REFRESH_TOKEN", authToken.f26509c);
                        a13.edit().putString(userUid, i16.toString()).apply();
                    }
                }
                vy.m mVar = pVar.f143236m0;
                if (mVar == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar.a("recovery_v2_fb_password_changed");
                nx.d0.B(pVar.s7(), h32.f1.AUTH_COLLECTION_SUCCESS, g0.CREATE_PASSWORD_MODAL, null, null, 28);
                if (pVar.f143234k0) {
                    Function1 function1 = pVar.f143240q0;
                    if (function1 != null) {
                        function1.invoke(b02.d.f20774a);
                    }
                } else {
                    i92.k kVar = pVar.f143235l0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.k(yz1.c.gbl_password_created);
                    Function1 function12 = pVar.f143240q0;
                    if (function12 != null) {
                        function12.invoke(b02.a.f20770a);
                    }
                }
                return Unit.f80348a;
            case 2:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                int i17 = p.f143223r0;
                pVar.getClass();
                boolean z13 = th3 instanceof NetworkResponseError;
                NetworkResponseError networkResponseError = z13 ? (NetworkResponseError) th3 : null;
                String e13 = (networkResponseError == null || (f1Var2 = networkResponseError.f45043a) == null || (M2 = k3.M(f1Var2)) == null) ? null : M2.e();
                if (e13 == null) {
                    e13 = pVar.getString(x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(e13, "getString(...)");
                }
                w2 w2Var = pVar.f143239p0;
                if (w2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) w2Var.f83497a;
                if (g1Var.o("android_strong_password", "enabled", z3Var) || g1Var.l("android_strong_password")) {
                    StrongPasswordTextField strongPasswordTextField = pVar.f143231h0;
                    if (strongPasswordTextField == null) {
                        Intrinsics.r("strongPasswordField");
                        throw null;
                    }
                    strongPasswordTextField.j(e13);
                } else {
                    GestaltTextField gestaltTextField = pVar.f143227d0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("passwordFieldConfirm");
                        throw null;
                    }
                    gestaltTextField.X(new kw1.c(e13, 5));
                }
                NetworkResponseError networkResponseError2 = z13 ? (NetworkResponseError) th3 : null;
                String e14 = (networkResponseError2 == null || (f1Var = networkResponseError2.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.e();
                nx.d0 s73 = pVar.s7();
                h32.f1 f1Var3 = h32.f1.AUTH_COLLECTION_FAIL;
                g0 g0Var = g0.CREATE_PASSWORD_MODAL;
                HashMap hashMap = new HashMap();
                userUid = e14 != null ? e14 : "";
                hashMap.put("fail_reason", userUid);
                Unit unit = Unit.f80348a;
                nx.d0.B(s73, f1Var3, g0Var, null, hashMap, 20);
                vy.m mVar2 = pVar.f143236m0;
                if (mVar2 != null) {
                    mVar2.a("recovery_v2_fb_password_failed");
                    return Unit.f80348a;
                }
                Intrinsics.r("analyticsApi");
                throw null;
            default:
                xl1.a it = (xl1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                StrongPasswordTextField strongPasswordTextField2 = pVar.f143231h0;
                if (strongPasswordTextField2 == null) {
                    Intrinsics.r("strongPasswordField");
                    throw null;
                }
                vr1.b i18 = strongPasswordTextField2.i();
                nx.d0 s74 = pVar.s7();
                s74.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.AUTH_COLLECTION_CLICK, (r18 & 2) != 0 ? null : u0.UPDATE_BUTTON, (r18 & 4) != 0 ? null : g0.CREATE_PASSWORD_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                h32.f1 f1Var4 = h32.f1.SUBMIT_NEW_PASSWORD;
                HashMap hashMap2 = new HashMap();
                rr1.a aVar = i18.f126459c;
                hashMap2.put("score", String.valueOf(aVar.f109934a));
                hashMap2.put("score_source", aVar.f109935b);
                hashMap2.put("surface", "SET_PASSWORD_ARR");
                Unit unit2 = Unit.f80348a;
                s74.g(f1Var4, null, hashMap2, false);
                String str = i18.f126457a;
                pVar.V7(str, str);
                return Unit.f80348a;
        }
    }
}
