package gh1;

import an1.g;
import android.view.View;
import cn1.s;
import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navdemo.one.NavDemoOneFragment;
import com.pinterest.navdemo.three.NavDemoThreeFragment;
import com.pinterest.navdemo.two.NavDemoTwoFragment;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.oneBarLibrary.modals.views.BodyTypeFilterEducationView;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import com.pinterest.partnerAnalytics.components.OverallPerformanceView;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.TopPinsView;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinVideoMetricsEmptyCard;
import com.pinterest.partnerAnalytics.feature.survey.SurveyBannerView;
import com.pinterest.qrCodeLogin.m;
import en1.i0;
import gu1.p;
import h32.f1;
import h32.g0;
import h32.u0;
import iu1.u;
import java.util.Iterator;
import java.util.List;
import jb2.h;
import jc0.v;
import kh2.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import nx.d0;
import pw0.i;
import rc0.z0;
import rg0.n;
import rh1.q0;
import vr1.j;
import xv1.l;
import yq1.a2;
import yq1.c2;
import yq1.e2;
import yq1.h2;
import yq1.u1;
import yq1.v1;
import zp.t;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65018b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f65017a = i13;
        this.f65018b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        gm1.a aVar;
        GestaltCheckBox gestaltCheckBox;
        l lVar;
        l lVar2;
        int i13 = this.f65017a;
        int i14 = 0;
        Object obj = this.f65018b;
        switch (i13) {
            case 0:
                f this$0 = (f) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.performClick();
                return;
            case 1:
                q0 this$02 = (q0) obj;
                int i15 = q0.B1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$02.V8();
                    this$02.d9();
                    if (q0.m9()) {
                        this$02.P7();
                        return;
                    }
                    ca2.e eVar = (ca2.e) this$02.f108273w1.getValue();
                    if (eVar != null) {
                        ca2.e.i(eVar, "close_button_tapped", 0.0f, null, 6);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                i listener = (i) obj;
                int i16 = IdeaPinVideoExportLoadingView.f49010b;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                listener.i0();
                return;
            case 3:
                CreatorFollowButton this$03 = (CreatorFollowButton) obj;
                int i17 = CreatorFollowButton.f49051o;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xl1.a) {
                    nk1.f fVar = this$03.f49064f;
                    if (fVar != null) {
                        fVar.f();
                    }
                    Function0 function0 = this$03.f49055l;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                GestaltCheckBox this$04 = (GestaltCheckBox) obj;
                em1.b bVar = GestaltCheckBox.f49354f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof rn1.f) {
                    this$04.f49360a.s(new em1.c(this$04.getId(), this$04.a0().f59598a));
                    return;
                }
                return;
            case 5:
                GestaltListAction this$05 = (GestaltListAction) obj;
                yl1.d dVar = GestaltListAction.V;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                q qVar = this$05.Q;
                z0 doOnClick = new z0(5, it);
                qVar.getClass();
                Intrinsics.checkNotNullParameter(doOnClick, "doOnClick");
                Intrinsics.checkNotNullParameter(it, "event");
                doOnClick.invoke(Unit.f80348a);
                qVar.s(it);
                return;
            case 6:
                GestaltRadioButton this$06 = (GestaltRadioButton) obj;
                int i18 = GestaltRadioButton.f49481g;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$06.f49487f.s(new g(this$06.getId()));
                return;
            case 7:
                GestaltStaticSearchBar this$07 = (GestaltStaticSearchBar) obj;
                vn1.c cVar = GestaltStaticSearchBar.f49525q;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof rn1.f) || (aVar = (gm1.a) this$07.f49527a.f33804b) == null) {
                    return;
                }
                aVar.h3(new s(this$07.getId()));
                return;
            case 8:
                do1.b toastActionButton = (do1.b) obj;
                rm1.i iVar = GestaltToast.E;
                Intrinsics.checkNotNullParameter(toastActionButton, "$toastActionButton");
                Intrinsics.checkNotNullParameter(it, "it");
                toastActionButton.f55664b.invoke();
                return;
            case 9:
                v1 this$08 = (v1) obj;
                int i19 = v1.D0;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                String str = this$08.C0;
                if (str == null) {
                    Intrinsics.r("emailTypoSuggestion");
                    throw null;
                }
                if (str.length() > 0) {
                    this$08.e8().X(new u1(this$08, i14));
                }
                this$08.s7().F(null, u0.SUGGESTED_EMAIL);
                return;
            case 10:
                c2 this$09 = (c2) obj;
                int i23 = c2.F0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof em1.c) {
                    em1.c cVar2 = (em1.c) it;
                    this$09.k8(c0.d.b2(cVar2));
                    Iterator it2 = ((List) this$09.D0.getValue()).iterator();
                    while (it2.hasNext()) {
                        int i24 = ((a2) it2.next()).f139771a;
                        boolean b23 = c0.d.b2(cVar2);
                        View view = this$09.getView();
                        if (view != null && (gestaltCheckBox = (GestaltCheckBox) view.findViewById(i24)) != null) {
                            gestaltCheckBox.L(new mm1.i(b23, 16));
                        }
                    }
                    return;
                }
                return;
            case 11:
                e2 this$010 = (e2) obj;
                int i25 = e2.C0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.a) {
                    this$010.k8(!z.j(String.valueOf(((xn1.a) it).f135436c)));
                    if (this$010.f139916v0) {
                        this$010.b8();
                        this$010.f139916v0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 12:
                h2 this$011 = (h2) obj;
                int i26 = h2.E0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.a) {
                    rr1.g gVar = this$011.C0;
                    if (gVar == null) {
                        Intrinsics.r("passwordValidationUtils");
                        throw null;
                    }
                    this$011.k8(gVar.c(String.valueOf(((xn1.a) it).f135436c), false));
                    if (this$011.f139916v0) {
                        this$011.b8();
                        this$011.f139916v0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 13:
                j this$012 = (j) obj;
                int i27 = j.f126465q;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xl1.a) {
                    this$012.g(yb0.d.CONFIRM_BUTTON_CLICK);
                    return;
                }
                return;
            case 14:
                NavDemoOneFragment this$013 = (NavDemoOneFragment) obj;
                int i28 = NavDemoOneFragment.f49913o0;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((eu1.l) this$013.f49914j0.getValue()).f60191c.e().a(eu1.c.f60182a);
                return;
            case 15:
                NavDemoThreeFragment this$014 = (NavDemoThreeFragment) obj;
                int i29 = NavDemoThreeFragment.f49919s0;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((p) this$014.f49920j0.getValue()).f66154e.e().a(gu1.c.f66136a);
                return;
            case 16:
                NavDemoTwoFragment this$015 = (NavDemoTwoFragment) obj;
                int i33 = NavDemoTwoFragment.f49929s0;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((u) this$015.f49930j0.getValue()).f73721e.e().a(iu1.i.f73704a);
                return;
            case 17:
                BodyTypeFilterEducationView this$016 = (BodyTypeFilterEducationView) obj;
                int i34 = BodyTypeFilterEducationView.f49996g;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                Function0 function02 = this$016.f49997d;
                if (function02 != null) {
                    function02.invoke();
                    return;
                }
                return;
            case 18:
                uv1.q this$017 = (uv1.q) obj;
                int i35 = uv1.q.I0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$017.V8("close_button_tapped");
                    return;
                }
                return;
            case 19:
                yv1.d this$018 = (yv1.d) obj;
                int i36 = yv1.d.f140223f;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof i0) || (lVar = this$018.f140228e) == null) {
                    return;
                }
                lVar.r3(false);
                return;
            case 20:
                yv1.l this$019 = (yv1.l) obj;
                int i37 = yv1.l.f140242e;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof h) || (lVar2 = this$019.f140246d) == null) {
                    return;
                }
                lVar2.r3(false);
                return;
            case 21:
                OverallPerformanceView this$020 = (OverallPerformanceView) obj;
                int i38 = OverallPerformanceView.f50054b;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                d0 d0Var = this$020.f50055a;
                if (d0Var != null) {
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_FILTER_MENU_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                m60.u.f85943a.d(Navigation.w1(PartnerAnalyticsLocation.ANALYTICS_OVERVIEW));
                return;
            case 22:
                GestaltButton submitButton = (GestaltButton) obj;
                int i39 = fw1.i.f63057p;
                Intrinsics.checkNotNullParameter(submitButton, "$submitButton");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.i) {
                    submitButton.d(new z0(10, it));
                    return;
                }
                return;
            case 23:
                InfoAboutDataView this$021 = (InfoAboutDataView) obj;
                int i43 = InfoAboutDataView.f50075l;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                int j13 = it.j();
                if (j13 != com.pinterest.partnerAnalytics.d.get_help_gestalt_button) {
                    if (j13 == com.pinterest.partnerAnalytics.d.send_feedback_gestalt_button) {
                        if (this$021.f50083k == null) {
                            throw new r4.b();
                        }
                        fw1.j jVar = this$021.f50082j;
                        if (jVar != null) {
                            String featureId = this$021.f50080h;
                            String helpLink = this$021.f50081i;
                            if (helpLink == null) {
                                Intrinsics.r("helpLink");
                                throw null;
                            }
                            Intrinsics.checkNotNullParameter(featureId, "featureId");
                            Intrinsics.checkNotNullParameter(helpLink, "helpLink");
                            jVar.f63063a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_SEND_FEEDBACK_BUTTON, (r18 & 4) != 0 ? null : g0.ANALYTICS_FEEDBACK_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            jVar.f63065c.d(new v(new fw1.b(featureId, helpLink), false, 0L, 30));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this$021.f50083k == null) {
                    throw new r4.b();
                }
                fw1.j jVar2 = this$021.f50082j;
                if (jVar2 != null) {
                    String helpUrl = this$021.f50081i;
                    if (helpUrl == null) {
                        Intrinsics.r("helpLink");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(helpUrl, "helpLink");
                    jVar2.f63063a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_HELP_CENTER_LINK, (r18 & 4) != 0 ? null : g0.ANALYTICS_FEEDBACK_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    ll.j jVar3 = jVar2.f63064b;
                    jVar3.getClass();
                    d0 pinalytics = jVar2.f63063a;
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    Intrinsics.checkNotNullParameter(helpUrl, "helpUrl");
                    a11.e.e(((a11.d) jVar3.f83754b).a(pinalytics), helpUrl, null, 6);
                    return;
                }
                return;
            case 24:
                jw1.b viewAdapter = (jw1.b) obj;
                int i44 = ToplineMetricsCard.f50106j;
                Intrinsics.checkNotNullParameter(viewAdapter, "$viewAdapter");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    viewAdapter.g();
                    return;
                }
                return;
            case 25:
                TopPinsView this$022 = (TopPinsView) obj;
                int i45 = TopPinsView.f50124p;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                d0 d0Var2 = this$022.f50131j;
                if (d0Var2 == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_VIEW_PINS, (r18 & 4) != 0 ? null : g0.ANALYTICS_PREVIEW_PIN_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                NavigationImpl w13 = Navigation.w1(PartnerAnalyticsLocation.TOP_PINS);
                w wVar = this$022.f50134m;
                if (wVar != null) {
                    wVar.d(w13);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 26:
                t this$023 = (t) obj;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((n) this$023.f142489b).a(null, null);
                a.c.y(m60.u.f85943a);
                return;
            case 27:
                PinVideoMetricsEmptyCard this$024 = (PinVideoMetricsEmptyCard) obj;
                int i46 = PinVideoMetricsEmptyCard.f50220c;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$024.f50222b.invoke();
                return;
            case 28:
                SurveyBannerView this$025 = (SurveyBannerView) obj;
                int i47 = SurveyBannerView.f50229g;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (r.Z0(it, this$025.f50235f)) {
                    dv0.q qVar2 = this$025.f50232c;
                    if (qVar2 != null) {
                        qVar2.m();
                        return;
                    } else {
                        Intrinsics.r("surveyBannerHelper");
                        throw null;
                    }
                }
                if (r.a1(it, this$025.f50235f)) {
                    dv0.q qVar3 = this$025.f50232c;
                    if (qVar3 == null) {
                        Intrinsics.r("surveyBannerHelper");
                        throw null;
                    }
                    qVar3.l();
                    this$025.a();
                    return;
                }
                return;
            default:
                com.pinterest.qrCodeLogin.z this$026 = (com.pinterest.qrCodeLogin.z) obj;
                int i48 = com.pinterest.qrCodeLogin.z.f50362q0;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                GestaltButtonGroup gestaltButtonGroup = this$026.f50369m0;
                if (gestaltButtonGroup == null) {
                    Intrinsics.r("buttonGroup");
                    throw null;
                }
                if (r.Z0(it, gestaltButtonGroup)) {
                    kh2.j.x2(this$026.d8(), m.f50328a);
                    return;
                }
                GestaltButtonGroup gestaltButtonGroup2 = this$026.f50369m0;
                if (gestaltButtonGroup2 == null) {
                    Intrinsics.r("buttonGroup");
                    throw null;
                }
                if (r.a1(it, gestaltButtonGroup2)) {
                    kh2.j.x2(this$026.d8(), com.pinterest.qrCodeLogin.r.f50333a);
                    return;
                }
                return;
        }
    }
}
