package lq0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.tc0;
import com.pinterest.api.model.tg0;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.feature.engagementtab.FloatingCommentView;
import com.pinterest.feature.newshub.feed.view.NewsHubEmptyStateView;
import com.pinterest.feature.pin.edit.section.view.PinEditBoardSectionPickerCellView;
import com.pinterest.feature.pin.edit.view.AttributeCompoundView;
import com.pinterest.feature.profile.savedtab.view.BoardRestoreItem;
import com.pinterest.feature.settings.account.view.PasswordEditView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84377c;

    public /* synthetic */ o(int i13, Object obj, Object obj2) {
        this.f84375a = i13;
        this.f84376b = obj;
        this.f84377c = obj2;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        f30 I;
        String N2;
        v10 Y3;
        Unit unit;
        i01.d1 d1Var;
        f30 f30Var;
        Object obj;
        f31.g gVar;
        f31.y yVar;
        int i13 = this.f84375a;
        Object obj2 = this.f84377c;
        Object obj3 = this.f84376b;
        switch (i13) {
            case 0:
                ConversationMessageItemView this$0 = (ConversationMessageItemView) obj3;
                String pinId = (String) obj2;
                int i14 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pinId, "$pinId");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    nx.d0 d0Var = this$0.f45549d0;
                    if (d0Var == null) {
                        Intrinsics.r("pinalytics");
                        throw null;
                    }
                    d0Var.b0(h32.u0.PIN_REPIN_BUTTON, h32.g0.CONVERSATION_MESSAGES, pinId, false);
                    mv mvVar = this$0.f45546c0;
                    if (mvVar == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    if (mvVar.I() == null) {
                        I = (f30) this$0.L().O(pinId);
                    } else {
                        mv mvVar2 = this$0.f45546c0;
                        if (mvVar2 == null) {
                            Intrinsics.r("message");
                            throw null;
                        }
                        I = mvVar2.I();
                    }
                    e02.a.b(this$0.m(), I, false, this$0.z(), null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                    return;
                }
                return;
            case 1:
                ConversationMessageItemView this$02 = (ConversationMessageItemView) obj3;
                wy0 wy0Var = (wy0) obj2;
                int i15 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rl1.t) {
                    nx.d0 d0Var2 = this$02.f45549d0;
                    if (d0Var2 == null) {
                        Intrinsics.r("pinalytics");
                        throw null;
                    }
                    d0Var2.F(h32.g0.CONVERSATION_MESSAGES, h32.u0.USER_LIST_USER);
                    r41.k kVar = r41.k.f106176a;
                    String f39332b = wy0Var.getF39332b();
                    Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                    kVar.d(f39332b, r41.b.ConversationMessageItemView);
                    return;
                }
                return;
            case 2:
                Function1 onClickUser = (Function1) obj3;
                wy0 user = (wy0) obj2;
                int i16 = FloatingCommentView.f45688q;
                Intrinsics.checkNotNullParameter(onClickUser, "$onClickUser");
                Intrinsics.checkNotNullParameter(user, "$user");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof rl1.t) {
                    String f39332b2 = user.getF39332b();
                    Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                    onClickUser.invoke(f39332b2);
                    return;
                }
                return;
            case 3:
                Function2 onClickAction = (Function2) obj3;
                rp0.d comment = (rp0.d) obj2;
                int i17 = FloatingCommentView.f45688q;
                Intrinsics.checkNotNullParameter(onClickAction, "$onClickAction");
                Intrinsics.checkNotNullParameter(comment, "$comment");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    onClickAction.invoke(comment, rh1.x.Overflow);
                    return;
                }
                return;
            case 4:
                gs0.c this$03 = (gs0.c) obj3;
                Navigation navigation = (Navigation) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(navigation, "$navigation");
                Intrinsics.checkNotNullParameter(it, "it");
                this$03.f66028b.d(navigation);
                return;
            case 5:
                su0.k this$04 = (su0.k) obj3;
                qu0.a option = (qu0.a) obj2;
                int i18 = su0.k.f115201e;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(option, "$option");
                Intrinsics.checkNotNullParameter(it, "it");
                m60.w wVar = this$04.f115202d;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                a.c.y(wVar);
                option.f105146b.invoke();
                return;
            case 6:
                jv0.g this$05 = (jv0.g) obj3;
                ModalViewWrapper this_apply = (ModalViewWrapper) obj2;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                wy0 f13 = ((b60.d) ((b60.b) this$05.f77629d)).f();
                if (f13 != null) {
                    String str = "";
                    if (!dl2.b.L1(f13) ? (N2 = f13.N2()) != null : (Y3 = f13.Y3()) != null && (N2 = Y3.A()) != null) {
                        str = N2;
                    }
                    uo.a aVar = ((x10.d) this$05.f77628c).f131566c;
                    aVar.getClass();
                    gk2.f0 u03 = com.bumptech.glide.d.u0(aVar.f122922a.a(new g30.u()));
                    uj2.a0 a0Var = tk2.e.f118017c;
                    fk2.g i19 = u03.r(a0Var).l(wj2.c.a()).i();
                    Intrinsics.checkNotNullExpressionValue(i19, "ignoreElement(...)");
                    i19.l(a0Var).h(wj2.c.a()).i(new cp.b0(str, 20), new ev0.g(6, jv0.f.f77623k));
                }
                GestaltIconButton gestaltIconButton = this_apply.f44749a;
                if (gestaltIconButton != null) {
                    gestaltIconButton.performClick();
                    return;
                }
                return;
            case 7:
                mv0.i this$06 = (mv0.i) obj3;
                GestaltButton.SmallPrimaryButton this_apply2 = (GestaltButton.SmallPrimaryButton) obj2;
                int i23 = mv0.i.f88365f1;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                m60.w f73 = this$06.f7();
                String str2 = this$06.Y0;
                if (str2 != null) {
                    this_apply2.setEnabled(false);
                    GestaltSpinner gestaltSpinner = this$06.f88367b1;
                    if (gestaltSpinner == null) {
                        Intrinsics.r("gestaltSpinner");
                        throw null;
                    }
                    dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
                    lv0.c cVar = this$06.Z0;
                    if (cVar == null) {
                        Intrinsics.r("affiliateImageSelectedListener");
                        throw null;
                    }
                    GestaltSwitch gestaltSwitch = this$06.f88366a1;
                    if (gestaltSwitch == null) {
                        Intrinsics.r("affiliateSwitch");
                        throw null;
                    }
                    cVar.v3(str2, gestaltSwitch.l().f96708a, new i1.h(this$06, 14));
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                f73.d(unit);
                return;
            case 8:
                sw0.j0 this$07 = (sw0.j0) obj3;
                GestaltText this_apply3 = (GestaltText) obj2;
                int i24 = sw0.j0.H1;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(this_apply3, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                this$07.g9().c(this_apply3);
                return;
            case 9:
                qx model = (qx) obj3;
                bu0.a this$08 = (bu0.a) obj2;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                kh2.w.m0(model, h32.u0.NEWS_HUB_HEADER_TEXT, (nx.d0) this$08.f23897b);
                return;
            case 10:
                NewsHubEmptyStateView this$09 = (NewsHubEmptyStateView) obj3;
                Function1 listener = (Function1) obj2;
                int i25 = NewsHubEmptyStateView.f46792h;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                this$09.f46796d.X(h32.u0.NOTIFICATION_FILTERS_BUTTON);
                listener.invoke(this$09.f46797e);
                return;
            case 11:
                ny0.v this$010 = (ny0.v) obj3;
                ny0.c1 state = (ny0.c1) obj2;
                int i26 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(state, "$state");
                Intrinsics.checkNotNullParameter(it, "it");
                kh2.j.x2(this$010.l9(), new ny0.n(state.f92565a));
                return;
            case 12:
                fz0.b bVar = (fz0.b) obj3;
                fz0.l lVar = (fz0.l) obj2;
                if (it instanceof om1.l) {
                    if (bVar.f63116b > 0) {
                        int i27 = fz0.l.f63133l0;
                        lVar.Y7().f63158f.e().a(fz0.e.f63121a);
                        return;
                    } else {
                        int i28 = fz0.l.f63133l0;
                        lVar.P7();
                        return;
                    }
                }
                return;
            case 13:
                kz0.b this$011 = (kz0.b) obj3;
                Function0 onRetakeQuiz = (Function0) obj2;
                int i29 = kz0.b.f81139b;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(onRetakeQuiz, "$onRetakeQuiz");
                Intrinsics.checkNotNullParameter(it, "it");
                c0.d.u2(this$011.f81140a, h32.f1.TAP, null, h32.u0.PEAR_RETAKE_QUIZ_BUTTON, null, 10);
                onRetakeQuiz.invoke();
                return;
            case 14:
                nz0.f this$012 = (nz0.f) obj3;
                String safeUrl = (String) obj2;
                int i33 = nz0.f.f92722n;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(safeUrl, "$safeUrl");
                Intrinsics.checkNotNullParameter(it, "it");
                a11.e.e(this$012.f92724e, safeUrl, null, 6);
                return;
            case 15:
                q01.i this$013 = (q01.i) obj3;
                p01.g listener2 = (p01.g) obj2;
                int i34 = q01.i.f101785g;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                int i35 = q01.d.f101779a[this$013.f101790e.ordinal()];
                if (i35 == 1) {
                    p01.f fVar = (p01.f) listener2;
                    fVar.f98362b.resetAllInlineOneBarFilters();
                    fVar.Z(new ArrayList());
                    return;
                } else {
                    if (i35 != 2) {
                        return;
                    }
                    p01.f fVar2 = (p01.f) listener2;
                    fVar2.Z(fVar2.f98369i);
                    h32.f1 f1Var = h32.f1.TAP;
                    h32.g0 g0Var = h32.g0.RELATED_PINS_FILTERED_FEED_EMPTY_STATE;
                    HashMap hashMap = new HashMap();
                    hashMap.put("pin_id", fVar2.f98361a);
                    String str3 = fVar2.f98368h;
                    if (str3 != null) {
                        hashMap.put("related_pins_tabs_selections", str3);
                    }
                    Unit unit2 = Unit.f80348a;
                    nx.d0.B(fVar2.f98363c, f1Var, g0Var, null, hashMap, 20);
                    return;
                }
            case 16:
                q01.w this$014 = (q01.w) obj3;
                p01.j listener3 = (p01.j) obj2;
                int i36 = q01.w.f101834e;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(listener3, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                int i37 = q01.t.f101831a[this$014.f101838d.ordinal()];
                if (i37 != 1) {
                    if (i37 != 2) {
                        return;
                    }
                    ((p01.n) listener3).c();
                    return;
                }
                p01.n nVar = (p01.n) listener3;
                nVar.getClass();
                String k13 = new nm.p().a().k(nVar.e());
                h32.f1 f1Var2 = h32.f1.TAP;
                h32.g0 g0Var2 = h32.g0.RELATED_PINS_FILTERED_FEED_FOOTER;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("pin_id", nVar.f98385a);
                hashMap2.put("related_pins_tabs_selections", k13);
                Unit unit3 = Unit.f80348a;
                nx.d0.B(nVar.f98387c, f1Var2, g0Var2, null, hashMap2, 20);
                tc0 tc0Var = (tc0) CollectionsKt.c0(nVar.f98392h.keySet());
                if (tc0Var == null || (d1Var = nVar.f98394j) == null) {
                    return;
                }
                d1Var.Q(tc0Var);
                return;
            case 17:
                GestaltButtonGroup this_apply4 = (GestaltButtonGroup) obj3;
                b11.k this$015 = (b11.k) obj2;
                int i38 = b11.k.f21049o;
                Intrinsics.checkNotNullParameter(this_apply4, "$this_apply");
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    if (kh2.r.Z0(it, this_apply4)) {
                        f30 f30Var2 = this$015.f21054e;
                        if (f30Var2 != null) {
                            np0.g gVar2 = this$015.f21059j;
                            if (gVar2 != null) {
                                np0.g.c(gVar2, f30Var2, this$015.f21052c, this$015.f21057h, this$015.f21055f, 48);
                                return;
                            } else {
                                Intrinsics.r("closeupActionController");
                                throw null;
                            }
                        }
                        return;
                    }
                    this$015.getClass();
                    if ((it instanceof xl1.a) && it.j() == p80.c.clickthrough_button && (f30Var = this$015.f21054e) != null) {
                        m60.w wVar2 = this$015.f21058i;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        String f39332b3 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b3, "getUid(...)");
                        wVar2.d(new ls1.s(f39332b3));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                w11.b listener4 = (w11.b) obj3;
                PinEditBoardSectionPickerCellView this$016 = (PinEditBoardSectionPickerCellView) obj2;
                int i39 = PinEditBoardSectionPickerCellView.f47158c;
                Intrinsics.checkNotNullParameter(listener4, "$listener");
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                String boardSectionId = this$016.f47160b;
                if (boardSectionId == null) {
                    Intrinsics.r("boardSectionId");
                    throw null;
                }
                listener4.getClass();
                Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
                Iterator it2 = listener4.getDataSources().get(0).d().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (!(obj instanceof ba) || !Intrinsics.d(((ba) obj).getF39332b(), boardSectionId)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ba baVar = obj instanceof ba ? (ba) obj : null;
                if (baVar == null) {
                    return;
                }
                listener4.f127601a.f(new v11.d(baVar));
                if (listener4.isBound()) {
                    ((x11.c) ((v11.c) listener4.getView())).P7();
                    return;
                }
                return;
            case 19:
                Function1 textListener = (Function1) obj3;
                AttributeCompoundView this$017 = (AttributeCompoundView) obj2;
                int i43 = AttributeCompoundView.f47185c;
                Intrinsics.checkNotNullParameter(textListener, "$textListener");
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.i) {
                    textListener.invoke(StringsKt.i0(((xn1.i) it).f135454c).toString());
                    return;
                } else {
                    if ((it instanceof xn1.d) && ((xn1.d) it).f135444c == 6) {
                        textListener.invoke(StringsKt.i0(this$017.f47187b.B0()).toString());
                        return;
                    }
                    return;
                }
            case 20:
                View this_apply5 = (View) obj3;
                m31.e this$018 = (m31.e) obj2;
                int i44 = m31.e.f85767x0;
                Intrinsics.checkNotNullParameter(this_apply5, "$this_apply");
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    hf0.b.k(this_apply5);
                    this$018.P7();
                    return;
                }
                return;
            case 21:
                GestaltIconButton iconView = (GestaltIconButton) obj3;
                a41.f0 actionIcon = (a41.f0) obj2;
                int i45 = a41.r.P1;
                Intrinsics.checkNotNullParameter(iconView, "$iconView");
                Intrinsics.checkNotNullParameter(actionIcon, "$actionIcon");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    iconView.performHapticFeedback(3);
                    actionIcon.f593e.invoke();
                    return;
                }
                return;
            case 22:
                a41.r this$019 = (a41.r) obj3;
                l41.b searchCellViewModel = (l41.b) obj2;
                int i46 = a41.r.P1;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(searchCellViewModel, "$searchCellViewModel");
                Intrinsics.checkNotNullParameter(it, "event");
                this$019.getClass();
                int j13 = it.j();
                if (j13 == nz1.c.user_profile_search_with_actions_bar) {
                    if (it instanceof cn1.s) {
                        searchCellViewModel.f81553b.invoke();
                        return;
                    } else {
                        if (it instanceof cn1.u) {
                            searchCellViewModel.f81555d.invoke();
                            return;
                        }
                        return;
                    }
                }
                GestaltStaticSearchBar gestaltStaticSearchBar = this$019.f652g1;
                if (gestaltStaticSearchBar == null) {
                    Intrinsics.r("searchFieldWithActions");
                    throw null;
                }
                Integer M = kh2.j.M(gestaltStaticSearchBar);
                if (M != null && j13 == M.intValue()) {
                    if (it instanceof om1.l) {
                        this$019.J1.invoke();
                        return;
                    }
                    return;
                }
                GestaltStaticSearchBar gestaltStaticSearchBar2 = this$019.f652g1;
                if (gestaltStaticSearchBar2 == null) {
                    Intrinsics.r("searchFieldWithActions");
                    throw null;
                }
                Integer N = kh2.j.N(gestaltStaticSearchBar2);
                if (N != null && j13 == N.intValue() && (it instanceof om1.l)) {
                    this$019.K1.invoke();
                    return;
                }
                return;
            case 23:
                w41.n0 this$020 = (w41.n0) obj3;
                f31.h innerState = (f31.h) obj2;
                int i47 = w41.n0.f128044e1;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(innerState, "$innerState");
                Intrinsics.checkNotNullParameter(it, "event");
                this$020.getClass();
                if (it instanceof cn1.s) {
                    yVar = f31.t.f61029a;
                } else if (it instanceof cn1.u) {
                    yVar = f31.u.f61030a;
                } else {
                    int j14 = it.j();
                    GestaltStaticSearchBar gestaltStaticSearchBar3 = this$020.Q0;
                    if (gestaltStaticSearchBar3 == null) {
                        Intrinsics.r("searchBar");
                        throw null;
                    }
                    Integer M2 = kh2.j.M(gestaltStaticSearchBar3);
                    if (M2 != null && j14 == M2.intValue()) {
                        f31.g gVar3 = (f31.g) CollectionsKt.U(0, innerState.f61010b);
                        if (gVar3 != null) {
                            yVar = gVar3.f61007f;
                        }
                        yVar = null;
                    } else {
                        int j15 = it.j();
                        GestaltStaticSearchBar gestaltStaticSearchBar4 = this$020.Q0;
                        if (gestaltStaticSearchBar4 == null) {
                            Intrinsics.r("searchBar");
                            throw null;
                        }
                        Integer N3 = kh2.j.N(gestaltStaticSearchBar4);
                        if (N3 != null && j15 == N3.intValue() && (gVar = (f31.g) CollectionsKt.U(1, innerState.f61010b)) != null) {
                            yVar = gVar.f61007f;
                        }
                        yVar = null;
                    }
                }
                if (yVar != null) {
                    this$020.n9(new w41.u(yVar));
                    return;
                }
                return;
            case 24:
                Function0 onClick = (Function0) obj3;
                BoardRestoreItem this$021 = (BoardRestoreItem) obj2;
                int i48 = BoardRestoreItem.f47568j;
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof an1.j) {
                    onClick.invoke();
                    this$021.getClass();
                    kh2.d.l(this$021.f47571f, new i31.a(true, 14));
                    return;
                }
                return;
            case 25:
                tg0 model2 = (tg0) obj3;
                z51.h this$022 = (z51.h) obj2;
                int i49 = z51.h.f140869e;
                Intrinsics.checkNotNullParameter(model2, "$model");
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    if (model2.f42211e) {
                        Activity l03 = bs1.c.l0(this$022);
                        Context context = this$022.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        rl2.g0.h0(l03, context);
                        return;
                    }
                    z51.c cVar2 = this$022.f140870a;
                    cVar2.getClass();
                    Date date = model2.f42207a;
                    Intrinsics.checkNotNullParameter(date, "date");
                    SimpleDateFormat simpleDateFormat = z51.e.f140868a1;
                    cVar2.f140865a.h9(date);
                    return;
                }
                return;
            case 26:
                l81.l this$023 = (l81.l) obj3;
                GestaltIconButton this_apply6 = (GestaltIconButton) obj2;
                int i53 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(this_apply6, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof om1.l) {
                    i81.c cVar3 = this$023.f82177p1;
                    if (cVar3 != null) {
                        ((k81.l) cVar3).M3();
                    }
                    this_apply6.t(l81.e.f82122k);
                    GestaltIconButton gestaltIconButton2 = this$023.M1;
                    if (gestaltIconButton2 != null) {
                        gestaltIconButton2.bringToFront();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                l81.l this$024 = (l81.l) obj3;
                f30 pin = (f30) obj2;
                int i54 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof om1.l) {
                    wk2.a aVar2 = this$024.f82159g1;
                    if (aVar2 == null) {
                        Intrinsics.r("cutoutToolNavigator");
                        throw null;
                    }
                    Object obj4 = aVar2.get();
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    String f39332b4 = pin.getF39332b();
                    Intrinsics.checkNotNullExpressionValue(f39332b4, "getUid(...)");
                    ab0.e.b((ab0.e) obj4, f39332b4, bs1.c.y0(pin), 0, d32.c.PIN_CLOSEUP_CUTOUT_TOOL, ml1.b.CROSS_FADE_TRANSITION, 16);
                    return;
                }
                return;
            case 28:
                q91.o this$025 = (q91.o) obj3;
                m91.b item = (m91.b) obj2;
                int i55 = q91.o.f103148c;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    this$025.f103149a.invoke(item);
                    return;
                }
                return;
            default:
                PasswordEditView this$026 = (PasswordEditView) obj3;
                GestaltText this_with = (GestaltText) obj2;
                int i56 = PasswordEditView.f48130i;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                Intrinsics.checkNotNullParameter(it, "it");
                hf0.b.k(this$026);
                lb2.d dVar = this$026.f48133f;
                if (dVar == null) {
                    Intrinsics.r("accountManager");
                    throw null;
                }
                Context context2 = this_with.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                lb2.d.b(dVar, context2, null, true, 2);
                return;
        }
    }
}
