package co;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.linecorp.linesdk.widget.LoginButton;
import com.pinterest.activity.conversation.view.ContactListInboxContainer;
import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i10;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.f3;
import com.pinterest.screens.t;
import d70.g;
import dr.k;
import h32.f1;
import h32.g0;
import h32.u0;
import h80.l;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jc0.v;
import k1.j1;
import kh2.m2;
import kk2.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lp.d;
import m60.u;
import m60.w;
import mp.f;
import mp.h;
import nt.a0;
import nx.f0;
import oo1.j;
import oq.p0;
import oq.q0;
import ps.s;
import rq.d2;
import rq.j4;
import tk2.e;
import tq.c0;
import u50.r;
import xo.d0;
import xo.i;
import xo.q;
import xo.x;
import y32.c;
import y90.h1;
import y90.i1;
import y90.k1;
import y90.n1;
import y90.o1;
import y90.p1;
import y90.s1;
import y90.t1;
import y90.u1;
import zp.d1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28269c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f28267a = i13;
        this.f28268b = obj;
        this.f28269c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Context context2;
        int i13 = this.f28267a;
        Object obj = this.f28269c;
        Object obj2 = this.f28268b;
        switch (i13) {
            case 0:
                ((LoginButton) obj2).lambda$setOnClickListener$1((View.OnClickListener) obj, view);
                return;
            case 1:
                i this$0 = (i) obj2;
                wy0 invitedUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(invitedUser, "$invitedUser");
                this$0.f135519i.F(g0.MODAL_DIALOG, u0.REMOVE_BUTTON);
                this$0.f135519i.a(f1.BOARD_REMOVE_COLLABORATOR, invitedUser.getUid(), false, true);
                q qVar = (q) this$0.f135522l;
                String string = (qVar == null || (context = qVar.getContext()) == null) ? null : context.getString(g.owner_approve_collaborator_request_error_message);
                if (string == null) {
                    string = "";
                }
                String uid = invitedUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                this$0.f135520j.a(this$0.f135517g.P(uid, this$0.f135512b).l(e.f118017c).i(new xo.b(0), new vo.a(3, new j1(string, 6))));
                return;
            case 2:
                q qVar2 = (q) obj2;
                int i14 = q.f135531w;
                qVar2.getClass();
                qVar2.f135543l.d(Navigation.z0((ScreenLocation) t.f51363d.getValue(), ((v7) obj).getUid()));
                return;
            case 3:
                i this$02 = (i) obj2;
                wy0 invitedUser2 = (wy0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(invitedUser2, "$invitedUser");
                this$02.f135519i.F(g0.MODAL_DIALOG, u0.REMOVE_BUTTON);
                this$02.f135519i.a(f1.BOARD_REMOVE_COLLABORATOR, invitedUser2.getUid(), false, true);
                d0 d0Var = (d0) this$02.f135522l;
                String string2 = (d0Var == null || (context2 = d0Var.getContext()) == null) ? null : context2.getString(g.owner_approve_collaborator_request_error_message);
                if (string2 == null) {
                    string2 = "";
                }
                String uid2 = invitedUser2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                this$02.f135520j.a(this$02.f135517g.P(uid2, this$02.f135512b).l(e.f118017c).i(new x(this$02, 0), new vo.a(9, new j1(string2, 7))));
                return;
            case 4:
                d0 this$03 = (d0) obj2;
                v7 board = (v7) obj;
                int i15 = d0.f135473x;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(board, "$board");
                ScreenLocation screenLocation = (ScreenLocation) t.f51363d.getValue();
                w wVar = this$03.f135482l;
                if (wVar != null) {
                    wVar.d(Navigation.z0(screenLocation, board.getUid()));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 5:
                z40.d0 d0Var2 = (z40.d0) obj;
                List list = (List) ((lp.a) obj2).f84205f;
                if (list.contains(d0Var2)) {
                    list.remove(d0Var2);
                    return;
                } else {
                    list.add(d0Var2);
                    return;
                }
            case 6:
                ContactListInboxContainer this$04 = (ContactListInboxContainer) obj2;
                Set contactSet = (Set) obj;
                int i16 = ContactListInboxContainer.f34862h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(contactSet, "$contactSet");
                this$04.getClass();
                e0.t.f56747e = c.EMPTY_INBOX_SUGGESTION.getValue();
                int i17 = 3;
                this$04.f34865c.a(new m(j.j(contactSet), new ep.a(i17, new d(this$04, 2)), 0).o(new jp.d(10, new d(this$04, i17)), new jp.d(11, new d(this$04, 4))));
                return;
            case 7:
                f this$05 = (f) obj2;
                Set contactSet2 = (Set) obj;
                int i18 = f.f87845k;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(contactSet2, "$contactSet");
                f0 f0Var = this$05.f87854i;
                if (f0Var == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                ((nx.m) f0Var).a(this$05).h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CONVERSATION_INBOX_MESSAGE_CONTACT_BUTTON, (r18 & 4) != 0 ? null : g0.CONVERSATION_MESSAGES, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                e0.t.f56747e = c.EMPTY_INBOX_SUGGESTION.getValue();
                this$05.f87852g.a(new m(j.j(contactSet2), new ep.a(4, new mp.e(this$05, 0)), 0).l(wj2.c.a()).o(new jp.d(12, new mp.e(this$05, 1)), new jp.d(13, new mp.e(this$05, 2))));
                return;
            case 8:
                mp.i this$06 = (mp.i) obj2;
                Set contactSet3 = (Set) obj;
                int i19 = mp.i.f87858h;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(contactSet3, "$contactSet");
                f0 f0Var2 = this$06.f87864f;
                if (f0Var2 == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                ((nx.m) f0Var2).a(this$06).h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CONVERSATION_INBOX_MESSAGE_CONTACT_BUTTON, (r18 & 4) != 0 ? null : g0.CONVERSATION_MESSAGES, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                e0.t.f56747e = c.EMPTY_INBOX_SUGGESTION.getValue();
                this$06.f87862d.a(new m(j.j(contactSet3), new ep.a(5, new h(this$06, 0)), 0).l(wj2.c.a()).o(new jp.d(14, new h(this$06, 1)), new jp.d(15, new h(this$06, 2))));
                return;
            case 9:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                sp.g this$07 = (sp.g) obj2;
                int i23 = sp.g.f114857p;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                if (onClickListener != null) {
                    onClickListener.onClick(this$07);
                    return;
                }
                return;
            case 10:
                View.OnClickListener onClickListener2 = (View.OnClickListener) obj;
                sp.i this$08 = (sp.i) obj2;
                int i24 = sp.i.f114873b;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (onClickListener2 != null) {
                    onClickListener2.onClick(this$08);
                    return;
                }
                return;
            case 11:
                aq.j editablePinWrapper = (aq.j) obj2;
                d1 this$09 = (d1) obj;
                int i25 = d1.f142360e0;
                Intrinsics.checkNotNullParameter(editablePinWrapper, "$editablePinWrapper");
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                NavigationImpl w13 = Navigation.w1((ScreenLocation) f3.f50791h.getValue());
                w13.m0("com.pinterest.EXTRA_SCHEDULED_PIN_ID", editablePinWrapper.B());
                this$09.getEventManager().d(w13);
                return;
            case 12:
                q0 this$010 = (q0) obj2;
                Function0 action = (Function0) obj;
                int i26 = q0.f97130c;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(action, "$action");
                if (((p0) this$010.f97132b) != p0.LOADING) {
                    action.invoke();
                    return;
                }
                return;
            case 13:
                rq.j1 this$011 = (rq.j1) obj2;
                RelativeLayout this_apply = (RelativeLayout) obj;
                int i27 = rq.j1.f109279h;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                nx.d0 viewPinalytics = this$011.getViewPinalytics();
                if (viewPinalytics != null) {
                    nx.d0.B(viewPinalytics, null, g0.PIN_CLOSEUP_PRODUCT_DETAILS, null, null, 29);
                }
                w wVar2 = u.f85943a;
                Context context3 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                wVar2.d(new v(new d2(context3, this$011.f109283d, this$011.f109282c), false, 0L, 30));
                return;
            case 14:
                j4 this$012 = (j4) obj2;
                f30 pin = (f30) obj;
                int i28 = j4.f109300w;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                this$012.l(pin);
                return;
            case 15:
                PinCloseupVideoModule.setupMusicAttributionView$lambda$25((PinCloseupVideoModule) obj2, (f30) obj, view);
                return;
            case 16:
                c0 this$013 = (c0) obj2;
                int i29 = c0.f118812l;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                NavigationImpl x13 = pe.i.x1(this$013.getPin(), (wy0) obj, r41.b.PdpMerchantBrandLabelModule);
                if (x13 != null) {
                    w wVar3 = this$013.f118815c;
                    if (wVar3 == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    wVar3.d(x13);
                }
                f30 pin2 = this$013.getPin();
                nx.d0 viewPinalytics2 = this$013.getViewPinalytics();
                if (pin2 == null || viewPinalytics2 == null) {
                    return;
                }
                u0 u0Var = u0.PIN_CLOSEUP_PRODUCT_BRAND_MERCHANT_LOCKUP;
                HashMap hashMap = new HashMap();
                this$013.getPinAuxHelper().c(pin2, hashMap);
                Unit unit = Unit.f80348a;
                viewPinalytics2.h(null, u0Var, hashMap);
                return;
            case 17:
                int i33 = k.H;
                ((k) obj2).f((String) obj);
                return;
            case 18:
                MainActivity this$014 = (MainActivity) obj2;
                xf1.a this_apply2 = (xf1.a) obj;
                bk.f fVar = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                nx.d0 pinalytics = this$014.getPinalytics();
                Context context4 = this_apply2.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                kg.t.M0(pinalytics, context4, ou1.e.UPLOAD_ERROR_DIALOG, null, null, 0, 56);
                return;
            case 19:
                MainActivity this$015 = (MainActivity) obj2;
                Function0 action2 = (Function0) obj;
                bk.f fVar2 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(action2, "$action");
                this$015.getEventManager().f(new com.pinterest.feature.video.model.a());
                action2.invoke();
                return;
            case 20:
                MainActivity this$016 = (MainActivity) obj2;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                this$016.getEventManager().d(Navigation.r0(com.pinterest.screens.b.c(), (f30) obj));
                return;
            case 21:
                SbaAdsLeadGenExpandView this$017 = (SbaAdsLeadGenExpandView) obj;
                int i34 = SbaAdsLeadGenExpandView.f35271w;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Context context5 = ((GestaltCheckBox) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                String obj3 = m2.C0(context5, s.url_private_policy, Locale.getDefault().getLanguage()).toString();
                r rVar = this$017.f35285n;
                if (rVar != null) {
                    rVar.a(new a0(obj3));
                    return;
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            case 22:
                SbaAdsLeadGenExpandView this$018 = (SbaAdsLeadGenExpandView) obj2;
                String linkNotNull = (String) obj;
                int i35 = SbaAdsLeadGenExpandView.f35271w;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(linkNotNull, "$linkNotNull");
                r rVar2 = this$018.f35285n;
                if (rVar2 != null) {
                    rVar2.a(new a0(linkNotNull));
                    return;
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            case 23:
                hu.d this$019 = (hu.d) obj2;
                m91.b item = (m91.b) obj;
                int i36 = hu.d.f70384d;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                this$019.f70385a.invoke(item);
                return;
            case 24:
                hu.d this$020 = (hu.d) obj2;
                ju.i item2 = (ju.i) obj;
                int i37 = hu.d.f70384d;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(item2, "$item");
                this$020.f70385a.invoke(item2);
                return;
            case 25:
                l this$021 = (l) obj2;
                i10 style = (i10) obj;
                int i38 = l.f68097m0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(style, "$style");
                l82.c e13 = ((h80.s) this$021.f68099d0.getValue()).f68122f.e();
                String f13 = style.f();
                if (f13 == null) {
                    f13 = "";
                }
                e13.a(new h80.e(f13));
                HashMap hashMap2 = this$021.f68106k0;
                String f14 = style.f();
                if (f14 == null) {
                    f14 = "";
                }
                hashMap2.put("style_name", f14);
                nx.d0.B(this$021.s7(), null, g0.IMAGE_GENERATION_STYLE_PICKER, null, hashMap2, 21);
                return;
            case 26:
                k90.k this$022 = (k90.k) obj2;
                f30 pin3 = (f30) obj;
                int i39 = k90.k.f78766y;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(pin3, "$pin");
                this$022.d0(pin3);
                return;
            case 27:
                k1 this$023 = (k1) obj2;
                h1 this$1 = (h1) obj;
                int i43 = h1.f138184y;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                i1 i1Var = this$023.f138199e;
                m62.k kVar = this$1.f138188x;
                if (kVar != null) {
                    i1Var.k(kVar);
                    return;
                } else {
                    Intrinsics.r("item");
                    throw null;
                }
            case 28:
                p1 this$024 = (p1) obj2;
                n1 this$12 = (n1) obj;
                int i44 = n1.D;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(this$12, "this$1");
                o1 o1Var = this$024.f138218g;
                m62.i iVar = this$12.B;
                if (iVar != null) {
                    o1Var.g(iVar);
                    return;
                } else {
                    Intrinsics.r("item");
                    throw null;
                }
            default:
                u1 this$025 = (u1) obj2;
                s1 this$13 = (s1) obj;
                int i45 = s1.f138239y;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(this$13, "this$1");
                t1 t1Var = this$025.f138255f;
                m62.h1 h1Var = this$13.f138242w;
                if (h1Var != null) {
                    t1Var.f(h1Var);
                    return;
                } else {
                    Intrinsics.r("item");
                    throw null;
                }
        }
    }

    public /* synthetic */ a(View.OnClickListener onClickListener, FrameLayout frameLayout, int i13) {
        this.f28267a = i13;
        this.f28269c = onClickListener;
        this.f28268b = frameLayout;
    }
}
