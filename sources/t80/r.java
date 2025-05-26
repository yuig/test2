package t80;

import android.content.Context;
import android.widget.ImageView;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.collage.cutoutcloseup.remoterequest.CollagesCarouselCutoutRelatedModulesPagedRemoteRequest;
import com.pinterest.component.avatarpairs.AvatarPairUpdate;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.u0;
import i2.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l7.w0;
import m60.x0;
import m90.f1;
import m90.h1;
import m90.j1;
import o82.l0;
import r72.f2;
import r72.n1;
import r72.y1;
import r72.z1;
import ra0.q0;
import s80.l7;
import s80.r6;
import t3.h2;
import t3.s3;
import u50.f0;
import u50.h0;
import u50.k0;
import uc0.q2;
import uc0.t0;
import uc0.v2;
import v90.p1;
import w1.i1;
import w1.n2;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f116729j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f116730k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13, Object obj, Object obj2) {
        super(1);
        this.f116728i = i13;
        this.f116729j = obj;
        this.f116730k = obj2;
    }

    public final rn1.a b(rn1.a it) {
        String str;
        int i13 = this.f116728i;
        Object obj = this.f116730k;
        Object obj2 = this.f116729j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = ga2.d.alert_view_title_tv;
                Context context = ((GestaltText) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER), e0.b(vn1.e.BOLD), pk.a0.o0(context), ((yb0.n) obj).f138512i, null, rn1.b.END, null, null, false, i14, null, vn1.g.BODY_300, vn1.g.HEADING_700, null, null, false, null, null, 2070339);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                dc0.o oVar = (dc0.o) obj2;
                f0 p23 = bs1.c.p2(oVar.f54343g);
                fm1.c Z = d7.b.Z(oVar.f54343g.length() > 0);
                Context context2 = ((LegoBoardRep) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, p23, oVar.f54342f, null, null, pk.a0.t(context2), oVar.f54356t ? 2 : 1, Z, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096908);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                dc0.l lVar = (dc0.l) obj2;
                return rn1.a.y(it, (lVar == null || (str = lVar.f54327a) == null) ? h0.f120562a : bs1.c.p2(str), null, null, null, null, 0, d7.b.Z((lVar != null ? lVar.f54327a : null) != null), null, (rm1.d) obj, null, false, 0, null, null, null, null, null, false, null, null, 2096830);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = ((jr0.b) obj2).f77541c;
                Context context3 = ((GestaltText) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(bs1.c.A(context3, eo1.b.color_themed_text_default), str2)), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    public final void e(int i13) {
        int i14 = this.f116728i;
        Object obj = this.f116730k;
        Object obj2 = this.f116729j;
        switch (i14) {
            case 5:
                r6.Companion.getClass();
                r6 r6Var = (r6) kotlin.collections.c0.J(i13, r6.values());
                int i15 = r6Var == null ? -1 : z80.a.f141043a[r6Var.ordinal()];
                if (i15 == 1) {
                    ((u50.r) obj2).a(s80.c0.f111476a);
                } else if (i15 == 2) {
                    ((u50.r) obj2).a(s80.a0.f111460a);
                } else if (i15 == 3) {
                    ((u50.r) obj2).a(s80.b0.f111469a);
                } else if (i15 == 4) {
                    ((u50.r) obj2).a(s80.e0.f111506a);
                } else if (i15 == 5) {
                    ((u50.r) obj2).a(s80.d0.f111491a);
                }
                a.c.y(((z80.b) obj).f141044a);
                break;
            case 6:
                ((u50.r) obj2).a(new s80.v(((f2) ((z80.m) obj).f141067b.f67841c.f55726a.getValue()).f106469a, true));
                break;
            default:
                fa0.v vVar = (fa0.v) ((HashMap) obj2).get(Integer.valueOf(i13));
                if (vVar != null) {
                    ((Function1) obj).invoke(vVar);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [m90.f1] */
    /* JADX WARN: Type inference failed for: r5v24, types: [m90.j1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u0 u0Var;
        u80.j jVar;
        int i13;
        h1 h1Var;
        int i14 = this.f116728i;
        int i15 = 2;
        int i16 = 3;
        int i17 = 0;
        u80.j jVar2 = null;
        int i18 = 1;
        Object obj2 = this.f116730k;
        Object obj3 = this.f116729j;
        switch (i14) {
            case 0:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                c cVar = ((v) obj2).f116743a;
                ((s) obj3).getClass();
                int i19 = i.f116694a[cVar.ordinal()];
                if (i19 == 1) {
                    u0Var = u0.COLLAGE_COMPOSER_CAROUSEL_DRAFTS_CARD;
                } else if (i19 == 2) {
                    u0Var = u0.COLLAGE_COMPOSER_CAROUSEL_REMIX_CARD;
                } else {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u0Var = u0.COLLAGE_COMPOSER_CAROUSEL_TUTORIAL_CARD;
                }
                update.f67047f = u0Var;
                return Unit.f80348a;
            case 1:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                d0 d0Var = (d0) obj3;
                boolean U0 = oe.f.U0(d0Var);
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                Intrinsics.checkNotNullParameter("enabled_buttons", "group");
                String str = (String) d0Var.f116688e.get("android_curation_collage_templates");
                boolean i23 = str != null ? kotlin.text.z.i(str, "enabled_buttons", true) : false;
                f fVar = (f) ((h) obj2);
                if (!fVar.f116690a.isEmpty()) {
                    List<ra0.d> list = fVar.f116690a;
                    ?? arrayList = new ArrayList(g0.q(list, 10));
                    for (ra0.d dVar : list) {
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        arrayList.add(new u80.h(dVar.f106911a.f106906a, dVar.f106912b));
                    }
                    if (U0) {
                        arrayList = CollectionsKt.y0(arrayList, 2);
                    }
                    u80.j a13 = U0 ? t.a(t.f116740d, i23) : t.f116737a;
                    if (i23 && (i13 = d0Var.f116686c) > 0) {
                        int i24 = l7.empty_state_carousel_drafts_cta_with_count;
                        String[] formatArgs = {String.valueOf(i13)};
                        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(new f0(formatArgs[0]));
                        a13 = u80.j.e(a13, null, new k0(i24, arrayList2), 1023);
                    }
                    jVar = t.b(a13, arrayList);
                } else {
                    jVar = null;
                }
                List list2 = fVar.f116691b;
                if (!list2.isEmpty()) {
                    List<ra0.d> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(g0.q(list3, 10));
                    for (ra0.d dVar2 : list3) {
                        Intrinsics.checkNotNullParameter(dVar2, "<this>");
                        arrayList3.add(new u80.h(dVar2.f106911a.f106906a, dVar2.f106912b));
                    }
                    jVar2 = t.b(U0 ? t.a(t.f116741e, i23) : t.f116738b, arrayList3);
                }
                u80.j[] elements = {jVar, jVar2, U0 ? t.a(t.f116742f, i23) : t.f116739c};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList cards = kotlin.collections.c0.A(elements);
                it.getClass();
                Intrinsics.checkNotNullParameter(cards, "cards");
                return new d(cards);
            case 2:
                Intrinsics.checkNotNullParameter((rn1.i) obj, "it");
                ((Function1) obj3).invoke(Integer.valueOf(((u80.j) obj2).f120954h));
                return Unit.f80348a;
            case 3:
                Intrinsics.checkNotNullParameter((Context) obj, "it");
                IdeaPinHandDrawingEditor ideaPinHandDrawingEditor = (IdeaPinHandDrawingEditor) obj3;
                ideaPinHandDrawingEditor.T(((s80.j) obj2).f111600i.f111832b);
                return ideaPinHandDrawingEditor;
            case 4:
                q3.x it2 = (q3.x) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                long j13 = it2.j();
                ((q1) obj3).setValue(new n4.j(j13));
                q1 q1Var = (q1) obj2;
                if (((int) (j13 & 4294967295L)) > ((int) (4294967295L & ((n4.j) q1Var.getValue()).f89186a))) {
                    q1Var.setValue(new n4.j(j13));
                }
                return Unit.f80348a;
            case 5:
                e(((Number) obj).intValue());
                return Unit.f80348a;
            case 6:
                e(((Number) obj).intValue());
                return Unit.f80348a;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                f90.b bVar = (f90.b) obj3;
                if (bVar.isBound()) {
                    String shuffleItemPinId = (String) obj2;
                    Intrinsics.checkNotNullExpressionValue(shuffleItemPinId, "$shuffleItemPinId");
                    bVar.f61447i.u(shuffleItemPinId, null, null);
                    c90.a aVar = (c90.a) bVar.getViewIfBound();
                    if (aVar != null) {
                        k90.c cVar2 = (k90.c) aVar;
                        if (cVar2.F9()) {
                            nx.k kVar = cVar2.f78729m1;
                            if (kVar == null) {
                                Intrinsics.r("collageAdsLogger");
                                throw null;
                            }
                            String D9 = cVar2.D9();
                            String Z = com.bumptech.glide.d.Z(cVar2, "EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", "");
                            cVar2.C9();
                            nx.k.d(kVar, D9, false, Z, false, System.currentTimeMillis() - cVar2.f78737u1, false, 96);
                        }
                    }
                }
                return Unit.f80348a;
            case 8:
                Map<String, String> it3 = (Map) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                CollagesCarouselCutoutRelatedModulesPagedRemoteRequest collagesCarouselCutoutRelatedModulesPagedRemoteRequest = (CollagesCarouselCutoutRelatedModulesPagedRemoteRequest) obj3;
                String str2 = collagesCarouselCutoutRelatedModulesPagedRemoteRequest.f44615a;
                int i25 = n1.f106581a;
                if (Intrinsics.d(str2, "none")) {
                    return new kk2.k(new w0(i18), 1);
                }
                Object obj4 = ((j90.b) obj2).getParams()[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.String");
                return collagesCarouselCutoutRelatedModulesPagedRemoteRequest.getPagedListService().b(kotlin.text.z.n((String) obj4, "ASSET_ID_PLACEHOLDER", collagesCarouselCutoutRelatedModulesPagedRemoteRequest.f44615a), collagesCarouselCutoutRelatedModulesPagedRemoteRequest.maybeFreezeParameters(it3));
            case 9:
                int intValue = ((Number) obj).intValue();
                return ((Function2) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 10:
                o12.b response = (o12.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List<dl1.s> list4 = response.f92783a;
                o90.k kVar2 = (o90.k) obj3;
                o90.e eVar = (o90.e) obj2;
                ArrayList arrayList4 = new ArrayList();
                for (dl1.s sVar : list4) {
                    if (sVar instanceof f30) {
                        h1Var = new j1((f30) sVar);
                    } else if (sVar instanceof v7) {
                        h1Var = new f1((v7) sVar);
                    } else {
                        if ((sVar instanceof vh) && kVar2.f93812b) {
                            vh vhVar = (vh) sVar;
                            eVar.getClass();
                            if (Intrinsics.d(vhVar.q(), "collage_composer_cards_carousel")) {
                                List list5 = vhVar.f42865w;
                                Intrinsics.checkNotNullExpressionValue(list5, "getObjects(...)");
                                if (!list5.isEmpty()) {
                                    h1Var = new h1(vhVar);
                                }
                            }
                        }
                        h1Var = null;
                    }
                    if (h1Var != null) {
                        arrayList4.add(h1Var);
                    }
                }
                return new l0(arrayList4, response.f92784b);
            case 11:
                v90.a it4 = (v90.a) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                v90.j1 j1Var = (v90.j1) obj3;
                t90.o oVar = it4.f124860h;
                p1 p1Var = ((v90.l) obj2).f124933b;
                int id3 = p1Var != null ? p1Var.getId() : t90.f.f116787a.f116819c;
                j1Var.getClass();
                List<t90.p> list6 = oVar.f116816a;
                ArrayList actions = new ArrayList(g0.q(list6, 10));
                for (t90.p pVar : list6) {
                    actions.add(t90.p.e(pVar, pVar.f116819c == id3));
                }
                Intrinsics.checkNotNullParameter(actions, "actions");
                return v90.a.e(it4, null, false, null, null, null, null, null, new t90.o(actions), null, false, 1919);
            case 12:
                z1 it5 = (z1) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if ((it5 instanceof y1) && ((y1) it5).f106726f.f106540a.length() == 0) {
                    kotlin.jvm.internal.j.z((j0) obj3, null, null, new ba0.a((ba0.e) obj2, null), 3);
                }
                return Unit.f80348a;
            case 13:
                i1 CollagePublishTextOption = (i1) obj;
                Intrinsics.checkNotNullParameter(CollagePublishTextOption, "$this$CollagePublishTextOption");
                s3 s3Var = (s3) obj3;
                if (s3Var != null) {
                    ((h2) s3Var).a();
                }
                ((androidx.compose.ui.focus.b) ((z2.j) obj2)).a(false);
                return Unit.f80348a;
            case 14:
                v7 v7Var = (v7) obj;
                Intrinsics.f(v7Var);
                ((da0.f) obj2).getClass();
                String f39332b = v7Var.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                String j14 = v7Var.j1();
                Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                ((u50.r) obj3).a(new ca0.g(new ca0.a(f39332b, new f0(j14), v7Var.b1(), null)));
                return Unit.f80348a;
            case 15:
                e(((Number) obj).intValue());
                return Unit.f80348a;
            case 16:
                xl1.b event = (xl1.b) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    ((Function1) obj3).invoke(((ia0.q) obj2).f71984a.f106911a);
                }
                return Unit.f80348a;
            case 17:
                nm1.c0 c0Var = new nm1.c0(pa0.h.header_tab_drafts, (k0) obj3);
                nm1.c0 c0Var2 = new nm1.c0(pa0.h.header_tab_templates, u50.g0.b(new String[0], pa0.j.templates_tab_title));
                pa0.c cVar3 = (pa0.c) obj2;
                int i26 = pa0.c.f99375x0;
                cVar3.getClass();
                return new nm1.b0(c0Var, c0Var2, com.bumptech.glide.d.G(cVar3, "CollageDraftPickerExtras.EXTRA_OPEN_ON_TEMPLATES_TAB", false) ? 1 : 0, null, new nm1.g(new nm1.n(u50.g0.b(new String[0], x0.back), rm1.q.ARROW_BACK)), null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, 0);
            case 18:
                z2.v focusState = (z2.v) obj;
                Intrinsics.checkNotNullParameter(focusState, "focusState");
                if (((z2.x) focusState).isFocused()) {
                    kotlin.jvm.internal.j.z((j0) obj3, null, null, new q0((t1.b) obj2, null), 3);
                }
                return Unit.f80348a;
            case 19:
                d6.b it6 = (d6.b) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                String name = (String) obj3;
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key = new d6.g(name);
                Object obj5 = (Set) obj2;
                if (obj5 == null) {
                    obj5 = s0.f80394a;
                }
                it6.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                it6.c(key, obj5);
                return Unit.f80348a;
            case 20:
                return b((rn1.a) obj);
            case 21:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                gm1.a eventHandler = (gm1.a) obj2;
                GestaltModalAlert gestaltModalAlert = ((yb0.p) obj3).f138533d;
                gestaltModalAlert.getClass();
                Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                return Unit.f80348a;
            case 22:
                Intrinsics.checkNotNullParameter((xm1.e) obj, "it");
                yb0.o oVar2 = (yb0.o) obj2;
                int i27 = yb0.p.f138529f;
                ((yb0.p) obj3).getClass();
                return new xm1.e(oVar2.f138519a, oVar2.f138520b, oVar2.f138521c, oVar2.f138522d, oVar2.f138523e, oVar2.f138524f, oVar2.f138525g, oVar2.f138526h, oVar2.f138527i, oVar2.f138528j);
            case 23:
                rl1.c0 bind = (rl1.c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108530c = true;
                rl1.r size = ((AvatarPairUpdate) obj3).f44713p > 3 ? rl1.r.MD : rl1.r.XL;
                Intrinsics.checkNotNullParameter(size, "size");
                bind.f108531d = size;
                rl1.d backgroundColor = new rl1.d(((bc0.e) obj2).f22632g);
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                bind.f108537j = backgroundColor;
                return Unit.f80348a;
            case 24:
                return b((rn1.a) obj);
            case 25:
                return b((rn1.a) obj);
            case 26:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                WebImageView webImageView = new WebImageView(context);
                webImageView.setScaleType((ImageView.ScaleType) obj3);
                ((Function1) obj2).invoke(webImageView);
                return webImageView;
            case 27:
                r1.e0 LazyVerticalGrid = (r1.e0) obj;
                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                List list7 = ((t0) obj3).f121865b;
                tc0.d dVar3 = tc0.d.f117227l;
                int size2 = list7.size();
                u80.s sVar2 = new u80.s(5, list7, dVar3);
                tc0.k kVar3 = new tc0.k(i18, list7, (Function1) obj2);
                Object obj6 = q2.i.f102113a;
                ((r1.l) LazyVerticalGrid).s(size2, null, null, sVar2, new q2.h(kVar3, true, 699646206));
                return Unit.f80348a;
            case 28:
                q1.x LazyColumn = (q1.x) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                s2.t tVar = (s2.t) obj2;
                for (Object obj7 : ((q2) obj3).f121854a) {
                    int i28 = i17 + 1;
                    if (i17 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    v2 v2Var = (v2) obj7;
                    String d2 = a.a.d("section", i17);
                    boolean booleanValue = ((Boolean) tVar.get(i17)).booleanValue();
                    n2 n2Var = new n2(v2Var, booleanValue, new b2.t(tVar, i17, i18), i16);
                    Object obj8 = q2.i.f102113a;
                    q1.x.a(LazyColumn, d2, new q2.h(n2Var, true, 101175321), 2);
                    if (booleanValue) {
                        kh2.j1.K1(LazyColumn, d2, v2Var.f121874b);
                    }
                    i17 = i28;
                }
                return Unit.f80348a;
            default:
                return b((rn1.a) obj);
        }
    }
}
