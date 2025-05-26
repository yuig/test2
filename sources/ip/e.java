package ip;

import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import ek2.f;
import h32.u0;
import kh2.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import u50.f0;

/* loaded from: classes3.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73363i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ NotifsOptInUpsellBannerView f73364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(NotifsOptInUpsellBannerView notifsOptInUpsellBannerView, int i13) {
        super(0);
        this.f73363i = i13;
        this.f73364j = notifsOptInUpsellBannerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f73363i) {
            case 0:
                m156invoke();
                break;
            default:
                m156invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m156invoke() {
        int i13 = this.f73363i;
        NotifsOptInUpsellBannerView notifsOptInUpsellBannerView = this.f73364j;
        switch (i13) {
            case 0:
                hp.d dVar = notifsOptInUpsellBannerView.f34846h;
                if (dVar != null) {
                    gp.a aVar = (gp.a) dVar.getView();
                    String str = dVar.f69807e;
                    if (str != null) {
                        ((NotifsOptInUpsellBannerView) aVar).D(str);
                        gp.a aVar2 = (gp.a) dVar.getView();
                        String text = dVar.f69811i;
                        if (text != null) {
                            NotifsOptInUpsellBannerView notifsOptInUpsellBannerView2 = (NotifsOptInUpsellBannerView) aVar2;
                            notifsOptInUpsellBannerView2.getClass();
                            Intrinsics.checkNotNullParameter(text, "text");
                            f0 h23 = bs1.c.h2(text);
                            GestaltButtonGroup gestaltButtonGroup = notifsOptInUpsellBannerView2.f34849k;
                            r.q(gestaltButtonGroup, h23);
                            int i14 = 1;
                            r.r(gestaltButtonGroup, d7.b.Z(!z.j(text)));
                            gp.a aVar3 = (gp.a) dVar.getView();
                            String str2 = dVar.f69813k;
                            if (str2 != null) {
                                ((NotifsOptInUpsellBannerView) aVar3).L(str2);
                                gp.a aVar4 = (gp.a) dVar.getView();
                                hp.c primaryFunction = new hp.c(dVar, 0);
                                NotifsOptInUpsellBannerView notifsOptInUpsellBannerView3 = (NotifsOptInUpsellBannerView) aVar4;
                                notifsOptInUpsellBannerView3.getClass();
                                Intrinsics.checkNotNullParameter(primaryFunction, "primaryFunction");
                                notifsOptInUpsellBannerView3.f34853o = primaryFunction;
                                gp.a aVar5 = (gp.a) dVar.getView();
                                hp.c secondaryFunction = new hp.c(dVar, i14);
                                NotifsOptInUpsellBannerView notifsOptInUpsellBannerView4 = (NotifsOptInUpsellBannerView) aVar5;
                                notifsOptInUpsellBannerView4.getClass();
                                Intrinsics.checkNotNullParameter(secondaryFunction, "secondaryFunction");
                                notifsOptInUpsellBannerView4.f34854p = secondaryFunction;
                                f i15 = dVar.f69805c.e(true, true).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.b(2), new vo.a(26, hp.b.f69799k));
                                Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
                                dVar.addDisposable(i15);
                                dVar.f69803a.a(null, null);
                                dVar.f69804b.F(dVar.f69817o, u0.ACCEPT_BUTTON);
                                return;
                            }
                            Intrinsics.r("manageButtonText");
                            throw null;
                        }
                        Intrinsics.r("doneButtonText");
                        throw null;
                    }
                    Intrinsics.r("notifsSettingUpsellText");
                    throw null;
                }
                return;
            default:
                hp.d dVar2 = notifsOptInUpsellBannerView.f34846h;
                if (dVar2 != null) {
                    dVar2.p3();
                    return;
                }
                return;
        }
    }
}
