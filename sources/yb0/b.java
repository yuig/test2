package yb0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.fb;
import com.pinterest.api.model.v7;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinEmptyStateView;
import com.pinterest.education.view.CommentNudgeActionPromptView;
import com.pinterest.education.view.CommentPushNotificationNudgeActionPromptView;
import com.pinterest.feature.board.common.newideas.upsell.homefeedupsell.view.BaseUpsellSingleItemView;
import com.pinterest.feature.board.detail.collaboratorview.view.BoardCollaboratorView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l1;
import com.pinterest.screens.z3;
import dl1.s;
import h32.f1;
import h32.u0;
import hp0.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kh2.r;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lm0.v;
import m60.u;
import m60.w;
import nx.d0;
import rl1.t;
import uc0.m0;
import uc0.p0;
import uj2.b0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138474b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f138473a = i13;
        this.f138474b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        h hVar;
        h hVar2;
        h hVar3;
        kk0.a aVar;
        mk0.e eVar;
        v7 v7Var;
        wo0.g gVar;
        String str;
        int i13 = this.f138473a;
        Unit unit = null;
        Object obj = this.f138474b;
        switch (i13) {
            case 0:
                g e13 = (g) obj;
                int i14 = AlertContainer.f44684d;
                Intrinsics.checkNotNullParameter(e13, "$e");
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event instanceof xm1.l) && (hVar3 = e13.f138486d) != null) {
                    hVar3.t2();
                }
                if ((event instanceof xm1.m) && (hVar2 = e13.f138486d) != null) {
                    hVar2.G6();
                }
                if (!(event instanceof xm1.n) || (hVar = e13.f138486d) == null) {
                    return;
                }
                hVar.H0(((xm1.n) event).f135391c);
                return;
            case 1:
                n this$0 = (n) obj;
                int i15 = n.f138503p;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (r.Z0(event, this$0.h())) {
                    View.OnClickListener onClickListener = this$0.f138513j;
                    if (onClickListener != null) {
                        onClickListener.onClick(this$0.h());
                    }
                    this$0.g(d.CONFIRM_BUTTON_CLICK);
                    return;
                }
                if (r.a1(event, this$0.h())) {
                    View.OnClickListener onClickListener2 = this$0.f138514k;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this$0.h());
                    }
                    this$0.g(d.CANCEL_BUTTON_CLICK);
                    return;
                }
                return;
            case 2:
                p0 p0Var = (p0) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.b) {
                    p0Var.i(m0.f121827a);
                    return;
                }
                return;
            case 3:
                jr0.b state = (jr0.b) obj;
                int i16 = com.pinterest.creatorHub.feature.creatorpathways.f.f44784q0;
                Intrinsics.checkNotNullParameter(state, "$state");
                Intrinsics.checkNotNullParameter(event, "it");
                state.f77543e.f77538b.invoke();
                return;
            case 4:
                jr0.a buttonState = (jr0.a) obj;
                int i17 = com.pinterest.creatorHub.feature.creatorpathways.f.f44784q0;
                Intrinsics.checkNotNullParameter(buttonState, "$buttonState");
                Intrinsics.checkNotNullParameter(event, "it");
                buttonState.f77538b.invoke();
                return;
            case 5:
                com.pinterest.creatorHub.feature.creatorpathways.f this$02 = (com.pinterest.creatorHub.feature.creatorpathways.f) obj;
                int i18 = com.pinterest.creatorHub.feature.creatorpathways.f.f44784q0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    com.pinterest.creatorHub.feature.creatorpathways.j jVar = this$02.f44787l0;
                    if (jVar != null) {
                        jVar.p3(com.pinterest.creatorHub.feature.creatorpathways.a.Dismiss);
                        return;
                    } else {
                        Intrinsics.r("creatorPathwaysModalViewListener");
                        throw null;
                    }
                }
                return;
            case 6:
                fd0.f state2 = (fd0.f) obj;
                int i19 = CreatorHubRecentPinEmptyStateView.f44801c;
                Intrinsics.checkNotNullParameter(state2, "$state");
                Intrinsics.checkNotNullParameter(event, "it");
                state2.f61846a.invoke();
                return;
            case 7:
                fd0.c state3 = (fd0.c) obj;
                int i23 = ld0.d.f82955g;
                Intrinsics.checkNotNullParameter(state3, "$state");
                Intrinsics.checkNotNullParameter(event, "it");
                state3.f61842d.invoke();
                return;
            case 8:
                od0.b this$03 = (od0.b) obj;
                int i24 = od0.b.f94098t0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$03.P7();
                    return;
                }
                return;
            case 9:
                cg0.b this$04 = (cg0.b) obj;
                int i25 = cg0.b.f27691s;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                bg0.a aVar2 = this$04.f27701q;
                if (aVar2 != null) {
                    aVar2.q3();
                    return;
                }
                return;
            case 10:
                CommentNudgeActionPromptView this$05 = (CommentNudgeActionPromptView) obj;
                int i26 = CommentNudgeActionPromptView.f44968s;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!r.Z0(event, this$05.f44970o)) {
                    if (r.a1(event, this$05.f44970o)) {
                        this$05.j();
                        return;
                    }
                    return;
                }
                w s13 = this$05.s();
                ScreenLocation screenLocation = (ScreenLocation) l1.f51056b.getValue();
                String str2 = this$05.f44973r;
                NavigationImpl L = Navigation.L(screenLocation, str2 != null ? str2 : "", ml1.b.NO_TRANSITION.getValue());
                String str3 = this$05.f44972q;
                if (str3 != null) {
                    L.m0("com.pinterest.EXTRA_PIN_ID", str3);
                }
                L.Y1("com.pinterest.EXTRA_SHOW_KEYBOARD", true);
                s13.d(L);
                this$05.i();
                return;
            case 11:
                CommentPushNotificationNudgeActionPromptView this$06 = (CommentPushNotificationNudgeActionPromptView) obj;
                int i27 = CommentPushNotificationNudgeActionPromptView.f44974p;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!r.Z0(event, this$06.f44976o)) {
                    if (r.a1(event, this$06.f44976o)) {
                        this$06.j();
                        return;
                    }
                    return;
                }
                Context context = this$06.getContext();
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                Context context2 = this$06.getContext();
                if (context2 != null) {
                    intent.putExtra("android.provider.extra.APP_PACKAGE", context2.getPackageName());
                }
                Object obj2 = d5.a.f53679a;
                context.startActivity(intent, null);
                this$06.i();
                return;
            case 12:
                eh0.i this$07 = (eh0.i) obj;
                int i28 = eh0.i.f58930h0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    eh0.h onDismissListener = this$07.f58932g0;
                    Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
                    HashSet hashSet = this$07.f87106y;
                    if (hashSet != null) {
                        hashSet.remove(onDismissListener);
                    }
                    this$07.M6();
                    jf2.c cVar = this$07.f58931f0;
                    if (cVar != null) {
                        ((Function0) cVar.f75875d).invoke();
                        return;
                    } else {
                        Intrinsics.r("rendering");
                        throw null;
                    }
                }
                return;
            case 13:
                th0.d this$08 = (th0.d) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof rn1.g) {
                    this$08.getPinalytics().X(u0.HELP_CENTER_LINK);
                    return;
                }
                return;
            case 14:
                ji0.j this$09 = (ji0.j) obj;
                int i29 = ji0.j.f76268b;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$09.getClass();
                a.c.y(u.f85943a);
                return;
            case 15:
                ki0.c this$010 = (ki0.c) obj;
                int i33 = ki0.c.f79783s0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$010.f7().d(Navigation.L(z3.d(), "", ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue()));
                return;
            case 16:
                ui0.e this$011 = (ui0.e) obj;
                int i34 = ui0.e.O0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$011.P7();
                    rg0.n nVar = this$011.J0;
                    if (nVar != null && nVar.f108060b == i32.l.ANDROID_EASY_GIFT_GUIDE_SAVING_UPSELL.value()) {
                        this$011.f7().d(h11.b.f66452a);
                    }
                    rg0.n nVar2 = this$011.J0;
                    if (nVar2 != null) {
                        nVar2.c(null, null);
                    }
                    this$011.J0 = null;
                    return;
                }
                return;
            case 17:
                BaseUpsellSingleItemView this$012 = (BaseUpsellSingleItemView) obj;
                int i35 = BaseUpsellSingleItemView.f45119f;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$012.callOnClick();
                return;
            case 18:
                fk0.q this$013 = (fk0.q) obj;
                int i36 = fk0.q.f62319j0;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    kh2.j.x2(this$013.d8(), fk0.d.f62277a);
                    return;
                }
                return;
            case 19:
                BoardCollaboratorView this$014 = (BoardCollaboratorView) obj;
                int i37 = BoardCollaboratorView.f45186c;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof sl1.n) {
                    kk0.a aVar3 = this$014.f45188b;
                    if (aVar3 == null || (v7Var = (eVar = (mk0.e) aVar3).f87343q) == null) {
                        return;
                    }
                    eVar.f87342p.n(v7Var, 5, eVar.f87333g, true, 8);
                    return;
                }
                if (event instanceof sl1.o) {
                    kk0.a aVar4 = this$014.f45188b;
                    if (aVar4 != null) {
                        ((mk0.e) aVar4).r3();
                        return;
                    }
                    return;
                }
                if (!(event instanceof sl1.m) || (aVar = this$014.f45188b) == null) {
                    return;
                }
                ((mk0.e) aVar).r3();
                return;
            case 20:
                rl0.c this$015 = (rl0.c) obj;
                int i38 = rl0.c.I0;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$015.P7();
                    return;
                }
                return;
            case 21:
                am0.b this$016 = (am0.b) obj;
                int i39 = am0.b.f15516e1;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$016.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("com.pinterest.EXTRA_NEWLY_CREATED_BOARD_ID", this$016.l9());
                this$016.P6("com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE_FROM_JUMPSTART", bundle);
                this$016.s7().X(u0.DONE_BUTTON);
                this$016.D5();
                return;
            case 22:
                em0.d this$017 = (em0.d) obj;
                int i43 = em0.d.K0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$017.s7().N(f1.TAP, u0.DONE_BUTTON, null, null, false);
                com.pinterest.feature.board.organize.b bVar = this$017.E0;
                if (bVar != null) {
                    dm0.d dVar = (dm0.d) bVar;
                    List<s> d2 = dVar.f55349l.d();
                    ArrayList arrayList = new ArrayList(g0.q(d2, 10));
                    for (s sVar : d2) {
                        Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Board");
                        arrayList.add((v7) sVar);
                    }
                    int i44 = dVar.f55346i;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i45 = 0; i45 <= i44 && i45 < size; i45++) {
                        arrayList2.add(((v7) arrayList.get(i45)).getUid());
                    }
                    bq.b bVar2 = bq.b.CUSTOM;
                    String apiKey = bVar2.getApiKey();
                    Intrinsics.checkNotNullExpressionValue(apiKey, "getApiKey(...)");
                    fk2.r rVar = new fk2.r(new uj2.f[]{dVar.f55343f.d(bVar2), dVar.f55344g.a(new cm0.a(arrayList2, apiKey))}, 0);
                    Intrinsics.checkNotNullExpressionValue(rVar, "mergeArray(...)");
                    d0.v(dVar.getPinalytics(), f1.USER_REORDER_BOARDS, null, false, 12);
                    dVar.addDisposable(nl.b.k(rVar, "BoardOrganizePresenter:reorderBoards", new jh0.d(dVar, 16)));
                    return;
                }
                return;
            case 23:
                im0.d this$018 = (im0.d) obj;
                int i46 = im0.d.f72605u0;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                hm0.c cVar2 = this$018.f72614r0;
                if (cVar2 != null) {
                    cVar2.r3();
                    return;
                } else {
                    Intrinsics.r("permissionsSettingListener");
                    throw null;
                }
            case 24:
                jm0.j this$019 = (jm0.j) obj;
                int i47 = jm0.j.f76978k1;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$019.n9(v.f83903a);
                    return;
                }
                return;
            case 25:
                om0.k kVar = (om0.k) obj;
                om0.g gVar2 = om0.q.f96566a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof sl1.m) {
                    Function1 function1 = kVar.f96528a;
                    sl1.m mVar = (sl1.m) event;
                    String str4 = mVar.f113203c;
                    String str5 = mVar.f113204d;
                    function1.invoke(new sl1.e(str4, str5 != null ? str5 : "", (Integer) null, 12));
                    return;
                }
                if (event instanceof sl1.o) {
                    kVar.f96529b.invoke(((sl1.o) event).f113209c);
                    return;
                } else {
                    if (event instanceof sl1.n) {
                        kVar.f96530c.invoke(((sl1.n) event).f113207c);
                        return;
                    }
                    return;
                }
            case 26:
                int i48 = oo0.c.f96805j;
                mo0.a aVar5 = (mo0.a) ((lo0.c) obj);
                aVar5.u3();
                fb fbVar = aVar5.f87800c;
                if (fbVar.c()) {
                    aVar5.t3();
                    return;
                }
                fbVar.f37649i = true;
                int i49 = 19;
                kk2.h hVar4 = new kk2.h(((b0) aVar5.f87799b.b(aVar5.q3()).buildRequest()).r(tk2.e.f118017c).l(wj2.c.a()), new xo.b(i49), 1);
                w wVar = u.f85943a;
                Objects.requireNonNull(wVar);
                aVar5.addDisposable(hVar4.o(new xo.a(wVar, 11), new xo.l(i49)));
                return;
            case 27:
                int i53 = to0.g.G0;
                ((ro0.e) ((po0.b) obj)).B3();
                return;
            case 28:
                xo0.n this$020 = (xo0.n) obj;
                int i54 = xo0.n.f135604g;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof t) || (gVar = this$020.f135610f) == null || (str = gVar.f130651d) == null) {
                    return;
                }
                gVar.getPresenterPinalytics().f122379a.X(u0.ARTICLE_CURATOR);
                gVar.f130649b.d(str, r41.b.BubbleHeader);
                return;
            default:
                hp0.t this$021 = (hp0.t) obj;
                int i55 = hp0.t.A0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof om1.l) {
                    ScreenLocation screenLocation2 = (ScreenLocation) this$021.f69878t0.getValue();
                    if (screenLocation2 != null) {
                        kh2.j.x2((f0) this$021.f69870l0.getValue(), new hp0.g(screenLocation2));
                        unit = Unit.f80348a;
                    }
                    if (unit == null) {
                        this$021.D5();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
