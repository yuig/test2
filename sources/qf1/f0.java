package qf1;

import com.pinterest.activity.pin.view.unifiedcomments.CommentsQuickReplies;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq.h3;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103669i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f103670j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f103671k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, boolean z13, int i13) {
        super(1);
        this.f103669i = i13;
        this.f103671k = obj;
        this.f103670j = z13;
    }

    public final void b(f30 pin) {
        int i13 = this.f103669i;
        Object obj = this.f103671k;
        boolean z13 = this.f103670j;
        switch (i13) {
            case 0:
                if (!z13) {
                    i0 i0Var = (i0) obj;
                    i0Var.d();
                    gb2.f fVar = gb2.f.f64747a;
                    String uid = pin.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    gb2.f.c(new gb2.i(uid, wa2.p.STATE_HIDDEN, wa2.o.BOTH));
                    i0.b(i0Var, pin);
                    break;
                } else {
                    Intrinsics.f(pin);
                    i0.b((i0) obj, pin);
                    gb2.f fVar2 = gb2.f.f64747a;
                    String uid2 = pin.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    gb2.f.c(new gb2.i(uid2, wa2.p.STATE_HIDDEN, wa2.o.BOTH));
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (!z13) {
                    Integer B6 = pin.B6();
                    if (B6.intValue() == q32.c.FOOD_AND_DRINKS.getValue()) {
                        CommentsQuickReplies commentsQuickReplies = (CommentsQuickReplies) obj;
                        List quickReplies = kotlin.collections.f0.j(Integer.valueOf(ob2.f.comment_templates_food_drink_yum), Integer.valueOf(ob2.f.comment_templates_food_drink_came_out_great), Integer.valueOf(ob2.f.comment_templates_food_drink_delish), Integer.valueOf(ob2.f.comment_templates_food_drink_looks_so_good), Integer.valueOf(ob2.f.comment_templates_food_drink_perfection));
                        commentsQuickReplies.getClass();
                        Intrinsics.checkNotNullParameter(quickReplies, "quickReplies");
                        commentsQuickReplies.f35114d = commentsQuickReplies.n(quickReplies);
                        commentsQuickReplies.j();
                        break;
                    }
                } else {
                    CommentsQuickReplies commentsQuickReplies2 = (CommentsQuickReplies) obj;
                    List quickReplies2 = kotlin.collections.f0.j(Integer.valueOf(ob2.f.comments_creator_quick_replies_what_do_you_think), Integer.valueOf(ob2.f.comments_creator_quick_replies_was_this_helpful), Integer.valueOf(ob2.f.comments_creator_quick_replies_show_me_your_take), Integer.valueOf(ob2.f.comments_creator_quick_replies_questions), Integer.valueOf(ob2.f.comments_creator_quick_replies_what_would_you_do));
                    commentsQuickReplies2.getClass();
                    Intrinsics.checkNotNullParameter(quickReplies2, "quickReplies");
                    commentsQuickReplies2.f35114d = commentsQuickReplies2.n(quickReplies2);
                    commentsQuickReplies2.j();
                    break;
                }
                break;
        }
    }

    public final void e(dl1.s sVar) {
        int i13 = this.f103669i;
        boolean z13 = this.f103670j;
        Object obj = this.f103671k;
        switch (i13) {
            case 1:
                if (sVar instanceof z2) {
                    oh1.m mVar = (oh1.m) obj;
                    if (mVar.I3(mVar.f94537s)) {
                        z2 z2Var = (z2) sVar;
                        LinkedHashMap linkedHashMap = n10.a.f88916a;
                        Intrinsics.checkNotNullParameter(z2Var, "<this>");
                        y2 c03 = z2Var.c0();
                        c03.f43894q = Boolean.valueOf(z13);
                        boolean[] zArr = c03.f43903z;
                        if (zArr.length > 16) {
                            zArr[16] = true;
                        }
                        z2 a13 = c03.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        mVar.f94521c.W(a13);
                        break;
                    }
                }
                break;
            default:
                String uid = sVar.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                ((dl1.l) obj).H(new dl1.u(uid), sVar, z13);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        Iterator it;
        boolean z14;
        gk1.d0 d0Var;
        int i13;
        int i14 = this.f103669i;
        final int i15 = 0;
        final int i16 = 1;
        boolean z15 = this.f103670j;
        Object obj2 = this.f103671k;
        switch (i14) {
            case 0:
                b((f30) obj);
                return Unit.f80348a;
            case 1:
                e((dl1.s) obj);
                return Unit.f80348a;
            case 2:
                b((f30) obj);
                return Unit.f80348a;
            case 3:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (z15) {
                    z13 = true;
                } else {
                    int i17 = rh1.k0.f108203k0;
                    ((rh1.k0) obj2).getClass();
                    z13 = false;
                }
                return rn1.a.y(it2, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 4:
                gk1.l it3 = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                gk1.d0 d0Var2 = (gk1.d0) obj2;
                List list = it3.f65239a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    ni1.f0 f0Var = (ni1.f0) it4.next();
                    if (f0Var instanceof lj1.b) {
                        lj1.b bVar = (lj1.b) f0Var;
                        boolean z16 = ((gk1.q) d0Var2).f65255a;
                        boolean z17 = z16 != z15 ? i16 : i15;
                        u50.i0 buttonText = bVar.f83616a;
                        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                        u50.n overlayTopRadius = bVar.f83618c;
                        Intrinsics.checkNotNullParameter(overlayTopRadius, "overlayTopRadius");
                        u50.n overlayBottomRadius = bVar.f83619d;
                        Intrinsics.checkNotNullParameter(overlayBottomRadius, "overlayBottomRadius");
                        u50.i overlayBackgroundColor = bVar.f83620e;
                        Intrinsics.checkNotNullParameter(overlayBackgroundColor, "overlayBackgroundColor");
                        vn1.c buttonTextColor = bVar.f83621f;
                        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
                        u50.i buttonBackgroundColor = bVar.f83622g;
                        Intrinsics.checkNotNullParameter(buttonBackgroundColor, "buttonBackgroundColor");
                        u50.n buttonInnerVerticalPadding = bVar.f83623h;
                        Intrinsics.checkNotNullParameter(buttonInnerVerticalPadding, "buttonInnerVerticalPadding");
                        it = it4;
                        u50.n buttonInnerHorizontalPadding = bVar.f83624i;
                        Intrinsics.checkNotNullParameter(buttonInnerHorizontalPadding, "buttonInnerHorizontalPadding");
                        d0Var = d0Var2;
                        u50.n buttonOuterHorizontalPadding = bVar.f83625j;
                        Intrinsics.checkNotNullParameter(buttonOuterHorizontalPadding, "buttonOuterHorizontalPadding");
                        u50.n buttonCornerRadius = bVar.f83626k;
                        Intrinsics.checkNotNullParameter(buttonCornerRadius, "buttonCornerRadius");
                        z14 = z15;
                        f0Var = new lj1.b(buttonText, z16, overlayTopRadius, overlayBottomRadius, overlayBackgroundColor, buttonTextColor, buttonBackgroundColor, buttonInnerVerticalPadding, buttonInnerHorizontalPadding, buttonOuterHorizontalPadding, buttonCornerRadius, bVar.f83627l, bVar.f83628m, z17);
                    } else {
                        it = it4;
                        z14 = z15;
                        d0Var = d0Var2;
                    }
                    arrayList.add(f0Var);
                    it4 = it;
                    d0Var2 = d0Var;
                    z15 = z14;
                    i15 = 0;
                    i16 = 1;
                }
                return gk1.l.e(it3, arrayList, null, null, 6);
            case 5:
                final v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                if (!z15) {
                    return new fk2.f0(((ok1.d) obj2).c(board), new Callable() { // from class: ok1.c
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i18 = i16;
                            v7 board2 = board;
                            switch (i18) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(board2, "$board");
                                    u7 G1 = board2.G1();
                                    G1.q(Boolean.TRUE);
                                    return G1.a();
                                default:
                                    Intrinsics.checkNotNullParameter(board2, "$board");
                                    u7 G12 = board2.G1();
                                    G12.q(Boolean.FALSE);
                                    return G12.a();
                            }
                        }
                    }, null, 0);
                }
                ok1.d dVar = (ok1.d) obj2;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(board, "board");
                String uid = board.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                dVar.a(f1.BOARD_FOLLOW, uid);
                return new fk2.f0(dVar.f95457b.h0(board), new Callable() { // from class: ok1.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i18 = i15;
                        v7 board2 = board;
                        switch (i18) {
                            case 0:
                                Intrinsics.checkNotNullParameter(board2, "$board");
                                u7 G1 = board2.G1();
                                G1.q(Boolean.TRUE);
                                return G1.a();
                            default:
                                Intrinsics.checkNotNullParameter(board2, "$board");
                                u7 G12 = board2.G1();
                                G12.q(Boolean.FALSE);
                                return G12.a();
                        }
                    }
                }, null, 0);
            case 6:
                e((dl1.s) obj);
                return Unit.f80348a;
            case 7:
                Intrinsics.checkNotNullParameter((yl1.b) obj, "it");
                nm1.h hVar = (nm1.h) ((nm1.l) obj2);
                return new yl1.b(hVar.f91430a, false, null, hVar.f91430a, yl1.d.TRANSPARENT.getColorPalette(), null, null, null, z15 ? nm1.f1.start_container_text_button : nm1.f1.end_container_text_button, null, 742);
            case 8:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) obj2;
                int i18 = GestaltPreviewTextView.f49643g;
                gestaltPreviewTextView.getClass();
                h3 h3Var = new h3(gestaltPreviewTextView, 3);
                com.google.firebase.messaging.q qVar = gestaltPreviewTextView.f49646e;
                qVar.F(im1.m.f72668n, h3Var);
                qVar.I(im1.m.f72670p, new h3(gestaltPreviewTextView, 4));
                if (gestaltPreviewTextView.k().f122872p && z15) {
                    gm1.a aVar = (gm1.a) qVar.f33804b;
                    vn1.i iVar = (vn1.i) gestaltPreviewTextView.f49647f.f116964b;
                    if (iVar == null) {
                        Intrinsics.r("gestaltTextLinkMovementMethod");
                        throw null;
                    }
                    iVar.f126284a = aVar;
                }
                return Unit.f80348a;
            case 9:
                om1.c it5 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return om1.c.e(it5, null, null, null, (z15 && ((GestaltTextComposer) obj2).k0().f130524k) ? fm1.c.VISIBLE : fm1.c.GONE, null, false, 0, 1015);
            case 10:
                zq1.o oVar = (zq1.o) obj2;
                nx.d0 pinalytics = oVar.getPinalytics();
                h32.g0 g0Var = h32.g0.FB_RECOVER_LOGIN_FORM;
                f1 f1Var = f1.CLIENT_SIGN_IN_SUCCESS;
                Pair[] pairArr = new Pair[1];
                pairArr[0] = new Pair("method", z15 ? "google" : "password");
                nx.d0.B(pinalytics, f1Var, g0Var, null, bs1.c.o(pairArr), 20);
                oVar.f142713a.k(z15 ? vq1.d.arr_logged_in_with_google : vq1.d.change_pwd_success);
                return Unit.f80348a;
            case 11:
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) obj2;
                legoFloatingBottomNavBar.f49973u.f106352b = z15;
                bs1.c.R1(legoFloatingBottomNavBar, z15);
                return Unit.f80348a;
            case 12:
                en1.d it6 = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return en1.d.e(it6, null, null, null, false, null, null, ((q42.c) obj2) == q42.c.DROPDOWN || z15, 0, 383);
            case 13:
                vl1.p bind = (vl1.p) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                vl1.l variant = z15 ? vl1.f.f126118d : vl1.g.f126119d;
                bind.getClass();
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f126144e = variant;
                bind.f126140a = new u50.k0(z15 ? h02.e.rvc_error_message : h02.e.rvc_nothing_to_see);
                if (z15) {
                    i13 = h02.e.rvc_error_message;
                } else {
                    int i19 = r02.e0.P0;
                    i13 = ((r02.e0) obj2).d9() ? h02.e.rvc_no_violations : h02.e.rvc_no_reports;
                }
                bind.f126141b = new u50.k0(i13);
                return Unit.f80348a;
            default:
                rl1.q it7 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return rl1.q.e(it7, null, null, this.f103670j, (rl1.r) obj2, null, false, false, null, 0, null, null, 2035);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(boolean z13, Object obj, int i13) {
        super(1);
        this.f103669i = i13;
        this.f103670j = z13;
        this.f103671k = obj;
    }
}
