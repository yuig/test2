package hp;

import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import em1.i;
import h32.u0;
import k1.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tk2.e;

/* loaded from: classes3.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69801i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f69802j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(0);
        this.f69801i = i13;
        this.f69802j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f69801i) {
            case 0:
                m151invoke();
                break;
            default:
                m151invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m151invoke() {
        int i13 = this.f69801i;
        d dVar = this.f69802j;
        switch (i13) {
            case 0:
                if (dVar.isBound()) {
                    ((NotifsOptInUpsellBannerView) ((gp.a) dVar.getView())).y();
                    u0 u0Var = u0.DONE_BUTTON;
                    dVar.f69804b.F(dVar.f69817o, u0Var);
                    if (((NotifsOptInUpsellBannerView) ((gp.a) dVar.getView())).f34847i.isShown()) {
                        NotifsOptInUpsellBannerView notifsOptInUpsellBannerView = (NotifsOptInUpsellBannerView) ((gp.a) dVar.getView());
                        boolean a23 = c0.d.a2(notifsOptInUpsellBannerView.f34850l);
                        boolean a24 = c0.d.a2(notifsOptInUpsellBannerView.f34851m);
                        if (a23 && a24) {
                            return;
                        }
                        dVar.f69805c.e(a23, a24).l(e.f118017c).h(wj2.c.a()).i(new xo.b(3), new vo.a(27, b.f69798j));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (dVar.isBound()) {
                    gp.a aVar = (gp.a) dVar.getView();
                    String str = dVar.f69808f;
                    if (str != null) {
                        ((NotifsOptInUpsellBannerView) aVar).D(str);
                        gp.a aVar2 = (gp.a) dVar.getView();
                        String doneButtonText = dVar.f69811i;
                        if (doneButtonText != null) {
                            NotifsOptInUpsellBannerView notifsOptInUpsellBannerView2 = (NotifsOptInUpsellBannerView) aVar2;
                            notifsOptInUpsellBannerView2.getClass();
                            Intrinsics.checkNotNullParameter(doneButtonText, "doneButtonText");
                            notifsOptInUpsellBannerView2.L("");
                            gp.a aVar3 = (gp.a) dVar.getView();
                            String emailText = dVar.f69815m;
                            if (emailText == null) {
                                Intrinsics.r("emailCheckBoxText");
                                throw null;
                            }
                            String pushText = dVar.f69814l;
                            if (pushText != null) {
                                NotifsOptInUpsellBannerView notifsOptInUpsellBannerView3 = (NotifsOptInUpsellBannerView) aVar3;
                                notifsOptInUpsellBannerView3.getClass();
                                Intrinsics.checkNotNullParameter(emailText, "emailText");
                                Intrinsics.checkNotNullParameter(pushText, "pushText");
                                c0.d.l(notifsOptInUpsellBannerView3.f34850l.L(new j1(pushText, 8)), i.f59624q);
                                c0.d.l(notifsOptInUpsellBannerView3.f34851m.L(new j1(emailText, 9)), i.f59624q);
                                bs1.c.U1(notifsOptInUpsellBannerView3.f34847i);
                                notifsOptInUpsellBannerView3.getLayoutParams().height = -2;
                                notifsOptInUpsellBannerView3.requestLayout();
                                u0 u0Var2 = u0.SETTINGS_BUTTON;
                                dVar.f69804b.F(dVar.f69817o, u0Var2);
                                return;
                            }
                            Intrinsics.r("pushCheckBoxText");
                            throw null;
                        }
                        Intrinsics.r("doneButtonText");
                        throw null;
                    }
                    Intrinsics.r("notifsEditSettingText");
                    throw null;
                }
                return;
        }
    }
}
