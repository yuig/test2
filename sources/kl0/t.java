package kl0;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c50.h9;
import c50.k6;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.BoardSectionFeed;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.boardsection.create.view.BoardSectionNameSuggestionsContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w1;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lm0.c1;
import m60.x0;
import ml0.m0;
import ml0.r0;
import o82.l0;
import om0.s0;
import om0.u0;
import qm0.j2;
import qm0.y1;
import qm0.z1;
import so.oa;
import um0.a1;
import um0.n0;
import um0.w0;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f80115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, int i13) {
        super(1);
        this.f80114i = i13;
        this.f80115j = obj;
    }

    public final l0 b(o12.b response) {
        int i13 = this.f80114i;
        int i14 = 0;
        Object obj = this.f80115j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(response, "response");
                List list = response.f92783a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof f30) {
                        arrayList.add(obj2);
                    }
                }
                km0.a aVar = (km0.a) obj;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    arrayList2.add(new lm0.c0((f30) next, aVar.f80170d, aVar.f80172f, i15, aVar.f80173g));
                    i15 = i16;
                }
                return new l0(arrayList2, response.f92784b);
            case 9:
                Intrinsics.checkNotNullParameter(response, "response");
                List list2 = response.f92783a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof ba) {
                        arrayList3.add(obj3);
                    }
                }
                km0.e eVar = (km0.e) obj;
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new lm0.f0((ba) it2.next(), eVar.f80182c, 0));
                }
                return new l0(arrayList4, response.f92784b);
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                List list3 = response.f92783a;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof f30) {
                        arrayList5.add(obj4);
                    }
                }
                sm0.j jVar = (sm0.j) obj;
                ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i17 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    arrayList6.add(new j2(i14, (f30) next2, jVar.f113262b));
                    i14 = i17;
                }
                return new l0(arrayList6, response.f92784b);
        }
    }

    public final y1 e(y1 it) {
        int i13 = this.f80114i;
        Object obj = this.f80115j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, null, null, i91.b.a(it.f104367g, false, ((qm0.x) ((qm0.z) obj)).f104353a, null, 5), false, false, null, 959);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, null, null, (i91.b) obj, false, false, null, 959);
        }
    }

    public final void f(Throwable throwable) {
        int i13 = this.f80114i;
        Object obj = this.f80115j;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ((qp.g) obj).e(throwable);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "<anonymous parameter 0>");
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().e(((ap0.i) obj).requireContext().getString(x0.oops_something_went_wrong));
                break;
        }
    }

    public final void h(l82.n start) {
        int i13 = this.f80114i;
        Object obj = this.f80115j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                r0 r0Var = (r0) obj;
                mb0.a aVar = (mb0.a) r0Var.f87497e.f63225b;
                start.a(aVar, new k6(29), aVar.a());
                tu.d0 d0Var = r0Var.f87495c;
                start.a(d0Var, new h9(0), d0Var.a());
                zy.d0 d0Var2 = r0Var.f87496d;
                start.a(d0Var2, new h9(1), d0Var2.a());
                break;
            case 7:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                jm0.a0 a0Var = (jm0.a0) obj;
                mb0.a aVar2 = (mb0.a) a0Var.f76953j.f63225b;
                start.a(aVar2, new h9(2), aVar2.a());
                l82.n.b(start, a0Var.f76947d);
                pm0.o oVar = a0Var.f76948e;
                start.a(oVar, new h9(3), oVar.a());
                p70.e eVar = a0Var.f76949f;
                start.a(eVar, new h9(4), eVar.a());
                n0 n0Var = a0Var.f76950g;
                start.a(n0Var, new h9(5), n0Var.a());
                w60.d dVar = a0Var.f76951h;
                start.a(dVar, new h9(6), dVar.a());
                zy.d0 d0Var3 = a0Var.f76952i;
                start.a(d0Var3, new h9(7), d0Var3.a());
                break;
            case 14:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                z1 z1Var = (z1) obj;
                l82.n.b(start, z1Var.f104372c);
                p70.e eVar2 = z1Var.f104373d;
                start.a(eVar2, new h9(8), eVar2.a());
                mb0.a aVar3 = (mb0.a) z1Var.f104378i.f63225b;
                start.a(aVar3, new h9(9), aVar3.a());
                zy.d0 d0Var4 = z1Var.f104374e;
                start.a(d0Var4, new h9(11), d0Var4.a());
                w60.d dVar2 = z1Var.f104375f;
                start.a(dVar2, new h9(12), dVar2.a());
                zb0.i iVar = z1Var.f104376g;
                start.a(iVar, new h9(10), iVar.a());
                k92.l lVar = z1Var.f104377h;
                start.a(lVar, new h9(13), lVar.a());
                break;
            case 21:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                vn0.n nVar = (vn0.n) obj;
                sk0.j jVar = nVar.f126267c;
                start.a(jVar, new h9(14), jVar.a());
                i60.a aVar4 = nVar.f126268d;
                start.a(aVar4, new h9(15), aVar4.a());
                p70.e eVar3 = nVar.f126269e;
                start.a(eVar3, new h9(16), eVar3.a());
                i60.a aVar5 = nVar.f126270f;
                start.a(aVar5, new h9(17), aVar5.a());
                k92.l lVar2 = nVar.f126271g;
                start.a(lVar2, new h9(18), lVar2.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                hp0.f0 f0Var = (hp0.f0) obj;
                ws.q qVar = f0Var.f69834c;
                start.a(qVar, new h9(20), qVar.a());
                w60.d dVar3 = f0Var.f69835d;
                start.a(dVar3, new h9(22), dVar3.a());
                zy.d0 a13 = f0Var.f69836e.a();
                start.a(a13, new h9(19), a13.a());
                mb0.a aVar6 = f0Var.f69837f;
                start.a(aVar6, new h9(21), aVar6.a());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 14;
        int i14 = 6;
        int i15 = this.f80114i;
        Object obj2 = this.f80115j;
        switch (i15) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = ((z) obj2).getContext();
                Spanned fromHtml = Html.fromHtml(context != null ? context.getString(y60.e.board_sensitivity_community_guidelines) : null);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 1:
                v7 board = (v7) obj;
                ol0.q qVar = (ol0.q) ((ll0.g) obj2).getView();
                Intrinsics.f(board);
                ol0.u uVar = (ol0.u) qVar;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(board, "board");
                Resources resources = uVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                dc0.o J0 = ph.a.J0(board, uVar.f96434c, resources, null, uVar.f96435d, new ka2.a(dc0.q.Default, false, false, null, false, false, false, false, null, false, false, false, false, false, 65534), null, null, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
                int i16 = eo1.b.color_background_secondary_base;
                dc0.q boardRepSize = J0.f54337a;
                Intrinsics.checkNotNullParameter(boardRepSize, "boardRepSize");
                dc0.g imageData = J0.f54338b;
                Intrinsics.checkNotNullParameter(imageData, "imageData");
                vn1.c primaryTextColor = J0.f54342f;
                Intrinsics.checkNotNullParameter(primaryTextColor, "primaryTextColor");
                String titleText = J0.f54343g;
                Intrinsics.checkNotNullParameter(titleText, "titleText");
                String primaryDescriptor = J0.f54344h;
                Intrinsics.checkNotNullParameter(primaryDescriptor, "primaryDescriptor");
                String contentDescription = J0.f54347k;
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                u50.n titleCreatorsSpacing = J0.f54349m;
                Intrinsics.checkNotNullParameter(titleCreatorsSpacing, "titleCreatorsSpacing");
                dc0.f metadataStyle = J0.f54357u;
                Intrinsics.checkNotNullParameter(metadataStyle, "metadataStyle");
                uVar.f96437f.d0(new dc0.o(boardRepSize, imageData, J0.f54339c, J0.f54340d, J0.f54341e, primaryTextColor, titleText, primaryDescriptor, J0.f54345i, J0.f54346j, contentDescription, J0.f54348l, titleCreatorsSpacing, J0.f54350n, i16, J0.f54352p, J0.f54353q, J0.f54354r, J0.f54355s, J0.f54356t, metadataStyle, J0.f54358v, J0.f54359w, J0.f54360x));
                ph.a.o(uVar.f96438g, new ol0.t(0, board));
                return Unit.f80348a;
            case 2:
                m0 it2 = (m0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return m0.b(it2, null, null, ((ml0.i) obj2).f87460a.f87503a, null, 55);
            case 3:
                h((l82.n) obj);
                return Unit.f80348a;
            case 4:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96681f = ((lm0.a) obj2).f83835e;
                return Unit.f80348a;
            case 5:
                lm0.x0 it3 = (lm0.x0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return lm0.x0.b(it3, null, null, (wa2.m) obj2, null, null, null, null, null, 1007);
            case 6:
                lm0.a it4 = (lm0.a) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                c1 filter = (c1) obj2;
                lm0.b bVar = lm0.e.f83858a;
                Intrinsics.checkNotNullParameter(filter, "filter");
                lm0.b bVar2 = lm0.d.f83855a[filter.ordinal()] == 1 ? lm0.e.f83858a : lm0.e.f83859b;
                sk0.d dVar = it4.f83838h;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(filter, "filter");
                boolean z13 = filter == c1.AllPins;
                List<sk0.a> list = dVar.f113049a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (sk0.a aVar : list) {
                    if (aVar.f113046c == sk0.c.ORGANIZE.getPosition()) {
                        aVar = sk0.a.e(aVar, z13);
                    }
                    arrayList.add(aVar);
                }
                return lm0.a.e(it4, null, null, bVar2, false, null, false, sk0.d.e(dVar, arrayList, false, 14), null, null, null, 1911);
            case 7:
                h((l82.n) obj);
                return Unit.f80348a;
            case 8:
                return b((o12.b) obj);
            case 9:
                return b((o12.b) obj);
            case 10:
                om1.p it5 = (om1.p) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof om1.l) {
                    ((s0) obj2).f96589b.invoke();
                }
                return Unit.f80348a;
            case 11:
                xl1.b it6 = (xl1.b) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (it6 instanceof xl1.a) {
                    ((u0) obj2).f96605b.invoke();
                }
                return Unit.f80348a;
            case 12:
                return e((y1) obj);
            case 13:
                return e((y1) obj);
            case 14:
                h((l82.n) obj);
                return Unit.f80348a;
            case 15:
                return b((o12.b) obj);
            case 16:
                dl0.a enabledIf = (dl0.a) obj;
                Intrinsics.checkNotNullParameter(enabledIf, "$this$enabledIf");
                ((tm0.k) obj2).f118136a.getClass();
                return Boolean.valueOf(!gi2.b.o0(enabledIf).isEmpty());
            case 17:
                w0 it7 = (w0) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return w0.b(it7, false, false, null, (a1) obj2, 23);
            case 18:
                um0.e it8 = (um0.e) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return um0.e.e(it8, (um0.z) obj2, null, null, 6);
            case 19:
                f((Throwable) obj);
                return Unit.f80348a;
            case 20:
                String suggestedName = (String) obj;
                Intrinsics.checkNotNullParameter(suggestedName, "suggestedName");
                ln0.c cVar = ((BoardSectionNameSuggestionsContainer) obj2).f45377c;
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(suggestedName, "suggestedName");
                    GestaltTextField gestaltTextField = ((rn0.e) cVar).f108832f0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("boardSectionTitleEditText");
                        throw null;
                    }
                    gestaltTextField.X(new c(suggestedName, i14));
                }
                return Unit.f80348a;
            case 21:
                h((l82.n) obj);
                return Unit.f80348a;
            case 22:
                BoardSectionFeed it9 = (BoardSectionFeed) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                List q13 = it9.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                bo0.a aVar2 = (bo0.a) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : q13) {
                    if (!Intrinsics.d(((ba) obj3).getUid(), (String) aVar2.f23603n)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 23:
                ba baVar = (ba) obj;
                co0.d dVar2 = (co0.d) obj2;
                dVar2.f28282g = baVar;
                ao0.a aVar3 = (ao0.a) dVar2.getView();
                String name = baVar.A();
                Intrinsics.checkNotNullExpressionValue(name, "getTitle(...)");
                do0.b bVar3 = (do0.b) aVar3;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Context requireContext = bVar3.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
                int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(k70.a.board_picker_content_view_margin_vertical);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                xk2.v vVar = bVar3.G0;
                com.bumptech.glide.c.a1(layoutParams, ((Number) vVar.getValue()).intValue(), dimensionPixelOffset, ((Number) vVar.getValue()).intValue(), dimensionPixelOffset);
                gestaltText.setLayoutParams(layoutParams);
                pk.a0.h1(gestaltText, eo1.a.space_100);
                bVar3.U8(gestaltText.i(new sk0.x(21, bVar3, name)));
                return Unit.f80348a;
            case 24:
                BoardFeed boardFeed = (BoardFeed) obj;
                Intrinsics.checkNotNullParameter(boardFeed, "boardFeed");
                ArrayList arrayList3 = new ArrayList();
                for (v7 v7Var : boardFeed.q()) {
                    Intrinsics.f(v7Var);
                    if (!kh2.d.A0(v7Var) && !v7Var.f1().booleanValue()) {
                        go0.c cVar2 = (go0.c) obj2;
                        if (((String) cVar2.f65831o).length() != 0) {
                            String j13 = v7Var.j1();
                            Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                            if (StringsKt.E(j13, (String) cVar2.f65831o, true)) {
                            }
                        }
                        arrayList3.add(v7Var);
                    }
                }
                if (arrayList3.isEmpty()) {
                    go0.c cVar3 = (go0.c) obj2;
                    arrayList3.add(new go0.b(j1.Y(((yk1.a) ((yk1.v) cVar3.f65834r)).f139224a.getString(e02.e.empty_state_board_picker_search_message), new Object[]{(String) cVar3.f65831o}, null, 6)));
                }
                return arrayList3;
            case 25:
                wy0 user = (wy0) obj;
                Intrinsics.f(user);
                xo0.n nVar = (xo0.n) ((uo0.b) obj2);
                nVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                GestaltAvatar gestaltAvatar = nVar.f135607c;
                kh2.m0.V0(gestaltAvatar, user);
                gestaltAvatar.H2(xo0.c.f135579n);
                String authorName = user.Z2();
                if (authorName == null) {
                    authorName = "";
                }
                Intrinsics.checkNotNullParameter(authorName, "author");
                nVar.f135609e.i(new c(authorName, 15));
                Intrinsics.checkNotNullParameter(authorName, "authorName");
                e0.t.g(gestaltAvatar, new c(authorName, i13));
                return Unit.f80348a;
            case 26:
                f((Throwable) obj);
                return Unit.f80348a;
            case 27:
                h((l82.n) obj);
                return Unit.f80348a;
            case 28:
                int i17 = gq0.d.R0;
                yq0.z zVar = (yq0.z) ((gq0.d) obj2).f139732f0;
                if (zVar != null) {
                    zVar.h();
                }
                return Unit.f80348a;
            default:
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                oo1.j jVar = oo1.j.f96854a;
                String conversationId = ((z40.n) obj2).a();
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                m60.u.f85943a.d(Navigation.z0((ScreenLocation) w1.f51512x.getValue(), conversationId));
                return Unit.f80348a;
        }
    }
}
