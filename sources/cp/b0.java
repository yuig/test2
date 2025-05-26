package cp;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.k;
import com.pinterest.api.model.aa0;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.ur0;
import com.pinterest.api.model.v7;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.education.user.signals.UserSignalsActionPromptView;
import com.pinterest.education.view.EducationActionPromptView;
import com.pinterest.feature.account.recovery.view.ResetPasswordView;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.f1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kh2.r;
import kotlin.jvm.internal.Intrinsics;
import rg0.s0;
import rg0.u0;
import so.oa;
import sw0.j0;
import u50.f0;
import uc0.l0;
import uc0.p0;
import w01.m0;
import x02.a2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52919b;

    public /* synthetic */ b0(Object obj, int i13) {
        this.f52918a = i13;
        this.f52919b = obj;
    }

    @Override // ak2.a
    public final void run() {
        aa0 aa0Var;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        int i13 = 12;
        int i14 = this.f52918a;
        int i15 = 1;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        final int i16 = 0;
        String str = null;
        str = null;
        Object obj = this.f52919b;
        switch (i14) {
            case 0:
                c0 this$0 = (c0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ek2.f fVar = this$0.f52924f;
                if (fVar != null) {
                    bk2.c.dispose(fVar);
                    return;
                }
                return;
            case 1:
                aq.g deleteActionListener = (aq.g) obj;
                Intrinsics.checkNotNullParameter(deleteActionListener, "$deleteActionListener");
                ((androidx.appcompat.widget.q) deleteActionListener).B();
                return;
            case 2:
                jf2.c this$02 = (jf2.c) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ep.b.C(null, (m60.w) this$02.f75875d);
                return;
            case 3:
                lu.y this$03 = (lu.y) obj;
                int i17 = lu.y.I0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.U1();
                this$03.F0.f126585l.F(new zt.b(17, new wt.c(this$03, 7)), new zt.b(18, lu.a.f84855v), cVar, a2Var);
                FrameLayout frameLayout = new FrameLayout(this$03.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                frameLayout.setBackgroundColor(-16777216);
                frameLayout.setAlpha(0.0f);
                frameLayout.setLayoutParams(layoutParams);
                this$03.G0 = frameLayout;
                FrameLayout frameLayout2 = this$03.f35324k0;
                if (frameLayout2 != null) {
                    frameLayout2.addView(frameLayout);
                    return;
                }
                return;
            case 4:
                cz.e this$04 = (cz.e) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                u0 u0Var = this$04.f53459g;
                if (u0Var != null) {
                    ((s0) u0Var).c();
                }
                Map map = lz.a.f85173b;
                ur0 ur0Var = this$04.f53460h;
                cz.n nVar = (cz.n) map.getOrDefault(ur0Var != null ? ur0Var.f42628b : null, cz.n.MODAL);
                if (nVar.getShouldClearSurveyData()) {
                    this$04.a();
                }
                if (nVar.getShowSuccessToast()) {
                    ur0 ur0Var2 = this$04.f53460h;
                    aa0 aa0Var2 = ur0Var2 != null ? ur0Var2.f42634h : null;
                    i92.k kVar = this$04.f53455c;
                    if (aa0Var2 != null) {
                        if (ur0Var2 != null && (aa0Var = ur0Var2.f42634h) != null) {
                            str = aa0Var.f35682a;
                        }
                        kVar.o(str);
                        return;
                    }
                    Integer successMessage = nVar.getSuccessMessage();
                    if (successMessage != null) {
                        kVar.n(successMessage.intValue());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                p0 this$05 = (p0) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                l0 l0Var = (l0) this$05.f121825e.getValue();
                l0Var.getClass();
                Intrinsics.checkNotNullParameter("Feedback sent", "text");
                l0Var.f121820g.i("Feedback sent");
                this$05.i(uc0.h.f121787a);
                return;
            case 6:
                UserSignalsActionPromptView this$06 = (UserSignalsActionPromptView) obj;
                int i18 = UserSignalsActionPromptView.f44960v;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                androidx.appcompat.app.j jVar = new androidx.appcompat.app.j(this$06.getContext(), vb2.d.dialog_pinterest_full_width);
                View inflate = LayoutInflater.from(this$06.getContext()).inflate(vb2.b.email_update_confirmation_v2, (ViewGroup) null);
                jVar.setView(inflate);
                final androidx.appcompat.app.k create = jVar.create();
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Window window = create.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                if (attributes != null) {
                    attributes.gravity = 80;
                }
                if (window != null) {
                    window.setLayout(-1, -2);
                }
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                GestaltText gestaltText = (GestaltText) inflate.findViewById(vb2.a.actionPromptConfirmationSettings);
                CharSequence string = j1.a0(this$06.getResources().getString(vb2.c.update_info_in_settings));
                Intrinsics.f(gestaltText);
                Intrinsics.f(string);
                Intrinsics.checkNotNullParameter(string, "string");
                pk.a0.q(gestaltText, new f0(string));
                gestaltText.j(new bp.j(11, create, this$06));
                View findViewById = inflate.findViewById(vb2.a.actionPromptButtonGroup);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById;
                gestaltButtonGroup.b(new gm1.a() { // from class: fg0.d
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i19 = i16;
                        k emailConfDialog = create;
                        GestaltButtonGroup buttonGroup = gestaltButtonGroup;
                        switch (i19) {
                            case 0:
                                int i23 = UserSignalsActionPromptView.f44960v;
                                Intrinsics.checkNotNullParameter(buttonGroup, "$buttonGroup");
                                Intrinsics.checkNotNullParameter(emailConfDialog, "$emailConfDialog");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (r.Z0(it, buttonGroup)) {
                                    emailConfDialog.dismiss();
                                    break;
                                }
                                break;
                            default:
                                int i24 = EducationActionPromptView.f44977y;
                                Intrinsics.checkNotNullParameter(buttonGroup, "$buttonGroup");
                                Intrinsics.checkNotNullParameter(emailConfDialog, "$emailConfDialog");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (r.Z0(it, buttonGroup)) {
                                    emailConfDialog.dismiss();
                                    break;
                                }
                                break;
                        }
                    }
                });
                create.show();
                return;
            case 7:
                EducationActionPromptView this$07 = (EducationActionPromptView) obj;
                int i19 = EducationActionPromptView.f44977y;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                androidx.appcompat.app.j jVar2 = new androidx.appcompat.app.j(this$07.getContext(), vb2.d.dialog_pinterest_full_width);
                View inflate2 = LayoutInflater.from(this$07.getContext()).inflate(vb2.b.email_update_confirmation_v2, (ViewGroup) null);
                jVar2.setView(inflate2);
                final androidx.appcompat.app.k create2 = jVar2.create();
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Window window2 = create2.getWindow();
                if (window2 != null) {
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (attributes2 != null) {
                        attributes2.gravity = 80;
                    }
                    window2.setLayout(-1, -2);
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
                GestaltText gestaltText2 = (GestaltText) inflate2.findViewById(vb2.a.actionPromptConfirmationSettings);
                Intrinsics.f(gestaltText2);
                CharSequence a03 = j1.a0(this$07.getResources().getString(vb2.c.update_info_in_settings));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                pk.a0.q(gestaltText2, bs1.c.h2(a03));
                gestaltText2.j(new bp.j(i13, create2, this$07));
                View findViewById2 = inflate2.findViewById(vb2.a.actionPromptButtonGroup);
                Intrinsics.g(findViewById2, "null cannot be cast to non-null type com.pinterest.gestalt.buttongroup.GestaltButtonGroup");
                final GestaltButtonGroup gestaltButtonGroup2 = (GestaltButtonGroup) findViewById2;
                final boolean z16 = z13 ? 1 : 0;
                gestaltButtonGroup2.b(new gm1.a() { // from class: fg0.d
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i192 = z16;
                        k emailConfDialog = create2;
                        GestaltButtonGroup buttonGroup = gestaltButtonGroup2;
                        switch (i192) {
                            case 0:
                                int i23 = UserSignalsActionPromptView.f44960v;
                                Intrinsics.checkNotNullParameter(buttonGroup, "$buttonGroup");
                                Intrinsics.checkNotNullParameter(emailConfDialog, "$emailConfDialog");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (r.Z0(it, buttonGroup)) {
                                    emailConfDialog.dismiss();
                                    break;
                                }
                                break;
                            default:
                                int i24 = EducationActionPromptView.f44977y;
                                Intrinsics.checkNotNullParameter(buttonGroup, "$buttonGroup");
                                Intrinsics.checkNotNullParameter(emailConfDialog, "$emailConfDialog");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (r.Z0(it, buttonGroup)) {
                                    emailConfDialog.dismiss();
                                    break;
                                }
                                break;
                        }
                    }
                });
                create2.show();
                return;
            case 8:
                sg0.f this$08 = (sg0.f) obj;
                int i23 = sg0.f.f112863g;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.f112866c.set(true);
                return;
            case 9:
                th0.d.p3((th0.d) obj);
                return;
            case 10:
                ii0.a this$09 = (ii0.a) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                nx.d0.v(this$09.getPinalytics(), f1.USER_PASSWORD_RESET_REQUEST, null, false, 12);
                gi0.a aVar = (gi0.a) this$09.getViewIfBound();
                if (aVar != null) {
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(((ResetPasswordView) aVar).getResources().getString(yr1.c.resent_password_reset_email));
                    return;
                }
                return;
            case 11:
                ll0.f this$010 = (ll0.f) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                v7 v7Var = this$010.f83814m;
                if (v7Var != null) {
                    u7 G1 = v7Var.G1();
                    G1.v(null);
                    v7 a13 = G1.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    this$010.x3(a13, new ll0.a(this$010, 2), ll0.e.f83799j);
                    return;
                }
                return;
            case 12:
                qp.g this$011 = (qp.g) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                this$011.h();
                return;
            case 13:
                super/*yk1.b*/.onUnbind();
                return;
            case 14:
                xp0.d this$012 = (xp0.d) obj;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                vp0.a aVar2 = (vp0.a) this$012.getView();
                yk1.i iVar = yk1.i.LOADED;
                aVar2.getClass();
                return;
            case 15:
                kr0.b this$013 = (kr0.b) obj;
                int i24 = kr0.b.f80759f;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                m60.w wVar = this$013.f80762c;
                if (wVar != null) {
                    wVar.d(new jc0.s(true));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 16:
                Runnable runnable = (Runnable) obj;
                Map map2 = ur0.g.f123074a;
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                runnable.run();
                return;
            case 17:
                fs0.i this$014 = (fs0.i) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.q3();
                this$014.f62852e.d(new pg0.c(0, this$014.f62849b, this$014.f62848a));
                return;
            case 18:
                au0.d this$015 = (au0.d) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                GestaltButton gestaltButton = ((com.pinterest.feature.ideaPinCreation.closeup.view.q) ((yt0.d) this$015.getView())).N0;
                if (gestaltButton != null) {
                    gestaltButton.d(new rn0.d(z14 ? 1 : 0, 22));
                    return;
                } else {
                    Intrinsics.r("nextGestaltButton");
                    throw null;
                }
            case 19:
                ev0.l this$016 = (ev0.l) obj;
                int i25 = ev0.l.W0;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                xj2.c F = this$016.S0.K(500L, TimeUnit.MILLISECONDS).A(wj2.c.a()).F(new ev0.g(i16, new ev0.h(this$016, i15)), new ev0.g(z15 ? 1 : 0, ev0.j.f60260j), cVar, a2Var);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                this$016.R6(F);
                return;
            case 20:
                String email = (String) obj;
                Intrinsics.checkNotNullParameter(email, "$email");
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().l(aq1.h.idea_pin_product_tagging_email_confirm_toast_text, email);
                return;
            case 21:
                pw0.c0 this$017 = (pw0.c0) obj;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.f101509q.invoke(Integer.valueOf(this$017.a()));
                return;
            case 22:
                j0 this$018 = (j0) obj;
                int i26 = j0.H1;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                FullBleedGestaltSpinner fullBleedGestaltSpinner = this$018.f115470a1;
                if (fullBleedGestaltSpinner != null) {
                    fullBleedGestaltSpinner.showLoadingSpinner(false);
                    return;
                } else {
                    Intrinsics.r("progressIndicator");
                    throw null;
                }
            case 23:
                yx0.h this$019 = (yx0.h) obj;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                int i27 = this$019.f140341g.f63028b;
                xx0.a aVar3 = (xx0.a) this$019.getView();
                if (i27 > 99) {
                    i27 = 99;
                }
                ((zx0.f) aVar3).l8(0, i27);
                return;
            case 24:
                ky0.c this$020 = (ky0.c) obj;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.p3();
                return;
            case 25:
                com.pinterest.feature.pin.d this$021 = (com.pinterest.feature.pin.d) obj;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.f47145b.performHapticFeedback(0);
                return;
            case 26:
                PinCloseupPresenter.loadCachedPin$lambda$7((PinCloseupPresenter) obj);
                return;
            case 27:
                m0 this$022 = (m0) obj;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                ep.b.C(null, this$022.f127070j);
                return;
            case 28:
                PinCloseupFragment this$023 = (PinCloseupFragment) obj;
                int i28 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.f7().d(new fd1.a());
                return;
            default:
                a41.d0 this$024 = (a41.d0) obj;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.f576u.m(((yk1.a) this$024.f567l).f139224a.getString(nz1.f.address_copied));
                return;
        }
    }
}
