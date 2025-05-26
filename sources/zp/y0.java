package zp;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.go;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.p20;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.boardsection.create.selectpins.view.CreateBoardSectionSelectPinsGridCell;
import com.pinterest.feature.conversation.view.ConversationDidItemView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.education.IdeaPinCreationEducationOnboardingView;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFilterRepView;
import com.pinterest.feature.storypin.creation.feedback.view.IdeaPinFeedbackSatisfactionView;
import com.pinterest.feature.storypin.creation.interesttagging.view.ShoppingBrandCapsule;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.screens.f3;
import com.pinterest.screens.v2;
import com.pinterest.ui.grid.ImageInterestFollowButton;
import com.pinterest.video.core.view.PinterestVideoView;
import df.j1;
import ey.j3;
import ey.k3;
import h32.d4;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f142583d;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, int i13) {
        this.f142580a = i13;
        this.f142581b = obj;
        this.f142582c = obj2;
        this.f142583d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1 function1;
        vh vhVar;
        int i13 = this.f142580a;
        Object obj = null;
        Object obj2 = this.f142583d;
        Object obj3 = this.f142582c;
        Object obj4 = this.f142581b;
        switch (i13) {
            case 0:
                d1 this$0 = (d1) obj4;
                aq.j editablePinWrapper = (aq.j) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(editablePinWrapper, "$editablePinWrapper");
                this$0.getEventManager().d(new jc0.s(false));
                NavigationImpl w13 = Navigation.w1((ScreenLocation) f3.f50794k.getValue());
                w13.y0(((Calendar) obj3).getTime(), "com.pinterest.EXTRA_PIN_SELECTED_DATE_TIME");
                w13.Y1("com.pinterest.EXTRA_IS_EDITABLE_PIN", true);
                w13.m0("com.pinterest.EXTRA_SCHEDULED_PIN_ID", editablePinWrapper.B());
                this$0.getEventManager().d(w13);
                return;
            case 1:
                float f13 = jq.n.f77453a;
                ((nx.d0) obj4).F(h32.g0.NAVIGATION, h32.u0.PIN_SEND_BUTTON);
                ((c2) obj3).q(y32.f.PINCH_TO_ZOOM.value(), (f30) obj2);
                return;
            case 2:
                Function2 onDraftTapped = (Function2) obj4;
                fi0 collage = (fi0) obj3;
                xa0.a state = (xa0.a) obj2;
                int i14 = xa0.p.f134422k;
                Intrinsics.checkNotNullParameter(onDraftTapped, "$onDraftTapped");
                Intrinsics.checkNotNullParameter(collage, "$collage");
                Intrinsics.checkNotNullParameter(state, "$state");
                String f39332b = collage.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                onDraftTapped.invoke(f39332b, Integer.valueOf(state.f134389b));
                return;
            case 3:
                Function2 onClick = (Function2) obj4;
                GestaltRadioButton gestaltRadioButton = (GestaltRadioButton) obj3;
                rg0.k item = (rg0.k) obj2;
                int i15 = gg0.e0.E;
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.f(gestaltRadioButton);
                onClick.invoke(gestaltRadioButton, item);
                return;
            case 4:
                rg0.n nVar = (rg0.n) obj4;
                HashMap auxData = (HashMap) obj3;
                rg0.e this$02 = (rg0.e) obj2;
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                nVar.d(auxData);
                this$02.f107988f.l(j1.U("%s_%s_%d_%d", new Object[]{"BRAND_SURVEY", nVar.f108063e, Integer.valueOf(nVar.f108060b), 1}), kotlin.collections.z0.d());
                this$02.f107989g = false;
                return;
            case 5:
                ScreenLocation browserLocation = (ScreenLocation) obj4;
                rg0.p0 view2 = (rg0.p0) obj3;
                rg0.n experienceValue = (rg0.n) obj2;
                rg0.s0 s0Var = rg0.s0.f108088a;
                Intrinsics.checkNotNullParameter(browserLocation, "$browserLocation");
                Intrinsics.checkNotNullParameter(view2, "$view");
                Intrinsics.checkNotNullParameter(experienceValue, "$experienceValue");
                NavigationImpl z03 = Navigation.z0(browserLocation, view2.d());
                Intrinsics.checkNotNullExpressionValue(z03, "create(...)");
                z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
                z03.Y1("com.pinterest.EXTRA_IS_SURVEY", true);
                rg0.s0 s0Var2 = rg0.s0.f108088a;
                xk2.v vVar = rg0.s0.f108091d;
                ((m60.w) ((oa) ((rg0.t0) vVar.getValue())).f113885r0.get()).d(z03);
                s0Var2.c();
                Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
                ((vy.m) ((oa) ((rg0.t0) vVar.getValue())).M1.get()).l(j1.W("%s_%s_%d_%d", "SURVEY", experienceValue.f108063e, Integer.valueOf(experienceValue.f108060b), 0), kotlin.collections.z0.d());
                return;
            case 6:
                f30 pin = (f30) obj3;
                CreateBoardSectionSelectPinsGridCell createBoardSectionSelectPinsGridCell = (CreateBoardSectionSelectPinsGridCell) obj2;
                pn0.b bVar = (pn0.b) ((qn0.f) obj4).f104463a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                LinkedHashSet linkedHashSet = bVar.H;
                if (!linkedHashSet.contains(pin.getF39332b())) {
                    boolean z13 = linkedHashSet.size() < 1000;
                    if (!z13) {
                        bVar.E.i(((yk1.a) bVar.I).f139224a.getString(k70.e.num_pins_to_move_limit));
                    }
                    if (!z13) {
                        return;
                    }
                }
                Intrinsics.checkNotNullParameter(pin, "pin");
                int indexOf = Collections.unmodifiableList(bVar.f109906r).indexOf(pin);
                boolean z14 = !createBoardSectionSelectPinsGridCell.f45365e;
                createBoardSectionSelectPinsGridCell.f45365e = z14;
                nn0.a aVar = createBoardSectionSelectPinsGridCell.f45364d;
                if (aVar != null) {
                    pn0.b bVar2 = (pn0.b) aVar;
                    dl1.s item2 = bVar2.getItem(indexOf);
                    if (item2 instanceof f30) {
                        LinkedHashSet linkedHashSet2 = bVar2.H;
                        if (z14) {
                            String f39332b2 = ((f30) item2).getF39332b();
                            Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                            linkedHashSet2.add(f39332b2);
                        } else {
                            linkedHashSet2.remove(((f30) item2).getF39332b());
                        }
                        bVar2.B.c(new eo0.a((f30) item2, z14));
                        int size = linkedHashSet2.size();
                        nn0.c cVar = (nn0.c) bVar2.getViewIfBound();
                        if (cVar != null) {
                            ((qn0.d) cVar).g9(size);
                        }
                    } else {
                        vb0.j.f125466a.S(bVar2.getItem(indexOf) instanceof f30, "Non-pin model encountered in CreateBoardSectionSelectPinsFragment feed", new Object[0]);
                    }
                }
                createBoardSectionSelectPinsGridCell.b();
                return;
            case 7:
                do0.b this$03 = (do0.b) obj4;
                String sourceSectionId = (String) obj3;
                String destinationSectionId = (String) obj2;
                int i16 = do0.b.I0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(sourceSectionId, "$sourceSectionId");
                Intrinsics.checkNotNullParameter(destinationSectionId, "$destinationSectionId");
                co0.d dVar = this$03.F0;
                if (dVar != null) {
                    dVar.t3(sourceSectionId, destinationSectionId);
                }
                this$03.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                return;
            case 8:
                ConversationDidItemView this$04 = (ConversationDidItemView) obj4;
                String pinId = (String) obj3;
                String userDidItDataId = (String) obj2;
                int i17 = ConversationDidItemView.f45528o;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(pinId, "$pinId");
                Intrinsics.checkNotNullParameter(userDidItDataId, "$userDidItDataId");
                this$04.getClass();
                String a13 = n00.b.a(n00.c.PIN_CLOSEUP);
                j3 j3Var = j3.f60510a;
                k3 k3Var = this$04.f45538m;
                if (k3Var == null) {
                    Intrinsics.r("perfLogger");
                    throw null;
                }
                Map<String, String> map = j3.f(j3Var, k3Var, jy.h.f77707a, pinId, 8).f60495b;
                x10.b bVar3 = this$04.f45537l;
                if (bVar3 != null) {
                    nl.b.t(pk2.f.k(bVar3.m(pinId, a13, map).r(tk2.e.f118017c), "observeOn(...)"), new uq.j(pinId, userDidItDataId, 3), null, 2);
                    return;
                } else {
                    Intrinsics.r("pinApiService");
                    throw null;
                }
            case 9:
                lq0.i this$05 = (lq0.i) obj4;
                String messageId = (String) obj3;
                lq0.b1 b1Var = (lq0.b1) obj2;
                int i18 = lq0.i.f84333d;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(messageId, "$messageId");
                m60.w wVar = this$05.f84336c;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar.d(new dq0.j(messageId, b1Var));
                m60.w wVar2 = this$05.f84336c;
                if (wVar2 != null) {
                    a.c.y(wVar2);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 10:
                wr0.a cellState = (wr0.a) obj4;
                Function2 clickAction = (Function2) obj3;
                Function1 segueAction = (Function1) obj2;
                int i19 = wr0.c.f130876d;
                Intrinsics.checkNotNullParameter(cellState, "$cellState");
                Intrinsics.checkNotNullParameter(clickAction, "$clickAction");
                Intrinsics.checkNotNullParameter(segueAction, "$segueAction");
                if (!cellState.f130856b) {
                    clickAction.invoke(cellState.f130862h, Integer.valueOf(cellState.f130865k));
                }
                segueAction.invoke(cellState);
                return;
            case 11:
                gs0.o this$06 = (gs0.o) obj4;
                View this_apply = (View) obj3;
                String str = (String) obj2;
                int i23 = gs0.o.f66055y;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                cs0.f fVar = this$06.f66072t;
                if (fVar != null) {
                    int i24 = kw0.b.grid_actions_gen_ai_learn_more_url;
                    Object[] objArr = new Object[1];
                    Iterator it = this$06.f66076x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.d((String) next, str)) {
                                obj = next;
                            }
                        }
                    }
                    String str2 = (String) obj;
                    if (str2 == null) {
                        str2 = "en";
                    }
                    objArr[0] = str2;
                    String url = bs1.c.g2(this_apply, i24, objArr);
                    fs0.w wVar3 = (fs0.w) fVar;
                    Intrinsics.checkNotNullParameter(url, "url");
                    wVar3.u3();
                    z70.m.f(wVar3.f62922u, url, null, null, null, true, null, null, false, null, false, true, null, false, null, new fs0.t(wVar3, 1), 15232);
                    return;
                }
                return;
            case 12:
                IdeaPinHandDrawingEditor this$07 = (IdeaPinHandDrawingEditor) obj4;
                go brushType = (go) obj3;
                ImageView this_configureDrawingToolListener = (ImageView) obj2;
                int i25 = IdeaPinHandDrawingEditor.A;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(brushType, "$brushType");
                Intrinsics.checkNotNullParameter(this_configureDrawingToolListener, "$this_configureDrawingToolListener");
                this$07.X(this_configureDrawingToolListener, brushType);
                com.pinterest.feature.ideaPinCreation.closeup.view.a0 a0Var = this$07.f46507y;
                if (a0Var != null) {
                    com.pinterest.feature.ideaPinCreation.closeup.view.a0.a(a0Var, h32.u0.STORY_PIN_DRAWING_BRUSH_SELECTION_BUTTON, d4.STORY_PIN_PAGE_DRAWING_TOOL);
                }
                com.facebook.login.o oVar = this$07.f46506x;
                if (oVar != null) {
                    Intrinsics.checkNotNullParameter(brushType, "brushType");
                    oVar.f30028a.invoke(new s80.r0(brushType));
                    return;
                }
                return;
            case 13:
                IdeaPinCreationEducationOnboardingView educationOnboardingView = (IdeaPinCreationEducationOnboardingView) obj4;
                rg0.n nVar2 = (rg0.n) obj3;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                Intrinsics.checkNotNullParameter(educationOnboardingView, "$educationOnboardingView");
                educationOnboardingView.f46532f.clear();
                educationOnboardingView.removeView(null);
                bs1.c.X0(educationOnboardingView);
                if (nVar2 != null) {
                    nVar2.a(null, null);
                    return;
                }
                return;
            case 14:
                ShoppingBrandCapsule this_run = (ShoppingBrandCapsule) obj4;
                mv0.m this$08 = (mv0.m) obj3;
                mv0.n this$1 = (mv0.n) obj2;
                int i26 = mv0.m.f88380w;
                Intrinsics.checkNotNullParameter(this_run, "$this_run");
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this_run.setSelected(!this_run.isSelected());
                zd1.g gVar = this$08.f88382v;
                if (gVar == null || (function1 = this$1.f88383d) == null) {
                    return;
                }
                function1.invoke(gVar);
                return;
            case 15:
                sw0.j this$09 = (sw0.j) obj4;
                pu mediaItem = (pu) obj3;
                pw0.r listener = (pw0.r) obj2;
                int i27 = sw0.j.f115455o;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(mediaItem, "$mediaItem");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                pw0.r rVar = this$09.f115459d;
                if (rVar != null) {
                    ((qw0.j) rVar).I3(mediaItem);
                    Unit unit = Unit.f80348a;
                }
                this$09.a(listener, mediaItem);
                return;
            case 16:
                sw0.j this$010 = (sw0.j) obj4;
                pu mediaItem2 = (pu) obj3;
                pw0.y listener2 = (pw0.y) obj2;
                int i28 = sw0.j.f115455o;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(mediaItem2, "$mediaItem");
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                pw0.y yVar = this$010.f115458c;
                if (yVar != null) {
                    ((qw0.j) yVar).L3(mediaItem2);
                    Unit unit2 = Unit.f80348a;
                }
                this$010.a(listener2, mediaItem2);
                return;
            case 17:
                b01.o this$011 = (b01.o) obj4;
                zz0.c item3 = (zz0.c) obj3;
                p20 style = (p20) obj2;
                int i29 = b01.o.f20764i;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(item3, "$item");
                Intrinsics.checkNotNullParameter(style, "$style");
                this$011.L(h32.f1.TAP, item3);
                String n13 = style.n();
                if (n13 == null || n13.length() == 0) {
                    return;
                }
                m60.w wVar4 = this$011.f20766e;
                if (wVar4 != null) {
                    ig1.b.R0(wVar4, n13, item3.f143150c);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 18:
                h01.k this$012 = (h01.k) obj4;
                h20 h20Var = (h20) obj3;
                String str3 = (String) obj2;
                int i33 = h01.k.f66439f;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                nx.d0 d0Var = this$012.f66442c;
                h32.f1 f1Var = h32.f1.TAP;
                h32.g0 g0Var = h32.g0.PEAR_INSIGHT_STORY_ENTRY_POINT_CONTAINER;
                h32.u0 u0Var = h32.u0.PEAR_INSIGHT_STORY_ENTRY_POINT;
                String f39332b3 = h20Var.getF39332b();
                HashMap hashMap = new HashMap();
                hashMap.put("referrer", str3 == null ? "" : str3);
                d0Var.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : f39332b3, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                NavigationImpl w14 = Navigation.w1((ScreenLocation) v2.f51464c.getValue());
                w14.m0("com.pinterest.EXTRA_INSIGHT_ID", h20Var.getF39332b());
                w14.m0("com.pinterest.EXTRA_REFERRER", str3);
                m60.w wVar5 = this$012.f66443d;
                if (wVar5 != null) {
                    wVar5.d(w14);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 19:
                i01.z0 filterUIParams = (i01.z0) obj4;
                i01.b1 loggingSpec = (i01.b1) obj3;
                i01.y0 itemClickListener = (i01.y0) obj2;
                int i34 = RelatedPinsFilterRepView.f46953g;
                Intrinsics.checkNotNullParameter(filterUIParams, "$filterUIParams");
                Intrinsics.checkNotNullParameter(loggingSpec, "$loggingSpec");
                Intrinsics.checkNotNullParameter(itemClickListener, "$itemClickListener");
                if (!filterUIParams.f70709d) {
                    itemClickListener.x0(loggingSpec.f70647a);
                    return;
                }
                String str4 = loggingSpec.f70648b;
                if (str4 != null) {
                    itemClickListener.R0(str4);
                    return;
                }
                return;
            case 20:
                yb0.n this_apply2 = (yb0.n) obj4;
                u11.c this$013 = (u11.c) obj3;
                q11.e confirmEvent = (q11.e) obj2;
                int i35 = u11.c.D0;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(confirmEvent, "$confirmEvent");
                this_apply2.h().a(u11.b.f119995l);
                q11.c cVar2 = this$013.f120001y0;
                if (cVar2 != null) {
                    ((t11.f) cVar2).B3(confirmEvent);
                    return;
                }
                return;
            case 21:
                j21.f this$014 = (j21.f) obj4;
                RelativeLayout this_apply3 = (RelativeLayout) obj3;
                String uri = (String) obj2;
                int i36 = j21.f.f74498q;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(this_apply3, "$this_apply");
                Intrinsics.checkNotNullParameter(uri, "$uri");
                i21.b bVar4 = this$014.f74507j;
                if (bVar4 != null && (vhVar = bVar4.f71439l) != null) {
                    bVar4.getPinalytics().Z(h32.u0.SEE_MORE_BUTTON, kh2.d.E(vhVar));
                }
                ku1.l lVar = this$014.f74505h;
                if (lVar == null) {
                    Intrinsics.r("uriNavigator");
                    throw null;
                }
                Context context = this_apply3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ku1.l.b(lVar, context, uri, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                return;
            case 22:
                g71.f this$015 = (g71.f) obj4;
                g71.b this_apply4 = (g71.b) obj3;
                d71.a skinToneFilterViewModel = (d71.a) obj2;
                int i37 = g71.f.f63895l;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(this_apply4, "$this_apply");
                Intrinsics.checkNotNullParameter(skinToneFilterViewModel, "$skinToneFilterViewModel");
                String str5 = skinToneFilterViewModel.f53902h;
                Integer num = this$015.f63905j;
                this$015.e(this_apply4, true, str5, skinToneFilterViewModel.f53903i);
                return;
            case 23:
                yf1.d this$016 = (yf1.d) obj4;
                a42.r rating = (a42.r) obj3;
                IdeaPinFeedbackSatisfactionView this_apply5 = (IdeaPinFeedbackSatisfactionView) obj2;
                int i38 = yf1.d.f138967c;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(rating, "$rating");
                Intrinsics.checkNotNullParameter(this_apply5, "$this_apply");
                for (IdeaPinFeedbackSatisfactionView ideaPinFeedbackSatisfactionView : this$016.f138969b) {
                    ideaPinFeedbackSatisfactionView.setClickable(false);
                }
                this$016.T(rating);
                this_apply5.postDelayed(new a11.p(16, this$016, rating), 500L);
                return;
            case 24:
                String username = (String) obj4;
                rh1.k0 this$017 = (rh1.k0) obj3;
                wy0 validUser = (wy0) obj2;
                int i39 = rh1.k0.f108203k0;
                Intrinsics.checkNotNullParameter(username, "$username");
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(validUser, "$validUser");
                if (username.length() > 0) {
                    Function1 function12 = this$017.f108218i;
                    String f39332b4 = validUser.getF39332b();
                    Intrinsics.checkNotNullExpressionValue(f39332b4, "getUid(...)");
                    function12.invoke(f39332b4);
                    return;
                }
                return;
            case 25:
                di1.g this$018 = (di1.g) obj4;
                PinterestVideoView this_with = (PinterestVideoView) obj3;
                String pinUid = (String) obj2;
                int i43 = di1.g.f55060u0;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                Intrinsics.checkNotNullParameter(pinUid, "$pinId");
                ai1.a aVar2 = this$018.f55061j0;
                if (aVar2 != null) {
                    aVar2.p3();
                }
                m60.w o03 = this_with.o0();
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                o03.d(new jc0.v(new zt1.d(pinUid, null), false, 0L, 30));
                return;
            case 26:
                Function2 onMetricsClick = (Function2) obj4;
                List metrics = (List) obj3;
                ProductTagCard this$019 = (ProductTagCard) obj2;
                int i44 = ProductTagCard.f50084v;
                Intrinsics.checkNotNullParameter(onMetricsClick, "$onMetricsClick");
                Intrinsics.checkNotNullParameter(metrics, "$metrics");
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                onMetricsClick.invoke(metrics, this$019.f50103s);
                return;
            case 27:
                ProductTagCard this$020 = (ProductTagCard) obj4;
                Function1 infoModalClick = (Function1) obj3;
                List metrics2 = (List) obj2;
                int i45 = ProductTagCard.f50084v;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(infoModalClick, "$infoModalClick");
                Intrinsics.checkNotNullParameter(metrics2, "$metrics");
                nx.d0 d0Var2 = this$020.f50085a;
                if (d0Var2 != null) {
                    d0Var2.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.CLICK, (r18 & 2) != 0 ? null : h32.u0.PIN_STATS_TAGGED_PRODUCTS_INFO_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_STATS_TAGGED_PRODUCTS_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                infoModalClick.invoke(metrics2);
                return;
            case 28:
                com.pinterest.schoolTeenPrompt.g this$021 = (com.pinterest.schoolTeenPrompt.g) obj4;
                rg0.j0 j0Var = (rg0.j0) obj3;
                rg0.n nVar3 = (rg0.n) obj2;
                int i46 = com.pinterest.schoolTeenPrompt.g.f50465k0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.D5();
                nu1.a aVar3 = this$021.f50466g0;
                if (aVar3 == null) {
                    Intrinsics.r("inAppNavigator");
                    throw null;
                }
                nu1.a.c(aVar3, j0Var.f108038c.f58914b, null, null, false, 30);
                nVar3.b(kotlin.collections.y0.b(new Pair("complete_trigger", "complete_button")));
                return;
            default:
                Function1 onFollowButtonTapped = (Function1) obj4;
                zs interest = (zs) obj3;
                ImageInterestFollowButton this$022 = (ImageInterestFollowButton) obj2;
                int i47 = ImageInterestFollowButton.f52383h;
                Intrinsics.checkNotNullParameter(onFollowButtonTapped, "$onFollowButtonTapped");
                Intrinsics.checkNotNullParameter(interest, "$interest");
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                onFollowButtonTapped.invoke(Boolean.valueOf(c0.d.d2(interest)));
                nk1.f fVar2 = this$022.f52387g;
                if (fVar2 != null) {
                    fVar2.f();
                    return;
                }
                return;
        }
    }
}
