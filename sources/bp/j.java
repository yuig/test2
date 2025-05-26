package bp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.activity.sendapin.ui.PersonListCell;
import com.pinterest.api.model.c6;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qc;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.education.user.signals.UserSignalsActionPromptView;
import com.pinterest.education.view.EducationActionPromptView;
import com.pinterest.education.view.EducationPromptView;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateCollaboratorView;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.feature.board.organize.view.BoardAndSectionOrganizeCell;
import com.pinterest.feature.bubbles.view.BubbleContentSeparatorCellView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.b5;
import com.pinterest.screens.l1;
import e82.h0;
import fd1.o0;
import gz.t;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import jc0.s;
import jc0.v;
import k1.q;
import kh2.r;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.q2;
import lh0.z3;
import m60.t0;
import m60.w;
import nx.d0;
import nx.d1;
import nx.j0;
import pk.a0;
import pw0.x;
import ra0.l0;
import rc0.z0;
import vs.u;
import wm1.i0;
import x02.x0;
import xo.y;
import zp.b0;
import zp.e0;
import zp.g1;
import zp.w0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23639c;

    public /* synthetic */ j(int i13, Object obj, Object obj2) {
        this.f23637a = i13;
        this.f23638b = obj;
        this.f23639c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
    @Override // gm1.a
    public final void h3(gm1.c it) {
        ti0.b bVar;
        int i13 = this.f23637a;
        Object obj = this.f23639c;
        Object obj2 = this.f23638b;
        switch (i13) {
            case 0:
                k kVar = (k) obj2;
                qc qcVar = (qc) obj;
                kVar.getClass();
                if (it instanceof xl1.a) {
                    f fVar = ((l) kVar.C).f23632f;
                    wy0 inviterUser = qcVar.f41259b;
                    xo.i iVar = (xo.i) fVar;
                    int i14 = iVar.f135511a;
                    j0 j0Var = iVar.f135519i;
                    xj2.b bVar2 = iVar.f135520j;
                    x0 x0Var = iVar.f135513c;
                    v7 v7Var = iVar.f135512b;
                    switch (i14) {
                        case 0:
                            Intrinsics.checkNotNullParameter(inviterUser, "inviterUser");
                            j0Var.F(g0.USER_FEED, u0.COLLABORATOR_APPROVE_BUTTON);
                            j0Var.a(f1.BOARD_REQUEST_APPROVAL_INVITE_COLLABORATOR, inviterUser.getUid(), false, true);
                            u7 G1 = v7Var.G1();
                            Boolean bool = Boolean.TRUE;
                            G1.g(bool);
                            G1.q(bool);
                            G1.f42451n = Integer.valueOf(v7Var.J0().intValue() + 1);
                            boolean[] zArr = G1.f42452n0;
                            if (zArr.length > 13) {
                                zArr[13] = true;
                            }
                            G1.r(Integer.valueOf(v7Var.W0().intValue() + 1));
                            v7 a13 = G1.a();
                            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                            bVar2.a(x0Var.V(a13, new q(iVar, a13, inviterUser, 8)).o(new vo.a(5, new xo.e(iVar, 0)), new vo.a(6, xo.f.f135496j)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(inviterUser, "inviterUser");
                            j0Var.F(g0.USER_FEED, u0.COLLABORATOR_APPROVE_BUTTON);
                            j0Var.a(f1.BOARD_REQUEST_APPROVAL_INVITE_COLLABORATOR, inviterUser.getUid(), false, true);
                            u7 G12 = v7Var.G1();
                            Boolean bool2 = Boolean.TRUE;
                            G12.g(bool2);
                            G12.q(bool2);
                            G12.f42451n = Integer.valueOf(v7Var.J0().intValue() + 1);
                            boolean[] zArr2 = G12.f42452n0;
                            if (zArr2.length > 13) {
                                zArr2[13] = true;
                            }
                            G12.r(Integer.valueOf(v7Var.W0().intValue() + 1));
                            v7 a14 = G12.a();
                            Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                            bVar2.a(x0Var.V(a14, new q(iVar, a14, inviterUser, 9)).o(new vo.a(10, new y(iVar, 0)), new vo.a(11, xo.f.f135498l)));
                            return;
                    }
                }
                return;
            case 1:
                e0 e0Var = (e0) obj2;
                w wVar = (w) obj;
                zp.c cVar = e0Var.f142397b;
                if (cVar != null) {
                    if (!cVar.g0()) {
                        e0Var.f142397b.T();
                        return;
                    } else {
                        e0Var.f142397b.d0();
                        wVar.d(new s(true));
                        return;
                    }
                }
                return;
            case 2:
                w0 this$0 = (w0) obj2;
                wy0 user = (wy0) obj;
                int i15 = w0.f142526y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(user, "$user");
                Intrinsics.checkNotNullParameter(it, "it");
                w eventManager = this$0.getEventManager();
                bh.b bVar3 = this$0.f142529b0;
                if (bVar3 == null) {
                    Intrinsics.r("editablePinWrapperProvider");
                    throw null;
                }
                f30 f30Var = this$0.f142542i0;
                d1 d1Var = this$0.f142532d0;
                if (d1Var != null) {
                    eventManager.d(new v(new b0(bVar3.g(f30Var, d1Var), user), false, 0L, 30));
                    return;
                } else {
                    Intrinsics.r("trackingParamAttacher");
                    throw null;
                }
            case 3:
                g1 this$02 = (g1) obj2;
                HashMap auxData = (HashMap) obj;
                int i16 = g1.f142408l;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(it, "it");
                this$02.f142412d.a(null, null);
                this$02.getEventManager().d(new s());
                w eventManager2 = this$02.getEventManager();
                SendableObject sendableObject = new SendableObject(this$02.f142411c);
                p32.c cVar2 = p32.c.GROUP_BOARD;
                h0 h0Var = this$02.f142417i;
                if (h0Var == null) {
                    Intrinsics.r("socialUtils");
                    throw null;
                }
                eventManager2.d(new v(new o0(sendableObject, -1, cVar2, false, false, null, false, null, false, null, false, null, h0Var, 7864), false, 0L, 30));
                q2 q2Var = this$02.f142414f;
                if (q2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 activate = a4.f83297a;
                Intrinsics.checkNotNullParameter("enabled_with_image", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                boolean o13 = ((lh0.g1) q2Var.f83463a).o("android_post_save_collab_upsell", "enabled_with_image", activate);
                j0 j0Var2 = this$02.f142413e;
                if (o13) {
                    j0Var2.g(f1.POST_SAVE_IMAGE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, null, auxData, false);
                    return;
                } else {
                    j0Var2.g(f1.POST_SAVE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, null, auxData, false);
                    return;
                }
            case 4:
                yq.i this$03 = (yq.i) obj2;
                Context context = (Context) obj;
                int i17 = yq.i.f139646x;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(it, "event");
                int j13 = it.j();
                GestaltButton gestaltButton = this$03.f139657k;
                if (gestaltButton == null) {
                    Intrinsics.r("createPinCodeGestaltButton");
                    throw null;
                }
                if (j13 == gestaltButton.getId()) {
                    this$03.f139658l.invoke();
                    return;
                }
                GestaltButton gestaltButton2 = this$03.f139659m;
                if (gestaltButton2 == null) {
                    Intrinsics.r("changeImageGestaltButton");
                    throw null;
                }
                if (j13 == gestaltButton2.getId()) {
                    zp.j jVar = this$03.f139662p;
                    if (jVar != null) {
                        zp.j.b(jVar, context, x.ProfilePhoto, 0, null, null, null, 508);
                        return;
                    } else {
                        Intrinsics.r("galleryRouter");
                        throw null;
                    }
                }
                return;
            case 5:
                PersonListCell personListCell = (PersonListCell) obj2;
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                int i18 = PersonListCell.f35160g;
                personListCell.getClass();
                if (it instanceof em1.c) {
                    onClickListener.onClick(personListCell.f35163c);
                    return;
                }
                return;
            case 6:
                GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) obj2;
                u this$04 = (u) obj;
                int i19 = u.f126516h0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                Intrinsics.f(gestaltButtonGroup);
                if (r.Z0(it, gestaltButtonGroup)) {
                    this$04.Y7().f126487d.e().a(vs.j.f126491a);
                    return;
                } else {
                    if (r.a1(it, gestaltButtonGroup)) {
                        this$04.Y7().f126487d.e().a(vs.k.f126492a);
                        return;
                    }
                    return;
                }
            case 7:
                View this_apply = (View) obj2;
                iz.s this$05 = (iz.s) obj;
                int i23 = iz.s.f73871x0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if ((it instanceof xn1.i) && this_apply.hasFocus()) {
                    String input = ((xn1.i) it).f135454c;
                    this$05.getClass();
                    Intrinsics.checkNotNullParameter(input, "input");
                    if (this$05.c8()) {
                        this$05.e8(new t(input));
                        return;
                    }
                    fz.a aVar = this$05.f70604l0;
                    if (aVar != null) {
                        aVar.q3(input);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                k90.g this$06 = (k90.g) obj2;
                wy0 user2 = (wy0) obj;
                int i24 = k90.g.f78749j;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(user2, "$user");
                Intrinsics.checkNotNullParameter(it, "event");
                if ((it instanceof om1.l) && it.j() == a90.c.cutout_details_overflow_button) {
                    new k90.l(null, this$06.f78750a, user2.getUid(), this$06.f78751b, this$06.f78752c, this$06.f78753d, null).b();
                    return;
                }
                return;
            case 9:
                Context context2 = (Context) obj2;
                GestaltListAction view = (GestaltListAction) obj;
                Intrinsics.checkNotNullParameter(context2, "$context");
                Intrinsics.checkNotNullParameter(view, "$view");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof i0) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter("ListAction Click", "text");
                    Toast.makeText(context2, "ListAction Click", 0).show();
                    return;
                }
                if (it instanceof wm1.j0) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter("ListAction LongClick", "text");
                    Toast.makeText(context2, "ListAction LongClick", 0).show();
                    return;
                }
                if (it instanceof xl1.a) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter("Button Click", "text");
                    Toast.makeText(context2, "Button Click", 0).show();
                    return;
                }
                if (it instanceof em1.c) {
                    wm1.n nVar = view.g0().f130270d;
                    Intrinsics.g(nVar, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.CheckBoxDisplayState");
                    kg.a.h(view, new l0((wm1.g) nVar, 11));
                    return;
                } else if ((it instanceof on1.g) || (it instanceof on1.h)) {
                    kg.a.h(view, new z0(0, it));
                    return;
                } else {
                    if ((it instanceof bm1.r) || (it instanceof bm1.s)) {
                        wm1.n nVar2 = view.g0().f130270d;
                        Intrinsics.g(nVar2, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.ButtonToggleDisplayState");
                        kg.a.h(view, new l0((wm1.f) nVar2, 12));
                        return;
                    }
                    return;
                }
            case 10:
                UserSignalsActionPromptView this$07 = (UserSignalsActionPromptView) obj2;
                GestaltTextField this_with = (GestaltTextField) obj;
                int i25 = UserSignalsActionPromptView.f44960v;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.i) {
                    xn1.i iVar2 = (xn1.i) it;
                    int length = iVar2.f135454c.length();
                    String str = iVar2.f135454c;
                    this$07.l().d(new jc0.m(length > 0 && !Intrinsics.d(str, this$07.f44964r), 1));
                    if (str.length() > 0) {
                        fg0.e eVar = fg0.e.f62117k;
                        GestaltText gestaltText = this$07.f44963q;
                        gestaltText.i(eVar);
                        String a15 = gp1.e.a(str);
                        if (a15 == null || z.j(a15)) {
                            this$07.f44965s = "";
                            return;
                        } else {
                            gestaltText.i(new fg0.f(this_with, a15, 0));
                            this$07.f44965s = a15;
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                androidx.appcompat.app.k emailConfDialog = (androidx.appcompat.app.k) obj2;
                UserSignalsActionPromptView this$08 = (UserSignalsActionPromptView) obj;
                int i26 = UserSignalsActionPromptView.f44960v;
                Intrinsics.checkNotNullParameter(emailConfDialog, "$emailConfDialog");
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                emailConfDialog.dismiss();
                this$08.s().d(Navigation.w1((ScreenLocation) b5.f50581a.getValue()));
                return;
            case 12:
                androidx.appcompat.app.k emailConfDialog2 = (androidx.appcompat.app.k) obj2;
                EducationActionPromptView this$09 = (EducationActionPromptView) obj;
                int i27 = EducationActionPromptView.f44977y;
                Intrinsics.checkNotNullParameter(emailConfDialog2, "$emailConfDialog");
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                emailConfDialog2.dismiss();
                this$09.s().d(Navigation.w1((ScreenLocation) l1.f51060f.getValue()));
                return;
            case 13:
                View.OnClickListener onClickListener2 = (View.OnClickListener) obj2;
                EducationPromptView this$010 = (EducationPromptView) obj;
                int i28 = EducationPromptView.f45011f;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                if (!(it instanceof rn1.f) || onClickListener2 == null) {
                    return;
                }
                onClickListener2.onClick(this$010.f45012a);
                return;
            case 14:
                View.OnClickListener onCancelClick = (View.OnClickListener) obj2;
                Intrinsics.checkNotNullParameter(onCancelClick, "$onCancelClick");
                Intrinsics.checkNotNullParameter(it, "it");
                onCancelClick.onClick((GestaltButton) obj);
                return;
            case 15:
                kotlin.jvm.internal.j0 onClickListener3 = (kotlin.jvm.internal.j0) obj2;
                wh0.c this$011 = (wh0.c) obj;
                int i29 = wh0.c.f129901g;
                Intrinsics.checkNotNullParameter(onClickListener3, "$onClickListener");
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((View.OnClickListener) onClickListener3.f80434a).onClick(this$011.f129903f);
                return;
            case 16:
                kotlin.jvm.internal.j0 onClickListener4 = (kotlin.jvm.internal.j0) obj2;
                wh0.e this$012 = (wh0.e) obj;
                int i33 = wh0.e.f129905f;
                Intrinsics.checkNotNullParameter(onClickListener4, "$onClickListener");
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((View.OnClickListener) onClickListener4.f80434a).onClick(this$012.f129906e);
                return;
            case 17:
                xh0.e this$013 = (xh0.e) obj2;
                GestaltButton.SmallSecondaryButton this_apply2 = (GestaltButton.SmallSecondaryButton) obj;
                int i34 = xh0.e.f134969y;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    this$013.f134972x.onClick(this_apply2);
                    return;
                }
                return;
            case 18:
                c6 model = (c6) obj2;
                si0.a this$014 = (si0.a) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                String B = model.B();
                if (B == null || (bVar = this$014.f113002k) == null) {
                    return;
                }
                ti0.c cVar3 = bVar.f117696a;
                if (cVar3.isBound()) {
                    ui0.e eVar2 = (ui0.e) ((ri0.a) cVar3.getView());
                    rg0.n nVar3 = eVar2.J0;
                    if (nVar3 != null) {
                        nVar3.a(null, null);
                    }
                    eVar2.J0 = null;
                    ui0.e eVar3 = (ui0.e) ((ri0.a) cVar3.getView());
                    rg0.n nVar4 = eVar3.J0;
                    if (nVar4 != null) {
                        nVar4.c(null, null);
                    }
                    eVar3.J0 = null;
                    eVar3.P7();
                    eVar3.f7().f(new r70.h(true, false));
                }
                if (!tb.f.i0(B)) {
                    nu1.a.c(cVar3.f117700c, B, null, null, false, 30);
                }
                HashMap hashMap = new HashMap();
                rg0.n nVar5 = cVar3.f117699b;
                hashMap.put("placed_experience_id", String.valueOf(nVar5 != null ? Integer.valueOf(nVar5.f108060b) : null));
                d0 d0Var = bVar.f117697b.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.WHATS_NEW_ACTION_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            case 19:
                xi0.i this$015 = (xi0.i) obj2;
                Context context3 = (Context) obj;
                int i35 = xi0.i.f135018g;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(context3, "$context");
                Intrinsics.checkNotNullParameter(it, "it");
                wi0.c cVar4 = this$015.f135019c;
                if (cVar4 != null) {
                    d0 d0Var2 = cVar4.f130005a.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                    d0Var2.g(f1.TAP, cVar4.f130008d, cVar4.f130013i, false);
                }
                ku1.l lVar = this$015.f135022f;
                if (lVar != null) {
                    ku1.l.b(lVar, context3, this$015.f135020d, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                    return;
                } else {
                    Intrinsics.r("uriNavigator");
                    throw null;
                }
            case 20:
                BoardCreateCollaboratorView this$016 = (BoardCreateCollaboratorView) obj2;
                h91.a selectedContacts = (h91.a) obj;
                int i36 = BoardCreateCollaboratorView.f45151f;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(selectedContacts, "$selectedContacts");
                Intrinsics.checkNotNullParameter(it, "event");
                int i37 = 7;
                if (it instanceof bm1.r) {
                    TypeAheadItem typeAheadItem = this$016.f45156e;
                    if (typeAheadItem == null) {
                        Intrinsics.r("contact");
                        throw null;
                    }
                    selectedContacts.f68312a.put(h91.a.b(typeAheadItem), typeAheadItem);
                    u2.x(this$016.f45155d, new jc0.m(true, i37));
                    return;
                }
                TypeAheadItem typeAheadItem2 = this$016.f45156e;
                if (typeAheadItem2 == null) {
                    Intrinsics.r("contact");
                    throw null;
                }
                selectedContacts.f68312a.remove(h91.a.b(typeAheadItem2));
                u2.x(this$016.f45155d, new jc0.m(false, i37));
                return;
            case 21:
                dl0.e boardTag = (dl0.e) obj2;
                LegoBoardDetailHeader this$017 = (LegoBoardDetailHeader) obj;
                int i38 = LegoBoardDetailHeader.Q;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof rn1.f) || boardTag == null) {
                    return;
                }
                if (this$017.G == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(boardTag, "boardTag");
                if (boardTag == dl0.e.MADE_FOR_YOU) {
                    m60.u.f85943a.d(Navigation.w1(com.pinterest.screens.q.a()));
                    return;
                }
                return;
            case 22:
                GestaltButtonGroup gestaltButtonGroup2 = (GestaltButtonGroup) obj2;
                ol0.u this$018 = (ol0.u) obj;
                int i39 = ol0.u.f96431i;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                Intrinsics.f(gestaltButtonGroup2);
                if (r.Z0(it, gestaltButtonGroup2)) {
                    this$018.f96439h.invoke();
                    return;
                }
                if (r.a1(it, gestaltButtonGroup2)) {
                    w wVar2 = this$018.f96436e;
                    if (wVar2 != null) {
                        a.c.y(wVar2);
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            case 23:
                em0.d this$019 = (em0.d) obj2;
                BoardAndSectionOrganizeCell this_apply3 = (BoardAndSectionOrganizeCell) obj;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(this_apply3, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.n) {
                    int i43 = em0.d.K0;
                    this$019.getClass();
                    Object tag = this_apply3.getTag(t0.registry_view_holder);
                    Intrinsics.g(tag, "null cannot be cast to non-null type com.pinterest.feature.core.view.RegistryViewHolder");
                    this$019.I0.s((yq0.d0) tag);
                    return;
                }
                return;
            case 24:
                qn0.d dVar = (qn0.d) obj2;
                ((pn0.b) dVar.P0).W3();
                if (!a0.N(((GestaltButton) obj).getText().toString(), dVar.getResources().getString(m60.x0.done))) {
                    dVar.s7().X(u0.SKIP_BUTTON);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("reason", dVar.R0.getValue());
                dVar.s7().Z(u0.BOARD_SECTION_ADD_BUTTON, hashMap2);
                return;
            case 25:
                to0.g gVar = (to0.g) obj2;
                w wVar3 = gVar.f118670x0;
                String str2 = gVar.f118664r0;
                wVar3.d(new v(new to0.r(str2, gVar.f118667u0.e(gVar.s7(), str2), (po0.b) obj, gVar.f118669w0)));
                return;
            case 26:
                to0.g gVar2 = (to0.g) obj2;
                gVar2.E0.s(gVar2.f118664r0, 0, y32.f.INAPP_BROWSER.value(), (f30) obj);
                return;
            case 27:
                BubbleContentSeparatorCellView this$020 = (BubbleContentSeparatorCellView) obj2;
                String str3 = (String) obj;
                int i44 = BubbleContentSeparatorCellView.f45411f;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    ku1.l lVar2 = this$020.f45416e;
                    if (lVar2 == null) {
                        Intrinsics.r("uriNavigator");
                        throw null;
                    }
                    Context context4 = this$020.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    ku1.l.b(lVar2, context4, str3, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                    return;
                }
                return;
            case 28:
                ViewPager viewPager = (ViewPager) obj2;
                ap0.i this$021 = (ap0.i) obj;
                int i45 = ap0.i.f20310r0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                viewPager.postDelayed(new dp.a(15, this$021, viewPager), 10L);
                return;
            default:
                zp0.f this$022 = (zp0.f) obj2;
                yp0.b mentionTextWatcher = (yp0.b) obj;
                int i46 = zp0.f.f142606p;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(mentionTextWatcher, "$mentionTextWatcher");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof xn1.b) && !(it instanceof xn1.a)) {
                    if (it instanceof xn1.i) {
                        mentionTextWatcher.h3(it);
                        return;
                    }
                    return;
                } else {
                    up0.m mVar = this$022.f142618l;
                    if (mVar != null) {
                        mVar.h3(it);
                        return;
                    }
                    return;
                }
        }
    }
}
