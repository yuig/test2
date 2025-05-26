package hp;

import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import h32.g0;
import h32.u0;
import i32.l;
import ip.e;
import kh2.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;
import rg0.n;
import u50.f0;

/* loaded from: classes3.dex */
public final class d extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f69803a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f69804b;

    /* renamed from: c, reason: collision with root package name */
    public final r20.a f69805c;

    /* renamed from: d, reason: collision with root package name */
    public final String f69806d;

    /* renamed from: e, reason: collision with root package name */
    public final String f69807e;

    /* renamed from: f, reason: collision with root package name */
    public final String f69808f;

    /* renamed from: g, reason: collision with root package name */
    public final String f69809g;

    /* renamed from: h, reason: collision with root package name */
    public final String f69810h;

    /* renamed from: i, reason: collision with root package name */
    public final String f69811i;

    /* renamed from: j, reason: collision with root package name */
    public final String f69812j;

    /* renamed from: k, reason: collision with root package name */
    public final String f69813k;

    /* renamed from: l, reason: collision with root package name */
    public final String f69814l;

    /* renamed from: m, reason: collision with root package name */
    public final String f69815m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f69816n;

    /* renamed from: o, reason: collision with root package name */
    public final g0 f69817o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n experienceValue, d0 pinalytics, r20.a notificationSettingsService) {
        super(0);
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(notificationSettingsService, "notificationSettingsService");
        this.f69803a = experienceValue;
        this.f69804b = pinalytics;
        this.f69805c = notificationSettingsService;
        a aVar = a.ALL;
        vd0.c cVar = experienceValue.f108070l;
        vd0.c m13 = cVar != null ? cVar.m("display_data") : null;
        if (m13 != null) {
            String d2 = m13.d("notifs_setting_upsell_text");
            this.f69806d = d2 == null ? "" : d2;
            String d13 = m13.d("notifs_edit_setting_text");
            this.f69808f = d13 == null ? "" : d13;
            String d14 = m13.d("notifs_setting_edit_prompt_text");
            this.f69807e = d14 == null ? "" : d14;
            vd0.c m14 = m13.m("complete_button");
            String d15 = m14 != null ? m14.d("text") : null;
            this.f69809g = d15 == null ? "" : d15;
            vd0.c m15 = m13.m("dismiss_button");
            String d16 = m15 != null ? m15.d("text") : null;
            this.f69810h = d16 == null ? "" : d16;
            vd0.c m16 = m13.m("done_button");
            String d17 = m16 != null ? m16.d("text") : null;
            this.f69811i = d17 == null ? "" : d17;
            vd0.c m17 = m13.m("manage_button");
            String d18 = m17 != null ? m17.d("text") : null;
            this.f69813k = d18 == null ? "" : d18;
            vd0.c m18 = m13.m("no_thanks_button");
            String d19 = m18 != null ? m18.d("text") : null;
            this.f69812j = d19 == null ? "" : d19;
            vd0.c m19 = m13.m("check_boxes");
            if (m19 != null) {
                vd0.c m23 = m19.m("push");
                String d23 = m23 != null ? m23.d("text") : null;
                this.f69814l = d23 == null ? "" : d23;
                vd0.c m24 = m19.m("email");
                String d24 = m24 != null ? m24.d("text") : null;
                this.f69815m = d24 != null ? d24 : "";
            }
            String d25 = m13.d("variant");
            if (d25 != null) {
                int hashCode = d25.hashCode();
                if (hashCode == 3452698) {
                    d25.equals("push");
                } else if (hashCode == 96619420) {
                    d25.equals("email");
                }
            }
            Boolean h10 = m13.h("use_no_thanks", Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
            this.f69816n = h10.booleanValue();
        }
        this.f69817o = experienceValue.f108060b == l.ANDROID_INBOX_MESSAGE_NOTIFS_OPT_IN_BANNER.getValue() ? g0.INBOX_NOTIFS_OPT_IN_BANNER_VIEW_UPSELL : g0.SHARESHEET_NOTIFS_OPT_IN_BANNER_VIEW_UPSELL;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        String str;
        gp.a view = (gp.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        NotifsOptInUpsellBannerView notifsOptInUpsellBannerView = (NotifsOptInUpsellBannerView) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        notifsOptInUpsellBannerView.f34846h = this;
        e primaryFunction = new e(notifsOptInUpsellBannerView, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(primaryFunction, "primaryFunction");
        notifsOptInUpsellBannerView.f34853o = primaryFunction;
        e secondaryFunction = new e(notifsOptInUpsellBannerView, 1);
        Intrinsics.checkNotNullParameter(secondaryFunction, "secondaryFunction");
        notifsOptInUpsellBannerView.f34854p = secondaryFunction;
        if (isBound()) {
            gp.a aVar = (gp.a) getView();
            String str2 = this.f69806d;
            if (str2 == null) {
                Intrinsics.r("notifsUpsellPromptTitle");
                throw null;
            }
            ((NotifsOptInUpsellBannerView) aVar).D(str2);
            gp.a aVar2 = (gp.a) getView();
            String text = this.f69809g;
            if (text == null) {
                Intrinsics.r("turnOnButtonText");
                throw null;
            }
            NotifsOptInUpsellBannerView notifsOptInUpsellBannerView2 = (NotifsOptInUpsellBannerView) aVar2;
            notifsOptInUpsellBannerView2.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            f0 h23 = bs1.c.h2(text);
            GestaltButtonGroup gestaltButtonGroup = notifsOptInUpsellBannerView2.f34849k;
            r.q(gestaltButtonGroup, h23);
            r.r(gestaltButtonGroup, d7.b.Z(!z.j(text)));
            gp.a aVar3 = (gp.a) getView();
            if (this.f69816n) {
                str = this.f69812j;
                if (str == null) {
                    Intrinsics.r("noThanksButtonText");
                    throw null;
                }
            } else {
                str = this.f69810h;
                if (str == null) {
                    Intrinsics.r("laterButtonText");
                    throw null;
                }
            }
            ((NotifsOptInUpsellBannerView) aVar3).L(str);
            ((NotifsOptInUpsellBannerView) ((gp.a) getView())).f34852n = this.f69803a.f108060b == l.ANDROID_SHARESHEET_MESSAGE_NOTIFS_OPT_IN_BANNER.getValue();
        }
    }

    public final void p3() {
        if (isBound()) {
            this.f69803a.c(null, null);
            ((NotifsOptInUpsellBannerView) ((gp.a) getView())).y();
            u0 u0Var = u0.DISMISS_BUTTON;
            this.f69804b.F(this.f69817o, u0Var);
        }
    }
}
