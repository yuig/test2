package yi0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import bs1.c;
import com.pinterest.api.model.br0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gz0;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.m40;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.wz;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.zs;
import com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView;
import com.pinterest.feature.board.grid.view.BoardGridCellImageView;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.interesttagging.view.PinInterestTagView;
import com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView;
import com.pinterest.feature.profile.boardsoftdeletion.SoftDeletionModule;
import com.pinterest.feature.shopping.shoppingstories.feed.emptystate.StructuredFeedEmptyStateView;
import com.pinterest.feature.user.board.view.MultiUserAvatarLayout;
import com.pinterest.feature.user.group.view.GroupUserImageView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import com.pinterest.reportFlow.feature.view.ReportSecondaryReasonRow;
import com.pinterest.ui.brio.reps.board.BoardGridCellTitleView;
import com.pinterest.ui.brio.view.SquareFourImageView;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.grid.TopicGridCell;
import com.pinterest.ui.imageview.WebImageView;
import dl1.s;
import e21.x;
import el0.e;
import eo1.b;
import h32.f1;
import hs1.r;
import i01.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jk.v;
import kh2.k3;
import kh2.m0;
import kh2.w;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kv0.u;
import lq0.g1;
import m60.r0;
import n02.p;
import nk1.g;
import nx.d0;
import o71.g0;
import oa2.o;
import oa2.t;
import pk.a0;
import r1.f;
import rq.m1;
import rq.s2;
import rq.t0;
import rq.t4;
import s7.z;
import so.o4;
import so.oa;
import so.r8;
import so.ra;
import so.sa;
import so.t8;
import so.z2;
import t3.s1;
import uj2.q;
import uk1.d;
import v42.k;
import vq0.h;
import w01.e0;
import x02.x2;
import yk1.j;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139067a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139068b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f139069c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar) {
        this(dVar, (x2) null);
        this.f139067a = 0;
    }

    public static HashMap i(zs zsVar) {
        HashMap hashMap = new HashMap();
        c.G1("interest", zsVar.F(), hashMap);
        c.G1("interest_id", zsVar.getUid(), hashMap);
        c.G1("recommendation_source", zsVar.E(), hashMap);
        return hashMap;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        wi0.c cVar;
        el0.c listener;
        String topicName;
        o oVar;
        SpannableStringBuilder spannableStringBuilder;
        Group group;
        String str;
        List A4;
        Object obj2;
        s21.c cVar2;
        b61.a aVar;
        g0 g0Var;
        String str2;
        String str3;
        String str4;
        ii1.a aVar2;
        p pVar;
        int i14 = this.f139067a;
        int i15 = 21;
        int i16 = 7;
        boolean z13 = false;
        Object obj3 = this.f139069c;
        Object obj4 = this.f139068b;
        switch (i14) {
            case 0:
                Object view = (vi0.d) nVar;
                vh model = (vh) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                View view2 = view instanceof View ? (View) view : null;
                if (view2 != null) {
                    m j13 = s1.j(view2);
                    if (!(j13 instanceof wi0.c)) {
                        j13 = null;
                    }
                    cVar = (wi0.c) j13;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    String uid = model.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    cVar.f130008d = uid;
                    cVar.f130009e = Integer.valueOf(i13);
                    List list = model.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        if (obj5 instanceof xk) {
                            arrayList.add(obj5);
                        }
                    }
                    cVar.f130010f = arrayList;
                    ih ihVar = model.f42857o;
                    if ((ihVar != null ? ihVar.g() : null) != null) {
                        ih ihVar2 = model.f42857o;
                        if ((ihVar2 != null ? ihVar2.e() : null) != null) {
                            ih ihVar3 = model.f42857o;
                            if ((ihVar3 != null ? ihVar3.c() : null) != null) {
                                cVar.f130011g = model.f42857o;
                            }
                        }
                    }
                    b42.c s13 = model.s();
                    if (s13 == null) {
                        s13 = b42.c.EVEN_BLOCK;
                    }
                    cVar.f130012h = s13;
                    cVar.f130013i = model.f42859q;
                    cVar.f130014j = model.u();
                    break;
                }
                break;
            case 1:
                Object view3 = (e) nVar;
                qk0.a model2 = (qk0.a) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                View view4 = view3 instanceof View ? (View) view3 : null;
                if (view4 != null) {
                    Object j14 = s1.j(view4);
                    listener = (el0.c) (!(j14 instanceof el0.c) ? null : j14);
                } else {
                    listener = null;
                }
                if (listener != null) {
                    Intrinsics.checkNotNullParameter(model2, "model");
                    if (!Intrinsics.d(listener.f59562c, model2)) {
                        listener.f59562c = model2;
                        listener.x3(model2.f104044a);
                        listener.f59564e = (int) Math.ceil(listener.d().size() / 2.0d);
                        listener.f59563d = 0;
                    }
                    d0.B(listener.getPinalytics(), f1.RENDER, h32.g0.RECOMMENDED_BOARDS, null, listener.D3(new Pair("page_board_id_list", listener.G3(0, f0.i(listener.d())))), 20);
                    listener.H3();
                    BoardMoreBoardsView boardMoreBoardsView = (BoardMoreBoardsView) view3;
                    boardMoreBoardsView.f45239h = new el0.a(listener, 1);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    boardMoreBoardsView.f45240i = listener;
                    break;
                }
                break;
            case 2:
                h((BoardGridCellLayout) nVar, (v7) obj);
                break;
            case 3:
                l11.c view5 = (l11.c) nVar;
                v7 model3 = (v7) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                view5.f81391i = model3.getUid();
                String j15 = model3.j1();
                topicName = j15 != null ? j15 : "";
                view5.f81392j = topicName;
                a0.p(view5.f81385c, topicName);
                Boolean g13 = model3.g1();
                Intrinsics.checkNotNullExpressionValue(g13, "getIsCollaborative(...)");
                boolean booleanValue = g13.booleanValue();
                Integer J0 = model3.J0();
                Intrinsics.checkNotNullExpressionValue(J0, "getCollaboratorCount(...)");
                view5.e(booleanValue, J0.intValue(), model3.I0(), model3.k1());
                view5.f81388f.g2(new bp.d(kh2.d.M0(model3), 5));
                view5.a(bp1.h.l(model3).f66450a);
                Integer q13 = model3.q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                if (q13.intValue() > 0 && !Intrinsics.d(model3.getUid(), (String) obj3)) {
                    z13 = true;
                }
                view5.g(z13);
                view5.setOnClickListener(new xa0.m(14, model3, this));
                break;
            case 4:
                Object view6 = (t) nVar;
                vo0.d model4 = (vo0.d) obj;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                View view7 = view6 instanceof View ? (View) view6 : null;
                if (view7 != null) {
                    Object j16 = s1.j(view7);
                    oVar = (o) (!(j16 instanceof o) ? null : j16);
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    oVar.t3(model4.f126392a);
                    break;
                }
                break;
            case 5:
                TopicGridCell view8 = (TopicGridCell) nVar;
                zs model5 = (zs) obj;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                String topicName2 = model5.D();
                if (topicName2 == null) {
                    topicName2 = "";
                }
                view8.getClass();
                Intrinsics.checkNotNullParameter(topicName2, "topicName");
                a0.p(view8.f52540a, topicName2);
                String D = model5.D();
                topicName = D != null ? D : "";
                Intrinsics.checkNotNullParameter(topicName, "topicName");
                a0.p(view8.f52543d, topicName);
                view8.a(model5, new g(((d) obj4).f122379a, null, model5.getUid(), i(model5), null, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER), new g1(16, this, model5));
                view8.e(v.n(model5), v.o(model5));
                view8.setOnClickListener(new xa0.m(21, this, model5));
                view8.b();
                break;
            case 6:
                PinInterestTagView view9 = (PinInterestTagView) nVar;
                m40 model6 = (m40) obj;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                String n13 = model6.n();
                if (n13 != null) {
                    view9.e(n13);
                    view9.b(false);
                    view9.a(new m1(this, model6, n13, i16));
                    break;
                }
                break;
            case 7:
                IdeaPinProductTagsItemView view10 = (IdeaPinProductTagsItemView) nVar;
                u model7 = (u) obj;
                Intrinsics.checkNotNullParameter(view10, "view");
                Intrinsics.checkNotNullParameter(model7, "model");
                String str5 = model7.f81012b;
                Object value = view10.f46552a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((WebImageView) value).loadUrl(str5);
                boolean z14 = model7.f81019i;
                if (z14) {
                    Object value2 = view10.f46552a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    Context context = view10.getContext();
                    int i17 = b.sema_color_background_wash_scrims_default;
                    Object obj6 = d5.a.f53679a;
                    ((WebImageView) value2).setColorFilter(context.getColor(i17), PorterDuff.Mode.SRC_ATOP);
                }
                wz wzVar = model7.f81015e;
                if (wzVar != null) {
                    Context context2 = view10.getContext();
                    int i18 = b.color_gray_500;
                    Object obj7 = d5.a.f53679a;
                    spannableStringBuilder = po1.c.d(wzVar, context2.getColor(i18), view10.getContext().getColor(b.color_themed_text_default), -1);
                } else {
                    spannableStringBuilder = null;
                }
                Object value3 = view10.f46554c.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((GestaltText) value3).i(new f(spannableStringBuilder, z14, 23));
                Object value4 = view10.f46556e.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((GestaltText) value4).i(new t4(model7.f81014d, z14, 13));
                Object value5 = view10.f46555d.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                int i19 = 15;
                ((GestaltText) value5).i(new t4(model7.f81013c, z14, 15));
                kv0.t tVar = model7.f81016f;
                float f13 = tVar.f81009a;
                wa2.t L = view10.L();
                L.f128939u = f13;
                L.f128941w = String.valueOf(tVar.f81010b);
                L.f128938t = 0;
                if (z14) {
                    wa2.t L2 = view10.L();
                    int i23 = IdeaPinProductTagsItemView.f46551k;
                    d7.b.A0(L2, vt1.a.s(z14).getColorRes());
                }
                xk2.v vVar = view10.f46557f;
                Object value6 = vVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((View) value6).setVisibility(f13 > 0.0f ? 0 : 8);
                Object value7 = vVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((View) value7).setBackground(view10.L());
                Object value8 = view10.f46558g.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((GestaltText) value8).i(new t4(model7.f81017g, z14, 14));
                om0.m1 clickAction = new om0.m1(19, this, model7);
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                xk2.v vVar2 = view10.f46559h;
                Object value9 = vVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((View) value9).setVisibility(model7.f81018h ? 0 : 8);
                Object value10 = vVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((View) value10).setOnClickListener(new t0(i19, clickAction));
                gv0.b action = new gv0.b(this, 2);
                Intrinsics.checkNotNullParameter(action, "action");
                view10.f46561j = action;
                Object value11 = view10.f46553b.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((GestaltText) value11).setVisibility(z14 ? 0 : 8);
                break;
            case 8:
                s2 view11 = (s2) nVar;
                u01.n model8 = (u01.n) obj;
                Intrinsics.checkNotNullParameter(view11, "view");
                Intrinsics.checkNotNullParameter(model8, "model");
                r01.c cVar3 = (r01.c) ((i) obj3);
                i01.h hVar = cVar3.f105709f;
                int i24 = c11.e.f24512a[hVar.ordinal()];
                if (i24 == 1) {
                    view11.bindData(model8.f119920d, model8.f119918b, model8.f119919c, (d0) obj4);
                } else if (i24 == 2) {
                    view11.bindData(model8.f119920d, model8.f119918b, model8.f119919c, (d0) obj4);
                    view11.b();
                } else if (i24 == 3 && (group = view11.f109541b) != null) {
                    group.setVisibility(8);
                }
                i01.g gVar = cVar3.f105710g;
                int i25 = c11.e.f24513b[gVar.ordinal()];
                if (i25 == 2) {
                    view11.f109542c = true;
                    Group group2 = view11.f109540a;
                    if (group2 != null) {
                        group2.setVisibility(0);
                    }
                } else if (i25 == 3) {
                    view11.f109542c = false;
                    Group group3 = view11.f109540a;
                    if (group3 != null) {
                        group3.setVisibility(8);
                    }
                }
                if (hVar == i01.h.COMPLETE && gVar == i01.g.COMPLETE) {
                    view11.setVisibility(8);
                    View view12 = view11.f109543d;
                    if (view12 != null) {
                        view12.setVisibility(8);
                    }
                    view11.e();
                    break;
                }
                break;
            case 9:
                z11.c view13 = (z11.c) nVar;
                gz0 model9 = (gz0) obj;
                Intrinsics.checkNotNullParameter(view13, "view");
                Intrinsics.checkNotNullParameter(model9, "model");
                wy0 wy0Var = model9.f38191d;
                String valueOf = String.valueOf(wy0Var.U2());
                wy0 f14 = ((b60.d) ((b60.b) obj3)).f();
                if (Intrinsics.d(f14 != null ? f14.getUid() : null, wy0Var.getUid())) {
                    str = ((yk1.a) ((yk1.v) obj4)).f139224a.getString(vc0.d.self_identifier);
                } else {
                    List A42 = wy0Var.A4();
                    str = (A42 == null || A42.isEmpty() || (A4 = wy0Var.A4()) == null) ? null : (String) A4.get(0);
                }
                topicName = str != null ? str : "";
                rl1.a R0 = m0.R0(wy0Var, (yk1.v) obj4, true);
                v32.a aVar3 = v32.c.Companion;
                int a13 = model9.a();
                aVar3.getClass();
                v32.c a14 = v32.a.a(a13);
                if (a14 == null) {
                    a14 = v32.c.NONE;
                }
                z11.b viewModel = new z11.b(valueOf, topicName, R0, a14, new b01.c(r11, view13, wy0Var));
                x xVar = (x) view13;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                LegoUserRep legoUserRep = xVar.f56992a;
                t.i4(legoUserRep, valueOf, 0, null, 14);
                legoUserRep.P0(topicName);
                pe.i.v1(legoUserRep.f52345e, R0);
                legoUserRep.z1(new e0(viewModel, 9));
                AppCompatImageView appCompatImageView = xVar.f56993b;
                Context context3 = xVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                appCompatImageView.setImageDrawable(w.G(context3, a14, null));
                Context context4 = xVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                appCompatImageView.setContentDescription(w.S(context4, a14));
                break;
            case 10:
                Object view14 = (r21.a) nVar;
                s model10 = (s) obj;
                Intrinsics.checkNotNullParameter(view14, "view");
                Intrinsics.checkNotNullParameter(model10, "model");
                if (model10 instanceof vh) {
                    vh vhVar = (vh) model10;
                    String uid2 = vhVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    List list2 = vhVar.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((s) obj2) instanceof wy0) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.api.model.User");
                    wy0 wy0Var2 = (wy0) obj2;
                    List list3 = vhVar.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj8 : list3) {
                        if (obj8 instanceof f30) {
                            arrayList2.add(obj8);
                        }
                    }
                    s21.a pinnerAuthorityModel = new s21.a(uid2, wy0Var2, arrayList2);
                    View view15 = view14 instanceof View ? (View) view14 : null;
                    if (view15 != null) {
                        Object j17 = s1.j(view15);
                        cVar2 = (s21.c) (!(j17 instanceof s21.c) ? null : j17);
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        Intrinsics.checkNotNullParameter(pinnerAuthorityModel, "pinnerAuthorityModel");
                        cVar2.f110721c = pinnerAuthorityModel;
                        cVar2.f110722d = Integer.valueOf(i13);
                        cVar2.q3(cVar2.f110721c);
                        break;
                    }
                }
                break;
            case 11:
                SoftDeletionModule view16 = (SoftDeletionModule) nVar;
                n31.d model11 = (n31.d) obj;
                Intrinsics.checkNotNullParameter(view16, "view");
                Intrinsics.checkNotNullParameter(model11, "model");
                String titleText = ((yk1.a) ((n31.c) obj4).f89161l).f139224a.getString(nz1.f.recently_deleted);
                Function0 ctaTapAction = ((n31.a) obj3).f89158a;
                int i26 = model11.f89163b;
                view16.getClass();
                Intrinsics.checkNotNullParameter(titleText, "titleText");
                Intrinsics.checkNotNullParameter(ctaTapAction, "ctaTapAction");
                view16.f47502a.setText(titleText);
                view16.f47503b.setText(view16.getResources().getQuantityString(nz1.e.recently_delete_column_subtitle, i26, Integer.valueOf(i26), 7));
                view16.f47504c.setOnClickListener(new t0(i15, ctaTapAction));
                break;
            case 12:
                Object view17 = (a61.a) nVar;
                vh story = (vh) obj;
                Intrinsics.checkNotNullParameter(view17, "view");
                Intrinsics.checkNotNullParameter(story, "model");
                View view18 = view17 instanceof View ? (View) view17 : null;
                if (view18 != null) {
                    Object j18 = s1.j(view18);
                    aVar = (b61.a) (!(j18 instanceof b61.a) ? null : j18);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    Intrinsics.checkNotNullParameter(story, "story");
                    aVar.f22016b = story;
                    aVar.f22017c = Integer.valueOf(i13);
                    break;
                }
                break;
            case 13:
                Object view19 = (k71.n) nVar;
                br.d model12 = (br.d) obj;
                Intrinsics.checkNotNullParameter(view19, "view");
                Intrinsics.checkNotNullParameter(model12, "model");
                View view20 = view19 instanceof View ? (View) view19 : null;
                if (view20 != null) {
                    Object j19 = s1.j(view20);
                    g0Var = (g0) (!(j19 instanceof g0) ? null : j19);
                } else {
                    g0Var = null;
                }
                if (g0Var != null) {
                    g0Var.f93294c = model12;
                    g0Var.f93296e = i13;
                    break;
                }
                break;
            case 14:
                de1.b view21 = (de1.b) nVar;
                zd1.c colorFilterItem = (zd1.c) obj;
                Intrinsics.checkNotNullParameter(view21, "view");
                Intrinsics.checkNotNullParameter(colorFilterItem, "model");
                fe1.c cVar4 = (fe1.c) view21;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(colorFilterItem, "colorFilterItem");
                cVar4.f62054e = colorFilterItem;
                String str6 = colorFilterItem.f141692c;
                if (str6 != null && (str2 = colorFilterItem.f141693d) != null && (str3 = colorFilterItem.f141694e) != null && (str4 = colorFilterItem.f141695f) != null) {
                    cVar4.f62051b.a(str6, str2, str3, str4);
                }
                ae1.a colorFilterItemUpdateListener = (ae1.a) obj4;
                Intrinsics.checkNotNullParameter(colorFilterItemUpdateListener, "colorFilterItemUpdateListener");
                cVar4.f62050a = colorFilterItemUpdateListener;
                String label = colorFilterItem.f141698i;
                Intrinsics.checkNotNullParameter(label, "label");
                a0.p(cVar4.f62052c, label);
                cVar4.setSelected(colorFilterItem.f141696g);
                zd1.c cVar5 = cVar4.f62054e;
                if (cVar5 != null) {
                    String string = cVar4.getResources().getString(mz1.g.content_description_color_filter, String.valueOf(cVar5.f141697h));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    boolean z15 = cVar5.f141696g;
                    Resources resources = cVar4.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    cVar4.setContentDescription(zd1.f.P1(z15, resources, string));
                }
                List list4 = (List) ((Function0) obj3).invoke();
                boolean L3 = list4 != null ? CollectionsKt.L(list4, colorFilterItem.f141690a) : true;
                c.R1(cVar4, L3);
                ViewGroup.LayoutParams layoutParams = cVar4.getLayoutParams();
                if (layoutParams != null) {
                    if (L3) {
                        layoutParams.height = -2;
                        break;
                    } else {
                        layoutParams.height = 0;
                        break;
                    }
                }
                break;
            case 15:
                StructuredFeedEmptyStateView view22 = (StructuredFeedEmptyStateView) nVar;
                Intrinsics.checkNotNullParameter(view22, "view");
                Intrinsics.checkNotNullParameter((br0) obj, "model");
                new z(view22, (d0) obj4, (yk1.v) obj3, true).a();
                break;
            case 16:
                Object view23 = (hi1.a) nVar;
                ih action2 = (ih) obj;
                Intrinsics.checkNotNullParameter(view23, "view");
                Intrinsics.checkNotNullParameter(action2, "model");
                View view24 = view23 instanceof View ? (View) view23 : null;
                if (view24 != null) {
                    Object j23 = s1.j(view24);
                    aVar2 = (ii1.a) (!(j23 instanceof ii1.a) ? null : j23);
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    Intrinsics.checkNotNullParameter(action2, "action");
                    aVar2.f72302c = action2;
                    aVar2.p3();
                    break;
                }
                break;
            case 17:
                ReportSecondaryReasonRow view25 = (ReportSecondaryReasonRow) nVar;
                ReportReasonData reportReasonData = (ReportReasonData) obj;
                Intrinsics.checkNotNullParameter(view25, "view");
                Intrinsics.checkNotNullParameter(reportReasonData, "reportReason");
                ReportSecondaryReasonRow reportSecondaryReasonRow = view25 instanceof View ? view25 : null;
                if (reportSecondaryReasonRow != null) {
                    j.a().getClass();
                    Object b13 = j.b(reportSecondaryReasonRow);
                    pVar = (p) (!(b13 instanceof p) ? null : b13);
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    ReportData reportData = (ReportData) obj4;
                    Intrinsics.checkNotNullParameter(view25, "view");
                    Intrinsics.checkNotNullParameter(reportReasonData, "reportReasonData");
                    Intrinsics.checkNotNullParameter(reportData, "reportData");
                    view25.f50446a = pVar;
                    Intrinsics.checkNotNullParameter(reportReasonData, "reportReasonData");
                    view25.f50447b = reportReasonData;
                    Intrinsics.checkNotNullParameter(reportData, "reportData");
                    view25.f50448c = reportData;
                    String primaryText = reportReasonData.f50417b;
                    if (primaryText != null) {
                        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                        a0.p(view25.f50449d, primaryText);
                        break;
                    }
                }
                break;
            default:
                k view26 = (k) nVar;
                f30 model13 = (f30) obj;
                Intrinsics.checkNotNullParameter(view26, "view");
                Intrinsics.checkNotNullParameter(model13, "model");
                view26.a0(((s42.k) obj3).H0(model13));
                view26.d0(new ol0.o(this, model13, 1));
                wa2.i iVar = (wa2.i) obj4;
                view26.Z(m60.f0.i0(iVar));
                com.bumptech.glide.c.n(iVar, view26, model13, i13);
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = 0;
        int i14 = this.f139067a;
        Object obj = this.f139068b;
        Object obj2 = this.f139069c;
        switch (i14) {
            case 0:
                return new wi0.c((d) obj, new ll.j(16, i13), (x2) obj2);
            case 1:
                d dVar = (d) obj;
                r8 r8Var = ((o4) obj2).f113578a;
                q qVar = (q) r8Var.f114090a.f113947u9.get();
                oa oaVar = r8Var.f114090a;
                return new el0.c(dVar, qVar, (b60.b) oaVar.f113850p0.get(), oaVar.j2(), r8Var.f114091b.e5());
            case 2:
                return new tl0.b(new tl0.a(0), new ll0.g(new wh1.a()), (g70.h) obj2);
            case 4:
                return oa2.p.a((oa2.p) obj2, (d) obj, null, null, zo0.a.f142322j, null, zo0.a.f142323k, null, null, null, null, null, false, null, 65494);
            case 10:
                t8 t8Var = ((ra) obj2).f114094a;
                return new s21.c((d) obj, (q) t8Var.f114636b.f113947u9.get(), (oa2.p) ((sa) t8Var.f114638d).D.get());
            case 12:
                return new b61.a((d) obj);
            case 13:
                return new g0((d) obj, (nu1.a) obj2);
            case 16:
                return new ii1.a((d) obj, (HashMap) obj2);
            case 17:
                r8 r8Var2 = ((z2) obj2).f114738a;
                uk1.e eVar = (uk1.e) r8Var2.f114090a.f113702ga.get();
                oa oaVar2 = r8Var2.f114090a;
                return new p(eVar, (q) oaVar2.f113947u9.get(), (a11.d) oaVar2.f113668ec.get());
            default:
                return null;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f139067a;
        switch (i14) {
            case 0:
                vh model = (vh) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 1:
                Intrinsics.checkNotNullParameter((qk0.a) obj, "model");
                break;
            case 2:
                v7 model2 = (v7) obj;
                switch (i14) {
                    case 2:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
            case 3:
                v7 model3 = (v7) obj;
                switch (i14) {
                    case 2:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        break;
                }
            case 4:
                Intrinsics.checkNotNullParameter((vo0.d) obj, "model");
                break;
            case 5:
                zs model4 = (zs) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 6:
                Intrinsics.checkNotNullParameter((m40) obj, "model");
                break;
            case 7:
                Intrinsics.checkNotNullParameter((u) obj, "model");
                break;
            case 8:
                Intrinsics.checkNotNullParameter((u01.n) obj, "model");
                break;
            case 9:
                Intrinsics.checkNotNullParameter((gz0) obj, "model");
                break;
            case 10:
                Intrinsics.checkNotNullParameter((s) obj, "model");
                break;
            case 11:
                Intrinsics.checkNotNullParameter((n31.d) obj, "model");
                break;
            case 12:
                vh model5 = (vh) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model5, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model5, "model");
                        break;
                }
            case 13:
                Intrinsics.checkNotNullParameter((br.d) obj, "model");
                break;
            case 14:
                Intrinsics.checkNotNullParameter((zd1.c) obj, "model");
                break;
            case 15:
                Intrinsics.checkNotNullParameter((br0) obj, "model");
                yk1.v vVar = (yk1.v) this.f139069c;
                break;
            case 16:
                Intrinsics.checkNotNullParameter((ih) obj, "model");
                break;
            case 17:
                Intrinsics.checkNotNullParameter((ReportReasonData) obj, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter((f30) obj, "model");
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(BoardGridCellLayout view, v7 model) {
        String str;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        ((j) this.f139068b).getClass();
        m b13 = j.b(view);
        Intrinsics.g(b13, "null cannot be cast to non-null type com.pinterest.feature.board.grid.presenter.BoardGridCellLayoutPresenter");
        tl0.b bVar = (tl0.b) b13;
        bVar.bind(view);
        bVar.f118061d = model;
        if (model != null) {
            bVar.f118062e = model.j1();
            bVar.f118063f = kh2.d.M0(model);
            wy0 B = w.B(model);
            bVar.f118065h = B != null ? B.Z2() : null;
            String uid = model.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            bVar.f118066i = uid;
            Integer l13 = model.l1();
            Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
            bVar.f118067j = l13.intValue();
            bVar.f118068k = model.a1();
            bVar.f118069l = model.b1();
            Boolean Y0 = model.Y0();
            Intrinsics.checkNotNullExpressionValue(Y0, "getHasCustomCover(...)");
            bVar.f118064g = Y0.booleanValue();
            bVar.f118070m = kh2.d.h1(model);
            sl0.b bVar2 = (sl0.b) bVar.getView();
            String str2 = bVar.f118062e;
            boolean z13 = bVar.f118063f;
            BoardGridCellTitleView boardGridCellTitleView = ((BoardGridCellLayout) bVar2).f45262a;
            a0.p(boardGridCellTitleView.f52212a, str2);
            k3.R1(boardGridCellTitleView.f52213b, z13);
            boardGridCellTitleView.setGravity(8388627);
            String str3 = bVar.f118065h;
            if (str3 != null) {
                a0.p(((BoardGridCellLayout) ((sl0.b) bVar.getView())).f45263b, str3);
            }
            ((BoardGridCellLayout) ((sl0.b) bVar.getView())).f45269h = bVar.f118066i;
            sl0.b bVar3 = (sl0.b) bVar.getView();
            int i13 = bVar.f118067j;
            BoardGridCellLayout boardGridCellLayout = (BoardGridCellLayout) bVar3;
            a0.p(boardGridCellLayout.f45264c, boardGridCellLayout.getResources().getQuantityString(le0.g.plural_pins, i13, Integer.valueOf(i13)));
            String boardId = model.getUid();
            Intrinsics.checkNotNullExpressionValue(boardId, "getUid(...)");
            String str4 = bVar.f118068k;
            String str5 = bVar.f118069l;
            boolean z14 = bVar.f118064g;
            List list = bVar.f118070m;
            tl0.a aVar = bVar.f118058a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            aVar.f118055a = str4;
            aVar.f118056b = str5;
            aVar.f118057c = list;
            boolean z15 = true;
            boolean z16 = true;
            byte b14 = 0;
            byte b15 = 0;
            boolean z17 = ((!z14 || str5 == null || str5.length() == 0) && ((str = aVar.f118055a) == null || str.length() == 0)) ? false : true;
            ((BoardGridCellImageView) ((sl0.a) aVar.getView())).f45258o = z17;
            if (z17) {
                String str6 = aVar.f118055a;
                String str7 = (str6 == null || str6.length() == 0) ? aVar.f118056b : aVar.f118055a;
                if (str7 != null) {
                    BoardGridCellImageView boardGridCellImageView = (BoardGridCellImageView) ((sl0.a) aVar.getView());
                    if (!a0.N(boardGridCellImageView.f45257n, str7)) {
                        ((hs1.m) hs1.t.a()).h(boardGridCellImageView.f45256m);
                        boardGridCellImageView.f45256m.f(null);
                        qa2.c cVar = boardGridCellImageView.f45256m;
                        cVar.f103239h = null;
                        cVar.f103242k = null;
                        boardGridCellImageView.f45257n = null;
                        boardGridCellImageView.getViewTreeObserver().removeOnPreDrawListener(boardGridCellImageView);
                        boardGridCellImageView.f45257n = str7;
                        boardGridCellImageView.m();
                    }
                }
            }
            List list2 = aVar.f118057c;
            if (list2 != null) {
                SquareFourImageView squareFourImageView = (SquareFourImageView) ((sl0.a) aVar.getView());
                List list3 = squareFourImageView.f52237k;
                if (list3 != null && list3.containsAll(list2) && list2.containsAll(squareFourImageView.f52237k)) {
                    squareFourImageView.f52237k = list2;
                } else {
                    squareFourImageView.f52237k = list2;
                    if (list2.isEmpty()) {
                        squareFourImageView.k();
                    } else {
                        squareFourImageView.k();
                        squareFourImageView.j();
                    }
                }
            }
            ll0.g gVar = bVar.f118059b;
            gVar.f83822c = model;
            List I0 = model.I0();
            wy0 k13 = model.k1();
            int i14 = 11;
            if (qb0.b.o(I0) || !kh2.d.e1(model)) {
                if (k13 != null) {
                    MultiUserAvatarLayout multiUserAvatarLayout = (MultiUserAvatarLayout) ((th1.a) gVar.getView());
                    k3.R1(multiUserAvatarLayout.f48969c, false);
                    multiUserAvatarLayout.f48967a.H2(new bp.d(z15, i14));
                    if (dl2.b.o1(k13)) {
                        final String M0 = dl2.b.M0(k13);
                        final String uid2 = k13.getUid();
                        GestaltAvatar gestaltAvatar = multiUserAvatarLayout.f48967a;
                        final byte b16 = b14 == true ? 1 : 0;
                        gestaltAvatar.H2(new Function1() { // from class: uh1.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i15 = b16;
                                String str8 = uid2;
                                switch (i15) {
                                    case 0:
                                        rl1.q displayState = (rl1.q) obj;
                                        int i16 = MultiUserAvatarLayout.f48966d;
                                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                                        String str9 = displayState.f108647a;
                                        String name = M0;
                                        Intrinsics.checkNotNullParameter(name, "name");
                                        rl1.e backgroundColor = new rl1.e(str8);
                                        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                                        return new rl1.q(str9, name, displayState.f108649c, displayState.f108650d, displayState.f108651e, displayState.f108652f, displayState.f108653g, displayState.f108654h, displayState.f108655i, backgroundColor, displayState.f108657k);
                                    default:
                                        rl1.q displayState2 = (rl1.q) obj;
                                        int i17 = MultiUserAvatarLayout.f48966d;
                                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                                        String str10 = displayState2.f108647a;
                                        String imageUrl = M0;
                                        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                                        rl1.e backgroundColor2 = new rl1.e(str8);
                                        Intrinsics.checkNotNullParameter(backgroundColor2, "backgroundColor");
                                        return new rl1.q(imageUrl, displayState2.f108648b, displayState2.f108649c, displayState2.f108650d, displayState2.f108651e, displayState2.f108652f, displayState2.f108653g, displayState2.f108654h, displayState2.f108655i, backgroundColor2, displayState2.f108657k);
                                }
                            }
                        });
                        return;
                    }
                    String n33 = k13.n3();
                    String k33 = k13.k3();
                    String l33 = k13.l3();
                    final String uid3 = k13.getUid();
                    re0.a imageSize = re0.a.MEDIUM;
                    Intrinsics.checkNotNullParameter(imageSize, "imageSize");
                    final String B2 = imageSize.compareTo(re0.a.LARGE_USE_LAYOUT_PARAMS) > 0 ? m0.B(n33, k33, l33) : imageSize.compareTo(re0.a.MEDIUM_USE_LAYOUT_PARAMS) > 0 ? m0.B(k33, n33, l33) : m0.B(l33, k33, n33);
                    GestaltAvatar gestaltAvatar2 = multiUserAvatarLayout.f48967a;
                    final boolean z18 = z16 ? 1 : 0;
                    gestaltAvatar2.H2(new Function1() { // from class: uh1.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i15 = z18;
                            String str8 = uid3;
                            switch (i15) {
                                case 0:
                                    rl1.q displayState = (rl1.q) obj;
                                    int i16 = MultiUserAvatarLayout.f48966d;
                                    Intrinsics.checkNotNullParameter(displayState, "displayState");
                                    String str9 = displayState.f108647a;
                                    String name = B2;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    rl1.e backgroundColor = new rl1.e(str8);
                                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                                    return new rl1.q(str9, name, displayState.f108649c, displayState.f108650d, displayState.f108651e, displayState.f108652f, displayState.f108653g, displayState.f108654h, displayState.f108655i, backgroundColor, displayState.f108657k);
                                default:
                                    rl1.q displayState2 = (rl1.q) obj;
                                    int i17 = MultiUserAvatarLayout.f48966d;
                                    Intrinsics.checkNotNullParameter(displayState2, "displayState");
                                    String str10 = displayState2.f108647a;
                                    String imageUrl = B2;
                                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                                    rl1.e backgroundColor2 = new rl1.e(str8);
                                    Intrinsics.checkNotNullParameter(backgroundColor2, "backgroundColor");
                                    return new rl1.q(imageUrl, displayState2.f108648b, displayState2.f108649c, displayState2.f108650d, displayState2.f108651e, displayState2.f108652f, displayState2.f108653g, displayState2.f108654h, displayState2.f108655i, backgroundColor2, displayState2.f108657k);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList(I0.size() + 1);
            if (k13 != null) {
                arrayList.add(k13);
            }
            arrayList.addAll(I0);
            MultiUserAvatarLayout multiUserAvatarLayout2 = (MultiUserAvatarLayout) ((th1.a) gVar.getView());
            ViewGroup.LayoutParams layoutParams = multiUserAvatarLayout2.f48969c.getLayoutParams();
            int min = Math.min(layoutParams.width, layoutParams.height);
            layoutParams.width = min;
            layoutParams.height = min;
            multiUserAvatarLayout2.f48969c.setLayoutParams(layoutParams);
            multiUserAvatarLayout2.f48969c.postInvalidate();
            multiUserAvatarLayout2.f48967a.H2(new bp.d(b15 == true ? 1 : 0, i14));
            k3.R1(multiUserAvatarLayout2.f48969c, true);
            wh1.a presenter = (wh1.a) gVar.f83821b;
            GroupUserImageView groupUserImageView = (GroupUserImageView) ((vh1.a) presenter.getView());
            int i15 = 0;
            while (true) {
                Bitmap[] bitmapArr = groupUserImageView.f48971b;
                if (i15 >= bitmapArr.length) {
                    break;
                }
                bitmapArr[i15] = null;
                i15++;
            }
            int i16 = 0;
            while (true) {
                hs1.a[] aVarArr = groupUserImageView.f48970a;
                if (i16 >= aVarArr.length) {
                    break;
                }
                if (aVarArr[i16] != null) {
                    ((hs1.m) hs1.t.a()).h(groupUserImageView.f48970a[i16]);
                    groupUserImageView.f48970a[i16] = null;
                }
                i16++;
            }
            int i17 = 0;
            while (true) {
                Rect[] rectArr = groupUserImageView.f48974e;
                if (i17 >= rectArr.length) {
                    break;
                }
                rectArr[i17].setEmpty();
                i17++;
            }
            groupUserImageView.f48976g.setEmpty();
            groupUserImageView.requestLayout();
            presenter.f129918a.clear();
            ((GroupUserImageView) ((vh1.a) presenter.getView())).f48985p = 0;
            presenter.f129918a = arrayList;
            ((GroupUserImageView) ((vh1.a) presenter.getView())).f48985p = presenter.f129918a.size();
            ((GroupUserImageView) ((vh1.a) presenter.getView())).f48984o = Math.min(presenter.f129918a.size(), 3);
            int min2 = Math.min(presenter.f129918a.size(), 3);
            for (int i18 = 0; i18 < min2; i18++) {
                wy0 wy0Var = (wy0) presenter.f129918a.get(i18);
                if (dl2.b.o1(wy0Var)) {
                    String M02 = dl2.b.M0(wy0Var);
                    GroupUserImageView groupUserImageView2 = (GroupUserImageView) ((vh1.a) presenter.getView());
                    int dimensionPixelSize = groupUserImageView2.getResources().getDimensionPixelSize(r0.thumbnail_large_size);
                    Bitmap[] bitmapArr2 = groupUserImageView2.f48971b;
                    Context context = groupUserImageView2.getContext();
                    tn1.c textPaint = groupUserImageView2.f48981l;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                    try {
                        bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.RGB_565);
                        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
                        Canvas canvas = new Canvas(bitmap);
                        canvas.drawColor(c.A(context, b.color_themed_light_gray));
                        if (M02 != null && !kotlin.text.z.j(M02)) {
                            float f13 = dimensionPixelSize / 2.0f;
                            canvas.drawText(M02, f13, f13 - ((textPaint.descent() + textPaint.ascent()) / 2), textPaint);
                        }
                    } catch (OutOfMemoryError e13) {
                        HashSet hashSet = tb0.h.f117076w;
                        tb0.g.f117075a.q(e13, "Out of memory", tb0.p.PIN_BUILDER);
                        bitmap = null;
                    }
                    bitmapArr2[i18] = bitmap;
                } else {
                    String s03 = dl2.b.s0(wy0Var);
                    Intrinsics.checkNotNullParameter(presenter, "presenter");
                    xh1.a aVar2 = new xh1.a();
                    aVar2.f134983b = new WeakReference(presenter);
                    aVar2.f134982a = s03;
                    GroupUserImageView groupUserImageView3 = (GroupUserImageView) ((vh1.a) presenter.getView());
                    groupUserImageView3.f48970a[i18] = aVar2;
                    hs1.q a13 = hs1.t.a();
                    hs1.a aVar3 = groupUserImageView3.f48970a[i18];
                    Bitmap.Config config = r.f70066d;
                    ((r) a13).e(aVar3, s03, null, true, 0, 0, Boolean.FALSE, null, false);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        this(dVar, (Function1) null);
        this.f139067a = 5;
    }

    public a(int i13, Object obj, Object obj2) {
        this.f139067a = i13;
        this.f139068b = obj;
        this.f139069c = obj2;
    }

    public a(ae1.a colorFilterItemUpdateListener, de1.u getRules) {
        this.f139067a = 14;
        Intrinsics.checkNotNullParameter(colorFilterItemUpdateListener, "colorFilterItemUpdateListener");
        Intrinsics.checkNotNullParameter(getRules, "getRules");
        this.f139068b = colorFilterItemUpdateListener;
        this.f139069c = getRules;
    }

    public a(go0.a listener, String str) {
        this.f139067a = 3;
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f139068b = listener;
        this.f139069c = str;
    }

    public a(jv0.o listener) {
        this.f139067a = 7;
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f139068b = listener;
        this.f139069c = s1.h("create(...)");
    }

    public a(d0 pinalytics, r01.c loadingGridStateProvider) {
        this.f139067a = 8;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(loadingGridStateProvider, "loadingGridStateProvider");
        this.f139068b = pinalytics;
        this.f139069c = loadingGridStateProvider;
    }

    public a(d0 pinalytics, yk1.v viewResources) {
        this.f139067a = 15;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f139068b = pinalytics;
        this.f139069c = viewResources;
    }

    public a(d pinalytics, HashMap auxData) {
        this.f139067a = 16;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f139068b = pinalytics;
        this.f139069c = auxData;
    }

    public a(d presenterPinalytics, Function1 function1) {
        this.f139067a = 5;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f139068b = presenterPinalytics;
        this.f139069c = function1;
    }

    public a(d presenterPinalytics, nu1.a inAppNavigator) {
        this.f139067a = 13;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f139068b = presenterPinalytics;
        this.f139069c = inAppNavigator;
    }

    public a(d pinalytics, oa2.p legoUserRepPresenterFactory) {
        this.f139067a = 4;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f139068b = pinalytics;
        this.f139069c = legoUserRepPresenterFactory;
    }

    public a(d presenterAnalytics, o4 boardMoreBoardsPresenterFactory) {
        this.f139067a = 1;
        Intrinsics.checkNotNullParameter(presenterAnalytics, "presenterAnalytics");
        Intrinsics.checkNotNullParameter(boardMoreBoardsPresenterFactory, "boardMoreBoardsPresenterFactory");
        this.f139068b = presenterAnalytics;
        this.f139069c = boardMoreBoardsPresenterFactory;
    }

    public a(d pinalytics, ra pinnerAuthorityPresenterFactory) {
        this.f139067a = 10;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinnerAuthorityPresenterFactory, "pinnerAuthorityPresenterFactory");
        this.f139068b = pinalytics;
        this.f139069c = pinnerAuthorityPresenterFactory;
    }

    public a(d presenterPinalytics, x2 x2Var) {
        this.f139067a = 0;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f139068b = presenterPinalytics;
        this.f139069c = x2Var;
    }

    public a(d presenterPinalytics, yk1.v viewResources) {
        this.f139067a = 12;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f139068b = presenterPinalytics;
        this.f139069c = viewResources;
    }

    public a(wa2.i pinFeatureConfig, s42.k selectPinsListener) {
        this.f139067a = 18;
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(selectPinsListener, "selectPinsListener");
        this.f139068b = pinFeatureConfig;
        this.f139069c = selectPinsListener;
    }

    public a(xu0.b tagSelectListener, du0.b presenterPinalytics) {
        this.f139067a = 6;
        Intrinsics.checkNotNullParameter(tagSelectListener, "tagSelectListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f139069c = tagSelectListener;
        this.f139068b = presenterPinalytics;
    }

    public a(yk1.a viewResources, b60.b activeUserManager) {
        this.f139067a = 9;
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f139068b = viewResources;
        this.f139069c = activeUserManager;
    }

    public a(j mvpBinder, g70.h boardNavigator) {
        this.f139067a = 2;
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f139068b = mvpBinder;
        this.f139069c = boardNavigator;
    }
}
