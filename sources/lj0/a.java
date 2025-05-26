package lj0;

import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import ap0.i;
import com.bumptech.glide.d;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilter;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilterToolbar;
import com.pinterest.feature.board.common.newideas.upsell.homefeedupsell.view.BaseUpsellSingleItemView;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateAddCollaboratorsView;
import com.pinterest.feature.board.detail.collaboratorview.view.BoardCollaboratorView;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import com.pinterest.feature.conversation.view.ConversationMessageThreadAnchorHeroView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.creator.analytics.view.CreatorPinalyticsItemMediumView;
import com.pinterest.feature.engagementtab.EngagementDetailsHeaderView;
import com.pinterest.feature.gridactions.modal.view.OverflowMenu;
import com.pinterest.feature.gridactions.modal.view.PinFeedbackModalContentView;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a1;
import com.pinterest.screens.o;
import cp.b0;
import dt0.n;
import ek0.h;
import fk0.k;
import go0.s;
import h32.f1;
import h32.g0;
import h32.u0;
import ho0.m;
import java.util.ArrayList;
import java.util.HashMap;
import kk2.l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq0.g1;
import lq0.r1;
import lq0.y0;
import m60.u;
import m60.w;
import np0.g;
import nx.d0;
import rj0.b;
import s7.z;
import sh.f;
import u50.k0;
import u50.r;
import vb0.j;
import x60.e;
import xo0.v;
import xo0.x;
import z42.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83612b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f83611a = i13;
        this.f83612b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kj0.a aVar;
        kk0.a aVar2;
        int i13 = this.f83611a;
        int i14 = 20;
        boolean z13 = false;
        byte b13 = 0;
        Integer num = null;
        Object obj = this.f83612b;
        switch (i13) {
            case 0:
                BoardPinsFilter this$0 = (BoardPinsFilter) obj;
                int i15 = BoardPinsFilter.f45116b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.isEnabled() || (aVar = this$0.f45117a) == null) {
                    return;
                }
                aVar.g0();
                return;
            case 1:
                BoardPinsFilterToolbar this$02 = (BoardPinsFilterToolbar) obj;
                int i16 = BoardPinsFilterToolbar.f45118a;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.getClass();
                return;
            case 2:
                BaseUpsellSingleItemView this$03 = (BaseUpsellSingleItemView) obj;
                int i17 = BaseUpsellSingleItemView.f45119f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                b bVar = this$03.f45124e;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            case 3:
                vj0.b this$04 = (vj0.b) obj;
                int i18 = vj0.b.f125917i0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (((Boolean) this$04.f125919h0.getValue()).booleanValue()) {
                    this$04.f7().d(Navigation.w1(o.a()));
                    return;
                }
                return;
            case 4:
                BoardCreateAddCollaboratorsView this$05 = (BoardCreateAddCollaboratorsView) obj;
                int i19 = BoardCreateAddCollaboratorsView.f45145f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                zj0.b bVar2 = this$05.f45146a;
                if (bVar2 != null) {
                    bVar2.p3();
                    return;
                }
                return;
            case 5:
                k this$06 = (k) obj;
                int i23 = k.L0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                GestaltTextField gestaltTextField = this$06.f62302r0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                Editable z03 = gestaltTextField.z0();
                if (z03 == null || z03.length() == 0) {
                    int i24 = e.msg_invalid_board_name_letter_number;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    this$06.f8(new k0(i24, new ArrayList(0)));
                    GestaltTextField gestaltTextField2 = this$06.f62302r0;
                    if (gestaltTextField2 != null) {
                        hf0.b.s(gestaltTextField2);
                        return;
                    } else {
                        Intrinsics.r("boardNameEt");
                        throw null;
                    }
                }
                h hVar = this$06.f62305u0;
                if (d.o0(hVar != null ? Boolean.valueOf(hVar.r3()) : null)) {
                    this$06.s7().F(g0.MODAL_CREATE_BOARD, u0.CONVERSATION_GROUP_BOARD_UPSELL_CREATE_GROUP_BOARD_BUTTON);
                }
                GestaltTextField gestaltTextField3 = this$06.f62302r0;
                if (gestaltTextField3 == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                String valueOf = String.valueOf(gestaltTextField3.z0());
                GestaltSwitchWithLabel gestaltSwitchWithLabel = this$06.f62295k0;
                if (gestaltSwitchWithLabel == null) {
                    Intrinsics.r("secretBoardToggle");
                    throw null;
                }
                boolean z14 = gestaltSwitchWithLabel.Z().f96740a.f96708a;
                h hVar2 = this$06.f62305u0;
                if (hVar2 != null) {
                    hVar2.t3(new z(valueOf, z14, (c) null, 12), this$06.f62309y0);
                }
                GestaltTextField gestaltTextField4 = this$06.f62302r0;
                if (gestaltTextField4 != null) {
                    hf0.b.k(gestaltTextField4);
                    return;
                } else {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
            case 6:
                BoardCollaboratorView this$07 = (BoardCollaboratorView) obj;
                int i25 = BoardCollaboratorView.f45186c;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                if (!this$07.isEnabled() || (aVar2 = this$07.f45188b) == null) {
                    return;
                }
                ((mk0.e) aVar2).r3();
                return;
            case 7:
                rl0.c this$08 = (rl0.c) obj;
                int i26 = rl0.c.I0;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.P7();
                return;
            case 8:
                tl0.b bVar3 = ((BoardGridCellLayout) obj).f45267f;
                if (bVar3 != null) {
                    d0 a13 = f.a();
                    u0 u0Var = u0.BOARD_COVER;
                    g0 g0Var = g0.FLOWED_BOARD;
                    v7 v7Var = bVar3.f118061d;
                    a13.b0(u0Var, g0Var, v7Var != null ? v7Var.getUid() : null, false);
                    v7 v7Var2 = bVar3.f118061d;
                    if (v7Var2 != null) {
                        g70.h.f(bVar3.f118060c, v7Var2, null, 6);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                do0.b this$09 = (do0.b) obj;
                int i27 = do0.b.I0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.f7().d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                return;
            case 10:
                ho0.d this$010 = (ho0.d) obj;
                int i28 = ho0.d.f69689a1;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.dismiss();
                return;
            case 11:
                m this$011 = (m) obj;
                int i29 = m.N1;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                s sVar = this$011.f69723g1;
                if (sVar != null) {
                    sVar.x3();
                    return;
                } else {
                    Intrinsics.r("viewListener");
                    throw null;
                }
            case 12:
                xo0.k this$012 = (xo0.k) obj;
                int i33 = xo0.k.f135597g1;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                wo0.e eVar = this$012.f135600c1;
                if (eVar != null) {
                    eVar.X3();
                    return;
                }
                return;
            case 13:
                v this$013 = (v) obj;
                int i34 = v.f135623p;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.getClass();
                f1 f1Var = f1.TAP;
                u0 u0Var2 = u0.RELATED_SEARCH_OPTION;
                HashMap hashMap = new HashMap();
                hashMap.put("query", this$013.f135587f);
                String str = this$013.f135628n;
                if (str != null) {
                    hashMap.put("filter_value", str);
                }
                this$013.f135625k.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var2, (r18 & 4) != 0 ? null : this$013.f135626l, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                uo0.c cVar = this$013.f135627m;
                if (cVar != null) {
                    cVar.c();
                    return;
                }
                return;
            case 14:
                x this$014 = (x) obj;
                int i35 = x.f135630m;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                uo0.c cVar2 = this$014.f135631j;
                if (cVar2 != null) {
                    cVar2.c();
                    return;
                }
                return;
            case 15:
                i this$015 = (i) obj;
                int i36 = i.f20310r0;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$015.D5();
                return;
            case 16:
                LegoFloatingBottomActionBar this$016 = (LegoFloatingBottomActionBar) obj;
                int i37 = LegoFloatingBottomActionBar.f45446n;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.f(view);
                g gVar = this$016.f45450d;
                if (gVar == null) {
                    Intrinsics.r("closeupActionController");
                    throw null;
                }
                f30 f30Var = this$016.f45458l;
                if (f30Var != null) {
                    ((np0.d) gVar).f(view, f30Var);
                    return;
                } else {
                    Intrinsics.r("pin");
                    throw null;
                }
            case 17:
                lq0.i this$017 = (lq0.i) obj;
                int i38 = lq0.i.f84333d;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                w wVar = this$017.f84336c;
                if (wVar != null) {
                    a.c.y(wVar);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 18:
                int i39 = ConversationMessageThreadAnchorHeroView.f45607f;
                NavigationImpl z04 = Navigation.z0((ScreenLocation) a1.f50498e.getValue(), (String) obj);
                z04.y0(Boolean.FALSE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST");
                u.f85943a.d(z04);
                return;
            case 19:
                y0 this$018 = (y0) obj;
                int i43 = y0.f84456e;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                g70.h hVar3 = this$018.f84457a;
                v7 v7Var3 = this$018.f84460d;
                if (v7Var3 != null) {
                    g70.h.f(hVar3, v7Var3, null, 6);
                    return;
                } else {
                    Intrinsics.r("board");
                    throw null;
                }
            case 20:
                r1 this$019 = (r1) obj;
                int i44 = r1.f84415d1;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.s7().X(u0.CONVERSATION_CREATE_BUTTON);
                this$019.f7().d(Navigation.w1(a1.a()));
                return;
            case 21:
                br0.i this$020 = (br0.i) obj;
                int i45 = br0.i.f23752f;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.getClass();
                this$020.f23756d.d(new jc0.s());
                return;
            case 22:
                CreatorPinalyticsItemMediumView this$021 = (CreatorPinalyticsItemMediumView) obj;
                int i46 = CreatorPinalyticsItemMediumView.f45651e;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                FrameLayout frameLayout = this$021.f45654c;
                if (frameLayout.getVisibility() == 0) {
                    bs1.c.b1(frameLayout);
                    return;
                } else {
                    bs1.c.U1(frameLayout);
                    return;
                }
            case 23:
                wr0.u headerViewState = (wr0.u) obj;
                int i47 = EngagementDetailsHeaderView.f45677k;
                Intrinsics.checkNotNullParameter(headerViewState, "$headerViewState");
                headerViewState.f130924j.invoke();
                return;
            case 24:
                cs0.b this_with = (cs0.b) obj;
                int i48 = OverflowMenu.f45705f;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                fs0.g gVar2 = (fs0.g) this_with.f53125d;
                int i49 = gVar2.f62839a;
                fs0.i iVar = gVar2.f62840b;
                switch (i49) {
                    case 0:
                        l lVar = iVar.f62856i;
                        if (lVar != null && !lVar.isDisposed()) {
                            lVar.dispose();
                        }
                        iVar.f62856i = (l) iVar.f62854g.c(iVar.f62850c, null).o(new uq0.c(21, new lq0.f1(iVar, 8)), new uq0.c(22, fs0.h.f62842k));
                        return;
                    default:
                        ek2.f fVar = iVar.f62855h;
                        if (fVar != null && !fVar.isDisposed()) {
                            fVar.dispose();
                        }
                        iVar.f62855h = iVar.f62853f.c(iVar.f62849b).i(new b0(iVar, 17), new uq0.c(i14, fs0.h.f62841j));
                        return;
                }
            case 25:
                PinFeedbackModalContentView this$022 = (PinFeedbackModalContentView) obj;
                int i53 = PinFeedbackModalContentView.f45711h;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                fs0.k kVar = this$022.f45714d;
                if (kVar != null) {
                    kVar.getPinalytics().X(u0.PIN_FEEDBACK_HIDE_BY_CREATOR);
                    wy0 wy0Var = kVar.f62864h;
                    if (wy0Var == null) {
                        j.f125466a.G("null originalUploader - get @lkirsh to fix this", new Object[0]);
                        kVar.F3();
                        return;
                    } else {
                        ik2.i iVar2 = new ik2.i(kVar.f62860d.L(kVar.f62859c).n(), new wr0.l(4, new g1(4, kVar, wy0Var)));
                        Intrinsics.checkNotNullExpressionValue(iVar2, "switchMapSingle(...)");
                        kVar.addDisposable(iVar2.F(new uq0.c(25, new fs0.j(kVar, b13 == true ? 1 : 0)), new uq0.c(26, new fs0.j(kVar, 1)), ck2.i.f27923c, ck2.i.f27924d));
                        return;
                    }
                }
                return;
            case 26:
                SbaHfBoardToggleSettingCellView this$023 = (SbaHfBoardToggleSettingCellView) obj;
                int i54 = SbaHfBoardToggleSettingCellView.f45813k;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                r rVar = this$023.f45817d;
                if (rVar != null) {
                    rVar.a(xs0.b.f135780a);
                    return;
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            case 27:
                n this$024 = (n) obj;
                int i55 = n.S0;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.k9().f56235h.e().a(new dt0.c(new ha2.a(e0.b(el.a.m(ts0.b.All, new lq0.f1(this$024, i14))), z13, num, 14)));
                return;
            case 28:
                ht0.m this$025 = (ht0.m) obj;
                int i56 = ht0.m.f70121z0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                this$025.P7();
                return;
            default:
                it0.c this$026 = (it0.c) obj;
                int i57 = it0.c.f73669e1;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                vs0.f fVar2 = this$026.f73670a1;
                if (fVar2 != null) {
                    fVar2.u3();
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
        }
    }
}
