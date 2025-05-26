package zq1;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import so.oa;
import so.s8;
import yq1.o2;
import yq1.y0;

/* loaded from: classes4.dex */
public final class v extends yk1.b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final lb2.q f142731a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.b f142732b;

    /* renamed from: c, reason: collision with root package name */
    public final so.g0 f142733c;

    /* renamed from: d, reason: collision with root package name */
    public final uk1.d f142734d;

    /* renamed from: e, reason: collision with root package name */
    public final com.pinterest.identity.authentication.a f142735e;

    /* renamed from: f, reason: collision with root package name */
    public final String f142736f;

    /* renamed from: g, reason: collision with root package name */
    public final qr1.m f142737g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f142738h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f142739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lb2.q authManager, cr1.b authenticationService, so.g0 twoFactorLoginFactory, uk1.d presenterPinalytics, com.pinterest.identity.authentication.a authNavigationHelper, String phoneNumber, qr1.m authority, HashMap pendingLoginParams, boolean z13) {
        super(0);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(authenticationService, "authenticationService");
        Intrinsics.checkNotNullParameter(twoFactorLoginFactory, "twoFactorLoginFactory");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(pendingLoginParams, "pendingLoginParams");
        this.f142731a = authManager;
        this.f142732b = authenticationService;
        this.f142733c = twoFactorLoginFactory;
        this.f142734d = presenterPinalytics;
        this.f142735e = authNavigationHelper;
        this.f142736f = phoneNumber;
        this.f142737g = authority;
        this.f142738h = pendingLoginParams;
        this.f142739i = z13;
    }

    @Override // yk1.b
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        this.f142731a.d(i13, i14, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        nf0.a dialogContainer;
        s view = (s) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        y0 y0Var = (y0) view;
        String phoneNumberEnd = this.f142736f;
        Intrinsics.checkNotNullParameter(phoneNumberEnd, "phoneNumberEnd");
        String string = y0Var.getString(vq1.d.two_factor_verification_description, phoneNumberEnd);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int L = StringsKt.L(string, phoneNumberEnd, 0, false, 6);
        spannableStringBuilder.setSpan(new StyleSpan(1), L, phoneNumberEnd.length() + L, 33);
        GestaltText gestaltText = y0Var.f140062m0;
        if (gestaltText == null) {
            Intrinsics.r("descriptionGestaltTextView");
            throw null;
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        pk.a0.p(gestaltText, spannableStringBuilder2);
        Intrinsics.checkNotNullParameter(this, "listener");
        y0Var.f140066q0 = this;
        FragmentActivity activity = y0Var.E4();
        if (activity != 0) {
            nf0.d dVar = activity instanceof nf0.d ? (nf0.d) activity : null;
            if (dVar == null || (dialogContainer = dVar.getDialogContainer()) == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(activity, "activity");
            ArrayList arrayList = ((mf0.k) dialogContainer).f87123f;
            if (!arrayList.isEmpty()) {
                w0 supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Fragment F = supportFragmentManager.F((String) it.next());
                    if (F != null) {
                        ((androidx.fragment.app.q) F).dismiss();
                    }
                }
            }
        }
    }

    public final void p3(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        Map B = Util.B(this.f142738h);
        s8 s8Var = this.f142733c.f113425a.f114091b;
        pr1.j jVar = new pr1.j(B, code, this.f142737g, this.f142739i);
        oa oaVar = s8Var.f114255d;
        jVar.f101190d = (cr1.b) oaVar.Z5.get();
        jVar.f101191e = (ox.b) oaVar.M1.get();
        jVar.f101192f = (or1.i) oaVar.f114015y5.get();
        int i13 = 2;
        xj2.c o13 = new kk2.h(new kk2.g(this.f142731a.c(jVar, (mr1.c) getView()), new o2(23, new u(this, 0)), 2), new t(this, i13), 1).o(new o2(24, new u(this, 1)), new o2(25, new u(this, i13)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void q3() {
        ek2.f i13 = new fk2.l(new fk2.x(this.f142732b.g(this.f142738h).l(tk2.e.f118017c).h(wj2.c.a()), new o2(21, new u(this, 3)), ck2.i.f27924d, ck2.i.f27923c), new t(this, 0), 0).i(new t(this, 1), new o2(22, new u(this, 4)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        addDisposable(i13);
    }

    public final void r3(String s13) {
        Intrinsics.checkNotNullParameter(s13, "s");
        s sVar = (s) getView();
        boolean z13 = s13.length() >= 6 && s13.length() <= 8;
        GestaltButton gestaltButton = ((y0) sVar).f140065p0;
        if (gestaltButton != null) {
            gestaltButton.d(new mm1.i(z13, 10));
        } else {
            Intrinsics.r("continueButton");
            throw null;
        }
    }
}
