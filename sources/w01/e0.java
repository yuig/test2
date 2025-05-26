package w01;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import com.pinterest.feature.pin.PinFeatureModuleLocation;
import com.pinterest.feature.pin.creation.CreationActivity;
import com.pinterest.feature.pin.edit.section.view.PinEditBoardSectionPickerCellView;
import com.pinterest.feature.profile.createdtab.scheduledpins.view.ScheduledPinsPreviewView;
import com.pinterest.feature.profile.recentpins.view.RecentlyActionedFeedFooterView;
import com.pinterest.feature.profile.savedtab.view.BoardRestoreItem;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadRecentSearchPillView;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadRecentSearchesCarouselView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.f3;
import com.pinterest.screens.k3;
import com.pinterest.ui.components.users.LegoUserRep;
import h32.a4;
import h32.f1;
import h32.u0;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z3;
import m60.x0;
import y01.p1;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126996i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f126997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, int i13) {
        super(0);
        this.f126996i = i13;
        this.f126997j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f126996i;
        Object obj = this.f126997j;
        switch (i13) {
            case 1:
                c cVar = (c) obj;
                return Boolean.valueOf(cVar.f126981f.w() && !cVar.f126981f.f());
            case 2:
                return Boolean.valueOf(((m0) obj).isBound());
            default:
                b11.k kVar = (b11.k) obj;
                lh0.z a13 = kVar.a();
                z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                Intrinsics.checkNotNullParameter("enabled_letterbox_visit_cta", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (!((g1) a13.f83517a).k("closeup_redesign_letterboxing_and_visit_cta_android", "enabled_letterbox_visit_cta", activate)) {
                    lh0.z a14 = kVar.a();
                    Intrinsics.checkNotNullParameter("enabled_no_letterbox_visit_cta", "group");
                    Intrinsics.checkNotNullParameter(activate, "activate");
                    if (!((g1) a14.f83517a).k("closeup_redesign_letterboxing_and_visit_cta_android", "enabled_no_letterbox_visit_cta", activate)) {
                        r1 = false;
                    }
                }
                return Boolean.valueOf(r1);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a4 a4Var;
        int i13 = 6;
        int i14 = this.f126996i;
        AttributeSet attributeSet = null;
        Object obj = this.f126997j;
        switch (i14) {
            case 0:
                f0 f0Var = (f0) obj;
                if (f0Var.isBound()) {
                    return (i01.b0) f0Var.getView();
                }
                return null;
            case 1:
                return invoke();
            case 2:
                return invoke();
            case 3:
                return invoke();
            case 4:
                m276invoke();
                return Unit.f80348a;
            case 5:
                m276invoke();
                return Unit.f80348a;
            case 6:
                m276invoke();
                return Unit.f80348a;
            case 7:
                Context requireContext = ((x11.c) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new PinEditBoardSectionPickerCellView(6, requireContext, (AttributeSet) null);
            case 8:
                Context requireContext2 = ((e21.v) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                e21.x xVar = new e21.x(requireContext2);
                xVar.setPaddingRelative(xVar.getPaddingStart(), xVar.getPaddingTop(), xVar.getPaddingEnd(), xVar.getResources().getDimensionPixelSize(m60.r0.margin_half));
                return xVar;
            case 9:
                m276invoke();
                return Unit.f80348a;
            case 10:
                m276invoke();
                return Unit.f80348a;
            case 11:
                m276invoke();
                return Unit.f80348a;
            case 12:
                a31.d dVar = (a31.d) obj;
                wy0 wy0Var = dVar.f517m;
                if (wy0Var == null) {
                    return null;
                }
                return new nk1.m(wy0Var, new nk1.g(dVar.getPinalytics(), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), dVar.f516l.a(true), null, null, null, dVar.f509e.g0(), null, null, 1912);
            case 13:
                return ((b31.g) obj).generateLoggingContext();
            case 14:
                m276invoke();
                return Unit.f80348a;
            case 15:
                u31.f fVar = (u31.f) obj;
                Context requireContext3 = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                ScheduledPinsPreviewView scheduledPinsPreviewView = new ScheduledPinsPreviewView(i13, requireContext3, attributeSet);
                jk2.p l13 = scheduledPinsPreviewView.f47510e.l(500L, TimeUnit.MILLISECONDS, tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(l13, "debounce(...)");
                xj2.c F = l13.A(wj2.c.a()).F(new a21.a(27, new p1(fVar, 19)), new a21.a(28, u31.c.f120158n), ck2.i.f27923c, ck2.i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                fVar.R6(F);
                return scheduledPinsPreviewView;
            case 16:
                g41.c cVar = (g41.c) obj;
                Context requireContext4 = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return ph.a.w(requireContext4, cVar.f7());
            case 17:
                Context requireContext5 = ((g41.e) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                LegoUserRep legoUserRep = new LegoUserRep(requireContext5);
                legoUserRep.y1(ze0.a.List);
                legoUserRep.t0(false);
                return legoUserRep;
            case 18:
                g41.m mVar = (g41.m) obj;
                return new n41.b(mVar.s7(), mVar.f7(), mVar.b7(), mVar.getActiveUserManager().b(mVar.U8()), new g41.l(1, mVar, g41.m.class, "onRemoveFollower", "onRemoveFollower(Lcom/pinterest/api/model/User;)V", 0));
            case 19:
                return (g41.g) obj;
            case 20:
                i41.d dVar2 = (i41.d) obj;
                if (dVar2.w3(dVar2.f71533p)) {
                    a4Var = a4.USER_SELF;
                } else {
                    a4Var = a4.USER_OTHERS;
                }
                return ((nx.m) dVar2.f71527j).a(new mq.w(a4Var, 11));
            case 21:
                a51.d dVar3 = (a51.d) obj;
                Context requireContext6 = dVar3.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                RecentlyActionedFeedFooterView recentlyActionedFeedFooterView = new RecentlyActionedFeedFooterView(i13, requireContext6, attributeSet);
                recentlyActionedFeedFooterView.f47566a = dVar3;
                x41.a g93 = dVar3.g9();
                Intrinsics.checkNotNullParameter(g93, "<set-?>");
                recentlyActionedFeedFooterView.f47567b = g93;
                return recentlyActionedFeedFooterView;
            case 22:
                m276invoke();
                return Unit.f80348a;
            case 23:
                Context requireContext7 = ((j51.e) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
                return new BoardRestoreItem(requireContext7);
            case 24:
                m276invoke();
                return Unit.f80348a;
            case 25:
                Context requireContext8 = ((p51.d) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext8, "requireContext(...)");
                p51.b bVar = new p51.b(requireContext8);
                bVar.setPaddingRelative(bVar.getPaddingStart(), bVar.getPaddingTop(), bVar.getPaddingEnd(), bVar.getResources().getDimensionPixelSize(m60.r0.margin_half));
                return bVar;
            case 26:
                u51.z zVar = (u51.z) obj;
                return new yk1.a(zVar.getResources(), zVar.f120650p.getTheme());
            case 27:
                q71.a aVar = (q71.a) obj;
                int i15 = n42.e.search_typeahead_pins_footer_lego;
                x61.e eVar = new x61.e(aVar, 3);
                int i16 = q71.x.O0;
                return aVar.V8(i15, eVar, null);
            case 28:
                Context context = ((SearchTypeaheadRecentSearchesCarouselView) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                return new SearchTypeaheadRecentSearchPillView(context, null);
            default:
                e81.n nVar = (e81.n) obj;
                return new e81.l(nVar, (ImageView) nVar.b(), nVar, nVar.f57802g, nVar.f57803h, nVar.f57804i, nVar.f57805j);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m276invoke() {
        boolean z13;
        int i13 = this.f126996i;
        Object obj = this.f126997j;
        switch (i13) {
            case 4:
                j11.d dVar = (j11.d) obj;
                dVar.getClass();
                Object bVar = new we0.b(dVar);
                m60.w wVar = dVar.f74393i;
                wVar.d(bVar);
                HashMap hashMap = dVar.f74400p;
                boolean z14 = dVar.f74395k;
                if (z14) {
                    dVar.f74394j.h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0.ONE_TAP_SAVE_EDIT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : dVar.f74389e, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    z13 = z14;
                } else {
                    z13 = z14;
                    dVar.f74394j.f0(u0.SAVING_REPIN_TOAST_CHANGE_BUTTON, h32.g0.SAVING_REPIN_TOAST, dVar.f74398n, hashMap, false);
                }
                new gy.f("saving_repin_toast").i();
                NavigationImpl z03 = Navigation.z0((ScreenLocation) k3.f51027b.getValue(), "");
                z03.m0("com.pinterest.EXTRA_PIN_ID", dVar.f74398n);
                String str = dVar.f74388d;
                z03.m0("com.pinterest.EXTRA_AUTO_SAVE_ORIGIN_PIN_ID", str);
                z03.m0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_ID", dVar.f74389e);
                z03.Y1("com.pinterest.EXTRA_IS_MOVING_PIN", true);
                z03.Y1("com.pinterest.EXTRA_IS_STORY_PIN", dVar.f74399o);
                z03.Y1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", dVar.f74392h);
                z03.m0("com.pinterest.EXTRA_PIN_CREATE_TYPE", "repin");
                z03.Y1("com.pinterest.EXTRA_IS_ONE_TAP_SAVE", z13);
                z03.m0("com.pinterest.EXTRA_SOURCE_PIN_ID", str);
                wVar.d(z03);
                return;
            case 5:
                ((CreationActivity) obj).y().a();
                return;
            case 6:
                s11.a aVar = (s11.a) obj;
                q11.c cVar = aVar.f110586l;
                if (cVar != null) {
                    t11.f fVar = (t11.f) cVar;
                    aq.d field = aVar.f110575a;
                    Intrinsics.checkNotNullParameter(field, "field");
                    int i14 = t11.a.f115790a[field.ordinal()];
                    aq.j jVar = fVar.f115801a;
                    switch (i14) {
                        case 1:
                            fVar.getPinalytics().F(h32.g0.PIN_EDIT_MODAL, u0.BOARD_EDIT_BUTTON);
                            NavigationImpl w13 = Navigation.w1((ScreenLocation) f3.f50784a.getValue());
                            if (jVar.Y()) {
                                w13.m0("com.pinterest.EXTRA_PIN_ID", jVar.B());
                            }
                            w13.Y1("com.pinterest.IS_EDIT", true);
                            w13.Y1("com.pinterest.EXTRA_IS_EDITABLE_PIN", true);
                            w13.Y1("com.pinterest.EXTRA_IS_STORY_PIN", jVar.Z());
                            w13.Y1("com.pinterest.EXTRA_PIN_FROM_SCHEDULED_PINS_PAGE", jVar instanceof aq.m);
                            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                            fVar.w3(w13);
                            return;
                        case 2:
                            fVar.getPinalytics().F(h32.g0.PIN_EDIT_MODAL, u0.BOARD_SECTION_EDIT_BUTTON);
                            NavigationImpl z04 = Navigation.z0(PinFeatureModuleLocation.PIN_EDIT_BOARD_SECTION_PICKER, fVar.t3(aq.d.BOARD_ID));
                            Intrinsics.checkNotNullExpressionValue(z04, "create(...)");
                            fVar.w3(z04);
                            return;
                        case 3:
                            if (((b60.d) fVar.f115803c).f() != null) {
                                NavigationImpl w14 = Navigation.w1((ScreenLocation) f3.f50789f.getValue());
                                w14.w0(new PinEditAdvanceMeta(jVar.y(), jVar.Y() ? jVar.B() : null, Boolean.parseBoolean(fVar.t3(aq.d.IS_COMMENTING_ALLOWED)), Boolean.parseBoolean(fVar.t3(aq.d.IS_SHOPPING_REC_ALLOWED)), jVar.W(), jVar.Z(), fVar.t3(aq.d.ALT_TEXT), fVar.t3(aq.d.SPONSOR_ID), Intrinsics.d(jVar.I(), Boolean.TRUE)), "com.pinterest.EXTRA_PIN_EDIT_ADV_META");
                                Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
                                fVar.w3(w14);
                                return;
                            }
                            return;
                        case 4:
                            NavigationImpl w15 = Navigation.w1((ScreenLocation) f3.f50791h.getValue());
                            w15.m0("com.pinterest.EXTRA_FREEFORM_TAGS", fVar.t3(aq.d.FREEFORM_TAGGING));
                            w15.m0("com.pinterest.EXTRA_INTEREST_LABELS", fVar.t3(aq.d.INTEREST_LABELS));
                            w15.m0("com.pinterest.EXTRA_INTEREST_IDS", fVar.t3(aq.d.INTEREST_TAGGING));
                            w15.Y1("com.pinterest.EXTRA_IS_EDITABLE_PIN", true);
                            Intrinsics.checkNotNullExpressionValue(w15, "apply(...)");
                            fVar.w3(w15);
                            return;
                        case 5:
                            NavigationImpl w16 = Navigation.w1((ScreenLocation) f3.f50793j.getValue());
                            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                            calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis(Long.parseLong(fVar.t3(aq.d.PUBLISH_TIME))));
                            w16.y0(calendar.getTime(), "com.pinterest.EXTRA_PIN_SELECTED_DATE_TIME");
                            Intrinsics.checkNotNullExpressionValue(w16, "apply(...)");
                            fVar.w3(w16);
                            return;
                        case 6:
                            rj0 R = jVar.R();
                            if (R != null) {
                                if (R.f() == rj0.a.UNAFFILIATED) {
                                    fVar.getPinalytics().X(u0.REMOVE_SPONSORSHIP_OPTION);
                                    q11.d dVar2 = (q11.d) fVar.getView();
                                    int i15 = q82.a.sponsored_pins_remove_partnership_alert_title;
                                    yk1.a aVar2 = (yk1.a) fVar.f115804d;
                                    String string = aVar2.f139224a.getString(i15);
                                    int i16 = ry1.f.sponsored_pins_remove_partner_alert_message;
                                    Resources resources = aVar2.f139224a;
                                    ((u11.c) dVar2).S8(string, resources.getString(i16), resources.getString(x0.remove), resources.getString(x0.cancel), q11.e.REMOVE_PAID_PARTNERSHIP_CONFIRM, q11.e.REMOVE_PAID_PARTNERSHIP_CANCELLED);
                                    return;
                                }
                                NavigationImpl w17 = Navigation.w1((ScreenLocation) f3.f50786c.getValue());
                                w17.m0("com.pinterest.CLOSEUP_PIN_ID", jVar.B());
                                wy0 e13 = R.e();
                                w17.m0("com.pinterest.EXTRA_USER_ID", e13 != null ? e13.getUid() : null);
                                w17.e(w17);
                                Intrinsics.checkNotNullExpressionValue(w17, "apply(...)");
                                fVar.w3(w17);
                                return;
                            }
                            return;
                        case 7:
                            NavigationImpl w18 = Navigation.w1((ScreenLocation) f3.f50787d.getValue());
                            aq.m mVar = jVar instanceof aq.m ? (aq.m) jVar : null;
                            w18.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_SCHEDULED_PIN_ID_TO_EDIT", mVar != null ? mVar.B() : null);
                            aq.c cVar2 = jVar instanceof aq.c ? (aq.c) jVar : null;
                            w18.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_PIN_ID_TO_EDIT", cVar2 != null ? cVar2.B() : null);
                            Intrinsics.checkNotNullExpressionValue(w18, "apply(...)");
                            fVar.w3(w18);
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 9:
                ((z11.b) obj).f140600e.invoke();
                return;
            case 10:
                com.pinterest.feature.pincarouselads.view.a0 a0Var = (com.pinterest.feature.pincarouselads.view.a0) obj;
                if (a0Var.a().c() && a0Var.a().d()) {
                    m60.w wVar2 = m60.u.f85943a;
                    String str2 = a0Var.f47366k;
                    wVar2.d(str2 != null ? new qs.b(str2, System.currentTimeMillis() * 1000000) : null);
                    return;
                }
                return;
            case 11:
                int i17 = w21.i.f127704g0;
                ((w21.i) obj).d8();
                return;
            case 14:
                ((k31.e) obj).f78244c.invoke();
                return;
            case 22:
                d51.g gVar = (d51.g) ((g51.e) obj).getViewIfBound();
                if (gVar != null) {
                    GestaltButton gestaltButton = ((j51.e) gVar).B0;
                    if (gestaltButton != null) {
                        bs1.c.s(gestaltButton, j51.d.f74717j);
                        return;
                    } else {
                        Intrinsics.r("restoreButton");
                        throw null;
                    }
                }
                return;
            default:
                ((m51.a) obj).f85880e.invoke();
                return;
        }
    }
}
