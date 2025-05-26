package fd1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.tb;
import com.pinterest.api.model.wd;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import com.pinterest.screens.n4;
import com.pinterest.shuffles.composer.ui.widget.ActionMenu;
import com.pinterest.ui.components.users.LegoUserRep;
import h32.d4;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import net.quikkly.android.utils.BitmapUtils;
import rh1.k1;
import rh1.v1;
import sf1.j1;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61909c;

    public /* synthetic */ e(int i13, Object obj, Object obj2) {
        this.f61907a = i13;
        this.f61908b = obj;
        this.f61909c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar;
        ScreenDescription w13;
        int i13 = this.f61907a;
        r14 = null;
        Class cls = null;
        Object obj = this.f61909c;
        Object obj2 = this.f61908b;
        switch (i13) {
            case 0:
                String str = (String) obj2;
                ContactSearchListCell this$0 = (ContactSearchListCell) obj;
                int i14 = ContactSearchListCell.f48383m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (str == null || (jVar = this$0.f48392i) == null) {
                    return;
                }
                ((dr.k) jVar).f(str);
                return;
            case 1:
                d0 this$02 = (d0) obj;
                String boardId = (String) obj2;
                int i15 = d0.f61884t;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                m60.w wVar = this$02.f61892h;
                if (wVar != null) {
                    wVar.d(Navigation.z0((ScreenLocation) n4.f51144a.getValue(), boardId));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 2:
                y0 this$03 = (y0) obj;
                String boardId2 = (String) obj2;
                int i16 = y0.f62016r;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(boardId2, "$boardId");
                m60.w wVar2 = this$03.f62025i;
                if (wVar2 != null) {
                    wVar2.d(Navigation.z0((ScreenLocation) n4.f51144a.getValue(), boardId2));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 3:
                sf1.s this$04 = (sf1.s) obj2;
                sf1.v0 listener = (sf1.v0) obj;
                int i17 = sf1.s.P;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                if (this$04.I != null) {
                    this$04.n();
                    return;
                }
                oq.c0 c0Var = (oq.c0) listener;
                View.OnClickListener onClickListener = c0Var.N;
                if (onClickListener != null) {
                    onClickListener.onClick(c0Var);
                    return;
                }
                return;
            case 4:
                j1 listener2 = (j1) obj2;
                sf1.e1 this$05 = (sf1.e1) obj;
                int i18 = sf1.e1.T;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                j1.Z1(listener2, this$05.f112556o);
                return;
            case 5:
                wg1.p this$06 = (wg1.p) obj2;
                LinearLayout this_apply = (LinearLayout) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                nx.d0 d0Var = this$06.f129819j.f122379a;
                h32.u0 u0Var = h32.u0.VIEW_ALL_BUTTON;
                h32.g0 g0Var = h32.g0.DYNAMIC_GRID_STORY;
                HashMap hashMap = new HashMap();
                String str2 = this$06.f129824o;
                if (str2 != null) {
                    hashMap.put("story_type", str2);
                }
                Unit unit = Unit.f80348a;
                d0Var.h(g0Var, u0Var, hashMap);
                Context context = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ih ihVar = this$06.f129823n;
                ku1.l.b(this$06.f129818i, context, ihVar != null ? ihVar.e() : null, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                return;
            case 6:
                Function1 clickAction = (Function1) obj2;
                com.pinterest.feature.todaytab.tab.view.e this$07 = (com.pinterest.feature.todaytab.tab.view.e) obj;
                int i19 = com.pinterest.feature.todaytab.tab.view.e.f48714o;
                Intrinsics.checkNotNullParameter(clickAction, "$clickAction");
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                clickAction.invoke(this$07.f48718g);
                return;
            case 7:
                com.pinterest.feature.unauth.sba.g this$08 = (com.pinterest.feature.unauth.sba.g) obj;
                String url = (String) obj2;
                int i23 = com.pinterest.feature.unauth.sba.g.f48812f;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(url, "$url");
                u50.r rVar = this$08.f48817e;
                if (rVar == null) {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
                Context context2 = this$08.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                rVar.a(new com.pinterest.feature.unauth.sba.j(context2, url));
                return;
            case 8:
                com.pinterest.feature.unifiedcomments.a listener3 = (com.pinterest.feature.unifiedcomments.a) obj2;
                wd sticker = (wd) obj;
                Intrinsics.checkNotNullParameter(listener3, "$listener");
                Intrinsics.checkNotNullParameter(sticker, "$model");
                oh1.q qVar = (oh1.q) listener3;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(sticker, "sticker");
                lh0.l0 l0Var = qVar.f94562b;
                l0Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) l0Var.f83412a;
                boolean o13 = g1Var.o("ce_android_comment_composer_redesign", "enabled", z3Var);
                m60.w wVar3 = qVar.f94563c;
                if (o13 || g1Var.l("ce_android_comment_composer_redesign")) {
                    String uid = sticker.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    wVar3.d(new vp.a(uid, sticker.v()));
                } else {
                    com.pinterest.framework.screens.s sVar = qVar.f94561a;
                    if (sVar != null && (w13 = sVar.w(1)) != null) {
                        cls = w13.getScreenClass();
                    }
                    if (Intrinsics.d(cls, ((ScreenLocation) com.pinterest.screens.v0.f51442d.getValue()).getF48114a())) {
                        String uid2 = sticker.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        wVar3.d(new rh1.d0(uid2, sticker.v()));
                    } else {
                        qVar.f94564d.n(qVar.getPinalytics(), qVar.f94565e, (r36 & 4) != 0 ? "" : qVar.f94566f, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : sticker, (r36 & 8192) != 0 ? Boolean.FALSE : null, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : false, false);
                    }
                }
                ((rh1.a0) ((rh1.b0) ((com.pinterest.feature.unifiedcomments.b) qVar.getView())).h9()).invoke();
                return;
            case 9:
                rh1.k0 this$09 = (rh1.k0) obj2;
                wy0 validUser = (wy0) obj;
                int i24 = rh1.k0.f108203k0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(validUser, "$validUser");
                Function1 function1 = this$09.f108218i;
                String uid3 = validUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                function1.invoke(uid3);
                return;
            case 10:
                rh1.k0 this$010 = (rh1.k0) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.f108220j.invoke((String) obj2);
                return;
            case 11:
                k1 this$011 = (k1) obj2;
                GestaltButton gestaltButton = (GestaltButton) obj;
                int i25 = k1.f108238l;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                if (this$011.f108247i) {
                    return;
                }
                m60.w wVar4 = this$011.f108249k;
                if (wVar4 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar4.d(new jc0.s());
                Context context3 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                this$011.f108248j.k(context3, this$011.f108242d, this$011.f108243e, this$011.f108244f, this$011.f108245g, this$011.f108246h, Boolean.TRUE);
                return;
            case 12:
                v1 this$012 = (v1) obj2;
                GestaltIconButton gestaltIconButton = (GestaltIconButton) obj;
                int i26 = v1.S0;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                nx.d0 s73 = this$012.s7();
                zp.j jVar2 = this$012.f108313p0;
                if (jVar2 == null) {
                    Intrinsics.r("galleryRouter");
                    throw null;
                }
                Context context4 = gestaltIconButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                zp.j.b(jVar2, context4, pw0.x.CommentAddPhoto, 0, null, null, s73, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                s73.F(h32.g0.COMMENT_COMPOSER, h32.u0.USER_DID_IT_BUTTON);
                return;
            case 13:
                GestaltAvatarGroup this$013 = (GestaltAvatarGroup) obj2;
                Function0 event = (Function0) obj;
                int i27 = sl1.j.f113184a;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(event, "$event");
                al1.n nVar = GestaltAvatarGroup.f49251e;
                gm1.a aVar = (gm1.a) this$013.f49255a.f33804b;
                if (aVar != null) {
                    aVar.h3((gm1.c) event.invoke());
                    return;
                }
                return;
            case 14:
                com.google.firebase.messaging.q this$014 = (com.google.firebase.messaging.q) obj2;
                Function0 makeClickEvent = (Function0) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(makeClickEvent, "$makeClickEvent");
                this$014.s((gm1.c) makeClickEvent.invoke());
                return;
            case 15:
                ProductTagCard this$015 = (ProductTagCard) obj2;
                Function1 detailsClick = (Function1) obj;
                int i28 = ProductTagCard.f50084v;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(detailsClick, "$detailsClick");
                nx.d0 d0Var2 = this$015.f50085a;
                if (d0Var2 != null) {
                    d0Var2.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.CLICK, (r18 & 2) != 0 ? null : h32.u0.PIN_STATS_TAGGED_PRODUCTS_DETAILS_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_STATS_TAGGED_PRODUCTS_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                detailsClick.invoke(this$015.f50103s);
                return;
            case 16:
                Function1 onClick = (Function1) obj2;
                px.h productTagItem = (px.h) obj;
                int i29 = gw1.j.f66233z;
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(productTagItem, "$productTagItem");
                onClick.invoke(productTagItem.f101562a);
                return;
            case 17:
                ToplineMetricsCard this$016 = (ToplineMetricsCard) obj2;
                jw1.a metricItem = (jw1.a) obj;
                int i33 = ToplineMetricsCard.f50106j;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(metricItem, "$metricItem");
                this$016.f50115i.invoke(metricItem.f77663a);
                return;
            case 18:
                ow1.g this$017 = (ow1.g) obj2;
                ww1.c metricType = (ww1.c) obj;
                fy1.e eVar = ow1.g.O0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(metricType, "$metricType");
                if (this$017.f97945n0 != null) {
                    List e83 = this$017.e8();
                    Integer num = this$017.f97945n0;
                    int intValue = num != null ? num.intValue() : 0;
                    metricType = (ww1.c) ((intValue < 0 || intValue > kotlin.collections.f0.i(e83)) ? (ww1.c) d7.b.F(this$017.e8()) : e83.get(intValue));
                }
                gw1.f fVar = this$017.f97942k0;
                if (fVar != null) {
                    fVar.c(metricType, this$017.e8(), new ow1.f(this$017, 0));
                    return;
                } else {
                    Intrinsics.r("metricsSelectionActionSheetHandler");
                    throw null;
                }
            case 19:
                tb this_apply2 = (tb) obj2;
                ex1.g this$018 = (ex1.g) obj;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                f30 l13 = this_apply2.l();
                if (l13 != null) {
                    this$018.f60398g.invoke(l13);
                    return;
                }
                return;
            case 20:
                Function1 onSelected = (Function1) obj2;
                px1.q filterSelection = (px1.q) obj;
                int i34 = px1.r.f101689u;
                Intrinsics.checkNotNullParameter(onSelected, "$onSelected");
                Intrinsics.checkNotNullParameter(filterSelection, "$filterSelection");
                onSelected.invoke(filterSelection);
                return;
            case 21:
                Function1 onSelected2 = (Function1) obj2;
                sx.a boardMetadata = (sx.a) obj;
                int i35 = wx1.e.f131215u;
                Intrinsics.checkNotNullParameter(onSelected2, "$onSelected");
                Intrinsics.checkNotNullParameter(boardMetadata, "$boardMetadata");
                onSelected2.invoke(boardMetadata);
                return;
            case 22:
                kl2.p onMoreActionsClicked = (kl2.p) obj2;
                mj item = (mj) obj;
                int i36 = RVCSectionItemView.f50428l;
                Intrinsics.checkNotNullParameter(onMoreActionsClicked, "$onMoreActionsClicked");
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(item, "<this>");
                mj.d dVar = mj.d.COPYRIGHT_INFRINGEMENT;
                mj.d dVar2 = mj.d.CLAIMED_CONTENT;
                mj.d dVar3 = mj.d.TRADEMARK_INFRINGEMENT;
                Boolean valueOf = Boolean.valueOf(item.C() == mj.a.CAN_APPEAL && (CollectionsKt.L(kotlin.collections.f0.j(dVar, dVar2, dVar3), item.Q()) || !item.J().booleanValue()));
                Intrinsics.checkNotNullParameter(item, "<this>");
                Boolean valueOf2 = Boolean.valueOf(item.Q() == mj.d.SELF_INJURY_AND_HARMFUL_BEHAVIOR);
                String z13 = item.z();
                Boolean B = item.B();
                Intrinsics.checkNotNullExpressionValue(B, "getAppealAttachmentsEnabled(...)");
                String L = item.L();
                Intrinsics.checkNotNullParameter(item, "<this>");
                onMoreActionsClicked.k(valueOf, valueOf2, z13, B, L, Boolean.valueOf(CollectionsKt.L(kotlin.collections.f0.j(dVar, dVar2, dVar3), item.Q()) && item.M() == mj.c.PIN), item.K());
                return;
            case 23:
                ActionMenu this$019 = (ActionMenu) obj2;
                p62.a action = (p62.a) obj;
                rl2.u[] uVarArr = ActionMenu.f51881l;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(action, "$action");
                this$019.f51882a.i(action.f98924a);
                return;
            case 24:
                da2.g this$020 = (da2.g) obj2;
                de1.t productFilterModal = (de1.t) obj;
                int i37 = da2.g.f54244o;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(productFilterModal, "$productFilterModal");
                this$020.f54257m.f122379a.X(h32.u0.FILTER_BUTTON);
                m60.u.f85943a.f(new jc0.v(productFilterModal, false, 0L, 30));
                return;
            case 25:
                ha2.l this$021 = (ha2.l) obj2;
                ha2.g model = (ha2.g) obj;
                int i38 = ha2.l.f68450n;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                this$021.f68461k.i(ha2.h.f68437m);
                this$021.f68453c.invoke(Integer.valueOf(model.getIndex()));
                return;
            case 26:
                Function1 clickHandler = (Function1) obj2;
                ba model2 = (ba) obj;
                Intrinsics.checkNotNullParameter(clickHandler, "$clickHandler");
                Intrinsics.checkNotNullParameter(model2, "$model");
                String uid4 = model2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                clickHandler.invoke(uid4);
                return;
            case 27:
                Function1 action2 = (Function1) obj2;
                oa2.i position = (oa2.i) obj;
                int i39 = LegoUserRep.A;
                Intrinsics.checkNotNullParameter(action2, "$action");
                Intrinsics.checkNotNullParameter(position, "$position");
                action2.invoke(position);
                return;
            default:
                cb2.x this$022 = (cb2.x) obj2;
                m10.d event2 = (m10.d) obj;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(event2, "$event");
                Intrinsics.f(view);
                nx.d0 d0Var3 = this$022.f27377J;
                if (d0Var3 == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                this$022.l(d0Var3, h32.u0.PIN_REPIN_BUTTON);
                d4 d4Var = d4.PIN;
                nx.d0 d0Var4 = this$022.f27377J;
                if (d0Var4 == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                az0.b bVar = new az0.b(d4Var, d0Var4);
                Context context5 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                bVar.a(context5);
                xk2.v vVar = zf0.f.f141903e;
                vb0.e.e().getClass();
                ig1.b.M0(this$022.k(), view, true, view.getContext(), true, df.j1.D0(i32.y0.ANDROID_REPIN_DIALOG_TAKEOVER, i32.l.ANDROID_FIRST_BOARD_CREATE), false);
                this$022.f27401x.getClass();
                boolean b13 = com.pinterest.feature.pin.r.b();
                f30 f30Var = this$022.I;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                boolean k13 = this$022.k();
                Intrinsics.d(this$022.g(), "board");
                String str3 = this$022.N;
                this$022.e(event2);
                String d2 = this$022.d();
                nx.d0 d0Var5 = this$022.f27377J;
                if (d0Var5 == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                jo1.a b14 = this$022.b();
                this$022.f27403z.getClass();
                k11.p.a(this$022.f27397t, f30Var, k13, true, false, str3, b13, d2, d0Var5, androidx.camera.core.impl.j.i(b14), b13 ? new ha2.i(8, this$022, event2) : null, new w1.l0(this$022, event2, b13, 7), 8);
                return;
        }
    }

    public /* synthetic */ e(ViewGroup viewGroup, String str, int i13) {
        this.f61907a = i13;
        this.f61909c = viewGroup;
        this.f61908b = str;
    }
}
