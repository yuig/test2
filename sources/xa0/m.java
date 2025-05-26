package xa0;

import a.cb;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.aa;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.dr;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.pp;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.api.model.zs;
import com.pinterest.feature.account.view.AccountSwitcherRowView;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.feature.board.edit.view.BoardHeaderImagePreview;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.feature.conversation.view.UpdatedConversationBoardItemView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.gridactions.modal.view.PinFeedbackModalContentView;
import com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinFontPicker;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinTextEditor;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import jc0.s;
import kl0.z;
import kotlin.Unit;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kt0.x;
import lq0.g1;
import m60.u;
import m60.w;
import m60.x0;
import nx.d0;
import qv0.b0;
import qv0.y;
import to0.r;
import x02.a2;
import zp.y0;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f134416c;

    public /* synthetic */ m(int i13, Object obj, Object obj2) {
        this.f134414a = i13;
        this.f134415b = obj;
        this.f134416c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        int i13 = this.f134414a;
        int i14 = 3;
        int i15 = 5;
        int i16 = 4;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        boolean z16 = true;
        v7 v7Var = null;
        Object obj = this.f134416c;
        Object obj2 = this.f134415b;
        switch (i13) {
            case 0:
                Function1 onOverflowMenuTapped = (Function1) obj2;
                fi0 collage = (fi0) obj;
                Intrinsics.checkNotNullParameter(onOverflowMenuTapped, "$onOverflowMenuTapped");
                Intrinsics.checkNotNullParameter(collage, "$collage");
                String f39332b = collage.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                onOverflowMenuTapped.invoke(f39332b);
                return;
            case 1:
                Function0 onInviteButtonClicked = (Function0) obj2;
                w eventManager = (w) obj;
                Intrinsics.checkNotNullParameter(onInviteButtonClicked, "$onInviteButtonClicked");
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                onInviteButtonClicked.invoke();
                eventManager.d(new s());
                return;
            case 2:
                AccountSwitcherRowView this$0 = (AccountSwitcherRowView) obj2;
                mr1.h userAccount = (mr1.h) obj;
                int i17 = AccountSwitcherRowView.f45067k;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(userAccount, "$userAccount");
                ki0.b bVar = this$0.f45070c;
                if (bVar != null) {
                    Intrinsics.checkNotNullParameter(userAccount, "userAccount");
                    fi0.c cVar2 = bVar.f79782a.f79789o0;
                    if (cVar2 != null) {
                        Intrinsics.checkNotNullParameter(userAccount, "userAccount");
                        xj2.c o13 = new kk2.h(new kk2.g(new kk2.g(new kk2.g(new kk2.m(cVar2.f62210c.I5(), new lb0.c(25, new fi0.b(cVar2, userAccount, 0)), 0).l(wj2.c.a()), new dh0.a(11, new fi0.b(cVar2, userAccount, z15 ? 1 : 0)), 2), new dh0.a(12, new fi0.b(cVar2, userAccount, 2)), 3), new dh0.a(13, new fi0.b(cVar2, userAccount, i14)), 1), new fi0.a(cVar2, z14 ? 1 : 0), 1).o(new dh0.a(14, new fi0.b(cVar2, userAccount, i16)), new dh0.a(15, new hh0.a(cVar2, 6)));
                        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                        cVar2.addDisposable(o13);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                sk0.a tool = (sk0.a) obj;
                Function1 onClick = (Function1) obj2;
                int i18 = FloatingToolbarView.f45199i;
                Intrinsics.checkNotNullParameter(tool, "$tool");
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                if (tool.f113047d) {
                    onClick.invoke(Integer.valueOf(tool.f113046c));
                    return;
                }
                return;
            case 4:
                rk0.j this$02 = (rk0.j) obj2;
                tk0.a displayState = (tk0.a) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(displayState, "$displayState");
                int i19 = displayState.f117940b;
                ba baVar = this$02.B;
                if (baVar != null) {
                    int intValue = baVar.x().intValue() - i19;
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    aa aaVar = new aa(baVar, 0);
                    aaVar.f35676f = Integer.valueOf(intValue);
                    boolean[] zArr = aaVar.f35681k;
                    if (zArr.length > 5) {
                        zArr[5] = true;
                    }
                    this$02.B = aaVar.a();
                } else {
                    v7 v7Var2 = this$02.A;
                    if (v7Var2 != null) {
                        int intValue2 = v7Var2.s1().intValue() - i19;
                        int i23 = intValue2 < 0 ? 0 : intValue2;
                        u7 G1 = v7Var2.G1();
                        G1.H(Integer.valueOf(i23));
                        v7Var = G1.a();
                    }
                    this$02.A = v7Var;
                }
                this$02.t(tk0.i.f117970a);
                return;
            case 5:
                LegoBoardDetailHeader this$03 = (LegoBoardDetailHeader) obj2;
                wy0 sponsoredCurator = (wy0) obj;
                int i24 = LegoBoardDetailHeader.Q;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(sponsoredCurator, "$sponsoredCurator");
                xk0.d dVar = this$03.G;
                if (dVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                String userId = sponsoredCurator.getF39332b();
                Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
                Intrinsics.checkNotNullParameter(userId, "userId");
                ((wk0.c) dVar).f130112f.d(userId, r41.b.LegoBoardDetailHeader);
                return;
            case 6:
                z this$04 = (z) obj2;
                rg0.n experienceValue = (rg0.n) obj;
                int i25 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(experienceValue, "$experienceValue");
                this$04.f7().d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                experienceValue.a(null, null);
                return;
            case 7:
                ol0.f this$05 = (ol0.f) obj2;
                String boardId = (String) obj;
                int i26 = ol0.f.V0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                this$05.s7().b0(u0.BOARD_LEAVE_BUTTON, g0.MODAL_DIALOG, boardId, false);
                a.c.y(this$05.f7());
                ll0.f fVar = this$05.Q0;
                if (fVar != null) {
                    fVar.u3();
                    return;
                }
                return;
            case 8:
                ol0.m displayState2 = (ol0.m) obj2;
                BoardHeaderImagePreview this$06 = (BoardHeaderImagePreview) obj;
                int i27 = BoardHeaderImagePreview.f45248g;
                Intrinsics.checkNotNullParameter(displayState2, "$displayState");
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                if (Intrinsics.d(displayState2, ol0.m.f96402f)) {
                    this$06.f45254f.invoke();
                    return;
                }
                return;
            case 9:
                h90.m this$07 = (h90.m) obj2;
                wy0 model = (wy0) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                Function1 function1 = (Function1) this$07.f68273b;
                String f39332b2 = model.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                function1.invoke(f39332b2);
                return;
            case 10:
                em0.d this$08 = (em0.d) obj2;
                v7 destinationBoard = (v7) obj;
                int i28 = em0.d.K0;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(destinationBoard, "$destinationBoard");
                com.pinterest.feature.board.organize.b bVar2 = this$08.E0;
                if (bVar2 != null) {
                    ((dm0.d) bVar2).u3(destinationBoard);
                    return;
                }
                return;
            case 11:
                dk0.b this$09 = (dk0.b) obj2;
                String sectionNameSuggestion = (String) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(sectionNameSuggestion, "$sectionNameSuggestion");
                ((Function1) this$09.f55159f).invoke(sectionNameSuggestion);
                return;
            case 12:
                zn0.d this$010 = (zn0.d) obj2;
                String boardSectionId = (String) obj;
                int i29 = zn0.d.f142270u0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(boardSectionId, "$boardSectionId");
                this$010.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                this$010.s7().b0(u0.BOARD_SECTION_DELETE_BUTTON, g0.MODAL_DIALOG, boardSectionId, false);
                yn0.d dVar2 = this$010.f142277p0;
                if (dVar2 != null) {
                    dVar2.s3();
                    return;
                }
                return;
            case 13:
                bo0.a this$011 = (bo0.a) obj2;
                ba model2 = (ba) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(model2, "$model");
                co0.d dVar3 = (co0.d) this$011.f23604o;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (dVar3.isBound()) {
                    dVar3.getPinalytics().X(u0.BOARD_SECTION_MERGE_LIST_CELL);
                    ao0.a aVar = (ao0.a) dVar3.getView();
                    ba baVar2 = dVar3.f28282g;
                    String sourceSectionName = baVar2 != null ? baVar2.A() : null;
                    if (sourceSectionName == null) {
                        sourceSectionName = "";
                    }
                    String destinationSectionName = model2.A();
                    Intrinsics.checkNotNullExpressionValue(destinationSectionName, "getTitle(...)");
                    String destinationSectionId = model2.getF39332b();
                    Intrinsics.checkNotNullExpressionValue(destinationSectionId, "getUid(...)");
                    do0.b bVar3 = (do0.b) aVar;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(sourceSectionName, "sourceSectionName");
                    Intrinsics.checkNotNullParameter(destinationSectionName, "destinationSectionName");
                    String sourceSectionId = dVar3.f28276a;
                    Intrinsics.checkNotNullParameter(sourceSectionId, "sourceSectionId");
                    Intrinsics.checkNotNullParameter(destinationSectionId, "destinationSectionId");
                    String string = bVar3.getString(k70.e.section_merge_alert_message, sourceSectionName, destinationSectionName);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = bVar3.getString(k70.e.section_merge_alert_title);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Spanned fromHtml = Html.fromHtml(string);
                    Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                    String string3 = bVar3.getString(k70.e.section_merge_alert_confirm_text);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    Context requireContext = bVar3.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    yb0.n nVar = new yb0.n(requireContext);
                    nVar.w(string2);
                    nVar.u(fromHtml);
                    nVar.q(string3);
                    String string4 = bVar3.getString(x0.cancel);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    nVar.m(string4);
                    nVar.setFocusable(true);
                    nVar.setFocusableInTouchMode(true);
                    nVar.requestFocus();
                    nVar.f138513j = new y0(bVar3, sourceSectionId, destinationSectionId, 7);
                    nVar.f138514k = new lj0.a(bVar3, 9);
                    cb.x(nVar, bVar3.f7());
                    return;
                }
                return;
            case 14:
                v7 model3 = (v7) obj2;
                yi0.a this$012 = (yi0.a) obj;
                Intrinsics.checkNotNullParameter(model3, "$model");
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Integer q13 = model3.q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                if (q13.intValue() > 0) {
                    view2 = view;
                } else {
                    view2 = view;
                    z13 = false;
                }
                view2.setClickable(z13);
                fo0.a aVar2 = (fo0.a) this$012.f139068b;
                String f39332b3 = model3.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b3, "getUid(...)");
                String j13 = model3.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                aVar2.W0(f39332b3, j13, model3.b1());
                return;
            case 15:
                h90.m this$013 = (h90.m) obj2;
                ba model4 = (ba) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(model4, "$model");
                ((fo0.a) this$013.f68273b).V0(model4);
                return;
            case 16:
                Context context = (Context) obj2;
                r this$014 = (r) obj;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                ig1.b.w(context, new SendableObject(this$014.f118682a, 0), p32.c.MESSAGE, this$014.f118685d);
                return;
            case 17:
                ConversationMessageItemView this$015 = (ConversationMessageItemView) obj2;
                wy0 pinner = (wy0) obj;
                int i33 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(pinner, "$pinner");
                d0 d0Var = this$015.f45549d0;
                if (d0Var == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                d0Var.F(g0.CONVERSATION_MESSAGES, u0.USER_LIST_USER);
                r41.k kVar = r41.k.f106176a;
                String f39332b4 = pinner.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b4, "getUid(...)");
                kVar.d(f39332b4, r41.b.ConversationMessageItemView);
                return;
            case 18:
                v7 board = (v7) obj2;
                UpdatedConversationBoardItemView this$016 = (UpdatedConversationBoardItemView) obj;
                int i34 = UpdatedConversationBoardItemView.f45626f;
                Intrinsics.checkNotNullParameter(board, "$board");
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                sh.f.a().b0(u0.BOARD_COVER, g0.FLOWED_BOARD, board.getF39332b(), false);
                g70.h hVar = this$016.f45630d;
                if (hVar != null) {
                    g70.h.f(hVar, board, null, 6);
                    return;
                } else {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
            case 19:
                PinFeedbackModalContentView this$017 = (PinFeedbackModalContentView) obj2;
                cs0.e option = (cs0.e) obj;
                int i35 = PinFeedbackModalContentView.f45711h;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(option, "$option");
                fs0.k kVar2 = this$017.f45714d;
                if (kVar2 != null) {
                    Intrinsics.checkNotNullParameter(option, "option");
                    boolean contains = h1.f(l32.f.NOT_RELEVANT_TO_SKIN_TONE, l32.f.NOT_RELEVANT_TO_HAIR_PATTERN, l32.f.NOT_RELEVANT_TO_BODY_TYPE).contains(option.f53127b);
                    if (contains) {
                        kVar2.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : option.f53128c, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : kVar2.f62859c, (r18 & 32) != 0 ? null : kVar2.f62867k, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    } else {
                        kVar2.getPinalytics().X(option.f53128c);
                    }
                    kVar2.addDisposable(new ik2.i(kVar2.f62860d.L(kVar2.f62859c).n(), new wr0.l(i14, new g1(5, kVar2, option))).F(new uq0.c(23, new r1.f(contains, kVar2, 17)), new uq0.c(24, new fs0.j(kVar2, 2)), cVar, a2Var));
                }
                this$017.setEnabled(false);
                return;
            case 20:
                gs0.o this$018 = (gs0.o) obj2;
                cs0.e feedbackOption = (cs0.e) obj;
                int i36 = gs0.o.f66055y;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(feedbackOption, "$feedbackOption");
                cs0.f fVar2 = this$018.f66072t;
                if (fVar2 != null) {
                    ((fs0.w) fVar2).F3(feedbackOption.f53127b, feedbackOption.f53128c);
                    return;
                }
                return;
            case 21:
                yi0.a this$019 = (yi0.a) obj2;
                zs model5 = (zs) obj;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(model5, "$model");
                d0 d0Var2 = ((uk1.d) this$019.f139068b).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                d0.B(d0Var2, null, null, null, yi0.a.i(model5), 23);
                Function1 function12 = (Function1) this$019.f139069c;
                if (function12 != null) {
                    function12.invoke(model5);
                    return;
                } else {
                    u.f85943a.d(Navigation.r0((ScreenLocation) com.pinterest.screens.a2.f50511e.getValue(), model5));
                    return;
                }
            case 22:
                ot0.b this$020 = (ot0.b) obj2;
                v7 board2 = (v7) obj;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(board2, "$model");
                ot0.i iVar = (ot0.i) this$020.f97518a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(board2, "board");
                ot0.k kVar3 = iVar.H0;
                if (kVar3 != null) {
                    String f39332b5 = board2.getF39332b();
                    Intrinsics.checkNotNullExpressionValue(f39332b5, "getUid(...)");
                    kVar3.v3(f39332b5);
                }
                Navigation navigation = iVar.I;
                if ((navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null) != null) {
                    iVar.f7().d(new hv0.i(board2));
                    iVar.z(ot0.f.f97521i);
                    GestaltTextField gestaltTextField = iVar.F0;
                    if (gestaltTextField != null) {
                        hf0.b.k(gestaltTextField);
                        return;
                    } else {
                        Intrinsics.r("searchBar");
                        throw null;
                    }
                }
                x02.x0 x0Var = iVar.D0;
                if (x0Var == null) {
                    Intrinsics.r("boardRepository");
                    throw null;
                }
                String f39332b6 = board2.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b6, "getUid(...)");
                iVar.R6(x0Var.Q(f39332b6).I(1L).F(new x(i16, new ot0.g(iVar, board2)), new x(i15, new ot0.h(iVar, z16 ? 1 : 0)), cVar, a2Var));
                return;
            case 23:
                BaseControlView this$021 = (BaseControlView) obj2;
                int i37 = BaseControlView.f45894e;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.X(obj);
                return;
            case 24:
                IdeaPinFontPicker this$022 = (IdeaPinFontPicker) obj2;
                cw0.a font = (cw0.a) obj;
                int i38 = IdeaPinFontPicker.f45997j;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(font, "$font");
                this$022.a(font.f53326a);
                au0.g gVar = this$022.f46005h;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(font, "font");
                au0.e eVar = gVar.f20492c;
                if (eVar != null) {
                    Intrinsics.checkNotNullParameter(font, "font");
                    ((IdeaPinTextEditor) eVar).g(font);
                }
                yt0.b bVar4 = gVar.f20493d;
                if (bVar4 != null) {
                    u0 u0Var = u0.STORY_PIN_TEXT_FONT_PICKER_OPTION;
                    d4 d4Var = d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL;
                    HashMap hashMap = new HashMap();
                    hashMap.put("story_pin_select_name", font.f53330e);
                    Unit unit = Unit.f80348a;
                    ((f0) bVar4).k0(u0Var, d4Var, hashMap);
                    return;
                }
                return;
            case 25:
                mv0.a this$023 = (mv0.a) obj2;
                String imageUrl = (String) obj;
                int i39 = mv0.a.f88320d;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(imageUrl, "$imageUrl");
                this$023.f88321a.invoke(Integer.valueOf(this$023.f88323c), imageUrl);
                this$023.f88322b.invoke();
                return;
            case 26:
                nv0.a this$024 = (nv0.a) obj2;
                zq model6 = (zq) obj;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(model6, "$model");
                this$024.f92350b.L2(new nv0.g(model6, g0.IDEA_PIN_STICKER_EVERGREEN));
                return;
            case 27:
                y this$025 = (y) obj2;
                pp sticker = (pp) obj;
                int i43 = y.f105218f;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(sticker, "$sticker");
                this$025.f105221c.L2(new nv0.e(sticker));
                return;
            case 28:
                b0 this$026 = (b0) obj2;
                dr stickerCategory = (dr) obj;
                int i44 = b0.f105157d;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(stickerCategory, "$stickerCategory");
                this$026.f105160c.L2(new nv0.h(stickerCategory));
                return;
            default:
                lp.a this$027 = (lp.a) obj2;
                zq sticker2 = (zq) obj;
                int i45 = lp.a.f84199g;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                Intrinsics.checkNotNullParameter(sticker2, "$sticker");
                ((nv0.b) this$027.f84204e).L2(new nv0.g(sticker2, g0.IDEA_PIN_STICKER_RECENTLY_USED));
                return;
        }
    }

    public /* synthetic */ m(sk0.a aVar, Function1 function1) {
        this.f134414a = 3;
        this.f134416c = aVar;
        this.f134415b = function1;
    }
}
