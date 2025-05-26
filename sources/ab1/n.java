package ab1;

import bb1.v;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import ic1.x;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class n extends t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final w f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f1732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1733c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w eventManager, uk1.d presenterPinalytics, cr1.a accountService, uj2.q networkStreamState, String verifiedPassword, String str) {
        super(presenterPinalytics, networkStreamState);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStreamState, "networkStreamState");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(verifiedPassword, "verifiedPassword");
        this.f1731a = eventManager;
        this.f1732b = accountService;
        this.f1733c = verifiedPassword;
        this.f1734d = str;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        ya1.e view = (ya1.e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        this.f1731a.h(this);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((bb1.w) view).f22574q0 = this;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isBound()) {
            ya1.e eVar = (ya1.e) getView();
            String countryCode = event.f72097a;
            bb1.w wVar = (bb1.w) eVar;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            GestaltText gestaltText = wVar.f22570m0;
            if (gestaltText == null) {
                Intrinsics.r("countryCodeText");
                throw null;
            }
            gestaltText.setHint("");
            GestaltText gestaltText2 = wVar.f22570m0;
            if (gestaltText2 == null) {
                Intrinsics.r("countryCodeText");
                throw null;
            }
            a0.p(gestaltText2, countryCode);
            GestaltButton gestaltButton = wVar.f22572o0;
            if (gestaltButton == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton.d(new v(wVar, 0));
            bb1.w wVar2 = (bb1.w) ((ya1.e) getView());
            wVar2.getClass();
            String formattingCountry = event.f72098b;
            Intrinsics.checkNotNullParameter(formattingCountry, "formattingCountry");
            wVar2.f22575r0 = new nr.i(formattingCountry);
            GestaltTextField gestaltTextField = wVar2.f22571n0;
            if (gestaltTextField != null) {
                ph.a.p(gestaltTextField, new v(wVar2, 2));
            } else {
                Intrinsics.r("phoneNumberEdit");
                throw null;
            }
        }
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((bb1.w) ((ya1.e) getView())).f22574q0 = null;
        this.f1731a.j(this);
        super.onUnbind();
    }

    public final void p3(String countryPhoneCode, String phoneNumber) {
        Intrinsics.checkNotNullParameter(countryPhoneCode, "countryPhoneCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        StringBuilder sb3 = new StringBuilder();
        int length = phoneNumber.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char charAt = phoneNumber.charAt(i14);
            if (Character.isDigit(charAt)) {
                sb3.append(charAt);
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        ek2.f i15 = new fk2.l(new fk2.x(this.f1732b.e(this.f1733c, sb4, countryPhoneCode, this.f1734d).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(27, new m(this, i13)), ck2.i.f27924d, ck2.i.f27923c), new g51.h(this, 7), 0).i(new fp.a(27, this, sb4), new ta1.c(28, new m(this, 1)));
        Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
        addDisposable(i15);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        ya1.e view = (ya1.e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        this.f1731a.h(this);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((bb1.w) view).f22574q0 = this;
    }
}
