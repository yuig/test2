package cp;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.pinterest.activity.conversation.view.BoardInviteInboxContainer;
import com.pinterest.activity.conversation.view.GroupUserImageViewV2;
import com.pinterest.activity.user.UserImageView;
import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import com.pinterest.ui.brio.view.TitleListCell;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.listview.ListCellBasic;
import com.pinterest.ui.text.DescriptionEditView;
import df.j1;
import h32.g0;
import h32.u0;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import m60.x0;
import u50.f0;
import u50.i0;
import u50.k0;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52935b;

    public /* synthetic */ i(Object obj, int i13) {
        this.f52934a = i13;
        this.f52935b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i13 = this.f52934a;
        final int i14 = 1;
        final int i15 = 0;
        Object obj3 = this.f52935b;
        switch (i13) {
            case 0:
                yl1.b displayState = (yl1.b) obj;
                int i16 = n.f52942w0;
                ((n) obj3).getClass();
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f139300a;
                k0 text = bs1.c.j2(new String[0], x0.next);
                Intrinsics.checkNotNullParameter(text, "text");
                return new yl1.b(text, !r9.f52958p0.isEmpty(), displayState.f139302c, displayState.f139303d, displayState.f139304e, displayState.f139305f, displayState.f139306g, displayState.f139307h, displayState.f139308i, displayState.f139309j);
            case 1:
                BoardInviteInboxContainer boardInviteInboxContainer = (BoardInviteInboxContainer) obj3;
                int i17 = BoardInviteInboxContainer.f34855g;
                boardInviteInboxContainer.removeAllViews();
                List<k8> q13 = ((BoardInviteFeed) obj).q();
                boardInviteInboxContainer.f34859d.h("PREF_NUM_BOARD_INVITES", q13.size());
                if (q13.isEmpty()) {
                    boardInviteInboxContainer.setVisibility(8);
                } else {
                    boardInviteInboxContainer.setVisibility(0);
                    for (k8 k8Var : q13) {
                        View inflate = View.inflate(boardInviteInboxContainer.getContext(), nb2.c.list_cell_conversation_lego_inbox_board_invite_row, null);
                        final lp.i iVar = new lp.i(inflate, boardInviteInboxContainer.f34860e);
                        if (k8Var != null) {
                            wy0 wy0Var = (wy0) iVar.C.O(k8Var.f39331a);
                            x02.x0 x0Var = iVar.D;
                            String str = k8Var.f39332b;
                            final v7 v7Var = (v7) x0Var.O(str);
                            if (wy0Var != null && v7Var != null && !pk.a0.x0(wy0Var.Z2()) && !pk.a0.x0(v7Var.j1())) {
                                inflate.setTag(str);
                                inflate.setOnClickListener(new View.OnClickListener() { // from class: lp.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i18 = i15;
                                        v7 board = v7Var;
                                        i this$0 = iVar;
                                        switch (i18) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                this$0.getClass();
                                                this$0.E.b0(u0.NEWS_FEED_BOARD, g0.NEWS_FEED, board.getId(), false);
                                                g70.h.f(this$0.f84215u, board, null, 6);
                                                break;
                                            default:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                this$0.getClass();
                                                this$0.E.b0(u0.NEWS_FEED_BOARD, g0.NEWS_FEED, board.getId(), false);
                                                g70.h.f(this$0.f84215u, board, null, 6);
                                                break;
                                        }
                                    }
                                });
                                iVar.f84220z.e(new gm1.a() { // from class: lp.g
                                    @Override // gm1.a
                                    public final void h3(gm1.c it) {
                                        int i18 = i15;
                                        v7 board = v7Var;
                                        i this$0 = iVar;
                                        switch (i18) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                gi.m mVar = this$0.B;
                                                String id3 = board.getId();
                                                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                                                mVar.b(id3);
                                                break;
                                            default:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                gi.m mVar2 = this$0.B;
                                                String string = this$0.f19717a.getContext().getResources().getString(x0.board_invite_declined_msg);
                                                String id4 = board.getId();
                                                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                                                mVar2.C(string, id4);
                                                break;
                                        }
                                    }
                                });
                                iVar.A.e(new gm1.a() { // from class: lp.g
                                    @Override // gm1.a
                                    public final void h3(gm1.c it) {
                                        int i18 = i14;
                                        v7 board = v7Var;
                                        i this$0 = iVar;
                                        switch (i18) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                gi.m mVar = this$0.B;
                                                String id3 = board.getId();
                                                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                                                mVar.b(id3);
                                                break;
                                            default:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                gi.m mVar2 = this$0.B;
                                                String string = this$0.f19717a.getContext().getResources().getString(x0.board_invite_declined_msg);
                                                String id4 = board.getId();
                                                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                                                mVar2.C(string, id4);
                                                break;
                                        }
                                    }
                                });
                                WebImageView webImageView = iVar.f84216v;
                                webImageView.k2(true);
                                Context context = inflate.getContext();
                                int i18 = s0.dimming_layer_light;
                                Object obj4 = d5.a.f53679a;
                                webImageView.setForeground(context.getDrawable(i18));
                                webImageView.setBackgroundColor(inflate.getContext().getColor(eo1.b.color_themed_light_gray));
                                String a13 = v7Var.a1();
                                if (a13 == null) {
                                    a13 = v7Var.b1();
                                }
                                webImageView.loadUrl(a13);
                                webImageView.setOnClickListener(new View.OnClickListener() { // from class: lp.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i182 = i14;
                                        v7 board = v7Var;
                                        i this$0 = iVar;
                                        switch (i182) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                this$0.getClass();
                                                this$0.E.b0(u0.NEWS_FEED_BOARD, g0.NEWS_FEED, board.getId(), false);
                                                g70.h.f(this$0.f84215u, board, null, 6);
                                                break;
                                            default:
                                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                Intrinsics.checkNotNullParameter(board, "$board");
                                                this$0.getClass();
                                                this$0.E.b0(u0.NEWS_FEED_BOARD, g0.NEWS_FEED, board.getId(), false);
                                                g70.h.f(this$0.f84215u, board, null, 6);
                                                break;
                                        }
                                    }
                                });
                                Date date = k8Var.createdAt;
                                String Z2 = wy0Var.Z2();
                                if (Z2 == null && (Z2 = wy0Var.z4()) == null) {
                                    Z2 = "";
                                }
                                pk.a0.p(iVar.f84217w, Z2);
                                CharSequence a03 = j1.a0(inflate.getContext().getString(x0.board_invite_description_simple, v7Var.j1()));
                                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                                pk.a0.q(iVar.f84218x, bs1.c.h2(a03));
                                kp.n m03 = kp.n.m0();
                                Context context2 = inflate.getContext();
                                Locale locale = Locale.getDefault();
                                Boolean bool = Boolean.FALSE;
                                m03.getClass();
                                String i03 = kp.n.i0(context2, date, locale, bool);
                                Intrinsics.checkNotNullExpressionValue(i03, "formatTimestamp(...)");
                                pk.a0.p(iVar.f84219y, i03);
                            }
                        }
                        boardInviteInboxContainer.addView(inflate);
                    }
                    m60.u.f85943a.d(new hc.m(boardInviteInboxContainer.getChildCount(), i15));
                }
                return Unit.f80348a;
            case 2:
                rl1.r size = (rl1.r) obj3;
                rl1.q displayState2 = (rl1.q) obj;
                int i19 = GroupUserImageViewV2.f34882b;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                String str2 = displayState2.f108647a;
                Intrinsics.checkNotNullParameter(size, "size");
                return new rl1.q(str2, displayState2.f108648b, displayState2.f108649c, size, displayState2.f108651e, displayState2.f108652f, displayState2.f108653g, displayState2.f108654h, displayState2.f108655i, displayState2.f108656j, displayState2.f108657k);
            case 3:
                cr.b bVar = (cr.b) obj3;
                rn1.a displayState3 = (rn1.a) obj;
                int i23 = cr.b.f53064g;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                i0 i0Var2 = displayState3.f108849g;
                f0 text2 = bs1.c.h2(bVar.f53069b.f41279b);
                Intrinsics.checkNotNullParameter(text2, "text");
                return new rn1.a(text2, displayState3.f108850h, displayState3.f108851i, displayState3.f108852j, displayState3.f108853k, displayState3.f108854l, displayState3.f108855m, displayState3.f108856n, displayState3.f108857o, displayState3.f108858p, displayState3.f108859q, displayState3.f108860r, displayState3.f108861s, displayState3.f108862t, displayState3.f108863u, displayState3.f108864v, displayState3.f108865w, displayState3.f108866x, displayState3.f108867y, displayState3.f108868z, displayState3.A);
            case 4:
                dr.k kVar = (dr.k) obj3;
                rn1.a displayState4 = (rn1.a) obj;
                int i24 = dr.k.H;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                i0 i0Var3 = displayState4.f108849g;
                k0 text3 = bs1.c.j2(new String[0], kVar.f56192g);
                Intrinsics.checkNotNullParameter(text3, "text");
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                vn1.c color = vn1.c.SUBTLE;
                Intrinsics.checkNotNullParameter(color, "color");
                return new rn1.a(text3, color, displayState4.f108851i, displayState4.f108852j, displayState4.f108853k, displayState4.f108854l, visibility, displayState4.f108856n, displayState4.f108857o, displayState4.f108858p, displayState4.f108859q, displayState4.f108860r, displayState4.f108861s, displayState4.f108862t, displayState4.f108863u, displayState4.f108864v, displayState4.f108865w, displayState4.f108866x, displayState4.f108867y, displayState4.f108868z, displayState4.A);
            case 5:
                lr.b bVar2 = (lr.b) obj3;
                do1.d displayState5 = (do1.d) obj;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                i0 i0Var4 = displayState5.f55665a;
                f0 text4 = bs1.c.h2(bVar2.f84476e);
                Intrinsics.checkNotNullParameter(text4, "text");
                String str3 = bVar2.f84477f;
                return new do1.d(text4, str3 != null ? new do1.j(str3) : null, displayState5.f55667c, displayState5.f55668d, displayState5.f55669e, displayState5.f55670f, displayState5.f55671g, displayState5.f55672h, displayState5.f55673i);
            case 6:
                rn1.a displayState6 = (rn1.a) obj;
                int i25 = UserImageView.f35215k;
                Intrinsics.checkNotNullParameter(displayState6, "displayState");
                i0 i0Var5 = displayState6.f108849g;
                f0 text5 = bs1.c.h2(((wy0) obj3).Z2());
                Intrinsics.checkNotNullParameter(text5, "text");
                return new rn1.a(text5, displayState6.f108850h, displayState6.f108851i, displayState6.f108852j, displayState6.f108853k, displayState6.f108854l, displayState6.f108855m, displayState6.f108856n, displayState6.f108857o, displayState6.f108858p, displayState6.f108859q, displayState6.f108860r, displayState6.f108861s, displayState6.f108862t, displayState6.f108863u, displayState6.f108864v, displayState6.f108865w, displayState6.f108866x, displayState6.f108867y, displayState6.f108868z, displayState6.A);
            case 7:
                i0 text6 = (i0) obj3;
                yl1.b displayState7 = (yl1.b) obj;
                int i26 = oo0.c.f96805j;
                Intrinsics.checkNotNullParameter(displayState7, "displayState");
                i0 i0Var6 = displayState7.f139300a;
                Intrinsics.checkNotNullParameter(text6, "text");
                return new yl1.b(text6, displayState7.f139301b, displayState7.f139302c, displayState7.f139303d, displayState7.f139304e, displayState7.f139305f, displayState7.f139306g, displayState7.f139307h, displayState7.f139308i, displayState7.f139309j);
            case 8:
                em1.b checkedState = (em1.b) obj3;
                em1.d displayState8 = (em1.d) obj;
                int i27 = oo0.c.f96805j;
                Intrinsics.checkNotNullParameter(displayState8, "displayState");
                em1.b bVar3 = displayState8.f59598a;
                Intrinsics.checkNotNullParameter(checkedState, "checkedState");
                return new em1.d(checkedState, displayState8.f59599b, displayState8.f59600c, displayState8.f59601d, displayState8.f59602e, displayState8.f59603f, displayState8.f59604g, displayState8.f59605h, displayState8.f59606i, displayState8.f59607j);
            case 9:
                vr0.c cVar = (vr0.c) obj3;
                vd0.c cVar2 = (vd0.c) obj;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                vd0.c m13 = cVar2.m("data");
                if (m13 != null) {
                    Iterator it = m13.l().values().iterator();
                    while (it.hasNext()) {
                        cVar.f126454a.c(rg0.n.f((vd0.c) it.next()));
                    }
                }
                return Unit.f80348a;
            case 10:
                vn1.c color2 = (vn1.c) obj3;
                rn1.a displayState9 = (rn1.a) obj;
                int i28 = PinnerGridCell.f52214n;
                Intrinsics.checkNotNullParameter(displayState9, "displayState");
                i0 i0Var7 = displayState9.f108849g;
                Intrinsics.checkNotNullParameter(color2, "color");
                return new rn1.a(i0Var7, color2, displayState9.f108851i, displayState9.f108852j, displayState9.f108853k, displayState9.f108854l, displayState9.f108855m, displayState9.f108856n, displayState9.f108857o, displayState9.f108858p, displayState9.f108859q, displayState9.f108860r, displayState9.f108861s, displayState9.f108862t, displayState9.f108863u, displayState9.f108864v, displayState9.f108865w, displayState9.f108866x, displayState9.f108867y, displayState9.f108868z, displayState9.A);
            case 11:
                rn1.a displayState10 = (rn1.a) obj;
                int i29 = TitleListCell.f52239b;
                Intrinsics.checkNotNullParameter(displayState10, "displayState");
                i0 i0Var8 = displayState10.f108849g;
                f0 text7 = bs1.c.h2((Spanned) obj3);
                Intrinsics.checkNotNullParameter(text7, "text");
                return new rn1.a(text7, displayState10.f108850h, displayState10.f108851i, displayState10.f108852j, displayState10.f108853k, displayState10.f108854l, displayState10.f108855m, displayState10.f108856n, displayState10.f108857o, displayState10.f108858p, true, displayState10.f108860r, displayState10.f108861s, displayState10.f108862t, displayState10.f108863u, displayState10.f108864v, displayState10.f108865w, displayState10.f108866x, displayState10.f108867y, displayState10.f108868z, displayState10.A);
            case 12:
                ListCellBasic listCellBasic = (ListCellBasic) obj3;
                rn1.a displayState11 = (rn1.a) obj;
                int i33 = ListCellBasic.f52579g;
                listCellBasic.getClass();
                Intrinsics.checkNotNullParameter(displayState11, "displayState");
                i0 i0Var9 = displayState11.f108849g;
                List style = Collections.singletonList(listCellBasic.f52585f ? vn1.e.REGULAR : vn1.e.BOLD);
                Intrinsics.checkNotNullParameter(style, "style");
                return new rn1.a(i0Var9, displayState11.f108850h, displayState11.f108851i, style, displayState11.f108853k, displayState11.f108854l, displayState11.f108855m, displayState11.f108856n, displayState11.f108857o, displayState11.f108858p, displayState11.f108859q, displayState11.f108860r, displayState11.f108861s, displayState11.f108862t, displayState11.f108863u, displayState11.f108864v, displayState11.f108865w, displayState11.f108866x, displayState11.f108867y, displayState11.f108868z, displayState11.A);
            case 13:
                fm1.c visibility2 = (fm1.c) obj3;
                jm1.b displayState12 = (jm1.b) obj;
                int i34 = ListCellBasic.f52579g;
                Intrinsics.checkNotNullParameter(displayState12, "displayState");
                fm1.c cVar3 = displayState12.f77020a;
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                return new jm1.b(visibility2, displayState12.f77021b, displayState12.f77022c, displayState12.f77023d, displayState12.f77024e, displayState12.f77025f, displayState12.f77026g);
            case 14:
                rn1.a displayState13 = (rn1.a) obj;
                int i35 = ListCellBasic.f52579g;
                Intrinsics.checkNotNullParameter(displayState13, "displayState");
                i0 i0Var10 = displayState13.f108849g;
                rn1.b ellipsize = rn1.b.END;
                Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
                return new rn1.a(i0Var10, displayState13.f108850h, displayState13.f108851i, displayState13.f108852j, displayState13.f108853k, ((Integer) obj3).intValue(), displayState13.f108855m, ellipsize, displayState13.f108857o, displayState13.f108858p, displayState13.f108859q, displayState13.f108860r, displayState13.f108861s, vn1.g.BODY_100, vn1.g.BODY_300, displayState13.f108864v, displayState13.f108865w, displayState13.f108866x, displayState13.f108867y, displayState13.f108868z, displayState13.A);
            case 15:
                DescriptionEditView descriptionEditView = (DescriptionEditView) obj3;
                ao1.b displayState14 = (ao1.b) obj;
                int i36 = DescriptionEditView.f52649e;
                descriptionEditView.getClass();
                Intrinsics.checkNotNullParameter(displayState14, "displayState");
                i0 i0Var11 = displayState14.f20030a;
                f0 text8 = bs1.c.h2(pk.a0.p1(descriptionEditView.f52650d.z0().toString()));
                Intrinsics.checkNotNullParameter(text8, "text");
                return new ao1.b(text8, displayState14.f20031b, displayState14.f20032c, displayState14.f20033d, displayState14.f20034e, displayState14.f20035f, displayState14.f20036g, displayState14.f20037h, displayState14.f20038i, displayState14.f20039j, displayState14.f20040k, displayState14.f20041l, displayState14.f20042m, displayState14.f20043n, displayState14.f20044o, displayState14.f20045p, displayState14.f20046q, displayState14.f20047r, displayState14.f20048s, displayState14.f20049t, displayState14.f20050u, displayState14.f20051v);
            case 16:
                qh2.g gVar = (qh2.g) obj3;
                gVar.a((byte[]) obj);
                gVar.l();
                return null;
            case 17:
                Function1 function1 = (Function1) obj3;
                Throwable th3 = (Throwable) obj;
                int i37 = ho2.g.f69760a;
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    Throwable th4 = (Throwable) function1.invoke(th3);
                    boolean d2 = Intrinsics.d(th3.getMessage(), th4.getMessage());
                    obj2 = th4;
                    if (!d2) {
                        boolean d13 = Intrinsics.d(th4.getMessage(), th3.toString());
                        obj2 = th4;
                        if (!d13) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th5) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    obj2 = ue.c.m(th5);
                }
                return (Throwable) (obj2 instanceof xk2.r ? null : obj2);
            default:
                ((xj2.c) obj3).dispose();
                return Unit.f80348a;
        }
    }
}
